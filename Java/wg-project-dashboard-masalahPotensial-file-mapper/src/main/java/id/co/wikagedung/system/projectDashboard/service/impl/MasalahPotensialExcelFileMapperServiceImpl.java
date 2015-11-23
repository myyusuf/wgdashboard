package id.co.wikagedung.system.projectDashboard.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import id.co.wikagedung.system.projectDashboard.constant.CommonConstant;
import id.co.wikagedung.system.projectDashboard.model.MasalahPotensial;
import id.co.wikagedung.system.projectDashboard.service.MasalahPotensialExcelFileMapperService;

public class MasalahPotensialExcelFileMapperServiceImpl implements
		MasalahPotensialExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(MasalahPotensialExcelFileMapperServiceImpl.class);

	private String pathName;

	public MasalahPotensialExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<MasalahPotensial> masalahPotensialExcelFileMapping()
			throws IOException, InvalidFormatException {

		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {

			filenames.add(list[i].getAbsolutePath());

		}

		ArrayList<MasalahPotensial> masalahPotensialList = new ArrayList<MasalahPotensial>();

		for (int i = 0; i < filenames.size(); i++) {

			String filePath = filenames.get(i);

			LOGGER.info("Read file with file path : " + filePath);

			File file = new File(filePath);

			if (file.getAbsolutePath().contains("READ")) {

				LOGGER.info("File with file path " + filePath
						+ " has been read");

			} else {

				XSSFWorkbook workbook = new XSSFWorkbook(file);
				XSSFSheet sheet = workbook
						.getSheet(CommonConstant.WG_MASALAH_POTENSIAL_SHEET_CONSTANT);

				for (int row = 0; row < sheet.getLastRowNum(); row++) {

					MasalahPotensial masalahPotensial = new MasalahPotensial();

					XSSFRow rows = sheet.getRow(row);

					if (rows != null) {

						for (int column = 0; column < rows.getLastCellNum(); column++) {

							XSSFCell cell = rows.getCell(column);

							if (cell != null) {

								if ((cell.getCellType() == XSSFCell.CELL_TYPE_STRING)) {

									if (row >= 5) {

										if (rows.getCell(1).getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {

											if (column == 2) {

												masalahPotensial
														.setButiranMasalah(cell
																.getStringCellValue());

											}

											if (column == 3) {

												masalahPotensial
														.setUsulanPemecahan(cell
																.getStringCellValue());

											}

											if (column == 4) {

												masalahPotensial
														.setTargetPenyelesaian(cell
																.getStringCellValue());

											}

										}

									}

								}

							}

						}

					}

					if ((masalahPotensial.getButiranMasalah() != null)
							&& (masalahPotensial.getUsulanPemecahan() != null)
							&& (masalahPotensial.getTargetPenyelesaian() != null)) {

						masalahPotensialList.add(masalahPotensial);

					}

				}

			}

		}

		return masalahPotensialList;

	}

}
