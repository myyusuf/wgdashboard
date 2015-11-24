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
import id.co.wikagedung.system.projectDashboard.model.CustomerEngagement;
import id.co.wikagedung.system.projectDashboard.model.EfisiensiPengadaan;
import id.co.wikagedung.system.projectDashboard.model.HasilEfektifitasProses;
import id.co.wikagedung.system.projectDashboard.model.HasilFokusPadaPelanggan;
import id.co.wikagedung.system.projectDashboard.model.HasilKepemimpinan;
import id.co.wikagedung.system.projectDashboard.model.HasilKeuanganDanPasar;
import id.co.wikagedung.system.projectDashboard.model.HasilProdukdanJasa;
import id.co.wikagedung.system.projectDashboard.model.InovasiKM;
import id.co.wikagedung.system.projectDashboard.model.LabaKotor;
import id.co.wikagedung.system.projectDashboard.model.Mutu;
import id.co.wikagedung.system.projectDashboard.model.NetCashFlow;
import id.co.wikagedung.system.projectDashboard.model.Penjualan;
import id.co.wikagedung.system.projectDashboard.model.ProjectScoreCard;
import id.co.wikagedung.system.projectDashboard.model.RatioTagihanBrutto;
import id.co.wikagedung.system.projectDashboard.model.ResponseRate;
import id.co.wikagedung.system.projectDashboard.model.RiskManagement;
import id.co.wikagedung.system.projectDashboard.model.SheComplianceLevel;
import id.co.wikagedung.system.projectDashboard.service.ProjectScoreCardExcelFileMapperService;

