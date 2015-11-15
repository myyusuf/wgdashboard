package id.co.wikagedung.system.projectDashboard.service.impl;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
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

	private String pathName;

	public InformasiManajemenExcelFileMapperServiceImpl(String pathName) {
		this.pathName = pathName;
	}

	public InformasiManajemen informasiManajemenExcelFileMapping()
			throws BiffException, IOException {

		File file = new File(pathName);

		Workbook workbook = Workbook.getWorkbook(file);
		Sheet sheet = workbook
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

		for (int row = 0; row < sheet.getRows(); row++) {

			for (int column = 0; column < sheet.getColumns(); column++) {

				Cell cell = sheet.getCell(column, row);
				CellType cellType = cell.getType();

				if ((cellType == CellType.NUMBER)
						|| (cellType == CellType.NUMBER_FORMULA)) {

					if (row == 8) {

						if (column == 9) {

							indukAwalKonstruksiOmsetKontrak
									.setRkpAwal(new Integer(cell.getContents()));

						}

						if (column == 10) {

							indukAwalKonstruksiOmsetKontrak
									.setRencanaSampaiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 11) {

							indukAwalKonstruksiOmsetKontrak
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							indukAwalKonstruksiOmsetKontrak
									.setRealisasiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 13) {

							indukAwalKonstruksiOmsetKontrak
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							indukAwalKonstruksiOmsetKontrak
									.setProyeksi(new Integer(cell.getContents()));

						}

					}

					if (row == 9) {

						if (column == 9) {

							tambahKurangVoClaimOmsetKontrak
									.setRkpAwal(new Integer(cell.getContents()));

						}

						if (column == 10) {

							tambahKurangVoClaimOmsetKontrak
									.setRencanaSampaiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 11) {

							tambahKurangVoClaimOmsetKontrak
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							tambahKurangVoClaimOmsetKontrak
									.setRealisasiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 13) {

							tambahKurangVoClaimOmsetKontrak
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							tambahKurangVoClaimOmsetKontrak
									.setProyeksi(new Integer(cell.getContents()));

						}

					}

					if (row == 10) {

						if (column == 9) {

							totalOk.setRkpAwal(new Integer(cell.getContents()));

						}

						if (column == 10) {

							totalOk.setRencanaSampaiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 11) {

							totalOk.setRealisasiSampaiBulanLalu(new Integer(
									cell.getContents()));

						}

						if (column == 12) {

							totalOk.setRealisasiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 13) {

							totalOk.setRealisasiSampaiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 14) {

							totalOk.setProyeksi(new Integer(cell.getContents()));

						}

					}

					if (row == 12) {

						if (column == 9) {

							indukAwalKonstruksiPenjualan
									.setRkpAwal(new Integer(cell.getContents()));

						}

						if (column == 10) {

							indukAwalKonstruksiPenjualan
									.setRencanaSampaiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 11) {

							indukAwalKonstruksiPenjualan
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							indukAwalKonstruksiPenjualan
									.setRealisasiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 13) {

							indukAwalKonstruksiPenjualan
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							indukAwalKonstruksiPenjualan
									.setProyeksi(new Integer(cell.getContents()));

						}

					}

					if (row == 13) {

						if (column == 9) {

							indukAwalKonstruksiPenjualanProsentase
									.setRkpAwal(new Integer(cell.getContents()));

						}

						if (column == 10) {

							indukAwalKonstruksiPenjualanProsentase
									.setRencanaSampaiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 11) {

							indukAwalKonstruksiPenjualanProsentase
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							indukAwalKonstruksiPenjualanProsentase
									.setRealisasiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 13) {

							indukAwalKonstruksiPenjualanProsentase
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							indukAwalKonstruksiPenjualanProsentase
									.setProyeksi(new Integer(cell.getContents()));

						}

					}

					if (row == 14) {

						if (column == 9) {

							tambahKurangVoClaimPenjualan
									.setRkpAwal(new Integer(cell.getContents()));

						}

						if (column == 10) {

							tambahKurangVoClaimPenjualan
									.setRencanaSampaiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 11) {

							tambahKurangVoClaimPenjualan
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							tambahKurangVoClaimPenjualan
									.setRealisasiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 13) {

							tambahKurangVoClaimPenjualan
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							tambahKurangVoClaimPenjualan
									.setProyeksi(new Integer(cell.getContents()));

						}

					}

					if (row == 15) {

						if (column == 9) {

							tambahKurangVoClaimPenjualanProsentase
									.setRkpAwal(new Integer(cell.getContents()));

						}

						if (column == 10) {

							tambahKurangVoClaimPenjualanProsentase
									.setRencanaSampaiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 11) {

							tambahKurangVoClaimPenjualanProsentase
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							tambahKurangVoClaimPenjualanProsentase
									.setRealisasiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 13) {

							tambahKurangVoClaimPenjualanProsentase
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							tambahKurangVoClaimPenjualanProsentase
									.setProyeksi(new Integer(cell.getContents()));

						}

					}

					if (row == 16) {

						if (column == 9) {

							totalOp.setRkpAwal(new Integer(cell.getContents()));

						}

						if (column == 10) {

							totalOp.setRencanaSampaiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 11) {

							totalOp.setRealisasiSampaiBulanLalu(new Integer(
									cell.getContents()));

						}

						if (column == 12) {

							totalOp.setRealisasiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 13) {

							totalOp.setRealisasiSampaiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 14) {

							totalOp.setProyeksi(new Integer(cell.getContents()));

						}

					}

					if (row == 18) {

						if (column == 9) {

							biayaLangsung.setRkpAwal(new Integer(cell
									.getContents()));

						}

						if (column == 10) {

							biayaLangsung.setRencanaSampaiBulanIni(new Integer(
									cell.getContents()));

						}

						if (column == 11) {

							biayaLangsung
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							biayaLangsung.setRealisasiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 13) {

							biayaLangsung
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							biayaLangsung.setProyeksi(new Integer(cell
									.getContents()));

						}

					}

					if (row == 19) {

						if (column == 9) {

							biayaTakLangsung.setRkpAwal(new Integer(cell
									.getContents()));

						}

						if (column == 10) {

							biayaTakLangsung
									.setRencanaSampaiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 11) {

							biayaTakLangsung
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							biayaTakLangsung.setRealisasiBulanIni(new Integer(
									cell.getContents()));

						}

						if (column == 13) {

							biayaTakLangsung
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							biayaTakLangsung.setProyeksi(new Integer(cell
									.getContents()));

						}

					}

					if (row == 20) {

						if (column == 9) {

							totalBiaya.setRkpAwal(new Integer(cell
									.getContents()));

						}

						if (column == 10) {

							totalBiaya.setRencanaSampaiBulanIni(new Integer(
									cell.getContents()));

						}

						if (column == 11) {

							totalBiaya.setRealisasiSampaiBulanLalu(new Integer(
									cell.getContents()));

						}

						if (column == 12) {

							totalBiaya.setRealisasiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 13) {

							totalBiaya.setRealisasiSampaiBulanIni(new Integer(
									cell.getContents()));

						}

						if (column == 14) {

							totalBiaya.setProyeksi(new Integer(cell
									.getContents()));

						}

					}

					if (row == 22) {

						if (column == 9) {

							biayaUsahaPusat.setRkpAwal(new Integer(cell
									.getContents()));

						}

						if (column == 10) {

							biayaUsahaPusat
									.setRencanaSampaiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 11) {

							biayaUsahaPusat
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							biayaUsahaPusat.setRealisasiBulanIni(new Integer(
									cell.getContents()));

						}

						if (column == 13) {

							biayaUsahaPusat
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							biayaUsahaPusat.setProyeksi(new Integer(cell
									.getContents()));

						}

					}

					if (row == 23) {

						if (column == 9) {

							risiko.setRkpAwal(new Integer(cell.getContents()));

						}

						if (column == 10) {

							risiko.setRencanaSampaiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 11) {

							risiko.setRealisasiSampaiBulanLalu(new Integer(cell
									.getContents()));

						}

						if (column == 12) {

							risiko.setRealisasiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 13) {

							risiko.setRealisasiSampaiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 14) {

							risiko.setProyeksi(new Integer(cell.getContents()));

						}

					}

					if (row == 24) {

						if (column == 9) {

							pphFinal.setRkpAwal(new Integer(cell.getContents()));

						}

						if (column == 10) {

							pphFinal.setRencanaSampaiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 11) {

							pphFinal.setRealisasiSampaiBulanLalu(new Integer(
									cell.getContents()));

						}

						if (column == 12) {

							pphFinal.setRealisasiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 13) {

							pphFinal.setRealisasiSampaiBulanIni(new Integer(
									cell.getContents()));

						}

						if (column == 14) {

							pphFinal.setProyeksi(new Integer(cell.getContents()));

						}

					}

					if (row == 25) {

						if (column == 9) {

							totalBuPusatRisikoPphFinal.setRkpAwal(new Integer(
									cell.getContents()));

						}

						if (column == 10) {

							totalBuPusatRisikoPphFinal
									.setRencanaSampaiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 11) {

							totalBuPusatRisikoPphFinal
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							totalBuPusatRisikoPphFinal
									.setRealisasiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 13) {

							totalBuPusatRisikoPphFinal
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							totalBuPusatRisikoPphFinal.setProyeksi(new Integer(
									cell.getContents()));

						}

					}

					if (row == 26) {

						if (column == 9) {

							lkInduk.setRkpAwal(new Integer(cell.getContents()));

						}

						if (column == 10) {

							lkInduk.setRencanaSampaiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 11) {

							lkInduk.setRealisasiSampaiBulanLalu(new Integer(
									cell.getContents()));

						}

						if (column == 12) {

							lkInduk.setRealisasiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 13) {

							lkInduk.setRealisasiSampaiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 14) {

							lkInduk.setProyeksi(new Integer(cell.getContents()));

						}

					}

					if (row == 27) {

						if (column == 9) {

							prosentaseLk.setRkpAwal(new Integer(cell
									.getContents()));

						}

						if (column == 10) {

							prosentaseLk.setRencanaSampaiBulanIni(new Integer(
									cell.getContents()));

						}

						if (column == 11) {

							prosentaseLk
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							prosentaseLk.setRealisasiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 13) {

							prosentaseLk
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							prosentaseLk.setProyeksi(new Integer(cell
									.getContents()));

						}

					}

					if (row == 29) {

						if (column == 9) {

							bungaJasaGiro.setRkpAwal(new Integer(cell
									.getContents()));

						}

						if (column == 10) {

							bungaJasaGiro.setRencanaSampaiBulanIni(new Integer(
									cell.getContents()));

						}

						if (column == 11) {

							bungaJasaGiro
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							bungaJasaGiro.setRealisasiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 13) {

							bungaJasaGiro
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							bungaJasaGiro.setProyeksi(new Integer(cell
									.getContents()));

						}

					}

					if (row == 30) {

						if (column == 9) {

							pendapatanBiaya.setRkpAwal(new Integer(cell
									.getContents()));

						}

						if (column == 10) {

							pendapatanBiaya
									.setRencanaSampaiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 11) {

							pendapatanBiaya
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							pendapatanBiaya.setRealisasiBulanIni(new Integer(
									cell.getContents()));

						}

						if (column == 13) {

							pendapatanBiaya
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							pendapatanBiaya.setProyeksi(new Integer(cell
									.getContents()));

						}

					}

					if (row == 31) {

						if (column == 9) {

							pembebananBiaya.setRkpAwal(new Integer(cell
									.getContents()));

						}

						if (column == 10) {

							pembebananBiaya
									.setRencanaSampaiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 11) {

							pembebananBiaya
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							pembebananBiaya.setRealisasiBulanIni(new Integer(
									cell.getContents()));

						}

						if (column == 13) {

							pembebananBiaya
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							pembebananBiaya.setProyeksi(new Integer(cell
									.getContents()));

						}

					}

					if (row == 32) {

						if (column == 9) {

							totalLabaRugiLain.setRkpAwal(new Integer(cell
									.getContents()));

						}

						if (column == 10) {

							totalLabaRugiLain
									.setRencanaSampaiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 11) {

							totalLabaRugiLain
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							totalLabaRugiLain.setRealisasiBulanIni(new Integer(
									cell.getContents()));

						}

						if (column == 13) {

							totalLabaRugiLain
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							totalLabaRugiLain.setProyeksi(new Integer(cell
									.getContents()));

						}

					}

					if (row == 36) {

						if (column == 9) {

							uangMuka.setRkpAwal(new Integer(cell.getContents()));

						}

						if (column == 10) {

							uangMuka.setRencanaSampaiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 11) {

							uangMuka.setRealisasiSampaiBulanLalu(new Integer(
									cell.getContents()));

						}

						if (column == 12) {

							uangMuka.setRealisasiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 13) {

							uangMuka.setRealisasiSampaiBulanIni(new Integer(
									cell.getContents()));

						}

						if (column == 14) {

							uangMuka.setProyeksi(new Integer(cell.getContents()));

						}

					}

					if (row == 37) {

						if (column == 9) {

							termijn.setRkpAwal(new Integer(cell.getContents()));

						}

						if (column == 10) {

							termijn.setRencanaSampaiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 11) {

							termijn.setRealisasiSampaiBulanLalu(new Integer(
									cell.getContents()));

						}

						if (column == 12) {

							termijn.setRealisasiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 13) {

							termijn.setRealisasiSampaiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 14) {

							termijn.setProyeksi(new Integer(cell.getContents()));

						}

					}

					if (row == 38) {

						if (column == 9) {

							totalPenerimaan.setRkpAwal(new Integer(cell
									.getContents()));

						}

						if (column == 10) {

							totalPenerimaan
									.setRencanaSampaiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 11) {

							totalPenerimaan
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							totalPenerimaan.setRealisasiBulanIni(new Integer(
									cell.getContents()));

						}

						if (column == 13) {

							totalPenerimaan
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							totalPenerimaan.setProyeksi(new Integer(cell
									.getContents()));

						}

					}

					if (row == 39) {

						if (column == 9) {

							pphPenerimaan.setRkpAwal(new Integer(cell
									.getContents()));

						}

						if (column == 10) {

							pphPenerimaan.setRencanaSampaiBulanIni(new Integer(
									cell.getContents()));

						}

						if (column == 11) {

							pphPenerimaan
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							pphPenerimaan.setRealisasiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 13) {

							pphPenerimaan
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							pphPenerimaan.setProyeksi(new Integer(cell
									.getContents()));

						}

					}

					if (row == 40) {

						if (column == 9) {

							penerimaanBersih.setRkpAwal(new Integer(cell
									.getContents()));

						}

						if (column == 10) {

							penerimaanBersih
									.setRencanaSampaiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 11) {

							penerimaanBersih
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							penerimaanBersih.setRealisasiBulanIni(new Integer(
									cell.getContents()));

						}

						if (column == 13) {

							penerimaanBersih
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							penerimaanBersih.setProyeksi(new Integer(cell
									.getContents()));

						}

					}

					if (row == 41) {

						if (column == 9) {

							persekot.setRkpAwal(new Integer(cell.getContents()));

						}

						if (column == 10) {

							persekot.setRencanaSampaiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 11) {

							persekot.setRealisasiSampaiBulanLalu(new Integer(
									cell.getContents()));

						}

						if (column == 12) {

							persekot.setRealisasiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 13) {

							persekot.setRealisasiSampaiBulanIni(new Integer(
									cell.getContents()));

						}

						if (column == 14) {

							persekot.setProyeksi(new Integer(cell.getContents()));

						}

					}

					if (row == 42) {

						if (column == 9) {

							dropping.setRkpAwal(new Integer(cell.getContents()));

						}

						if (column == 10) {

							dropping.setRencanaSampaiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 11) {

							dropping.setRealisasiSampaiBulanLalu(new Integer(
									cell.getContents()));

						}

						if (column == 12) {

							dropping.setRealisasiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 13) {

							dropping.setRealisasiSampaiBulanIni(new Integer(
									cell.getContents()));

						}

						if (column == 14) {

							dropping.setProyeksi(new Integer(cell.getContents()));

						}

					}

					if (row == 43) {

						if (column == 9) {

							rkPusat.setRkpAwal(new Integer(cell.getContents()));

						}

						if (column == 10) {

							rkPusat.setRencanaSampaiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 11) {

							rkPusat.setRealisasiSampaiBulanLalu(new Integer(
									cell.getContents()));

						}

						if (column == 12) {

							rkPusat.setRealisasiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 13) {

							rkPusat.setRealisasiSampaiBulanIni(new Integer(cell
									.getContents()));

						}

						if (column == 14) {

							rkPusat.setProyeksi(new Integer(cell.getContents()));

						}

					}

					if (row == 44) {

						if (column == 9) {

							surplusDefisit.setRkpAwal(new Integer(cell
									.getContents()));

						}

						if (column == 10) {

							surplusDefisit
									.setRencanaSampaiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 11) {

							surplusDefisit
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							surplusDefisit.setRealisasiBulanIni(new Integer(
									cell.getContents()));

						}

						if (column == 13) {

							surplusDefisit
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							surplusDefisit.setProyeksi(new Integer(cell
									.getContents()));

						}

					}

					if (row == 45) {

						if (column == 9) {

							prosentaseTerhadapProduksi.setRkpAwal(new Integer(
									cell.getContents()));

						}

						if (column == 10) {

							prosentaseTerhadapProduksi
									.setRencanaSampaiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 11) {

							prosentaseTerhadapProduksi
									.setRealisasiSampaiBulanLalu(new Integer(
											cell.getContents()));

						}

						if (column == 12) {

							prosentaseTerhadapProduksi
									.setRealisasiBulanIni(new Integer(cell
											.getContents()));

						}

						if (column == 13) {

							prosentaseTerhadapProduksi
									.setRealisasiSampaiBulanIni(new Integer(
											cell.getContents()));

						}

						if (column == 14) {

							prosentaseTerhadapProduksi.setProyeksi(new Integer(
									cell.getContents()));

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

		penjualan.setIndukAwalKonstruksiPenjualan(indukAwalKonstruksiPenjualan);
		penjualan
				.setIndukAwalKonstruksiPenjualanProsentase(indukAwalKonstruksiPenjualanProsentase);
		penjualan.setTambahKurangVoClaimPenjualan(tambahKurangVoClaimPenjualan);
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
		informasiManajemen.setBuPusatRisikoPphFinal(buPusatRisikoPphFinal);
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

		return informasiManajemen;
	}
}
