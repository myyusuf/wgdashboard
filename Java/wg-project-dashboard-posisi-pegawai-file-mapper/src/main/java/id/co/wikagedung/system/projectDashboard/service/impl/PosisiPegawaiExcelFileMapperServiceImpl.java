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
import id.co.wikagedung.system.projectDashboard.model.PosisiPegawai;
import id.co.wikagedung.system.projectDashboard.service.PosisiPegawaiExcelFileMapperService;

public class PosisiPegawaiExcelFileMapperServiceImpl implements
		PosisiPegawaiExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(PosisiPegawaiExcelFileMapperServiceImpl.class);

	private String pathName;

	public PosisiPegawaiExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<PosisiPegawai> posisiPegawaiExcelFileMapping()
			throws IOException, InvalidFormatException {

		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {

			filenames.add(list[i].getAbsolutePath());

		}

		ArrayList<PosisiPegawai> posisiPegawaiList = new ArrayList<PosisiPegawai>();

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
						.getSheet(CommonConstant.WG_POSISI_PEGAWAI_SHEET_CONSTANT);

				for (int row = 0; row < sheet.getLastRowNum(); row++) {

					PosisiPegawai posisiPegawai = new PosisiPegawai();

					XSSFRow rows = sheet.getRow(row);

					if (rows != null) {

						for (int column = 0; column < rows.getLastCellNum(); column++) {

							XSSFCell cell = rows.getCell(column);

							if (cell != null) {

								if ((cell.getCellType() == XSSFCell.CELL_TYPE_STRING)) {

									if (row >= 5) {

										if (rows.getCell(4).getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {

											posisiPegawai.setRow(row);

											if (column == 3) {

												posisiPegawai.setJabatan(cell
														.getStringCellValue());

											}

											if (column == 5) {

												posisiPegawai.setNama(cell
														.getStringCellValue());

											}

											if (column == 6) {

												posisiPegawai.setNip(cell
														.getStringCellValue());

											}

											if (column == 7) {

												posisiPegawai
														.setPendidikan(cell
																.getStringCellValue());

											}

										}

									}

								}

							}

						}

					}

					if ((posisiPegawai.getNama() != null)
							&& (posisiPegawai.getNip() != null)
							&& (posisiPegawai.getPendidikan() != null)) {

						posisiPegawaiList.add(posisiPegawai);

					}

				}

			}

		}

		return posisiPegawaiList;

	}

}
