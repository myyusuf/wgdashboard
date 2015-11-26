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
import id.co.wikagedung.system.projectDashboard.model.Pdp;
import id.co.wikagedung.system.projectDashboard.service.PdpExcelFileMapperService;

public class PdpExcelFileMapperServiceImpl implements PdpExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(PdpExcelFileMapperServiceImpl.class);

	private String pathName;

	public PdpExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<Pdp> pdpExcelFileMapping() throws IOException,
			InvalidFormatException {

		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {

			filenames.add(list[i].getAbsolutePath());

		}

		ArrayList<Pdp> pdpList = new ArrayList<Pdp>();

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
						.getSheet(CommonConstant.WG_PDP_SHEET_CONSTANT);

				for (int row = 0; row < sheet.getLastRowNum(); row++) {

					Pdp pdp = new Pdp();

					XSSFRow rows = sheet.getRow(row);

					if (rows != null) {

						for (int column = 0; column < rows.getLastCellNum(); column++) {

							XSSFCell cell = rows.getCell(column);

							if (cell != null) {

								if ((cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
										|| (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
										|| (cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA)) {

									if (row >= 8) {

										if (rows.getCell(0) != null) {

											if (column == 0) {

												pdp.setSpk(cell
														.getStringCellValue());

											}

											if (column == 1) {

												pdp.setProyek(cell
														.getStringCellValue());

											}

											if (column == 2) {

												pdp.setOk(cell
														.getNumericCellValue());

											}

											if (column == 3) {

												pdp.setOp(cell
														.getNumericCellValue());

											}

											if (column == 4) {

												pdp.setDuaSetengahPersenOp(cell
														.getNumericCellValue());

											}

											if (column == 5) {

												pdp.setSiVo(cell
														.getNumericCellValue());

											}

											if (column == 6) {

												pdp.setSiVoProsentase(cell
														.getNumericCellValue());

											}

											if (column == 7) {

												pdp.setCutOff(cell
														.getNumericCellValue());

											}

											if (column == 8) {

												pdp.setCutOffProsentase(cell
														.getNumericCellValue());

											}

											if (column == 9) {

												pdp.setPreliminaries(cell
														.getNumericCellValue());

											}

											if (column == 10) {

												pdp.setInvestasi(cell
														.getNumericCellValue());

											}

											if (column == 11) {

												pdp.setTotalPdp(cell
														.getNumericCellValue());

											}

											if (column == 12) {

												pdp.setTotalPdpSebelumnya(cell
														.getNumericCellValue());

											}

											if (column == 13) {

												pdp.setKeterangan(cell
														.getStringCellValue());

											}

										}

									}

								}

							}

						}

					}

					if ((pdp.getSpk() != null) && (pdp.getProyek() != null)
							&& (pdp.getOk() != null) && (pdp.getOp() != null)
							&& (pdp.getDuaSetengahPersenOp() != null)
							&& (pdp.getSiVo() != null)
							&& (pdp.getSiVoProsentase() != null)
							&& (pdp.getCutOff() != null)
							&& (pdp.getCutOffProsentase() != null)
							&& (pdp.getPreliminaries() != null)
							&& (pdp.getInvestasi() != null)
							&& (pdp.getTotalPdp() != null)
							&& (pdp.getTotalPdpSebelumnya() != null)
							&& (pdp.getKeterangan() != null)) {

						pdpList.add(pdp);

					}

				}

			}

		}

		return pdpList;

	}
}
