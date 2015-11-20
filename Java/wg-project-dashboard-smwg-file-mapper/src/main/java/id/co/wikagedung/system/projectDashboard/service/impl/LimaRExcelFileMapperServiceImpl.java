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
import id.co.wikagedung.system.projectDashboard.model.limaR.LimaR;
import id.co.wikagedung.system.projectDashboard.model.limaR.Rajin;
import id.co.wikagedung.system.projectDashboard.model.limaR.RajinKantorDanSekitarnya;
import id.co.wikagedung.system.projectDashboard.model.limaR.RajinKriteriaStandar;
import id.co.wikagedung.system.projectDashboard.model.limaR.RajinKriteriaTambahan;
import id.co.wikagedung.system.projectDashboard.model.limaR.Rapi;
import id.co.wikagedung.system.projectDashboard.model.limaR.RapiKantorDanSekitarnya;
import id.co.wikagedung.system.projectDashboard.model.limaR.RapiKriteriaStandar;
import id.co.wikagedung.system.projectDashboard.model.limaR.RapiKriteriaTambahan;
import id.co.wikagedung.system.projectDashboard.model.limaR.Rawat;
import id.co.wikagedung.system.projectDashboard.model.limaR.RawatKantorDanSekitarnya;
import id.co.wikagedung.system.projectDashboard.model.limaR.RawatKriteriaStandar;
import id.co.wikagedung.system.projectDashboard.model.limaR.RawatKriteriaTambahan;
import id.co.wikagedung.system.projectDashboard.model.limaR.Resik;
import id.co.wikagedung.system.projectDashboard.model.limaR.ResikKantorDanSekitarnya;
import id.co.wikagedung.system.projectDashboard.model.limaR.ResikKriteriaStandar;
import id.co.wikagedung.system.projectDashboard.model.limaR.ResikKriteriaTambahan;
import id.co.wikagedung.system.projectDashboard.model.limaR.Ringkas;
import id.co.wikagedung.system.projectDashboard.model.limaR.RingkasKantorDanSekitarnya;
import id.co.wikagedung.system.projectDashboard.model.limaR.RingkasKriteriaStandar;
import id.co.wikagedung.system.projectDashboard.model.limaR.RingkasKriteriaTambahan;
import id.co.wikagedung.system.projectDashboard.service.LimaRExcelFileMapperService;

