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
import id.co.wikagedung.system.projectDashboard.model.LabaRugi;
import id.co.wikagedung.system.projectDashboard.service.LabaRugiExcelFileMapperService;

public class LabaRugiExcelFileMapperServiceImpl implements
		LabaRugiExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(LabaRugiExcelFileMapperServiceImpl.class);

	private String pathName;

	public LabaRugiExcelFileMapperServiceImpl(String pathName) {
		// TODO Auto-generated constructor stub
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<LabaRugi> labaRugiExcelFileMapping() throws IOException,
			InvalidFormatException {
		// TODO Auto-generated method stub

		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();
		int i = 0;
		for (; i < list.length; i++) {
			filenames.add(list[i].getAbsolutePath());
		}

		ArrayList<LabaRugi> labaRugiList = new ArrayList<LabaRugi>();
		i = 0;
		for (; i < filenames.size(); i++) {
			String filePath = filenames.get(i);
			LOGGER.info("Read file with file path : " + filePath);

			File file = new File(filePath);
			if (file.getAbsolutePath().contains("READ")) {
				LOGGER.info("File with file path " + filePath
						+ " has been read");
			} else {
				XSSFWorkbook workbook = new XSSFWorkbook(file);
				XSSFSheet sheet = workbook.getSheet(CommonConstant.LABARUGI);

				for (int row = 0; row < sheet.getLastRowNum(); row++) {
					if (row == 9 || row == 10 || row == 11 || row == 12
							|| row == 17 || row == 18 || row == 19 || row == 20
							|| row == 21 || row == 22 || row == 23 || row == 24
							|| row == 25 || row == 31 || row == 32 || row == 36
							|| row == 37 || row == 38) {

						XSSFRow rows = sheet.getRow(row);
						LabaRugi labaRugi = new LabaRugi();
						if (row == 9) {
							labaRugi.setKodeUraian(CommonConstant.BIAYAMATERIAL);
						} else if (row == 10) {
							labaRugi.setKodeUraian(CommonConstant.BIAYAUPAH);
						} else if (row == 11) {
							labaRugi.setKodeUraian(CommonConstant.BIAYAALAT);
						} else if (row == 12) {
							labaRugi.setKodeUraian(CommonConstant.BIAYASUBKONT);
						} else if (row == 17) {
							labaRugi.setKodeUraian(CommonConstant.BIAYAPEMASARAN);
						} else if (row == 18) {
							labaRugi.setKodeUraian(CommonConstant.BIAYASEKRETARIAT);
						} else if (row == 19) {
							labaRugi.setKodeUraian(CommonConstant.BIAYAFASILITAS);
						} else if (row == 20) {
							labaRugi.setKodeUraian(CommonConstant.BIAYAPERSONALIA);
						} else if (row == 21) {
							labaRugi.setKodeUraian(CommonConstant.BIAYAKEUANGAN);
						} else if (row == 22) {
							labaRugi.setKodeUraian(CommonConstant.PPHFINAL);
						} else if (row == 23) {
							labaRugi.setKodeUraian(CommonConstant.BIAYAKENDARAAN);
						} else if (row == 24) {
							labaRugi.setKodeUraian(CommonConstant.BIAYAPENGUJIAN);
						} else if (row == 25) {
							labaRugi.setKodeUraian(CommonConstant.BIAYAUMUM);
						} else if (row == 31) {
							labaRugi.setKodeUraian(CommonConstant.BEBANBUPUSAT);
						} else if (row == 32) {
							labaRugi.setKodeUraian(CommonConstant.BEBANBUDIVISI);
						} else if (row == 36) {
							labaRugi.setKodeUraian(CommonConstant.LABARUGILAIN);
						} else if (row == 37) {
							labaRugi.setKodeUraian(CommonConstant.SELISIHKURS);
						} else if (row == 38) {
							labaRugi.setKodeUraian(CommonConstant.BEBANBYBUNGA);
						}

						labaRugi.setRkp(rows.getCell(3).getNumericCellValue());
						labaRugi.setSampaiTahunLalu(rows.getCell(4)
								.getNumericCellValue());
						labaRugi.setBulanLalu(rows.getCell(5)
								.getNumericCellValue());
						labaRugi.setBulanIni(rows.getCell(6)
								.getNumericCellValue());
						labaRugi.setSampaiBulanIni(rows.getCell(7)
								.getNumericCellValue());
						labaRugi.setSampaiTahunIni(rows.getCell(8)
								.getNumericCellValue());

						labaRugiList.add(labaRugi);
					}
				}
			}

		}

		return labaRugiList;
	}

}
