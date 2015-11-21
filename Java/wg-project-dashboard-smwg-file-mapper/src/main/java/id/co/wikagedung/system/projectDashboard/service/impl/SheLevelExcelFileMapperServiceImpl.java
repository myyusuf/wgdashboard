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
import id.co.wikagedung.system.projectDashboard.model.sheLevel.EvaluasiPenataan;
import id.co.wikagedung.system.projectDashboard.model.sheLevel.ImplementasiBenchmarkProject;
import id.co.wikagedung.system.projectDashboard.model.sheLevel.KebijakanKTiga;
import id.co.wikagedung.system.projectDashboard.model.sheLevel.PenerapanDanOperasional;
import id.co.wikagedung.system.projectDashboard.model.sheLevel.Perencanaan;
import id.co.wikagedung.system.projectDashboard.model.sheLevel.ResultShe;
import id.co.wikagedung.system.projectDashboard.model.sheLevel.SheLevel;
import id.co.wikagedung.system.projectDashboard.model.sheLevel.TindakanPemeriksaanDanPerbaikan;
import id.co.wikagedung.system.projectDashboard.service.SheLevelExcelFileMapperService;

public class SheLevelExcelFileMapperServiceImpl implements
		SheLevelExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(SheLevelExcelFileMapperServiceImpl.class);

	private String pathName;

	public SheLevelExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<SheLevel> sheLevelExcelFileMapping() throws IOException,
			InvalidFormatException {

		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {

			filenames.add(list[i].getAbsolutePath());

		}

		ArrayList<SheLevel> sheLevelList = new ArrayList<SheLevel>();

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
						.getSheet(CommonConstant.WG_SHE_LEVEL_SHEET_CONSTANT);

				SheLevel sheLevel = new SheLevel();

				KebijakanKTiga kebijakanKTiga = new KebijakanKTiga();
				Perencanaan perencanaan = new Perencanaan();
				PenerapanDanOperasional penerapanDanOperasional = new PenerapanDanOperasional();
				TindakanPemeriksaanDanPerbaikan tindakanPemeriksaanDanPerbaikan = new TindakanPemeriksaanDanPerbaikan();
				EvaluasiPenataan evaluasiPenataan = new EvaluasiPenataan();
				ResultShe resultShe = new ResultShe();
				ImplementasiBenchmarkProject implementasiBenchmarkProject = new ImplementasiBenchmarkProject();

				for (int row = 0; row < sheet.getLastRowNum(); row++) {

					XSSFRow rows = sheet.getRow(row);

					if (rows != null) {

						for (int column = 0; column < rows.getLastCellNum(); column++) {

							XSSFCell cell = rows.getCell(column);

							if (cell != null) {

								if ((cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
										|| (cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA)) {

									if (row == 8) {

										if (column == 6) {

											kebijakanKTiga.setKebijakanShe(cell
													.getNumericCellValue());

										}

									}

									if (row == 10) {

										if (column == 6) {

											perencanaan
													.setHirarcDanAspectImpactIdentification(cell
															.getNumericCellValue());

										}

									}

									if (row == 11) {

										if (column == 6) {

											perencanaan
													.setIdentifikasiPersyaratanHukumDanAturannya(cell
															.getNumericCellValue());

										}

									}

									if (row == 12) {

										if (column == 6) {

											perencanaan.setSasaranShe(cell
													.getNumericCellValue());

										}

									}

									if (row == 13) {

										if (column == 6) {

											perencanaan
													.setProgramManajemenShe(cell
															.getNumericCellValue());

										}

									}

									if (row == 15) {

										if (column == 6) {

											penerapanDanOperasional
													.setStrukturDanTanggungJawab(cell
															.getNumericCellValue());

										}

									}

									if (row == 16) {

										if (column == 6) {

											penerapanDanOperasional
													.setPelatihan(cell
															.getNumericCellValue());

										}

									}

									if (row == 17) {

										if (column == 6) {

											penerapanDanOperasional
													.setKompetensiPersonil(cell
															.getNumericCellValue());

										}

									}

									if (row == 19) {

										if (column == 6) {

											penerapanDanOperasional
													.setPapanInformasiDanKomunikasiPapanInformasiShe(cell
															.getNumericCellValue());

										}

									}

									if (row == 20) {

										if (column == 6) {

											penerapanDanOperasional
													.setPapanInformasiDanKomunikasiKomunikasiEkstern(cell
															.getNumericCellValue());

										}

									}

									if (row == 21) {

										if (column == 6) {

											penerapanDanOperasional
													.setPapanInformasiDanKomunikasiSheInduction(cell
															.getNumericCellValue());

										}

									}

									if (row == 23) {

										if (column == 6) {

											penerapanDanOperasional
													.setDokumentasiPedokumentasian(cell
															.getNumericCellValue());

										}

									}

									if (row == 24) {

										if (column == 6) {

											penerapanDanOperasional
													.setDokumentasiStatistik(cell
															.getNumericCellValue());

										}

									}

									if (row == 25) {

										if (column == 6) {

											penerapanDanOperasional
													.setPengadaanBarangDanJasa(cell
															.getNumericCellValue());

										}

									}

									if (row == 27) {

										if (column == 6) {

											penerapanDanOperasional
													.setPengendalianPekerjaanRambuRambu(cell
															.getNumericCellValue());

										}

									}

									if (row == 28) {

										if (column == 6) {

											penerapanDanOperasional
													.setPengendalianPekerjaanSpandukPoster(cell
															.getNumericCellValue());

										}

									}

									if (row == 29) {

										if (column == 6) {

											penerapanDanOperasional
													.setPengendalianPekerjaanSistemIjinKerja(cell
															.getNumericCellValue());

										}

									}

									if (row == 30) {

										if (column == 6) {

											penerapanDanOperasional
													.setPengendalianPekerjaanPengawasanPekerjaan(cell
															.getNumericCellValue());

										}

									}

									if (row == 31) {

										if (column == 6) {

											penerapanDanOperasional
													.setPengendalianPekerjaanGudang(cell
															.getNumericCellValue());

										}

									}

									if (row == 32) {

										if (column == 6) {

											penerapanDanOperasional
													.setPengendalianPekerjaanLayOutManagement(cell
															.getNumericCellValue());

										}

									}

									if (row == 33) {

										if (column == 6) {

											penerapanDanOperasional
													.setPengendalianPekerjaanInspeksiPekerjaan(cell
															.getNumericCellValue());

										}

									}

									if (row == 34) {

										if (column == 6) {

											penerapanDanOperasional
													.setPengedalianMaterialBerbahaya(cell
															.getNumericCellValue());

										}

									}

									if (row == 35) {

										if (column == 6) {

											penerapanDanOperasional
													.setKelayakanAlatBerat(cell
															.getNumericCellValue());

										}

									}

									if (row == 36) {

										if (column == 6) {

											penerapanDanOperasional
													.setKeadaanDarurat(cell
															.getNumericCellValue());

										}

									}

									if (row == 38) {

										if (column == 6) {

											tindakanPemeriksaanDanPerbaikan
													.setAudit(cell
															.getNumericCellValue());

										}

									}

									if (row == 40) {

										if (column == 6) {

											tindakanPemeriksaanDanPerbaikan
													.setInspeksiSheAlatBantu(cell
															.getNumericCellValue());

										}

									}

									if (row == 41) {

										if (column == 6) {

											tindakanPemeriksaanDanPerbaikan
													.setInspeksiShePeralatanShe(cell
															.getNumericCellValue());
										}

									}

									if (row == 42) {

										if (column == 6) {

											tindakanPemeriksaanDanPerbaikan
													.setInspeksiShePemantauanLingkungan(cell
															.getNumericCellValue());

										}

									}

									if (row == 43) {

										if (column == 6) {

											tindakanPemeriksaanDanPerbaikan
													.setPenangananKecelakaan(cell
															.getNumericCellValue());

										}

									}

									if (row == 44) {

										if (column == 6) {

											tindakanPemeriksaanDanPerbaikan
													.setPenangananPencemaranLingkungan(cell
															.getNumericCellValue());

										}

									}

									if (row == 45) {

										if (column == 6) {

											tindakanPemeriksaanDanPerbaikan
													.setPenyakitAkibatKerja(cell
															.getNumericCellValue());

										}

									}

									if (row == 46) {

										if (column == 6) {

											tindakanPemeriksaanDanPerbaikan
													.setKlinikKesehatan(cell
															.getNumericCellValue());

										}

									}

									if (row == 47) {

										if (column == 6) {

											tindakanPemeriksaanDanPerbaikan
													.setKantinWarungPekerjaKatering(cell
															.getNumericCellValue());

										}

									}

									if (row == 49) {

										if (column == 6) {

											evaluasiPenataan
													.setEvaluasiPemenuhanPeraturanPerundangan(cell
															.getNumericCellValue());

										}

									}

									if (row == 51) {

										if (column == 6) {

											resultShe.setResultShe(cell
													.getNumericCellValue());

										}

									}

									if (row == 54) {

										if (column == 6) {

											implementasiBenchmarkProject
													.setKegiatanRutinQsheMorningTalk(cell
															.getNumericCellValue());
										}

									}

									if (row == 55) {

										if (column == 6) {

											implementasiBenchmarkProject
													.setKegiatanRutinToolboxMeeting(cell
															.getNumericCellValue());

										}

									}

									if (row == 56) {

										if (column == 6) {

											implementasiBenchmarkProject
													.setKegiatanRutinQsheMeeting(cell
															.getNumericCellValue());

										}

									}

									if (row == 57) {

										if (column == 6) {

											implementasiBenchmarkProject
													.setKegiatanRutinQshePatrol(cell
															.getNumericCellValue());

										}

									}

									if (row == 58) {

										if (column == 6) {

											implementasiBenchmarkProject
													.setKegiatanRutinKebersihanSerentak(cell
															.getNumericCellValue());

										}

									}

									if (row == 59) {

										if (column == 6) {

											implementasiBenchmarkProject
													.setKegiatanRutinDailyMeeting(cell
															.getNumericCellValue());

										}

									}

									if (row == 61) {

										if (column == 6) {

											implementasiBenchmarkProject
													.setPimpinanRoleModelPelaksanaanTerlibatSheMorningTalk(cell
															.getNumericCellValue());

										}

									}

									if (row == 62) {

										if (column == 6) {

											implementasiBenchmarkProject
													.setPimpinanRoleModelPelaksanaanMemimpinQsheMeeting(cell
															.getNumericCellValue());

										}

									}

									if (row == 63) {

										if (column == 6) {

											implementasiBenchmarkProject
													.setPimpinanRoleModelPelaksanaanTerlibatQshePatrol(cell
															.getNumericCellValue());

										}

									}

									if (row == 64) {

										if (column == 6) {

											implementasiBenchmarkProject
													.setPimpinanRoleModelPelaksanaanMemimpinToolboxMeeting(cell
															.getNumericCellValue());

										}

									}

									if (row == 65) {

										if (column == 6) {

											implementasiBenchmarkProject
													.setPimpinanRoleModelPelaksanaanPelaksanaToolboxMeeting(cell
															.getNumericCellValue());

										}

									}

									if (row == 66) {

										if (column == 6) {

											implementasiBenchmarkProject
													.setPimpinanRoleModelPelaksanaanTerlibatKebersihanSerentak(cell
															.getNumericCellValue());

										}

									}

									if (row == 68) {

										if (column == 6) {

											implementasiBenchmarkProject
													.setPerlengkapanStandarPegawaiMenggunakanApd(cell
															.getNumericCellValue());

										}

									}

									if (row == 69) {

										if (column == 6) {

											implementasiBenchmarkProject
													.setPerlengkapanStandarPekerjaMenggunakanApd(cell
															.getNumericCellValue());

										}

									}

									if (row == 71) {

										if (column == 6) {

											implementasiBenchmarkProject
													.setKeterlibatanSubkonMandorMemilikiSheOfficer(cell
															.getNumericCellValue());

										}

									}

									if (row == 72) {

										if (column == 6) {

											implementasiBenchmarkProject
													.setKeterlibatanSubkonMandorMenghadiriMorningTalkToolboxMeeting(cell
															.getNumericCellValue());

										}

									}

									if (row == 73) {

										if (column == 6) {

											implementasiBenchmarkProject
													.setKeterlibatanSubkonMandorMelaksanakanLimaR(cell
															.getNumericCellValue());

										}

									}

								}

							}

						}

					}

				}

				sheLevel.setKebijakanKTiga(kebijakanKTiga);
				sheLevel.setPerencanaan(perencanaan);
				sheLevel.setPenerapanDanOperasional(penerapanDanOperasional);
				sheLevel.setTindakanPemeriksaanDanPerbaikan(tindakanPemeriksaanDanPerbaikan);
				sheLevel.setEvaluasiPenataan(evaluasiPenataan);
				sheLevel.setResultShe(resultShe);
				sheLevel.setImplementasiBenchmarkProject(implementasiBenchmarkProject);

				sheLevelList.add(sheLevel);

			}

		}

		return sheLevelList;

	}
}
