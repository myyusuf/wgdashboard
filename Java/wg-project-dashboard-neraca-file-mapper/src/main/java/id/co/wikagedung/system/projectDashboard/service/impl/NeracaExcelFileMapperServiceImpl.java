package id.co.wikagedung.system.projectDashboard.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import id.co.wikagedung.system.projectDashboard.constant.CommonConstant;
import id.co.wikagedung.system.projectDashboard.model.Neraca;
import id.co.wikagedung.system.projectDashboard.service.NeracaExcelFileMapperService;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NeracaExcelFileMapperServiceImpl implements
		NeracaExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(NeracaExcelFileMapperServiceImpl.class);

	private String pathName;

	public NeracaExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<Neraca> neracaExcelFileMapping() throws InvalidFormatException,
			IOException {
		// TODO Auto-generated method stub
		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {
			filenames.add(list[i].getAbsolutePath());
		}
		ArrayList<Neraca> neracaList = new ArrayList<Neraca>();

		for (int i = 0; i < filenames.size(); i++) {
			String filePath = filenames.get(i);
			LOGGER.info("Read file with file path : " + filePath);

			File file = new File(filePath);
			if (file.getAbsolutePath().contains("READ")) {
				LOGGER.info("File with file path " + filePath
						+ " has been read");
			} else {
				XSSFWorkbook workbook = new XSSFWorkbook(file);
				XSSFSheet sheet = workbook.getSheet(CommonConstant.neraca);

				for (int row = 5; row < sheet.getLastRowNum(); row++) {
					XSSFRow rows = sheet.getRow(row);
					if (rows != null) {
						if (rows.getCell(2) != null
								&& rows.getCell(2).getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
							Neraca neraca = new Neraca();
							neraca.setKode(rows.getCell(2).getNumericCellValue());
							neraca.setJumlah(rows.getCell(5).getNumericCellValue());
							neracaList.add(neraca);

						}
						if (rows.getCell(7) != null
								&& rows.getCell(7).getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
							Neraca neraca = new Neraca();
							neraca.setKode(rows.getCell(7).getNumericCellValue());
							neraca.setJumlah(rows.getCell(10).getNumericCellValue());
							neracaList.add(neraca);
						}
					}
				}
			}
		}
		return neracaList;
	}

}
