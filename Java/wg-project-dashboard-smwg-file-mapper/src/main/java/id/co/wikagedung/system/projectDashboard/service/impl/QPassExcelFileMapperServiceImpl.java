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
import id.co.wikagedung.system.projectDashboard.model.qPass.PekerjaanArsitektur;
import id.co.wikagedung.system.projectDashboard.model.qPass.PekerjaanArsitekturEksternalWork;
import id.co.wikagedung.system.projectDashboard.model.qPass.PekerjaanArsitekturEskternalWall;
import id.co.wikagedung.system.projectDashboard.model.qPass.PekerjaanArsitekturInternalFinishes;
import id.co.wikagedung.system.projectDashboard.model.qPass.PekerjaanArsitekturTesFungsi;
import id.co.wikagedung.system.projectDashboard.model.qPass.PekerjaanStruktur;
import id.co.wikagedung.system.projectDashboard.model.qPass.PekerjaanStrukturBekisting;
import id.co.wikagedung.system.projectDashboard.model.qPass.PekerjaanStrukturBesi;
import id.co.wikagedung.system.projectDashboard.model.qPass.PekerjaanStrukturBetonFinish;
import id.co.wikagedung.system.projectDashboard.model.qPass.PekerjaanStrukturMutuBesi;
import id.co.wikagedung.system.projectDashboard.model.qPass.PekerjaanStrukturMutuBeton;
import id.co.wikagedung.system.projectDashboard.model.qPass.QPass;
import id.co.wikagedung.system.projectDashboard.service.QPassExcelFileMapperService;

