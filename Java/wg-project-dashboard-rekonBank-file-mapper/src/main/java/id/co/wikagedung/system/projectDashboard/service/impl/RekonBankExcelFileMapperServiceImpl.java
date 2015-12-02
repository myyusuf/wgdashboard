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
import id.co.wikagedung.system.projectDashboard.model.MenurutBank;
import id.co.wikagedung.system.projectDashboard.model.MenurutRegisterBankWg;
import id.co.wikagedung.system.projectDashboard.model.RekonBank;
import id.co.wikagedung.system.projectDashboard.service.RekonBankExcelFileMapperService;

public class RekonBankExcelFileMapperServiceImpl implements
		RekonBankExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(RekonBankExcelFileMapperServiceImpl.class);

	private String pathName;

	public RekonBankExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<RekonBank> rekonBankExcelFileMapping() throws IOException,
			InvalidFormatException {

		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {

			filenames.add(list[i].getAbsolutePath());

		}

		ArrayList<RekonBank> rekonBankList = new ArrayList<RekonBank>();

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
						.getSheet(CommonConstant.WG_REKON_BANK_SHEET_CONSTANT);

				for (int row = 0; row < sheet.getLastRowNum(); row++) {

					XSSFRow rows = sheet.getRow(row);

					RekonBank rekonBank = new RekonBank();
					MenurutBank menurutBank = new MenurutBank();
					MenurutRegisterBankWg menurutRegisterBankWg = new MenurutRegisterBankWg();

					if (rows != null) {

						for (int column = 0; column < rows.getLastCellNum(); column++) {

							XSSFCell cell = rows.getCell(column);

							if (cell != null) {

								if ((cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
										|| (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
										|| (cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA)) {

									if (row >= 10) {

										if ((column >= 1) && (column <= 3)) {

											if (rows.getCell(1).getCellType() == XSSFCell.CELL_TYPE_STRING) {

												if (column == 1) {

													menurutBank
															.setKeterangan(cell
																	.getStringCellValue());

												}

												if (column == 2) {

													menurutBank
															.setJumlah(cell
																	.getNumericCellValue());

												}

												if (column == 3) {

													menurutBank
															.setJumlah(cell
																	.getNumericCellValue());

												}

											}

										}

										if ((column >= 4) && (column <= 7)) {

											if (rows.getCell(5).getCellType() == XSSFCell.CELL_TYPE_STRING) {

												if (column == 5) {

													menurutRegisterBankWg
															.setKeterangan(cell
																	.getStringCellValue());

												}

												if ((column == 6)
														|| (column == 7)) {

													menurutRegisterBankWg
															.setJumlah(cell
																	.getNumericCellValue());

												}

												if (column == 7) {

													menurutRegisterBankWg
															.setJumlah(cell
																	.getNumericCellValue());

												}

											}

										}

									}

								}

							}

							if ((menurutBank.getKeterangan() != null)
									&& (menurutBank.getJumlah() != null)
									&& (menurutRegisterBankWg.getKeterangan() != null)
									&& (menurutRegisterBankWg.getJumlah() != null)
									&& (!menurutRegisterBankWg.getKeterangan()
											.equals("KOREKSI"))
									&& (!menurutRegisterBankWg.getKeterangan()
											.equals("SALDO SESUNGGUHNYA"))) {

								rekonBank.setMenurutBank(menurutBank);
								rekonBank
										.setMenurutRegisterBankWg(menurutRegisterBankWg);

							}

						}

					}

					if ((rekonBank.getMenurutBank() != null)
							&& (rekonBank.getMenurutRegisterBankWg() != null)) {

						rekonBankList.add(rekonBank);

					}

				}

			}

		}

		return rekonBankList;

	}
}
