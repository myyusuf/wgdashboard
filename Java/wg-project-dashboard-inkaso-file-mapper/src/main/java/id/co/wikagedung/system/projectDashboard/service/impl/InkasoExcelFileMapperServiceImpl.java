package id.co.wikagedung.system.projectDashboard.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import id.co.wikagedung.system.projectDashboard.constant.CommonConstant;
import id.co.wikagedung.system.projectDashboard.model.Inkaso;
import id.co.wikagedung.system.projectDashboard.model.InkasoDetail;
import id.co.wikagedung.system.projectDashboard.model.InkasoResume;
import id.co.wikagedung.system.projectDashboard.service.InkasoExcelFileMapperService;

public class InkasoExcelFileMapperServiceImpl implements
		InkasoExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(InkasoExcelFileMapperServiceImpl.class);

	private String pathName;

	public InkasoExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public Inkaso inkasoExcelFileMapping() throws InvalidFormatException,
			IOException {
		// TODO Auto-generated method stub
		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		Inkaso inkaso = new Inkaso();
		ArrayList<InkasoDetail> inkasoDetailList = new ArrayList<InkasoDetail>();
		ArrayList<InkasoResume> inkasoResumeList = new ArrayList<InkasoResume>();
		String keteranganResume = "";
		String keteranganDetail = "";

		for (int i = 0; i < list.length; i++) {
			filenames.add(list[i].getAbsolutePath());
		}
		for (int i = 0; i < filenames.size(); i++) {
			String filePath = filenames.get(i);
			LOGGER.info("Read file with file path : " + filePath);

			File file = new File(filePath);
			if (file.getAbsolutePath().contains("READ")) {
				LOGGER.info("File with file path " + filePath
						+ " has been read");
			} else {
				XSSFWorkbook workbook = new XSSFWorkbook(file);
				XSSFSheet sheet = workbook.getSheet(CommonConstant.inkaso);

				for (int row = 3; row < 10; row++) {

					XSSFRow rows = sheet.getRow(row);
					if (rows != null) {
						if (rows.getCell(1) != null
								&& rows.getCell(1).getCellType() == XSSFCell.CELL_TYPE_STRING) {
							keteranganResume = rows.getCell(2)
									.getStringCellValue();
						}
						if (rows.getCell(2) != null
								&& rows.getCell(2).getStringCellValue() != null
								&& !rows.getCell(2).getStringCellValue().trim()
										.equals("")) {
							InkasoResume inkasoResume = new InkasoResume();
							Double netto = null;
							inkasoResume.setKeterangan(keteranganResume);
							inkasoResume.setUraian(rows.getCell(2)
									.getStringCellValue());
							netto = rows.getCell(3) == null? null : rows.getCell(3).getNumericCellValue();
							inkasoResume.setNetto(netto);
							inkasoResume.setPpn(netto == null? null : netto/10);
							inkasoResume.setBruto(netto == null? null : 1.1*netto);
							
							inkasoResumeList.add(inkasoResume);
						}
					}
				}
				
				for (int row = 16; row < sheet.getLastRowNum(); row++) {
					XSSFRow rows = sheet.getRow(row);
					if (rows != null){
						if (rows.getCell(1) != null
								&& rows.getCell(1).getCellType() == XSSFCell.CELL_TYPE_STRING) {
							keteranganDetail = rows.getCell(2) == null ? null : rows.getCell(2).getStringCellValue();
						}
						
						if (rows.getCell(1) != null
								&& (rows.getCell(1).getCellType() == XSSFCell.CELL_TYPE_NUMERIC || rows.getCell(1).getCellType() == XSSFCell.CELL_TYPE_FORMULA)) {
							InkasoDetail inkasoDetail = new InkasoDetail();
							Double bruto = null;
							Double netto = null;
							Double penerimaanBersih = null;
							Long jangkaWaktu = null;
							
							inkasoDetail.setKeterangan(keteranganDetail);
							inkasoDetail.setUraian(rows.getCell(2) == null? null : rows.getCell(2).getStringCellValue());
							inkasoDetail.setPrestasiBrutoPersentase(rows.getCell(3) == null ? null :rows.getCell(3).getNumericCellValue());
							inkasoDetail.setPrestasiBrutoRupiah(rows.getCell(4) == null? null : rows.getCell(4).getNumericCellValue());
							inkasoDetail.setAngsuranTM(rows.getCell(5) == null? null: rows.getCell(5).getNumericCellValue());
							inkasoDetail.setRetensi(rows.getCell(6) == null ? null : rows.getCell(6).getNumericCellValue());
							bruto = rows.getCell(7) == null? null : rows.getCell(7).getNumericCellValue();
							netto = bruto == null ? null : bruto /1.1;
							penerimaanBersih = bruto == null? null : bruto - (netto*0.03);
							inkasoDetail.setKuitansiBruto(bruto);
							inkasoDetail.setKuitansiNetto(netto);
							inkasoDetail.setKuitansiPpn(netto == null? null : netto/10);
							inkasoDetail.setPotonganPphFinal(netto == null? null :netto*0.03);
							inkasoDetail.setPenerimaanBersih(penerimaanBersih);
							inkasoDetail.setPembayaran(penerimaanBersih);
							inkasoDetail.setTagihanBelumCair(rows.getCell(13) == null? null : rows.getCell(13).getNumericCellValue());
							inkasoDetail.setMonitorWaktuTanggalMasuk(rows.getCell(14) == null? null : rows.getCell(14).getDateCellValue());
							inkasoDetail.setMonitorWaktuTanggalJatuhTempo(rows.getCell(15) == null ? null :rows.getCell(15).getDateCellValue());
							inkasoDetail.setMonitorWaktuTanggalCair(rows.getCell(16) == null ?null : rows.getCell(16).getDateCellValue());
							if(inkasoDetail.getMonitorWaktuTanggalCair() != null && inkasoDetail.getMonitorWaktuTanggalJatuhTempo() != null){
								long diff = inkasoDetail.getMonitorWaktuTanggalCair().getTime() - inkasoDetail.getMonitorWaktuTanggalJatuhTempo().getTime();
								jangkaWaktu = TimeUnit.MILLISECONDS.toDays(diff);
							}
							inkasoDetail.setJangkaWaktu(jangkaWaktu == null? null : new Double(jangkaWaktu));
							
							inkasoDetailList.add(inkasoDetail);
						}
					}
				}	
			}
		}
		inkaso.setInkasoDetail(inkasoDetailList);
		inkaso.setInkasoResume(inkasoResumeList);
		return inkaso;
	}

}
