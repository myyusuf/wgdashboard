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
import id.co.wikagedung.system.projectDashboard.model.BiayaLangsung;
import id.co.wikagedung.system.projectDashboard.model.BiayaPelaksanaan;
import id.co.wikagedung.system.projectDashboard.model.BiayaTakLangsung;
import id.co.wikagedung.system.projectDashboard.model.BiayaUsahaPusat;
import id.co.wikagedung.system.projectDashboard.model.BuPusatRisikoPphFinal;
import id.co.wikagedung.system.projectDashboard.model.BungaJasaGiro;
import id.co.wikagedung.system.projectDashboard.model.Dropping;
import id.co.wikagedung.system.projectDashboard.model.IndukAwalKonstruksiOmsetKontrak;
import id.co.wikagedung.system.projectDashboard.model.IndukAwalKonstruksiPenjualan;
import id.co.wikagedung.system.projectDashboard.model.IndukAwalKonstruksiPenjualanProsentase;
import id.co.wikagedung.system.projectDashboard.model.InformasiManajemen;
import id.co.wikagedung.system.projectDashboard.model.LabaRugiLain;
import id.co.wikagedung.system.projectDashboard.model.LkInduk;
import id.co.wikagedung.system.projectDashboard.model.OmsetKontrakNetto;
import id.co.wikagedung.system.projectDashboard.model.PembebananBiaya;
import id.co.wikagedung.system.projectDashboard.model.PendapatanBiaya;
import id.co.wikagedung.system.projectDashboard.model.Penerimaan;
import id.co.wikagedung.system.projectDashboard.model.PenerimaanBersih;
import id.co.wikagedung.system.projectDashboard.model.Penjualan;
import id.co.wikagedung.system.projectDashboard.model.Persekot;
import id.co.wikagedung.system.projectDashboard.model.PphFinal;
import id.co.wikagedung.system.projectDashboard.model.PphPenerimaan;
import id.co.wikagedung.system.projectDashboard.model.ProsentaseLk;
import id.co.wikagedung.system.projectDashboard.model.ProsentaseTerhadapProduksi;
import id.co.wikagedung.system.projectDashboard.model.Risiko;
import id.co.wikagedung.system.projectDashboard.model.RkPusat;
import id.co.wikagedung.system.projectDashboard.model.SurplusDefisit;
import id.co.wikagedung.system.projectDashboard.model.TambahKurangVoClaimOmsetKontrak;
import id.co.wikagedung.system.projectDashboard.model.TambahKurangVoClaimPenjualan;
import id.co.wikagedung.system.projectDashboard.model.TambahKurangVoClaimPenjualanProsentase;
import id.co.wikagedung.system.projectDashboard.model.Termijn;
import id.co.wikagedung.system.projectDashboard.model.TotalBiaya;
import id.co.wikagedung.system.projectDashboard.model.TotalBuPusatRisikoPphFinal;
import id.co.wikagedung.system.projectDashboard.model.TotalLabaRugiLain;
import id.co.wikagedung.system.projectDashboard.model.TotalOk;
import id.co.wikagedung.system.projectDashboard.model.TotalOp;
import id.co.wikagedung.system.projectDashboard.model.TotalPenerimaan;
import id.co.wikagedung.system.projectDashboard.model.UangMuka;
import id.co.wikagedung.system.projectDashboard.service.InformasiManajemenExcelFileMapperService;

