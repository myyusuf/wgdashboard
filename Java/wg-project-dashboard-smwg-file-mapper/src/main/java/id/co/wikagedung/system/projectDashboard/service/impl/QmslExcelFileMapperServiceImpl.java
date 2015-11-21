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
import id.co.wikagedung.system.projectDashboard.model.qmsl.FungsiEnjinering;
import id.co.wikagedung.system.projectDashboard.model.qmsl.FungsiKa;
import id.co.wikagedung.system.projectDashboard.model.qmsl.FungsiKomersial;
import id.co.wikagedung.system.projectDashboard.model.qmsl.FungsiPengadaan;
import id.co.wikagedung.system.projectDashboard.model.qmsl.FungsiProduksi;
import id.co.wikagedung.system.projectDashboard.model.qmsl.FungsiQa;
import id.co.wikagedung.system.projectDashboard.model.qmsl.ManajerKepalaProyek;
import id.co.wikagedung.system.projectDashboard.model.qmsl.Qmsl;
import id.co.wikagedung.system.projectDashboard.service.QmslExcelFileMapperService;

public class QmslExcelFileMapperServiceImpl implements
		QmslExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(QmslExcelFileMapperServiceImpl.class);

	private String pathName;

	public QmslExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<Qmsl> qmslExcelFileMapping() throws IOException,
			InvalidFormatException {

		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {

			filenames.add(list[i].getAbsolutePath());

		}

		ArrayList<Qmsl> qmslList = new ArrayList<Qmsl>();

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
						.getSheet(CommonConstant.WG_QMSL_SHEET_CONSTANT);

				Qmsl qmsl = new Qmsl();

				ManajerKepalaProyek manajerKepalaProyek = new ManajerKepalaProyek();
				FungsiKomersial fungsiKomersial = new FungsiKomersial();
				FungsiQa fungsiQa = new FungsiQa();
				FungsiProduksi fungsiProduksi = new FungsiProduksi();
				FungsiEnjinering fungsiEnjinering = new FungsiEnjinering();
				FungsiPengadaan fungsiPengadaan = new FungsiPengadaan();
				FungsiKa fungsiKa = new FungsiKa();

				for (int row = 0; row < sheet.getLastRowNum(); row++) {

					XSSFRow rows = sheet.getRow(row);

					if (rows != null) {

						for (int column = 0; column < rows.getLastCellNum(); column++) {

							XSSFCell cell = rows.getCell(column);

							if (cell != null) {

								if ((cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
										|| (cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA)) {

									if (row == 8) {

										if (column == 7) {

											manajerKepalaProyek
													.setProsesPersiapan(cell
															.getNumericCellValue());

										}

									}

									if (row == 9) {

										if (column == 7) {

											manajerKepalaProyek
													.setProsesRkp(cell
															.getNumericCellValue());

										}

									}

									if (row == 10) {

										if (column == 7) {

											manajerKepalaProyek
													.setProsesManajemenReview(cell
															.getNumericCellValue());

										}

									}

									if (row == 11) {

										if (column == 7) {

											manajerKepalaProyek
													.setProsesRoleModel(cell
															.getNumericCellValue());

										}

									}

									if (row == 12) {

										if (column == 7) {

											manajerKepalaProyek
													.setProsesScoreCard(cell
															.getNumericCellValue());

										}

									}

									if (row == 14) {

										if (column == 7) {

											manajerKepalaProyek
													.setResultMutu(cell
															.getNumericCellValue());

										}

									}

									if (row == 15) {

										if (column == 7) {

											manajerKepalaProyek
													.setResultWaktu(cell
															.getNumericCellValue());

										}

									}

									if (row == 16) {

										if (column == 7) {

											manajerKepalaProyek
													.setResultMutu(cell
															.getNumericCellValue());

										}

									}

									if (row == 19) {

										if (column == 7) {

											fungsiKomersial
													.setLaporanBulanan(cell
															.getNumericCellValue());

										}

									}

									if (row == 20) {

										if (column == 7) {

											fungsiKomersial
													.setVariationOrderDanPekerjaanTambahKurang(cell
															.getNumericCellValue());

										}

									}

									if (row == 21) {

										if (column == 7) {

											fungsiKomersial
													.setSchedulingReschedulingInternal(cell
															.getNumericCellValue());

										}

									}

									if (row == 22) {

										if (column == 7) {

											fungsiKomersial
													.setAdministrasiKontrak(cell
															.getNumericCellValue());

										}

									}

									if (row == 23) {

										if (column == 7) {

											fungsiKomersial
													.setManajemenRisiko(cell
															.getNumericCellValue());

										}

									}

									if (row == 26) {

										if (column == 7) {

											fungsiQa.setqPlan(cell
													.getNumericCellValue());

										}

									}

									if (row == 27) {

										if (column == 7) {

											fungsiQa.setAktivitasCppPtkp(cell
													.getNumericCellValue());

										}

									}

									if (row == 28) {

										if (column == 7) {

											fungsiQa.setAktivitasPelaksanaanQplan(cell
													.getNumericCellValue());

										}

									}

									if (row == 29) {

										if (column == 7) {

											fungsiQa.setKalibrasi(cell
													.getNumericCellValue());

										}

									}

									if (row == 30) {

										if (column == 7) {

											fungsiQa.setAuditInternalDanAuditEksternal(cell
													.getNumericCellValue());

										}

									}

									if (row == 31) {

										if (column == 7) {

											fungsiQa.setPengendalianDokumenDanRekaman(cell
													.getNumericCellValue());

										}

									}

									if (row == 32) {

										if (column == 7) {

											fungsiQa.setKepuasanPelanggan(cell
													.getNumericCellValue());

										}

									}

									if (row == 35) {

										if (column == 7) {

											fungsiProduksi
													.setPengendalianSumberDaya(cell
															.getNumericCellValue());

										}

									}

									if (row == 36) {

										if (column == 7) {

											fungsiProduksi
													.setPengendalianProduksi(cell
															.getNumericCellValue());

										}

									}

									if (row == 37) {

										if (column == 7) {

											fungsiProduksi
													.setPengendalianGambarLapangan(cell
															.getNumericCellValue());

										}

									}

									if (row == 38) {

										if (column == 7) {

											fungsiProduksi.setMetodeKerja(cell
													.getNumericCellValue());

										}

									}

									if (row == 39) {

										if (column == 7) {

											fungsiProduksi
													.setPengendalianMutuPekerja(cell
															.getNumericCellValue());

										}

									}

									if (row == 40) {

										if (column == 7) {

											fungsiProduksi
													.setRapatKoordinasiProduksi(cell
															.getNumericCellValue());

										}

									}

									if (row == 43) {

										if (column == 7) {

											fungsiEnjinering
													.setDesignDanRedesign(cell
															.getNumericCellValue());

										}

									}

									if (row == 44) {

										if (column == 7) {

											fungsiEnjinering
													.setPengendalianGambar(cell
															.getNumericCellValue());

										}

									}

									if (row == 45) {

										if (column == 7) {

											fungsiEnjinering
													.setMetodeKerjaDanMetodePelaksanaan(cell
															.getNumericCellValue());

										}

									}

									if (row == 46) {

										if (column == 7) {

											fungsiEnjinering
													.setVeDanInovasiKm(cell
															.getNumericCellValue());

										}

									}

									if (row == 49) {

										if (column == 7) {

											fungsiPengadaan
													.setPolaPembelanjaan(cell
															.getNumericCellValue());

										}

									}

									if (row == 50) {

										if (column == 7) {

											fungsiPengadaan
													.setRencanaPengadaan(cell
															.getNumericCellValue());

										}

									}

									if (row == 51) {

										if (column == 7) {

											fungsiPengadaan
													.setEvaluasiPenyediaJasaDanPemasok(cell
															.getNumericCellValue());

										}

									}

									if (row == 52) {

										if (column == 7) {

											fungsiPengadaan
													.setPemeliharaanAlat(cell
															.getNumericCellValue());

										}

									}

									if (row == 55) {

										if (column == 7) {

											fungsiPengadaan
													.setPemeliharaanAlat(cell
															.getNumericCellValue());

										}

									}

									if (row == 56) {

										if (column == 7) {

											fungsiPengadaan
													.setPemeliharaanAlat(cell
															.getNumericCellValue());

										}

									}

									if (row == 57) {

										if (column == 7) {

											fungsiPengadaan
													.setPemeliharaanAlat(cell
															.getNumericCellValue());

										}

									}

									if (row == 58) {

										if (column == 7) {

											fungsiPengadaan
													.setPemeliharaanAlat(cell
															.getNumericCellValue());

										}

									}

									if (row == 59) {

										if (column == 7) {

											fungsiPengadaan
													.setPemeliharaanAlat(cell
															.getNumericCellValue());

										}

									}

									if (row == 60) {

										if (column == 7) {

											fungsiPengadaan
													.setPemeliharaanAlat(cell
															.getNumericCellValue());

										}

									}

								}

							}

						}

					}

				}

				qmsl.setManajerKepalaProyek(manajerKepalaProyek);
				qmsl.setFungsiKomersial(fungsiKomersial);
				qmsl.setFungsiQa(fungsiQa);
				qmsl.setFungsiProduksi(fungsiProduksi);
				qmsl.setFungsiEnjinering(fungsiEnjinering);
				qmsl.setFungsiPengadaan(fungsiPengadaan);
				qmsl.setFungsiKa(fungsiKa);

				qmslList.add(qmsl);

			}
		}

		return qmslList;
	}

}
