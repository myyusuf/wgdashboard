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
import id.co.wikagedung.system.projectDashboard.model.PosisiKeuangan;
import id.co.wikagedung.system.projectDashboard.service.PosisiKeuanganExcelFileMapperService;

public class PosisiKeuanganExcelFileMapperServiceImpl implements
		PosisiKeuanganExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(PosisiKeuanganExcelFileMapperServiceImpl.class);

	private String pathName;

	public PosisiKeuanganExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<PosisiKeuangan> posisiKeuanganExcelFileMapping()
			throws IOException, InvalidFormatException {

		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {

			filenames.add(list[i].getAbsolutePath());

		}

		ArrayList<PosisiKeuangan> posisiKeuanganList = new ArrayList<PosisiKeuangan>();

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
						.getSheet(CommonConstant.WG_POSISI_KEUANGAN_SHEET_CONSTANT);

				PosisiKeuangan posisiKeuangan = new PosisiKeuangan();

				for (int row = 0; row < sheet.getLastRowNum(); row++) {

					XSSFRow rows = sheet.getRow(row);

					if (rows != null) {

						for (int column = 0; column < rows.getLastCellNum(); column++) {

							XSSFCell cell = rows.getCell(column);

							if (cell != null) {

								if ((cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
										|| cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA) {

									if (row == 5) {

										if (column == 6) {

											posisiKeuangan
													.setUangMukaInduk(cell
															.getNumericCellValue());

										}

									}

									if (row == 6) {

										if (column == 6) {

											posisiKeuangan.setTermijn(cell
													.getNumericCellValue());

										}

									}

									if (row == 8) {

										if (column == 6) {

											posisiKeuangan.setUangMukaVo(cell
													.getNumericCellValue());

										}

									}

									if (row == 9) {

										if (column == 6) {

											posisiKeuangan.setTermijnVo(cell
													.getNumericCellValue());

										}

									}

									if (row == 15) {

										if (column == 6) {

											posisiKeuangan
													.setPotonganRetensi(cell
															.getNumericCellValue());

										}

									}

									if (row == 16) {

										if (column == 6) {

											posisiKeuangan
													.setPotonganUangMuka(cell
															.getNumericCellValue());

										}

									}

									if (row == 17) {

										if (column == 6) {

											posisiKeuangan.setPotonganPpn(cell
													.getNumericCellValue());

										}

									}

									if (row == 18) {

										if (column == 6) {

											posisiKeuangan
													.setPotonganPphTermijn(cell
															.getNumericCellValue());

										}

									}

									if (row == 23) {

										if (column == 6) {

											posisiKeuangan.setPersekot(cell
													.getNumericCellValue());

										}

									}

									if (row == 24) {

										if (column == 6) {

											posisiKeuangan.setDropping(cell
													.getNumericCellValue());

										}

									}

									if (row == 25) {

										if (column == 6) {

											posisiKeuangan.setPembebananRk(cell
													.getNumericCellValue());

										}

									}

									if (row == 32) {

										if (column == 6) {

											posisiKeuangan
													.setPekerjaanInduk(cell
															.getNumericCellValue());

										}

									}

									if (row == 33) {

										if (column == 6) {

											posisiKeuangan
													.setPekerjaanVoClaim(cell
															.getNumericCellValue());

										}

									}

									if (row == 39) {

										if (column == 6) {

											posisiKeuangan
													.setPrestasiEksternPekerjaanInduk(cell
															.getNumericCellValue());

										}

									}

									if (row == 40) {

										if (column == 6) {

											posisiKeuangan
													.setPrestasiEksternPekerjaanVo(cell
															.getNumericCellValue());

										}

									}

									if (row == 44) {

										if (column == 6) {

											posisiKeuangan
													.setBiayaLangsung(cell
															.getNumericCellValue());

										}

									}

									if (row == 45) {

										if (column == 6) {

											posisiKeuangan
													.setBiayaTakLangsung(cell
															.getNumericCellValue());

										}

									}

									if (row == 49) {

										if (column == 8) {

											posisiKeuangan
													.setUangMukaPemasok(cell
															.getNumericCellValue());

										}

									}

									if (row == 50) {

										if (column == 8) {

											posisiKeuangan
													.setUangMukaSubkontraktor(cell
															.getNumericCellValue());

										}

									}

									if (row == 51) {

										if (column == 8) {

											posisiKeuangan.setUtangPemasok(cell
													.getNumericCellValue());

										}

									}

									if (row == 52) {

										if (column == 8) {

											posisiKeuangan
													.setUtangSubkontraktor(cell
															.getNumericCellValue());

										}

									}

									if (row == 53) {

										if (column == 8) {

											posisiKeuangan.setUtangMandor(cell
													.getNumericCellValue());

										}

									}

									if (row == 54) {

										if (column == 8) {

											posisiKeuangan.setPersediaan(cell
													.getNumericCellValue());

										}

									}

									if (row == 55) {

										if (column == 8) {

											posisiKeuangan
													.setBiayaAkanDibayar(cell
															.getNumericCellValue());

										}

									}

									if (row == 56) {

										if (column == 8) {

											posisiKeuangan
													.setPiutangFaktur(cell
															.getNumericCellValue());

										}

									}

									if (row == 58) {

										if (column == 8) {

											posisiKeuangan.setPdpkMaterial(cell
													.getNumericCellValue());

										}

									}

									if (row == 59) {

										if (column == 8) {

											posisiKeuangan.setPdpkUpah(cell
													.getNumericCellValue());

										}

									}

									if (row == 60) {

										if (column == 8) {

											posisiKeuangan
													.setPdpkPeralatan(cell
															.getNumericCellValue());

										}

									}

									if (row == 61) {

										if (column == 8) {

											posisiKeuangan
													.setPdpkSubkontraktor(cell
															.getNumericCellValue());

										}

									}

								}

							}

						}

					}

				}

				posisiKeuanganList.add(posisiKeuangan);

			}

		}

		return posisiKeuanganList;

	}
}