public class InformasiManajemenExcelFileMapperServiceImpl implements
		InformasiManajemenExcelFileMapperService {

	private static final Logger LOGGER = Logger
			.getLogger(InformasiManajemenExcelFileMapperServiceImpl.class);

	private String pathName;

	public InformasiManajemenExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	@SuppressWarnings("resource")
	public List<InformasiManajemen> informasiManajemenExcelFileMapping()
			throws IOException, InvalidFormatException {

		File repository = new File(pathName);
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {

			filenames.add(list[i].getAbsolutePath());

		}

		ArrayList<InformasiManajemen> informasiManajemenList = new ArrayList<InformasiManajemen>();

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
						.getSheet(CommonConstant.WG_INFORMASI_MANAJEMEN_SHEET_CONSTANT);

				InformasiManajemen informasiManajemen = new InformasiManajemen();

				OmsetKontrakNetto omsetKontrakNetto = new OmsetKontrakNetto();
				IndukAwalKonstruksiOmsetKontrak indukAwalKonstruksiOmsetKontrak = new IndukAwalKonstruksiOmsetKontrak();
				TambahKurangVoClaimOmsetKontrak tambahKurangVoClaimOmsetKontrak = new TambahKurangVoClaimOmsetKontrak();
				TotalOk totalOk = new TotalOk();

				Penjualan penjualan = new Penjualan();
				IndukAwalKonstruksiPenjualan indukAwalKonstruksiPenjualan = new IndukAwalKonstruksiPenjualan();
				IndukAwalKonstruksiPenjualanProsentase indukAwalKonstruksiPenjualanProsentase = new IndukAwalKonstruksiPenjualanProsentase();
				TambahKurangVoClaimPenjualan tambahKurangVoClaimPenjualan = new TambahKurangVoClaimPenjualan();
				TambahKurangVoClaimPenjualanProsentase tambahKurangVoClaimPenjualanProsentase = new TambahKurangVoClaimPenjualanProsentase();
				TotalOp totalOp = new TotalOp();

				BiayaPelaksanaan biayaPelaksanaan = new BiayaPelaksanaan();
				BiayaLangsung biayaLangsung = new BiayaLangsung();
				BiayaTakLangsung biayaTakLangsung = new BiayaTakLangsung();
				TotalBiaya totalBiaya = new TotalBiaya();

				BuPusatRisikoPphFinal buPusatRisikoPphFinal = new BuPusatRisikoPphFinal();
				BiayaUsahaPusat biayaUsahaPusat = new BiayaUsahaPusat();
				Risiko risiko = new Risiko();
				PphFinal pphFinal = new PphFinal();
				TotalBuPusatRisikoPphFinal totalBuPusatRisikoPphFinal = new TotalBuPusatRisikoPphFinal();

				LkInduk lkInduk = new LkInduk();
				ProsentaseLk prosentaseLk = new ProsentaseLk();

				LabaRugiLain labaRugiLain = new LabaRugiLain();
				BungaJasaGiro bungaJasaGiro = new BungaJasaGiro();
				PendapatanBiaya pendapatanBiaya = new PendapatanBiaya();
				PembebananBiaya pembebananBiaya = new PembebananBiaya();
				TotalLabaRugiLain totalLabaRugiLain = new TotalLabaRugiLain();

				Penerimaan penerimaan = new Penerimaan();
				UangMuka uangMuka = new UangMuka();
				Termijn termijn = new Termijn();
				TotalPenerimaan totalPenerimaan = new TotalPenerimaan();
				PphPenerimaan pphPenerimaan = new PphPenerimaan();
				PenerimaanBersih penerimaanBersih = new PenerimaanBersih();

				Persekot persekot = new Persekot();

				Dropping dropping = new Dropping();

				RkPusat rkPusat = new RkPusat();

				SurplusDefisit surplusDefisit = new SurplusDefisit();

				ProsentaseTerhadapProduksi prosentaseTerhadapProduksi = new ProsentaseTerhadapProduksi();

				for (int row = 0; row < sheet.getLastRowNum(); row++) {

					XSSFRow rows = sheet.getRow(row);

					for (int column = 0; column < rows.getLastCellNum(); column++) {

						XSSFCell cell = rows.getCell(column);

						if (cell != null) {

							if ((cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
									|| (cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA)) {

								if (row == 8) {

									if (column == 9) {

										indukAwalKonstruksiOmsetKontrak
												.setRkpAwal(cell
														.getNumericCellValue());

									}

									if (column == 10) {

										indukAwalKonstruksiOmsetKontrak
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										indukAwalKonstruksiOmsetKontrak
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										indukAwalKonstruksiOmsetKontrak
												.setRealisasiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 13) {

										indukAwalKonstruksiOmsetKontrak
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										indukAwalKonstruksiOmsetKontrak
												.setProyeksi(cell
														.getNumericCellValue());

									}

								}

								if (row == 9) {

									if (column == 9) {

										tambahKurangVoClaimOmsetKontrak
												.setRkpAwal(cell
														.getNumericCellValue());

									}

									if (column == 10) {

										tambahKurangVoClaimOmsetKontrak
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										tambahKurangVoClaimOmsetKontrak
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										tambahKurangVoClaimOmsetKontrak
												.setRealisasiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 13) {

										tambahKurangVoClaimOmsetKontrak
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										tambahKurangVoClaimOmsetKontrak
												.setProyeksi(cell
														.getNumericCellValue());

									}

								}

								if (row == 10) {

									if (column == 9) {

										totalOk.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										totalOk.setRencanaSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 11) {

										totalOk.setRealisasiSampaiBulanLalu(cell
												.getNumericCellValue());

									}

									if (column == 12) {

										totalOk.setRealisasiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 13) {

										totalOk.setRealisasiSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 14) {

										totalOk.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 12) {

									if (column == 9) {

										indukAwalKonstruksiPenjualan
												.setRkpAwal(cell
														.getNumericCellValue());

									}

									if (column == 10) {

										indukAwalKonstruksiPenjualan
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										indukAwalKonstruksiPenjualan
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										indukAwalKonstruksiPenjualan
												.setRealisasiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 13) {

										indukAwalKonstruksiPenjualan
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										indukAwalKonstruksiPenjualan
												.setProyeksi(cell
														.getNumericCellValue());

									}

								}

								if (row == 13) {

									if (column == 9) {

										indukAwalKonstruksiPenjualanProsentase
												.setRkpAwal(cell
														.getNumericCellValue());

									}

									if (column == 10) {

										indukAwalKonstruksiPenjualanProsentase
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										indukAwalKonstruksiPenjualanProsentase
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										indukAwalKonstruksiPenjualanProsentase
												.setRealisasiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 13) {

										indukAwalKonstruksiPenjualanProsentase
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										indukAwalKonstruksiPenjualanProsentase
												.setProyeksi(cell
														.getNumericCellValue());

									}

								}

								if (row == 14) {

									if (column == 9) {

										tambahKurangVoClaimPenjualan
												.setRkpAwal(cell
														.getNumericCellValue());

									}

									if (column == 10) {

										tambahKurangVoClaimPenjualan
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										tambahKurangVoClaimPenjualan
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										tambahKurangVoClaimPenjualan
												.setRealisasiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 13) {

										tambahKurangVoClaimPenjualan
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										tambahKurangVoClaimPenjualan
												.setProyeksi(cell
														.getNumericCellValue());

									}

								}

								if (row == 15) {

									if (column == 9) {

										tambahKurangVoClaimPenjualanProsentase
												.setRkpAwal(cell
														.getNumericCellValue());

									}

									if (column == 10) {

										tambahKurangVoClaimPenjualanProsentase
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										tambahKurangVoClaimPenjualanProsentase
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										tambahKurangVoClaimPenjualanProsentase
												.setRealisasiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 13) {

										tambahKurangVoClaimPenjualanProsentase
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										tambahKurangVoClaimPenjualanProsentase
												.setProyeksi(cell
														.getNumericCellValue());

									}

								}

								if (row == 16) {

									if (column == 9) {

										totalOp.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										totalOp.setRencanaSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 11) {

										totalOp.setRealisasiSampaiBulanLalu(cell
												.getNumericCellValue());

									}

									if (column == 12) {

										totalOp.setRealisasiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 13) {

										totalOp.setRealisasiSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 14) {

										totalOp.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 18) {

									if (column == 9) {

										biayaLangsung.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										biayaLangsung
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										biayaLangsung
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										biayaLangsung.setRealisasiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 13) {

										biayaLangsung
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										biayaLangsung.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 19) {

									if (column == 9) {

										biayaTakLangsung.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										biayaTakLangsung
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										biayaTakLangsung
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										biayaTakLangsung
												.setRealisasiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 13) {

										biayaTakLangsung
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										biayaTakLangsung.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 20) {

									if (column == 9) {

										totalBiaya.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										totalBiaya
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										totalBiaya
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										totalBiaya.setRealisasiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 13) {

										totalBiaya
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										totalBiaya.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 22) {

									if (column == 9) {

										biayaUsahaPusat.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										biayaUsahaPusat
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										biayaUsahaPusat
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										biayaUsahaPusat
												.setRealisasiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 13) {

										biayaUsahaPusat
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										biayaUsahaPusat.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 23) {

									if (column == 9) {

										risiko.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										risiko.setRencanaSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 11) {

										risiko.setRealisasiSampaiBulanLalu(cell
												.getNumericCellValue());

									}

									if (column == 12) {

										risiko.setRealisasiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 13) {

										risiko.setRealisasiSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 14) {

										risiko.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 24) {

									if (column == 9) {

										pphFinal.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										pphFinal.setRencanaSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 11) {

										pphFinal.setRealisasiSampaiBulanLalu(cell
												.getNumericCellValue());

									}

									if (column == 12) {

										pphFinal.setRealisasiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 13) {

										pphFinal.setRealisasiSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 14) {

										pphFinal.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 25) {

									if (column == 9) {

										totalBuPusatRisikoPphFinal
												.setRkpAwal(cell
														.getNumericCellValue());

									}

									if (column == 10) {

										totalBuPusatRisikoPphFinal
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										totalBuPusatRisikoPphFinal
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										totalBuPusatRisikoPphFinal
												.setRealisasiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 13) {

										totalBuPusatRisikoPphFinal
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										totalBuPusatRisikoPphFinal
												.setProyeksi(cell
														.getNumericCellValue());

									}

								}

								if (row == 26) {

									if (column == 9) {

										lkInduk.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										lkInduk.setRencanaSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 11) {

										lkInduk.setRealisasiSampaiBulanLalu(cell
												.getNumericCellValue());

									}

									if (column == 12) {

										lkInduk.setRealisasiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 13) {

										lkInduk.setRealisasiSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 14) {

										lkInduk.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 27) {

									if (column == 9) {

										prosentaseLk.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										prosentaseLk
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										prosentaseLk
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										prosentaseLk.setRealisasiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 13) {

										prosentaseLk
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										prosentaseLk.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 29) {

									if (column == 9) {

										bungaJasaGiro.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										bungaJasaGiro
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										bungaJasaGiro
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										bungaJasaGiro.setRealisasiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 13) {

										bungaJasaGiro
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										bungaJasaGiro.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 30) {

									if (column == 9) {

										pendapatanBiaya.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										pendapatanBiaya
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										pendapatanBiaya
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										pendapatanBiaya
												.setRealisasiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 13) {

										pendapatanBiaya
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										pendapatanBiaya.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 31) {

									if (column == 9) {

										pembebananBiaya.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										pembebananBiaya
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										pembebananBiaya
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										pembebananBiaya
												.setRealisasiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 13) {

										pembebananBiaya
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										pembebananBiaya.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 32) {

									if (column == 9) {

										totalLabaRugiLain.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										totalLabaRugiLain
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										totalLabaRugiLain
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										totalLabaRugiLain
												.setRealisasiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 13) {

										totalLabaRugiLain
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										totalLabaRugiLain.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 36) {

									if (column == 9) {

										uangMuka.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										uangMuka.setRencanaSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 11) {

										uangMuka.setRealisasiSampaiBulanLalu(cell
												.getNumericCellValue());

									}

									if (column == 12) {

										uangMuka.setRealisasiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 13) {

										uangMuka.setRealisasiSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 14) {

										uangMuka.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 37) {

									if (column == 9) {

										termijn.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										termijn.setRencanaSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 11) {

										termijn.setRealisasiSampaiBulanLalu(cell
												.getNumericCellValue());

									}

									if (column == 12) {

										termijn.setRealisasiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 13) {

										termijn.setRealisasiSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 14) {

										termijn.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 38) {

									if (column == 9) {

										totalPenerimaan.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										totalPenerimaan
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										totalPenerimaan
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										totalPenerimaan
												.setRealisasiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 13) {

										totalPenerimaan
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										totalPenerimaan.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 39) {

									if (column == 9) {

										pphPenerimaan.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										pphPenerimaan
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										pphPenerimaan
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										pphPenerimaan.setRealisasiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 13) {

										pphPenerimaan
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										pphPenerimaan.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 40) {

									if (column == 9) {

										penerimaanBersih.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										penerimaanBersih
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										penerimaanBersih
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										penerimaanBersih
												.setRealisasiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 13) {

										penerimaanBersih
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										penerimaanBersih.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 41) {

									if (column == 9) {

										persekot.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										persekot.setRencanaSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 11) {

										persekot.setRealisasiSampaiBulanLalu(cell
												.getNumericCellValue());

									}

									if (column == 12) {

										persekot.setRealisasiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 13) {

										persekot.setRealisasiSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 14) {

										persekot.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 42) {

									if (column == 9) {

										dropping.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										dropping.setRencanaSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 11) {

										dropping.setRealisasiSampaiBulanLalu(cell
												.getNumericCellValue());

									}

									if (column == 12) {

										dropping.setRealisasiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 13) {

										dropping.setRealisasiSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 14) {

										dropping.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 43) {

									if (column == 9) {

										rkPusat.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										rkPusat.setRencanaSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 11) {

										rkPusat.setRealisasiSampaiBulanLalu(cell
												.getNumericCellValue());

									}

									if (column == 12) {

										rkPusat.setRealisasiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 13) {

										rkPusat.setRealisasiSampaiBulanIni(cell
												.getNumericCellValue());

									}

									if (column == 14) {

										rkPusat.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 44) {

									if (column == 9) {

										surplusDefisit.setRkpAwal(cell
												.getNumericCellValue());

									}

									if (column == 10) {

										surplusDefisit
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										surplusDefisit
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										surplusDefisit
												.setRealisasiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 13) {

										surplusDefisit
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										surplusDefisit.setProyeksi(cell
												.getNumericCellValue());

									}

								}

								if (row == 45) {

									if (column == 9) {

										prosentaseTerhadapProduksi
												.setRkpAwal(cell
														.getNumericCellValue());

									}

									if (column == 10) {

										prosentaseTerhadapProduksi
												.setRencanaSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 11) {

										prosentaseTerhadapProduksi
												.setRealisasiSampaiBulanLalu(cell
														.getNumericCellValue());

									}

									if (column == 12) {

										prosentaseTerhadapProduksi
												.setRealisasiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 13) {

										prosentaseTerhadapProduksi
												.setRealisasiSampaiBulanIni(cell
														.getNumericCellValue());

									}

									if (column == 14) {

										prosentaseTerhadapProduksi
												.setProyeksi(cell
														.getNumericCellValue());

									}

								}

							}

						}

					}
				}

				omsetKontrakNetto
						.setIndukAwalKonstruksiOmsetKontrak(indukAwalKonstruksiOmsetKontrak);
				omsetKontrakNetto
						.setTambahKurangVoClaimOmsetKontrak(tambahKurangVoClaimOmsetKontrak);
				omsetKontrakNetto.setTotalOk(totalOk);

				penjualan
						.setIndukAwalKonstruksiPenjualan(indukAwalKonstruksiPenjualan);
				penjualan
						.setIndukAwalKonstruksiPenjualanProsentase(indukAwalKonstruksiPenjualanProsentase);
				penjualan
						.setTambahKurangVoClaimPenjualan(tambahKurangVoClaimPenjualan);
				penjualan
						.setTambahKurangVoClaimPenjualanProsentase(tambahKurangVoClaimPenjualanProsentase);
				penjualan.setTotalOp(totalOp);

				biayaPelaksanaan.setBiayaLangsung(biayaLangsung);
				biayaPelaksanaan.setBiayaTakLangsung(biayaTakLangsung);
				biayaPelaksanaan.setTotalBiaya(totalBiaya);

				buPusatRisikoPphFinal.setBiayaUsahaPusat(biayaUsahaPusat);
				buPusatRisikoPphFinal.setRisiko(risiko);
				buPusatRisikoPphFinal.setPphFinal(pphFinal);
				buPusatRisikoPphFinal
						.setTotalBuPusatRisikoPphFinal(totalBuPusatRisikoPphFinal);

				labaRugiLain.setBungaJasaGiro(bungaJasaGiro);
				labaRugiLain.setPendapatanBiaya(pendapatanBiaya);
				labaRugiLain.setPembebananBiaya(pembebananBiaya);
				labaRugiLain.setTotalLabaRugiLain(totalLabaRugiLain);

				penerimaan.setUangMuka(uangMuka);
				penerimaan.setTermijn(termijn);
				penerimaan.setTotalPenerimaan(totalPenerimaan);
				penerimaan.setPphPenerimaan(pphPenerimaan);
				penerimaan.setPenerimaanBersih(penerimaanBersih);

				informasiManajemen.setOmsetKontrakNetto(omsetKontrakNetto);
				informasiManajemen.setPenjualan(penjualan);
				informasiManajemen.setBiayaPelaksanaan(biayaPelaksanaan);
				informasiManajemen
						.setBuPusatRisikoPphFinal(buPusatRisikoPphFinal);
				informasiManajemen.setLkInduk(lkInduk);
				informasiManajemen.setProsentaseLk(prosentaseLk);
				informasiManajemen.setLabaRugiLain(labaRugiLain);
				informasiManajemen.setPenerimaan(penerimaan);
				informasiManajemen.setPersekot(persekot);
				informasiManajemen.setDropping(dropping);
				informasiManajemen.setRkPusat(rkPusat);
				informasiManajemen.setSurplusDefisit(surplusDefisit);
				informasiManajemen
						.setProsentaseTerhadapProduksi(prosentaseTerhadapProduksi);

				LOGGER.info("Get informasi manajemen from file " + filePath
						+ " : " + informasiManajemen.toString());

				informasiManajemenList.add(informasiManajemen);

				File renameFile = new File(pathName + "(READ) "
						+ file.getName());

				file.renameTo(renameFile);

				LOGGER.info("Rename file " + pathName + file.getName() + " to "
						+ pathName + "(READ) " + file.getName());

			}

		}

		return informasiManajemenList;

	}
}