public class LimaRExcelFileMapperServiceImpl implements
		LimaRExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(LimaRExcelFileMapperServiceImpl.class);

	private String pathName;

	public LimaRExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<LimaR> limaRExcelFileMapping() throws IOException,
			InvalidFormatException {

		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {

			filenames.add(list[i].getAbsolutePath());

		}

		ArrayList<LimaR> limaRList = new ArrayList<LimaR>();

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
						.getSheet(CommonConstant.WG_LIMA_R_SHEET_CONSTANT);

				LimaR limaR = new LimaR();

				Ringkas ringkas = new Ringkas();
				RingkasKantorDanSekitarnya ringkasKantorDanSekitarnya = new RingkasKantorDanSekitarnya();
				RingkasKriteriaStandar ringkasKriteriaStandar = new RingkasKriteriaStandar();
				RingkasKriteriaTambahan ringkasKriteriaTambahan = new RingkasKriteriaTambahan();

				Rapi rapi = new Rapi();
				RapiKantorDanSekitarnya rapiKantorDanSekitarnya = new RapiKantorDanSekitarnya();
				RapiKriteriaStandar rapiKriteriaStandar = new RapiKriteriaStandar();
				RapiKriteriaTambahan rapiKriteriaTambahan = new RapiKriteriaTambahan();

				Resik resik = new Resik();
				ResikKantorDanSekitarnya resikKantorDanSekitarnya = new ResikKantorDanSekitarnya();
				ResikKriteriaStandar resikKriteriaStandar = new ResikKriteriaStandar();
				ResikKriteriaTambahan resikKriteriaTambahan = new ResikKriteriaTambahan();

				Rawat rawat = new Rawat();
				RawatKantorDanSekitarnya rawatKantorDanSekitarnya = new RawatKantorDanSekitarnya();
				RawatKriteriaStandar rawatKriteriaStandar = new RawatKriteriaStandar();
				RawatKriteriaTambahan rawatKriteriaTambahan = new RawatKriteriaTambahan();

				Rajin rajin = new Rajin();
				RajinKantorDanSekitarnya rajinKantorDanSekitarnya = new RajinKantorDanSekitarnya();
				RajinKriteriaStandar rajinKriteriaStandar = new RajinKriteriaStandar();
				RajinKriteriaTambahan rajinKriteriaTambahan = new RajinKriteriaTambahan();

				for (int row = 0; row < sheet.getLastRowNum(); row++) {

					XSSFRow rows = sheet.getRow(row);

					if (rows != null) {

						for (int column = 0; column < rows.getLastCellNum(); column++) {

							XSSFCell cell = rows.getCell(column);

							if (cell != null) {

								if ((cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
										|| (cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA)) {

									// RINGKAS
									if (row == 11) {

										if (column == 4) {

											ringkasKantorDanSekitarnya
													.setKantorTempatKerja(cell
															.getNumericCellValue());

										}

									}

									if (row == 12) {

										if (column == 4) {

											ringkasKantorDanSekitarnya
													.setKantorAtkMesinAlatPenunjang(cell
															.getNumericCellValue());

										}

									}

									if (row == 13) {

										if (column == 4) {

											ringkasKantorDanSekitarnya
													.setKantorBahanRujukanReferensiArsip(cell
															.getNumericCellValue());

										}

									}

									if (row == 14) {

										if (column == 4) {

											ringkasKantorDanSekitarnya
													.setKantorDokumen(cell
															.getNumericCellValue());

										}

									}

									if (row == 16) {

										if (column == 4) {

											ringkasKantorDanSekitarnya
													.setMusholla(cell
															.getNumericCellValue());

										}

									}

									if (row == 17) {

										if (column == 4) {

											ringkasKantorDanSekitarnya
													.setToilet(cell
															.getNumericCellValue());

										}

									}

									if (row == 19) {

										if (column == 4) {

											ringkasKriteriaStandar
													.setPagarProyek(cell
															.getNumericCellValue());

										}

									}

									if (row == 20) {

										if (column == 4) {

											ringkasKriteriaStandar
													.setRambuDanSpanduk(cell
															.getNumericCellValue());

										}

									}

									if (row == 21) {

										if (column == 4) {

											ringkasKriteriaStandar
													.setGudang(cell
															.getNumericCellValue());

										}

									}

									if (row == 22) {

										if (column == 4) {

											ringkasKriteriaStandar
													.setPosSatpam(cell
															.getNumericCellValue());

										}

									}

									if (row == 23) {

										if (column == 4) {

											ringkasKriteriaStandar
													.setBarakPekerja(cell
															.getNumericCellValue());

										}

									}

									if (row == 25) {

										ringkasKriteriaTambahan
												.setWorkshop(cell
														.getNumericCellValue());

									}

									if (row == 26) {

										ringkasKriteriaTambahan
												.setSisaMaterialDanSampah(cell
														.getNumericCellValue());

									}

									if (row == 29) {

										ringkasKriteriaTambahan
												.setJalanKerjaDanTba(cell
														.getNumericCellValue());

									}

									if (row == 30) {

										ringkasKriteriaTambahan
												.setJalurKabel(cell
														.getNumericCellValue());

									}

									if (row == 31) {

										ringkasKriteriaTambahan
												.setJalurDewatering(cell
														.getNumericCellValue());

									}

									if (row == 32) {

										ringkasKriteriaTambahan
												.setAreaPengecoran(cell
														.getNumericCellValue());

									}

									if (row == 33) {

										ringkasKriteriaTambahan
												.setSafetyLineDanToloTolo(cell
														.getNumericCellValue());

									}

									// RAPI
									if (row == 38) {

										rapiKantorDanSekitarnya
												.setKantorTempatKerja(cell
														.getNumericCellValue());

									}

									if (row == 39) {

										rapiKantorDanSekitarnya
												.setKantorAtkMesinAlatPenunjang(cell
														.getNumericCellValue());

									}

									if (row == 40) {

										rapiKantorDanSekitarnya
												.setKantorBahanRujukanReferensiArsip(cell
														.getNumericCellValue());

									}

									if (row == 41) {

										rapiKantorDanSekitarnya
												.setKantorDokumen(cell
														.getNumericCellValue());

									}

									if (row == 43) {

										rapiKantorDanSekitarnya
												.setMusholla(cell
														.getNumericCellValue());

									}

									if (row == 44) {

										rapiKantorDanSekitarnya.setToilet(cell
												.getNumericCellValue());

									}

									if (row == 46) {

										rapiKriteriaStandar.setPagarProyek(cell
												.getNumericCellValue());

									}

									if (row == 47) {

										rapiKriteriaStandar
												.setRambuDanSpanduk(cell
														.getNumericCellValue());

									}

									if (row == 48) {

										rapiKriteriaStandar.setGudang(cell
												.getNumericCellValue());

									}

									if (row == 49) {

										rapiKriteriaStandar.setPosSatpam(cell
												.getNumericCellValue());

									}

									if (row == 50) {

										rapiKriteriaStandar
												.setBarakPekerja(cell
														.getNumericCellValue());

									}

									if (row == 52) {

										rapiKriteriaTambahan.setWorkshop(cell
												.getNumericCellValue());

									}

									if (row == 53) {

										rapiKriteriaTambahan
												.setSisaMaterialDanSampah(cell
														.getNumericCellValue());

									}

									if (row == 54) {

										rapiKriteriaTambahan.setJalanUmum(cell
												.getNumericCellValue());

									}

									if (row == 55) {

										rapiKriteriaTambahan.setPerancah(cell
												.getNumericCellValue());

									}

									if (row == 56) {

										rapiKriteriaTambahan
												.setJalanKerjaDanTba(cell
														.getNumericCellValue());

									}

									if (row == 57) {

										rapiKriteriaTambahan.setJalurKabel(cell
												.getNumericCellValue());

									}

									if (row == 58) {

										rapiKriteriaTambahan
												.setJalurDewatering(cell
														.getNumericCellValue());

									}

									if (row == 59) {

										rapiKriteriaTambahan
												.setAreaPengecoran(cell
														.getNumericCellValue());

									}

									if (row == 60) {

										rapiKriteriaTambahan
												.setSafetyLineDanToloTolo(cell
														.getNumericCellValue());

									}

									// RESIK
									if (row == 65) {

										if (column == 4) {

											resikKantorDanSekitarnya
													.setKantorTempatKerja(cell
															.getNumericCellValue());

										}

									}

									if (row == 66) {

										if (column == 4) {

											resikKantorDanSekitarnya
													.setKantorAtkMesinAlatPenunjang(cell
															.getNumericCellValue());

										}

									}

									if (row == 67) {

										if (column == 4) {

											resikKantorDanSekitarnya
													.setKantorBahanRujukanReferensiArsip(cell
															.getNumericCellValue());

										}

									}

									if (row == 68) {

										if (column == 4) {

											resikKantorDanSekitarnya
													.setKantorDokumen(cell
															.getNumericCellValue());

										}

									}

									if (row == 73) {

										resikKriteriaStandar
												.setPagarProyek(cell
														.getNumericCellValue());

									}

									if (row == 74) {

										resikKriteriaStandar
												.setRambuDanSpanduk(cell
														.getNumericCellValue());

									}

									if (row == 75) {

										resikKriteriaStandar.setGudang(cell
												.getNumericCellValue());

									}

									if (row == 76) {

										resikKriteriaStandar.setPosSatpam(cell
												.getNumericCellValue());

									}

									if (row == 77) {

										resikKriteriaStandar
												.setBarakPekerja(cell
														.getNumericCellValue());

									}

									if (row == 79) {

										resikKriteriaTambahan.setWorkshop(cell
												.getNumericCellValue());

									}

									if (row == 80) {

										resikKriteriaTambahan
												.setSisaMaterialDanSampah(cell
														.getNumericCellValue());

									}

									if (row == 81) {

										resikKriteriaTambahan.setJalanUmum(cell
												.getNumericCellValue());

									}

									if (row == 82) {

										resikKriteriaTambahan.setPerancah(cell
												.getNumericCellValue());

									}

									if (row == 83) {

										resikKriteriaTambahan
												.setJalanKerjaDanTba(cell
														.getNumericCellValue());

									}

									if (row == 84) {

										resikKriteriaTambahan
												.setJalurKabel(cell
														.getNumericCellValue());

									}

									if (row == 85) {

										resikKriteriaTambahan
												.setJalurDewatering(cell
														.getNumericCellValue());

									}

									if (row == 86) {

										resikKriteriaTambahan
												.setAreaPengecoran(cell
														.getNumericCellValue());

									}

									if (row == 87) {

										resikKriteriaTambahan
												.setSafetyLineDanToloTolo(cell
														.getNumericCellValue());

									}

									// RAWAT
									if (row == 92) {

										if (column == 4) {

											rawatKantorDanSekitarnya
													.setPelaksanaan(cell
															.getNumericCellValue());

										}

									}

									if (row == 97) {

										if (column == 4) {

											rawatKantorDanSekitarnya
													.setMusholla(cell
															.getNumericCellValue());

										}

									}

									if (row == 98) {

										if (column == 4) {

											rawatKantorDanSekitarnya
													.setToilet(cell
															.getNumericCellValue());

										}

									}

									if (row == 100) {

										if (column == 4) {

											rawatKriteriaStandar
													.setPagarProyek(cell
															.getNumericCellValue());

										}

									}

									if (row == 101) {

										if (column == 4) {

											rawatKriteriaStandar
													.setRambuDanSpanduk(cell
															.getNumericCellValue());

										}

									}

									if (row == 102) {

										if (column == 4) {

											rawatKriteriaStandar.setGudang(cell
													.getNumericCellValue());

										}

									}

									if (row == 103) {

										if (column == 4) {

											rawatKriteriaStandar
													.setPosSatpam(cell
															.getNumericCellValue());

										}

									}

									if (row == 104) {

										if (column == 4) {

											rawatKriteriaStandar
													.setBarakPekerja(cell
															.getNumericCellValue());

										}

									}

									if (row == 106) {

										if (column == 4) {

											rawatKriteriaTambahan
													.setWorkshop(cell
															.getNumericCellValue());

										}

									}

									if (row == 107) {

										if (column == 4) {

											rawatKriteriaTambahan
													.setSisaMaterialDanSampah(cell
															.getNumericCellValue());

										}

									}

									if (row == 108) {

										if (column == 4) {

											rawatKriteriaTambahan
													.setJalanUmum(cell
															.getNumericCellValue());

										}

									}

									if (row == 109) {

										if (column == 4) {

											rawatKriteriaTambahan
													.setPerancah(cell
															.getNumericCellValue());

										}

									}

									if (row == 110) {

										if (column == 4) {

											rawatKriteriaTambahan
													.setJalanKerjaDanTba(cell
															.getNumericCellValue());

										}

									}

									if (row == 111) {

										if (column == 4) {

											rawatKriteriaTambahan
													.setJalurKabel(cell
															.getNumericCellValue());

										}

									}

									if (row == 112) {

										if (column == 4) {

											rawatKriteriaTambahan
													.setJalurDewatering(cell
															.getNumericCellValue());

										}

									}

									if (row == 113) {

										if (column == 4) {

											rawatKriteriaTambahan
													.setAreaPengecoran(cell
															.getNumericCellValue());

										}

									}

									if (row == 114) {

										if (column == 4) {

											rawatKriteriaTambahan
													.setSafetyLineDanToloTolo(cell
															.getNumericCellValue());

										}

									}

									// RAJIN
									if (row == 119) {

										if (column == 4) {

											rajinKantorDanSekitarnya
													.setPelaksanaan(cell
															.getNumericCellValue());

										}

									}

									if (row == 124) {

										if (column == 4) {

											rajinKantorDanSekitarnya
													.setMusholla(cell
															.getNumericCellValue());

										}

									}

									if (row == 125) {

										if (column == 4) {

											rajinKantorDanSekitarnya
													.setToilet(cell
															.getNumericCellValue());

										}

									}

									if (row == 127) {

										if (column == 4) {

											rajinKriteriaStandar
													.setPagarProyek(cell
															.getNumericCellValue());

										}

									}

									if (row == 128) {

										if (column == 4) {

											rajinKriteriaStandar
													.setRambuDanSpanduk(cell
															.getNumericCellValue());

										}

									}

									if (row == 129) {

										if (column == 4) {

											rajinKriteriaStandar.setGudang(cell
													.getNumericCellValue());

										}

									}

									if (row == 130) {

										if (column == 4) {

											rajinKriteriaStandar
													.setPosSatpam(cell
															.getNumericCellValue());

										}

									}

									if (row == 131) {

										if (column == 4) {

											rajinKriteriaStandar
													.setBarakPekerja(cell
															.getNumericCellValue());

										}

									}

									if (row == 133) {

										if (column == 4) {

											rajinKriteriaTambahan
													.setWorkshop(cell
															.getNumericCellValue());

										}

									}

									if (row == 134) {

										if (column == 4) {

											rajinKriteriaTambahan
													.setSisaMaterialDanSampah(cell
															.getNumericCellValue());

										}

									}

									if (row == 135) {

										if (column == 4) {

											rajinKriteriaTambahan
													.setJalanUmum(cell
															.getNumericCellValue());

										}

									}

									if (row == 136) {

										if (column == 4) {

											rajinKriteriaTambahan
													.setPerancah(cell
															.getNumericCellValue());

										}

									}

									if (row == 137) {

										if (column == 4) {

											rajinKriteriaTambahan
													.setJalanKerjaDanTba(cell
															.getNumericCellValue());

										}

									}

									if (row == 138) {

										if (column == 4) {

											rajinKriteriaTambahan
													.setJalurKabel(cell
															.getNumericCellValue());

										}

									}

									if (row == 139) {

										if (column == 4) {

											rajinKriteriaTambahan
													.setJalurDewatering(cell
															.getNumericCellValue());

										}

									}

									if (row == 140) {

										if (column == 4) {

											rajinKriteriaTambahan
													.setAreaPengecoran(cell
															.getNumericCellValue());

										}

									}

									if (row == 141) {

										if (column == 4) {

											rajinKriteriaTambahan
													.setSafetyLineDanToloTolo(cell
															.getNumericCellValue());

										}

									}

								}

							}

						}

					}

				}

				ringkas.setRingkasKantorDanSekitarnya(ringkasKantorDanSekitarnya);
				ringkas.setRingkasKriteriaStandar(ringkasKriteriaStandar);
				ringkas.setRingkasKriteriaTambahan(ringkasKriteriaTambahan);

				rapi.setRapiKantorDanSekitarnya(rapiKantorDanSekitarnya);
				rapi.setRapiKriteriaStandar(rapiKriteriaStandar);
				rapi.setRapiKriteriaTambahan(rapiKriteriaTambahan);

				resik.setResikKantorDanSekitarnya(resikKantorDanSekitarnya);
				resik.setResikKriteriaStandar(resikKriteriaStandar);
				resik.setResikKriteriaTambahan(resikKriteriaTambahan);

				rawat.setRawatKantorDanSekitarnya(rawatKantorDanSekitarnya);
				rawat.setRawatKriteriaStandar(rawatKriteriaStandar);
				rawat.setRawatKriteriaTambahan(rawatKriteriaTambahan);

				rajin.setRajinKantorDanSekitarnya(rajinKantorDanSekitarnya);
				rajin.setRajinKriteriaStandar(rajinKriteriaStandar);
				rajin.setRajinKriteriaTambahan(rajinKriteriaTambahan);

				limaR.setRingkas(ringkas);
				limaR.setRapi(rapi);
				limaR.setResik(resik);
				limaR.setRawat(rawat);
				limaR.setRajin(rajin);

				limaRList.add(limaR);

			}
		}

		return limaRList;

	}

}