public class ProjectScoreCardExcelFileMapperServiceImpl implements
		ProjectScoreCardExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(ProjectScoreCardExcelFileMapperServiceImpl.class);

	private String pathName;

	public ProjectScoreCardExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<ProjectScoreCard> projectScoreCardExcelFileMapping()
			throws IOException, InvalidFormatException {

		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {

			filenames.add(list[i].getAbsolutePath());

		}

		ArrayList<ProjectScoreCard> projectScoreCardList = new ArrayList<ProjectScoreCard>();

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
						.getSheet(CommonConstant.WG_PROJECT_SCORE_CARD_SHEET_CONSTANT);

				ProjectScoreCard projectScoreCard = new ProjectScoreCard();

				HasilProdukdanJasa hasilProdukdanJasa = new HasilProdukdanJasa();
				Mutu mutu = new Mutu();

				HasilFokusPadaPelanggan hasilFokusPadaPelanggan = new HasilFokusPadaPelanggan();
				CustomerEngagement customerEngagement = new CustomerEngagement();
				ResponseRate responseRate = new ResponseRate();

				HasilKeuanganDanPasar hasilKeuanganDanPasar = new HasilKeuanganDanPasar();
				LabaKotor labaKotor = new LabaKotor();
				NetCashFlow netCashFlow = new NetCashFlow();
				RatioTagihanBrutto ratioTagihanBrutto = new RatioTagihanBrutto();
				Penjualan penjualan = new Penjualan();

				HasilEfektifitasProses hasilEfektifitasProses = new HasilEfektifitasProses();
				SheComplianceLevel sheComplianceLevel = new SheComplianceLevel();
				InovasiKM inovasiKM = new InovasiKM();
				EfisiensiPengadaan efisiensiPengadaan = new EfisiensiPengadaan();

				HasilKepemimpinan hasilKepemimpinan = new HasilKepemimpinan();
				RiskManagement riskManagement = new RiskManagement();

				for (int row = 0; row < sheet.getLastRowNum(); row++) {

					XSSFRow rows = sheet.getRow(row);

					if (rows != null) {

						for (int column = 0; column < rows.getLastCellNum(); column++) {

							XSSFCell cell = rows.getCell(column);

							if (cell != null) {

								if ((cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
										|| (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
										|| (cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA)) {

									if (row == 7) {

										if (column == 5) {

											mutu.setTargetRkp(cell
													.getNumericCellValue());

										}

										if (column == 6) {

											mutu.setTargetPeriodikRencana(cell
													.getNumericCellValue());

										}

										if (column == 7) {

											mutu.setTargetPeriodikRealisasi(cell
													.getNumericCellValue());

										}

										if (column == 8) {

											mutu.setTargetPeriodikProsentase(cell
													.getNumericCellValue());

										}

										if (column == 9) {

											mutu.setNilai(cell
													.getNumericCellValue());

										}

										if (column == 10) {

											mutu.setBobotKpi(cell
													.getNumericCellValue());

										}

										if (column == 11) {

											mutu.setScoreRencana(cell
													.getNumericCellValue());

										}

										if (column == 12) {

											mutu.setScoreRealisasi(cell
													.getNumericCellValue());

										}

										if (column == 13) {

											mutu.setUpjFungsi(cell
													.getStringCellValue());

										}

										if (column == 14) {

											mutu.setLevel(cell
													.getStringCellValue());

										}

									}

									if (row == 9) {

										if (column == 5) {

											customerEngagement
													.setTargetRkp(cell
															.getNumericCellValue());

										}

										if (column == 6) {

											customerEngagement
													.setTargetPeriodikRencana(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											customerEngagement
													.setTargetPeriodikRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											customerEngagement
													.setTargetPeriodikProsentase(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											customerEngagement.setNilai(cell
													.getNumericCellValue());

										}

										if (column == 10) {

											customerEngagement.setBobotKpi(cell
													.getNumericCellValue());

										}

										if (column == 11) {

											customerEngagement
													.setScoreRencana(cell
															.getNumericCellValue());

										}

										if (column == 12) {

											customerEngagement
													.setScoreRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 13) {

											customerEngagement
													.setUpjFungsi(cell
															.getStringCellValue());

										}

										if (column == 14) {

											customerEngagement.setLevel(cell
													.getStringCellValue());

										}

									}

									if (row == 10) {

										if (column == 5) {

											responseRate.setTargetRkp(cell
													.getNumericCellValue());

										}

										if (column == 6) {

											responseRate
													.setTargetPeriodikRencana(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											responseRate
													.setTargetPeriodikRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											responseRate
													.setTargetPeriodikProsentase(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											responseRate.setNilai(cell
													.getNumericCellValue());

										}

										if (column == 10) {

											responseRate.setBobotKpi(cell
													.getNumericCellValue());

										}

										if (column == 11) {

											responseRate.setScoreRencana(cell
													.getNumericCellValue());

										}

										if (column == 12) {

											responseRate.setScoreRealisasi(cell
													.getNumericCellValue());

										}

										if (column == 13) {

											responseRate.setUpjFungsi(cell
													.getStringCellValue());

										}

										if (column == 14) {

											responseRate.setLevel(cell
													.getStringCellValue());

										}

									}

									if (row == 12) {

										if (column == 5) {

											labaKotor.setTargetRkp(cell
													.getNumericCellValue());

										}

										if (column == 6) {

											labaKotor
													.setTargetPeriodikRencana(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											labaKotor
													.setTargetPeriodikRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											labaKotor
													.setTargetPeriodikProsentase(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											labaKotor.setNilai(cell
													.getNumericCellValue());

										}

										if (column == 10) {

											labaKotor.setBobotKpi(cell
													.getNumericCellValue());

										}

										if (column == 11) {

											labaKotor.setScoreRencana(cell
													.getNumericCellValue());

										}

										if (column == 12) {

											labaKotor.setScoreRealisasi(cell
													.getNumericCellValue());

										}

										if (column == 13) {

											labaKotor.setUpjFungsi(cell
													.getStringCellValue());

										}

										if (column == 14) {

											labaKotor.setLevel(cell
													.getStringCellValue());

										}

									}

									if (row == 13) {

										if (column == 5) {

											netCashFlow.setTargetRkp(cell
													.getNumericCellValue());

										}

										if (column == 6) {

											netCashFlow
													.setTargetPeriodikRencana(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											netCashFlow
													.setTargetPeriodikRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											netCashFlow
													.setTargetPeriodikProsentase(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											netCashFlow.setNilai(cell
													.getNumericCellValue());

										}

										if (column == 10) {

											netCashFlow.setBobotKpi(cell
													.getNumericCellValue());

										}

										if (column == 11) {

											netCashFlow.setScoreRencana(cell
													.getNumericCellValue());

										}

										if (column == 12) {

											netCashFlow.setScoreRealisasi(cell
													.getNumericCellValue());

										}

										if (column == 13) {

											netCashFlow.setUpjFungsi(cell
													.getStringCellValue());

										}

										if (column == 14) {

											netCashFlow.setLevel(cell
													.getStringCellValue());

										}

									}

									if (row == 14) {

										if (column == 5) {

											ratioTagihanBrutto
													.setTargetRkp(cell
															.getNumericCellValue());

										}

										if (column == 6) {

											ratioTagihanBrutto
													.setTargetPeriodikRencana(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											ratioTagihanBrutto
													.setTargetPeriodikRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											ratioTagihanBrutto
													.setTargetPeriodikProsentase(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											ratioTagihanBrutto.setNilai(cell
													.getNumericCellValue());

										}

										if (column == 10) {

											ratioTagihanBrutto.setBobotKpi(cell
													.getNumericCellValue());

										}

										if (column == 11) {

											ratioTagihanBrutto
													.setScoreRencana(cell
															.getNumericCellValue());

										}

										if (column == 12) {

											ratioTagihanBrutto
													.setScoreRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 13) {

											ratioTagihanBrutto
													.setUpjFungsi(cell
															.getStringCellValue());

										}

										if (column == 14) {

											ratioTagihanBrutto.setLevel(cell
													.getStringCellValue());

										}

									}

									if (row == 15) {

										if (column == 5) {

											penjualan.setTargetRkp(cell
													.getNumericCellValue());

										}

										if (column == 6) {

											penjualan
													.setTargetPeriodikRencana(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											penjualan
													.setTargetPeriodikRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											penjualan
													.setTargetPeriodikProsentase(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											penjualan.setNilai(cell
													.getNumericCellValue());

										}

										if (column == 10) {

											penjualan.setBobotKpi(cell
													.getNumericCellValue());

										}

										if (column == 11) {

											penjualan.setScoreRencana(cell
													.getNumericCellValue());

										}

										if (column == 12) {

											penjualan.setScoreRealisasi(cell
													.getNumericCellValue());

										}

										if (column == 13) {

											penjualan.setUpjFungsi(cell
													.getStringCellValue());

										}

										if (column == 14) {

											penjualan.setLevel(cell
													.getStringCellValue());

										}

									}

									if (row == 17) {

										if (column == 5) {

											sheComplianceLevel
													.setTargetRkp(cell
															.getNumericCellValue());

										}

										if (column == 6) {

											sheComplianceLevel
													.setTargetPeriodikRencana(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											sheComplianceLevel
													.setTargetPeriodikRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											sheComplianceLevel
													.setTargetPeriodikProsentase(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											sheComplianceLevel.setNilai(cell
													.getNumericCellValue());

										}

										if (column == 10) {

											sheComplianceLevel.setBobotKpi(cell
													.getNumericCellValue());

										}

										if (column == 11) {

											sheComplianceLevel
													.setScoreRencana(cell
															.getNumericCellValue());

										}

										if (column == 12) {

											sheComplianceLevel
													.setScoreRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 13) {

											sheComplianceLevel
													.setUpjFungsi(cell
															.getStringCellValue());

										}

										if (column == 14) {

											sheComplianceLevel.setLevel(cell
													.getStringCellValue());

										}

									}

									if (row == 18) {

										if (column == 5) {

											inovasiKM.setTargetRkp(cell
													.getNumericCellValue());

										}

										if (column == 6) {

											inovasiKM
													.setTargetPeriodikRencana(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											inovasiKM
													.setTargetPeriodikRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											inovasiKM
													.setTargetPeriodikProsentase(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											inovasiKM.setNilai(cell
													.getNumericCellValue());

										}

										if (column == 10) {

											inovasiKM.setBobotKpi(cell
													.getNumericCellValue());

										}

										if (column == 11) {

											inovasiKM.setScoreRencana(cell
													.getNumericCellValue());

										}

										if (column == 12) {

											inovasiKM.setScoreRealisasi(cell
													.getNumericCellValue());

										}

										if (column == 13) {

											inovasiKM.setUpjFungsi(cell
													.getStringCellValue());

										}

										if (column == 14) {

											inovasiKM.setLevel(cell
													.getStringCellValue());

										}

									}

									if (row == 19) {

										if (column == 5) {

											efisiensiPengadaan
													.setTargetRkp(cell
															.getNumericCellValue());

										}

										if (column == 6) {

											efisiensiPengadaan
													.setTargetPeriodikRencana(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											efisiensiPengadaan
													.setTargetPeriodikRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											efisiensiPengadaan
													.setTargetPeriodikProsentase(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											efisiensiPengadaan.setNilai(cell
													.getNumericCellValue());

										}

										if (column == 10) {

											efisiensiPengadaan.setBobotKpi(cell
													.getNumericCellValue());

										}

										if (column == 11) {

											efisiensiPengadaan
													.setScoreRencana(cell
															.getNumericCellValue());

										}

										if (column == 12) {

											efisiensiPengadaan
													.setScoreRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 13) {

											efisiensiPengadaan
													.setUpjFungsi(cell
															.getStringCellValue());

										}

										if (column == 14) {

											efisiensiPengadaan.setLevel(cell
													.getStringCellValue());

										}

									}

									if (row == 21) {

										if (column == 5) {

											riskManagement.setTargetRkp(cell
													.getNumericCellValue());

										}

										if (column == 6) {

											riskManagement
													.setTargetPeriodikRencana(cell
															.getNumericCellValue());

										}

										if (column == 7) {

											riskManagement
													.setTargetPeriodikRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 8) {

											riskManagement
													.setTargetPeriodikProsentase(cell
															.getNumericCellValue());

										}

										if (column == 9) {

											riskManagement.setNilai(cell
													.getNumericCellValue());

										}

										if (column == 10) {

											riskManagement.setBobotKpi(cell
													.getNumericCellValue());

										}

										if (column == 11) {

											riskManagement.setScoreRencana(cell
													.getNumericCellValue());

										}

										if (column == 12) {

											riskManagement
													.setScoreRealisasi(cell
															.getNumericCellValue());

										}

										if (column == 13) {

											riskManagement.setUpjFungsi(cell
													.getStringCellValue());

										}

										if (column == 14) {

											riskManagement.setLevel(cell
													.getStringCellValue());

										}

									}

								}

							}

						}

					}

				}

				hasilProdukdanJasa.setMutu(mutu);

				hasilFokusPadaPelanggan
						.setCustomerEngagement(customerEngagement);
				hasilFokusPadaPelanggan.setResponseRate(responseRate);

				hasilKeuanganDanPasar.setLabaKotor(labaKotor);
				hasilKeuanganDanPasar.setNetCashFlow(netCashFlow);
				hasilKeuanganDanPasar.setRatioTagihanBrutto(ratioTagihanBrutto);
				hasilKeuanganDanPasar.setPenjualan(penjualan);

				hasilEfektifitasProses
						.setSheComplianceLevel(sheComplianceLevel);
				hasilEfektifitasProses.setInovasiKM(inovasiKM);
				hasilEfektifitasProses
						.setEfisiensiPengadaan(efisiensiPengadaan);

				hasilKepemimpinan.setRiskManagement(riskManagement);

				projectScoreCard.setHasilProdukdanJasa(hasilProdukdanJasa);
				projectScoreCard
						.setHasilFokusPadaPelanggan(hasilFokusPadaPelanggan);
				projectScoreCard
						.setHasilKeuanganDanPasar(hasilKeuanganDanPasar);
				projectScoreCard
						.setHasilEfektifitasProses(hasilEfektifitasProses);
				projectScoreCard.setHasilKepemimpinan(hasilKepemimpinan);

				projectScoreCardList.add(projectScoreCard);

			}

		}

		return projectScoreCardList;

	}

}
