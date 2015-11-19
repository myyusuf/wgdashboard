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
import id.co.wikagedung.system.projectDashboard.model.HasilUsaha;
import id.co.wikagedung.system.projectDashboard.service.HasilUsahaExcelFileMapperService;

public class HasilUsahaExcelFileMapperServiceImpl implements
		HasilUsahaExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(HasilUsahaExcelFileMapperServiceImpl.class);

	private String pathName;

	public HasilUsahaExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<HasilUsaha> hasilUsahaExcelFileMapping() throws IOException,
			InvalidFormatException {

		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {

			filenames.add(list[i].getAbsolutePath());

		}

		ArrayList<HasilUsaha> hasilUsahaList = new ArrayList<HasilUsaha>();

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
						.getSheet(CommonConstant.WG_HASIL_USAHA_SHEET_CONSTANT);

				Map<Integer, Double> bulanKeMap = new HashMap<Integer, Double>();
				Map<Integer, Double> okAwalMap = new HashMap<Integer, Double>();
				Map<Integer, Double> okAddMap = new HashMap<Integer, Double>();
				Map<Integer, Double> opRaRpMap = new HashMap<Integer, Double>();
				Map<Integer, Double> opRaProsentaseMap = new HashMap<Integer, Double>();
				Map<Integer, Double> opRiRpMap = new HashMap<Integer, Double>();
				Map<Integer, Double> opRiProsentaseMap = new HashMap<Integer, Double>();
				Map<Integer, Double> lkRaRpMap = new HashMap<Integer, Double>();
				Map<Integer, Double> lkRaProsentaseMap = new HashMap<Integer, Double>();
				Map<Integer, Double> lkRiRpMap = new HashMap<Integer, Double>();
				Map<Integer, Double> lkRiProsentaseMap = new HashMap<Integer, Double>();

				for (int row = 0; row < sheet.getLastRowNum(); row++) {

					XSSFRow rows = sheet.getRow(row);

					if (rows != null) {

						for (int column = 0; column < rows.getLastCellNum(); column++) {

							XSSFCell cell = rows.getCell(column);

							if (cell != null) {

								if ((cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
										|| cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA) {

									// Bulan Ke
									if (row == 6) {

										if ((column != 1) || (column != 2)
												|| (column != 3)) {

											if (!bulanKeMap.containsKey(column)) {

												bulanKeMap.put(column, cell
														.getNumericCellValue());

											}

										}

									}

									// OK Awal
									if (row == 7) {

										if ((column != 1) || (column != 2)
												|| (column != 3)) {

											if (!okAwalMap.containsKey(column)) {

												okAwalMap.put(column, cell
														.getNumericCellValue());

											}

										}

									}

									// OK Add
									if (row == 8) {

										if ((column != 1) || (column != 2)
												|| (column != 3)) {

											if (!okAddMap.containsKey(column)) {

												okAddMap.put(column, cell
														.getNumericCellValue());

											}

										}

									}

									// OP Ra Rupiah
									if (row == 9) {

										if ((column != 1) || (column != 2)
												|| (column != 3)) {

											if (!opRaRpMap.containsKey(column)) {

												opRaRpMap.put(column, cell
														.getNumericCellValue());

											}

										}

									}

									// OP Ra Prosentase
									if (row == 10) {

										if ((column != 1) || (column != 2)
												|| (column != 3)) {

											if (!opRaProsentaseMap
													.containsKey(column)) {

												opRaProsentaseMap
														.put(column,
																cell.getNumericCellValue());

											}

										}

									}

									// OP Ri Rupiah
									if (row == 11) {

										if ((column != 1) || (column != 2)
												|| (column != 3)) {

											if (!opRiRpMap.containsKey(column)) {

												opRiRpMap.put(column, cell
														.getNumericCellValue());

											}

										}

									}

									// OP Ri Prosentase
									if (row == 12) {

										if ((column != 1) || (column != 2)
												|| (column != 3)) {

											if (!opRiProsentaseMap
													.containsKey(column)) {

												opRiProsentaseMap
														.put(column,
																cell.getNumericCellValue());

											}

										}

									}

									// LK Ra Rupiah
									if (row == 13) {

										if ((column != 1) || (column != 2)
												|| (column != 3)) {

											if (!lkRaRpMap.containsKey(column)) {

												lkRaRpMap.put(column, cell
														.getNumericCellValue());

											}

										}

									}

									// LK Ra Prosentase
									if (row == 14) {

										if ((column != 1) || (column != 2)
												|| (column != 3)) {

											if (!lkRaProsentaseMap
													.containsKey(column)) {

												lkRaProsentaseMap
														.put(column,
																cell.getNumericCellValue());

											}

										}

									}

									// LK Ri Rupiah
									if (row == 15) {

										if ((column != 1) || (column != 2)
												|| (column != 3)) {

											if (!lkRiRpMap.containsKey(column)) {

												lkRiRpMap.put(column, cell
														.getNumericCellValue());

											}

										}

									}

									// LK Ri Prosentase
									if (row == 16) {

										if ((column != 1) || (column != 2)
												|| (column != 3)) {

											if (!lkRiProsentaseMap
													.containsKey(column)) {

												lkRiProsentaseMap
														.put(column,
																cell.getNumericCellValue());

											}

										}

									}

								}

								HasilUsaha hasilUsaha = new HasilUsaha();
								hasilUsaha.setBulanKe(bulanKeMap.get(column));
								hasilUsaha.setOkAwal(okAwalMap.get(column));
								hasilUsaha.setOkAdd(okAddMap.get(column));
								hasilUsaha.setOpRaRp(opRaRpMap.get(column));
								hasilUsaha.setOpRaProsentase(opRaProsentaseMap
										.get(column));
								hasilUsaha.setOpRiRp(opRiRpMap.get(column));
								hasilUsaha.setOpRiProsentase(opRiProsentaseMap
										.get(column));
								hasilUsaha.setLkRaRp(lkRaRpMap.get(column));
								hasilUsaha.setLkRaProsentase(lkRaProsentaseMap
										.get(column));
								hasilUsaha.setLkRiRp(lkRiRpMap.get(column));
								hasilUsaha.setLkRiProsentase(lkRiProsentaseMap
										.get(column));

								if ((hasilUsaha.getBulanKe() != null)
										&& (hasilUsaha.getOkAwal() != null)
										&& (hasilUsaha.getOkAdd() != null)
										&& (hasilUsaha.getOpRaRp() != null)
										&& (hasilUsaha.getOpRaProsentase() != null)
										&& (hasilUsaha.getOpRiRp() != null)
										&& (hasilUsaha.getOpRiProsentase() != null)
										&& (hasilUsaha.getLkRaRp() != null)
										&& (hasilUsaha.getLkRaProsentase() != null)
										&& (hasilUsaha.getLkRiRp() != null)
										&& (hasilUsaha.getLkRiProsentase() != null)) {

									if (!hasilUsahaList.contains(hasilUsaha)) {

										hasilUsahaList.add(hasilUsaha);

									}

								}

							}

						}

					}

				}

			}

		}

		return hasilUsahaList;

	}
}
