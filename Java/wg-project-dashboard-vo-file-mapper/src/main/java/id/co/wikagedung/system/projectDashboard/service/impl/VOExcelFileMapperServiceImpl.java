package id.co.wikagedung.system.projectDashboard.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import id.co.wikagedung.system.projectDashboard.constant.CommonConstant;
import id.co.wikagedung.system.projectDashboard.model.VO;
import id.co.wikagedung.system.projectDashboard.model.VOResume;
import id.co.wikagedung.system.projectDashboard.service.VOExcelFileMapperService;

public class VOExcelFileMapperServiceImpl implements VOExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(VOExcelFileMapperServiceImpl.class);

	private String pathName;

	public VOExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public VOResume voResumeExcelFileMapping()
			throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();
		int i = 0;
		for (; i < list.length; i++) {
			filenames.add(list[i].getAbsolutePath());
		}
		
		VOResume voResume = new VOResume();
		ArrayList<VO> voList = new ArrayList<VO>();
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
				XSSFSheet sheet = workbook.getSheet(CommonConstant.VO);

				for (int row = 10; row < sheet.getLastRowNum(); row++) {

					XSSFRow rows = sheet.getRow(row);
					if (rows != null) {
						if (rows.getCell(0) != null
								&& rows.getCell(0).getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
							VO vo = new VO();
							vo.setItemPengerjaan(rows.getCell(1) == null ? null
									: rows.getCell(1).getStringCellValue());
							vo.setNoSuratPengajuan(rows.getCell(2) == null ? null
									: rows.getCell(2).getStringCellValue());
							vo.setTanggalPengajuan(rows.getCell(3) == null ? null
									: rows.getCell(3).getDateCellValue());
							vo.setPermohonanYangDiajukanBiaya(rows.getCell(4) == null ? null
									: rows.getCell(4).getStringCellValue());
							vo.setPermohonanYangDiajukanWaktu(rows.getCell(5) == null ? null
									: rows.getCell(5).getStringCellValue());
							vo.setBesarnyaClaimAtasVODiajukan(rows.getCell(6) == null ? null
									: rows.getCell(6).getNumericCellValue());
							vo.setBesarnyaClaimAtasVONegosiasi(rows.getCell(7) == null ? null
									: rows.getCell(7).getNumericCellValue());
							vo.setBesarnyaClaimAtasVODisetujui(rows.getCell(8) == null ? null
									: rows.getCell(8).getNumericCellValue());
							vo.setBesarnyaClaimAtasVODiprogress(rows.getCell(9) == null ? null
									: rows.getCell(9).getNumericCellValue());
							vo.setBesarnyaClaimAtasVODibayar(rows.getCell(10) == null ? null
									: rows.getCell(10).getNumericCellValue());
							vo.setPelaksanaanSudah(rows.getCell(11) == null ? null
									: rows.getCell(11).getStringCellValue());
							vo.setPelaksanaanBelum(rows.getCell(12) == null ? null
									: rows.getCell(12).getStringCellValue());
							vo.setKeterangan(rows.getCell(13) == null ? null
									: rows.getCell(13).getStringCellValue());

							voList.add(vo);
						}
					}
				}
				voResume.setOkAwal(sheet.getRow(3).getCell(2).getNumericCellValue());
				voResume.setVoDisetujui(sheet.getRow(4).getCell(2).getNumericCellValue());
				voResume.setOkSaatIni(sheet.getRow(5).getCell(2).getNumericCellValue());
				voResume.setVo(voList);

			}
		}
		return voResume;
	}

}
