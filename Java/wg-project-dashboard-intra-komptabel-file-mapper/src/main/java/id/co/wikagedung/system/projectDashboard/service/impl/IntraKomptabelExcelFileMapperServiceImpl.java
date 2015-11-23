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
import id.co.wikagedung.system.projectDashboard.model.IntraKomptabel;
import id.co.wikagedung.system.projectDashboard.service.IntraKomptabelExcelFileMapperService;

public class IntraKomptabelExcelFileMapperServiceImpl implements
		IntraKomptabelExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(IntraKomptabelExcelFileMapperServiceImpl.class);

	private String pathName;

	public IntraKomptabelExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<IntraKomptabel> intraKomptabelExcelFileMapping()
			throws IOException, InvalidFormatException {

		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {

			filenames.add(list[i].getAbsolutePath());

		}

		ArrayList<IntraKomptabel> intraKomptabelList = new ArrayList<IntraKomptabel>();

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
						.getSheet(CommonConstant.WG_INTRA_KOMPTABEL_SHEET_CONSTANT);

				for (int row = 0; row < sheet.getLastRowNum(); row++) {

					IntraKomptabel intraKomptabel = new IntraKomptabel();

					XSSFRow rows = sheet.getRow(row);

					if (rows != null) {

						for (int column = 0; column < rows.getLastCellNum(); column++) {

							XSSFCell cell = rows.getCell(column);

							if (cell != null) {

								if ((cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
										|| (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
										|| (cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA)) {

									if (row >= 6) {

										if (rows.getCell(0).getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {

											if (column == 1) {

												intraKomptabel.setUraian(cell
														.getStringCellValue());

											}

											if (column == 2) {

												intraKomptabel.setJumlah(cell
														.getNumericCellValue());

											}

											if (column == 3) {

												intraKomptabel.setMerk(cell
														.getStringCellValue());

											}

											if (column == 4) {

												intraKomptabel
														.setKodeInventaris(cell
																.getStringCellValue());

											}

											if (column == 5) {

												intraKomptabel
														.setTahunBeli(cell
																.getNumericCellValue());

											}

											if (column == 6) {

												intraKomptabel
														.setHargaBeli(cell
																.getNumericCellValue());

											}

											if (column == 7) {

												intraKomptabel.setKondisi(cell
														.getStringCellValue());

											}

											if (column == 8) {

												intraKomptabel
														.setKeterangan(cell
																.getStringCellValue());

											}

										}

									}

								}

							}

						}

					}

					if ((intraKomptabel.getUraian() != null)
							&& (intraKomptabel.getJumlah() != null)
							&& (intraKomptabel.getMerk() != null)
							&& (intraKomptabel.getKodeInventaris() != null)
							&& (intraKomptabel.getTahunBeli() != null)
							&& (intraKomptabel.getHargaBeli() != null)
							&& (intraKomptabel.getKondisi() != null)
							&& (intraKomptabel.getKeterangan() != null)) {

						intraKomptabelList.add(intraKomptabel);

					}

				}

			}

		}

		return intraKomptabelList;

	}

}
