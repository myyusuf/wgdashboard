package id.co.wikagedung.system.projectDashboard.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import id.co.wikagedung.system.projectDashboard.constant.CommonConstant;
import id.co.wikagedung.system.projectDashboard.model.DaftarIndukAlat;
import id.co.wikagedung.system.projectDashboard.service.DaftarIndukAlatExcelFileMapperService;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DaftarIndukAlatExcelFileMapperServiceImpl implements
		DaftarIndukAlatExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(DaftarIndukAlatExcelFileMapperServiceImpl.class);

	private String pathName;

	public DaftarIndukAlatExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<DaftarIndukAlat> daftarIndukAlatExcelFileMapping()
			throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();
		String keterangan = "";
		for (int i = 0; i < list.length; i++) {
			filenames.add(list[i].getAbsolutePath());
		}

		ArrayList<DaftarIndukAlat> daftarIndukAlatList = new ArrayList<DaftarIndukAlat>();
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
						.getSheet(CommonConstant.daftarIndukAlat);
				for (int row = 6; row < sheet.getLastRowNum(); row++) {
					XSSFRow rows = sheet.getRow(row);
					if (rows != null && rows.getCell(0) != null) {
						if (rows.getCell(0).getCellType() == XSSFCell.CELL_TYPE_STRING) {
							keterangan = rows.getCell(1).getStringCellValue();
						}
						if (rows.getCell(0).getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
							DaftarIndukAlat daftarIndukAlat = new DaftarIndukAlat();
							daftarIndukAlat.setKeterangan(keterangan);
							daftarIndukAlat
									.setNoInventaris(rows.getCell(1) == null ? ""
											: rows.getCell(1)
													.getStringCellValue());
							daftarIndukAlat
									.setNamaAlat(rows.getCell(2) == null ? ""
											: rows.getCell(2)
													.getStringCellValue());
							daftarIndukAlat
									.setMerkAlat(rows.getCell(3) == null ? ""
											: rows.getCell(3)
													.getStringCellValue());
							daftarIndukAlat
									.setModelNoSeri(rows.getCell(4) == null ? ""
											: rows.getCell(4)
													.getStringCellValue());
							daftarIndukAlat
									.setSpesifikasi(rows.getCell(5) == null ? ""
											: rows.getCell(5)
													.getStringCellValue());
							daftarIndukAlat
									.setTahunBeli(rows.getCell(6) == null ? 0
											: rows.getCell(6)
													.getNumericCellValue());
							daftarIndukAlat
									.setNamaAgen(rows.getCell(7) == null ? ""
											: rows.getCell(7)
													.getStringCellValue());
							daftarIndukAlat
									.setAlamatAgen(rows.getCell(8) == null ? ""
											: rows.getCell(8)
													.getStringCellValue());
							daftarIndukAlat
									.setNoInstruksiKerja(rows.getCell(9) == null ? ""
											: rows.getCell(9)
													.getStringCellValue());
							daftarIndukAlat
									.setLokasiAlat(rows.getCell(10) == null ? ""
											: rows.getCell(10)
													.getStringCellValue());

							if ((daftarIndukAlat.getKeterangan() != null)
									&& (daftarIndukAlat.getNoInventaris() != null)
									&& (daftarIndukAlat.getNamaAlat() != null)
									&& (daftarIndukAlat.getMerkAlat() != null)
									&& (daftarIndukAlat.getModelNoSeri() != null)
									&& (daftarIndukAlat.getSpesifikasi() != null)
									&& (daftarIndukAlat.getTahunBeli() != null)
									&& (daftarIndukAlat.getNamaAgen() != null)
									&& (daftarIndukAlat.getAlamatAgen() != null)
									&& (daftarIndukAlat.getNoInstruksiKerja() != null)
									&& (daftarIndukAlat.getLokasiAlat() != null)) {

								if ((!daftarIndukAlat.getNoInventaris().equals(
										""))
										&& (!daftarIndukAlat.getNamaAlat()
												.equals(""))
										&& (!daftarIndukAlat.getMerkAlat()
												.equals(""))
										&& (!daftarIndukAlat.getModelNoSeri()
												.equals(""))
										&& (!daftarIndukAlat.getSpesifikasi()
												.equals(""))
										&& (daftarIndukAlat.getTahunBeli() != 0.0)
										&& (!daftarIndukAlat.getNamaAgen()
												.equals(""))
										&& (!daftarIndukAlat.getAlamatAgen()
												.equals(""))
										&& (!daftarIndukAlat
												.getNoInstruksiKerja().equals(
														""))
										&& (!daftarIndukAlat.getLokasiAlat()
												.equals(""))) {

									daftarIndukAlatList.add(daftarIndukAlat);

								}

							}

						}

					}

				}

			}

		}

		return daftarIndukAlatList;

	}

}
