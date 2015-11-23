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
import id.co.wikagedung.system.projectDashboard.model.Efisiensi;
import id.co.wikagedung.system.projectDashboard.service.EfisiensiExcelFileMapperService;

public class EfisiensiExcelFileMapperServiceImpl implements
		EfisiensiExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(EfisiensiExcelFileMapperServiceImpl.class);

	private String pathName;

	public EfisiensiExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<Efisiensi> efisiensiExcelFileMapping() throws IOException,
			InvalidFormatException {

		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {

			filenames.add(list[i].getAbsolutePath());

		}

		ArrayList<Efisiensi> efisiensiList = new ArrayList<Efisiensi>();

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
						.getSheet(CommonConstant.WG_EFISIENSI_SHEET_CONSTANT);

				for (int row = 0; row < sheet.getLastRowNum(); row++) {

					Efisiensi efisiensi = new Efisiensi();

					XSSFRow rows = sheet.getRow(row);

					if (rows != null) {

						for (int column = 0; column < rows.getLastCellNum(); column++) {

							XSSFCell cell = rows.getCell(column);

							if (cell != null) {

								if ((cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
										|| (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
										|| (cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA)) {

									if (row >= 5) {

										if (rows.getCell(0).getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {

											if (column == 1) {

												efisiensi.setItemPekerjaan(cell
														.getStringCellValue());

											}

											if (column == 2) {

												efisiensi.setRabtRabp(cell
														.getNumericCellValue());

											}

											if (column == 3) {

												efisiensi.setPerolehan(cell
														.getNumericCellValue());

											}

											if (column == 4) {

												efisiensi.setEfisiensi(cell
														.getNumericCellValue());

											}

											if (column == 5) {

												efisiensi
														.setPenggunaanEfisiensiPosting(cell
																.getStringCellValue());

											}

											if (column == 6) {

												efisiensi
														.setPenggunaanEfisiensiKeterangan(cell
																.getStringCellValue());

											}

											if (column == 7) {

												efisiensi
														.setPenggunaanEfisiensiNilai(cell
																.getNumericCellValue());

											}

											if (column == 8) {

												efisiensi.setSaldo(cell
														.getNumericCellValue());

											}

											if (column == 9) {

												efisiensi.setKeterangan(cell
														.getStringCellValue());

											}

										}

									}

								}

							}

						}

					}

					if ((efisiensi.getItemPekerjaan() != null)
							&& (efisiensi.getRabtRabp() != null)
							&& (efisiensi.getPerolehan() != null)
							&& (efisiensi.getEfisiensi() != null)
							&& (efisiensi.getPenggunaanEfisiensiPosting() != null)
							&& (efisiensi.getPenggunaanEfisiensiKeterangan() != null)
							&& (efisiensi.getPenggunaanEfisiensiNilai() != null)
							&& (efisiensi.getSaldo() != null)
							&& (efisiensi.getKeterangan() != null)) {

						efisiensiList.add(efisiensi);

					}

				}

			}

		}

		return efisiensiList;

	}

}
