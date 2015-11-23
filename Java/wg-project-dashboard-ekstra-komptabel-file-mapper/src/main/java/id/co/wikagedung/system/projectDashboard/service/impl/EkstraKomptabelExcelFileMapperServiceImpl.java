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
import id.co.wikagedung.system.projectDashboard.model.EkstraKomptabel;
import id.co.wikagedung.system.projectDashboard.service.EkstraKomptabelExcelFileMapperService;

public class EkstraKomptabelExcelFileMapperServiceImpl implements
		EkstraKomptabelExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(EkstraKomptabelExcelFileMapperServiceImpl.class);

	private String pathName;

	public EkstraKomptabelExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<EkstraKomptabel> ekstraKomptabelExcelFileMapping()
			throws IOException, InvalidFormatException {

		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {

			filenames.add(list[i].getAbsolutePath());

		}

		ArrayList<EkstraKomptabel> ekstraKomptabelList = new ArrayList<EkstraKomptabel>();

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
						.getSheet(CommonConstant.WG_EKSTRA_KOMPTABEL_SHEET_CONSTANT);

				for (int row = 0; row < sheet.getLastRowNum(); row++) {

					EkstraKomptabel ekstraKomptabel = new EkstraKomptabel();

					XSSFRow rows = sheet.getRow(row);

					if (rows != null) {

						for (int column = 0; column < rows.getLastCellNum(); column++) {

							XSSFCell cell = rows.getCell(column);

							if (cell != null) {

								if ((cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
										|| (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
										|| (cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA)) {

									if (row >= 7) {

										if (rows.getCell(0).getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {

											if (column == 1) {

												ekstraKomptabel.setUraian(cell
														.getStringCellValue());

											}

											if (column == 2) {

												ekstraKomptabel.setJumlah(cell
														.getNumericCellValue());

											}

											if (column == 3) {

												ekstraKomptabel.setMerk(cell
														.getStringCellValue());

											}

											if (column == 4) {

												ekstraKomptabel
														.setKodeInventaris(cell
																.getStringCellValue());

											}

											if (column == 5) {

												ekstraKomptabel
														.setTahunBeli(cell
																.getNumericCellValue());

											}

											if (column == 6) {

												ekstraKomptabel
														.setHargaBeli(cell
																.getNumericCellValue());

											}

											if (column == 7) {

												ekstraKomptabel.setKondisi(cell
														.getStringCellValue());

											}

											if (column == 8) {

												ekstraKomptabel
														.setKeterangan(cell
																.getStringCellValue());

											}

										}

									}

								}

							}

						}

					}

					if ((ekstraKomptabel.getUraian() != null)
							&& (ekstraKomptabel.getJumlah() != null)
							&& (ekstraKomptabel.getMerk() != null)
							&& (ekstraKomptabel.getKodeInventaris() != null)
							&& (ekstraKomptabel.getTahunBeli() != null)
							&& (ekstraKomptabel.getHargaBeli() != null)
							&& (ekstraKomptabel.getKondisi() != null)
							&& (ekstraKomptabel.getKeterangan() != null)) {

						ekstraKomptabelList.add(ekstraKomptabel);

					}

				}

			}

		}

		return ekstraKomptabelList;

	}

}
