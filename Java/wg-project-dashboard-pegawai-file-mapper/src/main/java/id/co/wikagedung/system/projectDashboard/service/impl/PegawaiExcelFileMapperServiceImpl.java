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
import id.co.wikagedung.system.projectDashboard.model.Pegawai;
import id.co.wikagedung.system.projectDashboard.service.PegawaiExcelFileMapperService;

public class PegawaiExcelFileMapperServiceImpl implements
		PegawaiExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(PegawaiExcelFileMapperServiceImpl.class);

	private String pathName;

	public PegawaiExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<Pegawai> pegawaiExcelFileMapping()
			throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();
		String jabatan = "";
		String subJabatan = "";

		for (int i = 0; i < list.length; i++) {
			filenames.add(list[i].getAbsolutePath());
		}

		ArrayList<Pegawai> pegawaiList = new ArrayList<Pegawai>();

		for (int i = 0; i < filenames.size(); i++) {
			String filePath = filenames.get(i);
			LOGGER.info("Read file with file path : " + filePath);

			File file = new File(filePath);
			if (file.getAbsolutePath().contains("READ")) {
				LOGGER.info("File with file path " + filePath
						+ " has been read");
			} else {
				XSSFWorkbook workbook = new XSSFWorkbook(file);
				XSSFSheet sheet = workbook.getSheet(CommonConstant.pegawai);

				for (int row = 5; row < sheet.getLastRowNum(); row++) {
					XSSFRow rows = sheet.getRow(row);
					if (rows != null
							&& rows.getCell(4) != null
							&& rows.getCell(4).getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
						Pegawai pegawai = new Pegawai();
						if (rows.getCell(2) != null
								&& rows.getCell(2).getStringCellValue() != null
								&& !rows.getCell(2).getStringCellValue().trim()
										.equals("")) {
							jabatan = rows.getCell(2).getStringCellValue();
							subJabatan = rows.getCell(2).getStringCellValue();
						}
						if (rows.getCell(3) != null
								&& rows.getCell(3).getStringCellValue() != null
								&& !rows.getCell(3).getStringCellValue().trim()
										.equals("")) {
							subJabatan = rows.getCell(3).getStringCellValue();
						}

						pegawai.setJabatan(jabatan);
						pegawai.setSubJabatan(subJabatan);
						pegawai.setNama(rows.getCell(5).getStringCellValue());
						pegawai.setNip(rows.getCell(6).getStringCellValue());
						pegawai.setStatusPendidikan(rows.getCell(7)
								.getStringCellValue());

						pegawaiList.add(pegawai);
					}
				}
			}
		}
		return pegawaiList;
	}

}
