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
import id.co.wikagedung.system.projectDashboard.model.MonitoringPenjualan;
import id.co.wikagedung.system.projectDashboard.service.MonitoringPenjualanFileMapperService;

public class MonitoringPenjualanFileMapperServiceImpl implements
		MonitoringPenjualanFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(MonitoringPenjualanFileMapperServiceImpl.class);

	private String pathName;

	public MonitoringPenjualanFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<MonitoringPenjualan> monitoringPenjualanExcelFileMapping()
			throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {
			filenames.add(list[i].getAbsolutePath());
		}

		ArrayList<MonitoringPenjualan> monPenjList = new ArrayList<MonitoringPenjualan>();
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
						.getSheet(CommonConstant.MONITORING_PENJUALAN);
				for (int row = 10; row < sheet.getLastRowNum(); row++) {
					XSSFRow rows = sheet.getRow(row);
					if (rows != null
							&& rows.getCell(0) != null
							&& rows.getCell(0).getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
						MonitoringPenjualan monitoringPenjualan = new MonitoringPenjualan();

						monitoringPenjualan.setNoBuktiMemorial(rows.getCell(1)
								.getStringCellValue());
						monitoringPenjualan.setBulan(rows.getCell(2)
								.getStringCellValue());
						monitoringPenjualan.setPrestThdOkAkhirBulan(rows
								.getCell(4).getNumericCellValue());
						monitoringPenjualan.setPrestThdOkAkhirKumulatif(rows
								.getCell(5).getNumericCellValue());
						monitoringPenjualan.setProduksiBulan(rows.getCell(6)
								.getNumericCellValue());
						monitoringPenjualan.setProduksiKumulatif(rows
								.getCell(7).getNumericCellValue());

						monPenjList.add(monitoringPenjualan);
					}
				}
			}
		}

		return monPenjList;
	}

}
