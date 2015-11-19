package id.co.wikagedung.system.projectDashboard.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import id.co.wikagedung.system.projectDashboard.constant.CommonConstant;
import id.co.wikagedung.system.projectDashboard.model.ManajemenRisiko;
import id.co.wikagedung.system.projectDashboard.service.ManajemenRisikoExcelFileMapperService;

public class ManajemenRisikoExcelFileMapperServiceImpl implements
		ManajemenRisikoExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(ManajemenRisikoExcelFileMapperServiceImpl.class);

	private String pathName;

	public ManajemenRisikoExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<ManajemenRisiko> manajemenRisikoExcelFileMapping()
			throws IOException, InvalidFormatException {

		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {

			filenames.add(list[i].getAbsolutePath());

		}

		ArrayList<ManajemenRisiko> manajemenRisikoList = new ArrayList<ManajemenRisiko>();

		Map<Integer, ManajemenRisiko> manajemenRisikoMap = new HashMap<Integer, ManajemenRisiko>();

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
						.getSheet(CommonConstant.WG_MANAJEMEN_RISIKO_SHEET_CONSTANT);

				ManajemenRisiko manajemenRisiko = new ManajemenRisiko();

				for (int row = 0; row < sheet.getLastRowNum(); row++) {

					XSSFRow rows = sheet.getRow(row);

					if (rows != null) {

						for (int column = 0; column < rows.getLastCellNum(); column++) {

							XSSFCell cell = rows.getCell(column);

							if (cell != null) {

								if ((cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
										|| (cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA)
										|| (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)) {

									if (row > 7) {

										if (rows.getCell(0).getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {

											if (column == 1) {

												manajemenRisiko.setRisiko(cell
														.getStringCellValue());

											}

											if (column == 2) {

												manajemenRisiko
														.setStlTingkatRisiko(cell
																.getStringCellValue());

											}

											if (column == 3) {

												manajemenRisiko
														.setStlNilaiRisiko(cell
																.getNumericCellValue());

											}

											if (column == 4) {

												manajemenRisiko
														.setRtlRencanaTindakLanjut(cell
																.getStringCellValue());

											}

											if (column == 5) {

												manajemenRisiko
														.setRtlTingkatRisiko(cell
																.getStringCellValue());

											}

											if (column == 6) {

												manajemenRisiko
														.setRtlRencanaBiayaMitigasiRisiko(cell
																.getNumericCellValue());

											}

											if (column == 7) {

												manajemenRisiko
														.setRtlRencanaSisaRisiko(cell
																.getNumericCellValue());

											}

											if (column == 8) {

												manajemenRisiko
														.setRtlTotalRencanaNilaiRisiko(cell
																.getNumericCellValue());

											}

											if (column == 9) {

												manajemenRisiko
														.setHtlRealisasiTindakLanjutSampaiSaatIni(cell
																.getStringCellValue());

											}

											if (column == 11) {

												manajemenRisiko
														.setHtlStatus(cell
																.getStringCellValue());

											}

											if (column == 12) {

												manajemenRisiko
														.setHtlPenanggungJawab(cell
																.getStringCellValue());

											}

											if (column == 13) {

												manajemenRisiko
														.setHtlBiayaMitigasi(cell
																.getNumericCellValue());

											}

											if (column == 14) {

												manajemenRisiko
														.setHtlRealisasiSisaRisiko(cell
																.getNumericCellValue());

											}

											if (column == 15) {

												manajemenRisiko
														.setHtlTotalRealisasiNilaiRisiko(cell
																.getNumericCellValue());

											}

											if ((manajemenRisiko.getRisiko() != null)
													&& (manajemenRisiko
															.getStlTingkatRisiko() != null)
													&& (manajemenRisiko
															.getStlNilaiRisiko() != null)
													&& (manajemenRisiko
															.getRtlRencanaTindakLanjut() != null)
													&& (manajemenRisiko
															.getRtlTingkatRisiko() != null)
													&& (manajemenRisiko
															.getRtlRencanaBiayaMitigasiRisiko() != null)
													&& (manajemenRisiko
															.getRtlRencanaSisaRisiko() != null)
													&& (manajemenRisiko
															.getRtlTotalRencanaNilaiRisiko() != null)
													&& (manajemenRisiko
															.getHtlRealisasiTindakLanjutSampaiSaatIni() != null)
													&& (manajemenRisiko
															.getHtlStatus() != null)
													&& (manajemenRisiko
															.getHtlPenanggungJawab() != null)
													&& (manajemenRisiko
															.getHtlBiayaMitigasi() != null)
													&& (manajemenRisiko
															.getHtlRealisasiSisaRisiko() != null)
													&& (manajemenRisiko
															.getHtlTotalRealisasiNilaiRisiko() != null)) {

												manajemenRisikoList
														.add(manajemenRisiko);

											}

										}

									}

								}

							}

						}

					}

				}

			}
		}

		return manajemenRisikoList;
	}
}