public class QPassExcelFileMapperServiceImpl implements
		QPassExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(QPassExcelFileMapperServiceImpl.class);

	private String pathName;

	public QPassExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<QPass> qPassExcelFileMapping() throws IOException,
			InvalidFormatException {

		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {

			filenames.add(list[i].getAbsolutePath());

		}

		ArrayList<QPass> qPassList = new ArrayList<QPass>();

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
						.getSheet(CommonConstant.WG_Q_PASS_SHEET_CONSTANT);

				QPass qPass = new QPass();

				PekerjaanStruktur pekerjaanStruktur = new PekerjaanStruktur();
				PekerjaanStrukturBekisting pekerjaanStrukturBekisting = new PekerjaanStrukturBekisting();
				PekerjaanStrukturBesi pekerjaanStrukturBesi = new PekerjaanStrukturBesi();
				PekerjaanStrukturBetonFinish pekerjaanStrukturBetonFinish = new PekerjaanStrukturBetonFinish();
				PekerjaanStrukturMutuBeton pekerjaanStrukturMutuBeton = new PekerjaanStrukturMutuBeton();
				PekerjaanStrukturMutuBesi pekerjaanStrukturMutuBesi = new PekerjaanStrukturMutuBesi();

				PekerjaanArsitektur pekerjaanArsitektur = new PekerjaanArsitektur();
				PekerjaanArsitekturInternalFinishes pekerjaanArsitekturInternalFinishes = new PekerjaanArsitekturInternalFinishes();
				PekerjaanArsitekturEskternalWall pekerjaanArsitekturEskternalWall = new PekerjaanArsitekturEskternalWall();
				PekerjaanArsitekturEksternalWork pekerjaanArsitekturEksternalWork = new PekerjaanArsitekturEksternalWork();
				PekerjaanArsitekturTesFungsi pekerjaanArsitekturTesFungsi = new PekerjaanArsitekturTesFungsi();

				for (int row = 0; row < sheet.getLastRowNum(); row++) {

					XSSFRow rows = sheet.getRow(row);

					if (rows != null) {

						for (int column = 0; column < rows.getLastCellNum(); column++) {

							XSSFCell cell = rows.getCell(column);

							if (cell != null) {

								if ((cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
										|| (cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA)) {

									if (row == 8) {

										if (column == 2) {

											pekerjaanStrukturBekisting
													.setJumlahSampelRencana(cell
															.getNumericCellValue());

										}

										if (column == 3) {

											pekerjaanStrukturBekisting
													.setJumlahSampeSampaiBulanIniRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 4) {

											pekerjaanStrukturBekisting
													.setJumlahItemPenilaian(cell
															.getNumericCellValue());

										}

										if (column == 5) {

											pekerjaanStrukturBekisting
													.setJumlahItemDiterima(cell
															.getNumericCellValue());

										}

										if (column == 6) {

											pekerjaanStrukturBekisting
													.setBobotProsentaseSatu(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											pekerjaanStrukturBekisting
													.setBobotProsentaseDua(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											pekerjaanStrukturBekisting
													.setDataAssesTotalMemenuhiSyarat(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											pekerjaanStrukturBekisting
													.setDataAssesTotalJumlahItemDicek(cell
															.getNumericCellValue());

										}

										if (column == 10) {

											pekerjaanStrukturBekisting
													.setDataAssesTotalMemenuhiSyarat(cell
															.getNumericCellValue());

										}

										if (column == 11) {

											pekerjaanStrukturBekisting
													.setProsentaseDiterima(cell
															.getNumericCellValue());

										}

										if (column == 12) {

											pekerjaanStrukturBekisting
													.setPoint(cell
															.getNumericCellValue());

										}

										if (column == 13) {

											pekerjaanStrukturBekisting
													.setScore(cell
															.getNumericCellValue());

										}

										if (column == 14) {

											pekerjaanStrukturBekisting
													.setTotal(cell
															.getNumericCellValue());

										}

									}

									if (row == 9) {

										if (column == 2) {

											pekerjaanStrukturBesi
													.setJumlahSampelRencana(cell
															.getNumericCellValue());

										}

										if (column == 3) {

											pekerjaanStrukturBesi
													.setJumlahSampeSampaiBulanIniRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 4) {

											pekerjaanStrukturBesi
													.setJumlahItemPenilaian(cell
															.getNumericCellValue());

										}

										if (column == 5) {

											pekerjaanStrukturBesi
													.setJumlahItemDiterima(cell
															.getNumericCellValue());

										}

										if (column == 6) {

											pekerjaanStrukturBesi
													.setBobotProsentaseSatu(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											pekerjaanStrukturBesi
													.setBobotProsentaseDua(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											pekerjaanStrukturBesi
													.setDataAssesTotalMemenuhiSyarat(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											pekerjaanStrukturBesi
													.setDataAssesTotalJumlahItemDicek(cell
															.getNumericCellValue());

										}

										if (column == 10) {

											pekerjaanStrukturBesi
													.setDataAssesBobot(cell
															.getNumericCellValue());

										}

										if (column == 11) {

											pekerjaanStrukturBesi
													.setProsentaseDiterima(cell
															.getNumericCellValue());

										}

										if (column == 12) {

											pekerjaanStrukturBesi.setPoint(cell
													.getNumericCellValue());

										}

										if (column == 13) {

											pekerjaanStrukturBesi.setScore(cell
													.getNumericCellValue());

										}

										if (column == 14) {

											pekerjaanStrukturBesi.setTotal(cell
													.getNumericCellValue());

										}

									}

									if (row == 10) {

										if (column == 2) {

											pekerjaanStrukturBetonFinish
													.setJumlahSampelRencana(cell
															.getNumericCellValue());

										}

										if (column == 3) {

											pekerjaanStrukturBetonFinish
													.setJumlahSampeSampaiBulanIniRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 4) {

											pekerjaanStrukturBetonFinish
													.setJumlahItemPenilaian(cell
															.getNumericCellValue());

										}

										if (column == 5) {

											pekerjaanStrukturBetonFinish
													.setJumlahItemDiterima(cell
															.getNumericCellValue());

										}

										if (column == 6) {

											pekerjaanStrukturBetonFinish
													.setBobotProsentaseSatu(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											pekerjaanStrukturBetonFinish
													.setBobotProsentaseDua(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											pekerjaanStrukturBetonFinish
													.setDataAssesTotalMemenuhiSyarat(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											pekerjaanStrukturBetonFinish
													.setDataAssesTotalJumlahItemDicek(cell
															.getNumericCellValue());

										}

										if (column == 10) {

											pekerjaanStrukturBetonFinish
													.setDataAssesBobot(cell
															.getNumericCellValue());

										}

										if (column == 11) {

											pekerjaanStrukturBetonFinish
													.setProsentaseDiterima(cell
															.getNumericCellValue());

										}

										if (column == 12) {

											pekerjaanStrukturBetonFinish
													.setPoint(cell
															.getNumericCellValue());

										}

										if (column == 13) {

											pekerjaanStrukturBetonFinish
													.setScore(cell
															.getNumericCellValue());

										}

										if (column == 14) {

											pekerjaanStrukturBetonFinish
													.setTotal(cell
															.getNumericCellValue());

										}

									}

									if (row == 11) {

										if (column == 2) {

											pekerjaanStrukturMutuBeton
													.setJumlahSampelRencana(cell
															.getNumericCellValue());

										}

										if (column == 3) {

											pekerjaanStrukturMutuBeton
													.setJumlahSampeSampaiBulanIniRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 4) {

											pekerjaanStrukturMutuBeton
													.setJumlahItemPenilaian(cell
															.getNumericCellValue());

										}

										if (column == 5) {

											pekerjaanStrukturMutuBeton
													.setJumlahItemDiterima(cell
															.getNumericCellValue());

										}

										if (column == 6) {

											pekerjaanStrukturMutuBeton
													.setBobotProsentaseSatu(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											pekerjaanStrukturMutuBeton
													.setBobotProsentaseDua(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											pekerjaanStrukturMutuBeton
													.setDataAssesTotalMemenuhiSyarat(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											pekerjaanStrukturMutuBeton
													.setDataAssesTotalJumlahItemDicek(cell
															.getNumericCellValue());

										}

										if (column == 10) {

											pekerjaanStrukturMutuBeton
													.setDataAssesBobot(cell
															.getNumericCellValue());

										}

										if (column == 11) {

											pekerjaanStrukturMutuBeton
													.setProsentaseDiterima(cell
															.getNumericCellValue());

										}

										if (column == 12) {

											pekerjaanStrukturMutuBeton
													.setPoint(cell
															.getNumericCellValue());

										}

										if (column == 13) {

											pekerjaanStrukturMutuBeton
													.setScore(cell
															.getNumericCellValue());

										}

										if (column == 14) {

											pekerjaanStrukturMutuBeton
													.setTotal(cell
															.getNumericCellValue());
										}

									}

									if (row == 12) {

										if (column == 2) {

											pekerjaanStrukturMutuBesi
													.setJumlahSampelRencana(cell
															.getNumericCellValue());

										}

										if (column == 3) {

											pekerjaanStrukturMutuBesi
													.setJumlahSampeSampaiBulanIniRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 4) {

											pekerjaanStrukturMutuBesi
													.setJumlahItemPenilaian(cell
															.getNumericCellValue());

										}

										if (column == 5) {

											pekerjaanStrukturMutuBesi
													.setJumlahItemDiterima(cell
															.getNumericCellValue());

										}

										if (column == 6) {

											pekerjaanStrukturMutuBesi
													.setBobotProsentaseSatu(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											pekerjaanStrukturMutuBesi
													.setBobotProsentaseDua(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											pekerjaanStrukturMutuBesi
													.setDataAssesTotalMemenuhiSyarat(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											pekerjaanStrukturMutuBesi
													.setDataAssesTotalJumlahItemDicek(cell
															.getNumericCellValue());

										}

										if (column == 10) {

											pekerjaanStrukturMutuBesi
													.setDataAssesBobot(cell
															.getNumericCellValue());

										}

										if (column == 11) {

											pekerjaanStrukturMutuBesi
													.setProsentaseDiterima(cell
															.getNumericCellValue());

										}

										if (column == 12) {

											pekerjaanStrukturMutuBesi
													.setPoint(cell
															.getNumericCellValue());

										}

										if (column == 13) {

											pekerjaanStrukturMutuBesi
													.setScore(cell
															.getNumericCellValue());

										}

										if (column == 14) {

											pekerjaanStrukturMutuBesi
													.setTotal(cell
															.getNumericCellValue());

										}

									}

									if (row == 15) {

										if (column == 2) {

											pekerjaanArsitekturInternalFinishes
													.setJumlahSampelRencana(cell
															.getNumericCellValue());

										}

										if (column == 3) {

											pekerjaanArsitekturInternalFinishes
													.setJumlahSampeSampaiBulanIniRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 4) {

											pekerjaanArsitekturInternalFinishes
													.setJumlahItemPenilaian(cell
															.getNumericCellValue());

										}

										if (column == 5) {

											pekerjaanArsitekturInternalFinishes
													.setJumlahItemDiterima(cell
															.getNumericCellValue());

										}

										if (column == 6) {

											pekerjaanArsitekturInternalFinishes
													.setBobotProsentaseSatu(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											pekerjaanArsitekturInternalFinishes
													.setBobotProsentaseDua(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											pekerjaanArsitekturInternalFinishes
													.setDataAssesTotalMemenuhiSyarat(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											pekerjaanArsitekturInternalFinishes
													.setDataAssesTotalJumlahItemDicek(cell
															.getNumericCellValue());

										}

										if (column == 10) {

											pekerjaanArsitekturInternalFinishes
													.setDataAssesBobot(cell
															.getNumericCellValue());

										}

										if (column == 11) {

											pekerjaanArsitekturInternalFinishes
													.setProsentaseDiterima(cell
															.getNumericCellValue());

										}

										if (column == 12) {

											pekerjaanArsitekturInternalFinishes
													.setPoint(cell
															.getNumericCellValue());

										}

										if (column == 13) {

											pekerjaanArsitekturInternalFinishes
													.setScore(cell
															.getNumericCellValue());

										}

										if (column == 14) {

											pekerjaanArsitekturInternalFinishes
													.setTotal(cell
															.getNumericCellValue());

										}

									}

									if (row == 16) {

										if (column == 2) {

											pekerjaanArsitekturEskternalWall
													.setJumlahSampelRencana(cell
															.getNumericCellValue());

										}

										if (column == 3) {

											pekerjaanArsitekturEskternalWall
													.setJumlahSampeSampaiBulanIniRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 4) {

											pekerjaanArsitekturEskternalWall
													.setJumlahItemPenilaian(cell
															.getNumericCellValue());

										}

										if (column == 5) {

											pekerjaanArsitekturEskternalWall
													.setJumlahItemDiterima(cell
															.getNumericCellValue());

										}

										if (column == 6) {

											pekerjaanArsitekturEskternalWall
													.setBobotProsentaseSatu(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											pekerjaanArsitekturEskternalWall
													.setBobotProsentaseDua(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											pekerjaanArsitekturEskternalWall
													.setDataAssesTotalMemenuhiSyarat(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											pekerjaanArsitekturEskternalWall
													.setDataAssesTotalJumlahItemDicek(cell
															.getNumericCellValue());

										}

										if (column == 10) {

											pekerjaanArsitekturEskternalWall
													.setDataAssesBobot(cell
															.getNumericCellValue());

										}

										if (column == 11) {

											pekerjaanArsitekturEskternalWall
													.setProsentaseDiterima(cell
															.getNumericCellValue());

										}

										if (column == 12) {

											pekerjaanArsitekturEskternalWall
													.setPoint(cell
															.getNumericCellValue());

										}

										if (column == 13) {

											pekerjaanArsitekturEskternalWall
													.setScore(cell
															.getNumericCellValue());

										}

										if (column == 14) {

											pekerjaanArsitekturEskternalWall
													.setTotal(cell
															.getNumericCellValue());

										}

									}

									if (row == 17) {

										if (column == 2) {

											pekerjaanArsitekturEksternalWork
													.setJumlahSampelRencana(cell
															.getNumericCellValue());

										}

										if (column == 3) {

											pekerjaanArsitekturEksternalWork
													.setJumlahSampeSampaiBulanIniRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 4) {

											pekerjaanArsitekturEksternalWork
													.setJumlahItemPenilaian(cell
															.getNumericCellValue());

										}

										if (column == 5) {

											pekerjaanArsitekturEksternalWork
													.setJumlahItemDiterima(cell
															.getNumericCellValue());

										}

										if (column == 6) {

											pekerjaanArsitekturEksternalWork
													.setBobotProsentaseSatu(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											pekerjaanArsitekturEksternalWork
													.setBobotProsentaseDua(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											pekerjaanArsitekturEksternalWork
													.setDataAssesTotalMemenuhiSyarat(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											pekerjaanArsitekturEksternalWork
													.setDataAssesTotalJumlahItemDicek(cell
															.getNumericCellValue());

										}

										if (column == 10) {

											pekerjaanArsitekturEksternalWork
													.setDataAssesBobot(cell
															.getNumericCellValue());

										}

										if (column == 11) {

											pekerjaanArsitekturEksternalWork
													.setProsentaseDiterima(cell
															.getNumericCellValue());

										}

										if (column == 12) {

											pekerjaanArsitekturEksternalWork
													.setPoint(cell
															.getNumericCellValue());

										}

										if (column == 13) {

											pekerjaanArsitekturEksternalWork
													.setScore(cell
															.getNumericCellValue());

										}

										if (column == 14) {

											pekerjaanArsitekturEksternalWork
													.setTotal(cell
															.getNumericCellValue());

										}

									}

									if (row == 18) {

										if (column == 2) {

											pekerjaanArsitekturTesFungsi
													.setJumlahSampelRencana(cell
															.getNumericCellValue());

										}

										if (column == 3) {

											pekerjaanArsitekturTesFungsi
													.setJumlahSampeSampaiBulanIniRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 4) {

											pekerjaanArsitekturTesFungsi
													.setJumlahItemPenilaian(cell
															.getNumericCellValue());

										}

										if (column == 5) {

											pekerjaanArsitekturTesFungsi
													.setJumlahItemDiterima(cell
															.getNumericCellValue());

										}

										if (column == 6) {

											pekerjaanArsitekturTesFungsi
													.setBobotProsentaseSatu(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											pekerjaanArsitekturTesFungsi
													.setBobotProsentaseDua(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											pekerjaanArsitekturTesFungsi
													.setDataAssesTotalMemenuhiSyarat(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											pekerjaanArsitekturTesFungsi
													.setDataAssesTotalJumlahItemDicek(cell
															.getNumericCellValue());

										}

										if (column == 10) {

											pekerjaanArsitekturTesFungsi
													.setDataAssesBobot(cell
															.getNumericCellValue());

										}

										if (column == 11) {

											pekerjaanArsitekturTesFungsi
													.setProsentaseDiterima(cell
															.getNumericCellValue());

										}

										if (column == 12) {

											pekerjaanArsitekturTesFungsi
													.setPoint(cell
															.getNumericCellValue());

										}

										if (column == 13) {

											pekerjaanArsitekturTesFungsi
													.setScore(cell
															.getNumericCellValue());

										}

										if (column == 14) {

											pekerjaanArsitekturTesFungsi
													.setTotal(cell
															.getNumericCellValue());

										}

									}

								}

							}

						}

					}

				}

				pekerjaanStruktur
						.setPekerjaanStrukturBekisting(pekerjaanStrukturBekisting);
				pekerjaanStruktur
						.setPekerjaanStrukturBesi(pekerjaanStrukturBesi);
				pekerjaanStruktur
						.setPekerjaanStrukturBetonFinish(pekerjaanStrukturBetonFinish);
				pekerjaanStruktur
						.setPekerjaanStrukturMutuBeton(pekerjaanStrukturMutuBeton);
				pekerjaanStruktur
						.setPekerjaanStrukturMutuBesi(pekerjaanStrukturMutuBesi);

				pekerjaanArsitektur
						.setPekerjaanArsitekturInternalFinishes(pekerjaanArsitekturInternalFinishes);
				pekerjaanArsitektur
						.setPekerjaanArsitekturEskternalWall(pekerjaanArsitekturEskternalWall);
				pekerjaanArsitektur
						.setPekerjaanArsitekturEksternalWork(pekerjaanArsitekturEksternalWork);
				pekerjaanArsitektur
						.setPekerjaanArsitekturTesFungsi(pekerjaanArsitekturTesFungsi);

				qPass.setPekerjaanStruktur(pekerjaanStruktur);
				qPass.setPekerjaanArsitektur(pekerjaanArsitektur);

				qPassList.add(qPass);

			}
		}

		return qPassList;

	}

}
