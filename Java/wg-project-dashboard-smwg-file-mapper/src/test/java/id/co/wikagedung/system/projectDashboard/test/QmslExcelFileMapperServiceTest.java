package id.co.wikagedung.system.projectDashboard.test;

import id.co.wikagedung.system.projectDashboard.model.qmsl.Qmsl;
import id.co.wikagedung.system.projectDashboard.service.QmslExcelFileMapperService;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/spring-ctx.xml" })
public class QmslExcelFileMapperServiceTest {

	@Autowired
	private QmslExcelFileMapperService qmslExcelFileMapperService;

	// @Test
	public void qmslExcelFileMapping() throws IOException,
			InvalidFormatException {

		List<Qmsl> result = qmslExcelFileMapperService.qmslExcelFileMapping();

		for (Qmsl qmsl : result) {

			System.out.println("QMSL : " + qmsl.toString());

		}

	}

	@Test
	public void getDataQmsl() throws InvalidFormatException, IOException {

		List<Qmsl> result = qmslExcelFileMapperService.qmslExcelFileMapping();

		Double fungsiManajerKepalaProyek = 0.0;
		Double fungsiKomersial = 0.0;
		Double fungsiQa = 0.0;
		Double fungsiProduksi = 0.0;
		Double fungsiEnjinering = 0.0;
		Double fungsiPengadaan = 0.0;
		Double fungsiKa = 0.0;
		Double total = 0.0;

		for (Qmsl qmsl : result) {

			fungsiManajerKepalaProyek = qmsl.getManajerKepalaProyek()
					.getProsesPersiapan()
					+ qmsl.getManajerKepalaProyek().getProsesRkp()
					+ qmsl.getManajerKepalaProyek().getProsesManajemenReview()
					+ qmsl.getManajerKepalaProyek().getProsesRoleModel()
					+ qmsl.getManajerKepalaProyek().getProsesScoreCard()
					+ qmsl.getManajerKepalaProyek().getResultMutu()
					+ qmsl.getManajerKepalaProyek().getResultWaktu()
					+ qmsl.getManajerKepalaProyek().getResultBiaya();

			fungsiKomersial = qmsl.getFungsiKomersial().getLaporanBulanan()
					+ qmsl.getFungsiKomersial()
							.getVariationOrderDanPekerjaanTambahKurang()
					+ qmsl.getFungsiKomersial()
							.getSchedulingReschedulingInternal()
					+ qmsl.getFungsiKomersial().getAdministrasiKontrak()
					+ qmsl.getFungsiKomersial().getManajemenRisiko();

			fungsiQa = qmsl.getFungsiQa().getqPlan()
					+ qmsl.getFungsiQa().getAktivitasCppPtkp()
					+ qmsl.getFungsiQa().getAktivitasPelaksanaanQplan()
					+ qmsl.getFungsiQa().getKalibrasi()
					+ qmsl.getFungsiQa().getAuditInternalDanAuditEksternal()
					+ qmsl.getFungsiQa().getPengendalianDokumenDanRekaman()
					+ qmsl.getFungsiQa().getKepuasanPelanggan();

			fungsiProduksi = qmsl.getFungsiProduksi()
					.getPengendalianSumberDaya()
					+ qmsl.getFungsiProduksi().getPengendalianProduksi()
					+ qmsl.getFungsiProduksi().getPengendalianGambarLapangan()
					+ qmsl.getFungsiProduksi().getMetodeKerja()
					+ qmsl.getFungsiProduksi().getPengendalianMutuPekerja()
					+ qmsl.getFungsiProduksi().getRapatKoordinasiProduksi();

			fungsiEnjinering = qmsl.getFungsiEnjinering()
					.getDesignDanRedesign()
					+ qmsl.getFungsiEnjinering().getPengendalianGambar()
					+ qmsl.getFungsiEnjinering()
							.getMetodeKerjaDanMetodePelaksanaan()
					+ qmsl.getFungsiEnjinering().getVeDanInovasiKm();

			fungsiPengadaan = qmsl.getFungsiPengadaan().getPolaPembelanjaan()
					+ qmsl.getFungsiPengadaan().getRencanaPengadaan()
					+ qmsl.getFungsiPengadaan()
							.getEvaluasiPenyediaJasaDanPemasok()
					+ qmsl.getFungsiPengadaan().getPemeliharaanAlat();

			fungsiKa = qmsl.getFungsiKa().getPenerimaanDanPenangananMaterial()
					+ qmsl.getFungsiKa().getGudang()
					+ qmsl.getFungsiKa().getKeuangan()
					+ qmsl.getFungsiKa().getAkuntansi()
					+ qmsl.getFungsiKa().getPelatihanDanKompetensi()
					+ qmsl.getFungsiKa().getKepersonaliaan();

			total = fungsiManajerKepalaProyek + fungsiKomersial + fungsiQa
					+ fungsiProduksi + fungsiEnjinering + fungsiPengadaan
					+ fungsiKa;

		}

		System.out.println("Sub Total Fungsi Manajer Kepala Proyek : "
				+ fungsiManajerKepalaProyek);
		System.out.println("Sub Total Fungsi Komersial : " + fungsiKomersial);
		System.out.println("Sub Total Fungsi QA : " + fungsiQa);
		System.out.println("Sub Total Fungsi Produksi : " + fungsiProduksi);
		System.out.println("Sub Total Fungsi Enjinering : " + fungsiEnjinering);
		System.out.println("Sub Total Fungsi Pengadaan : " + fungsiPengadaan);
		System.out.println("Sub Total Fungsi KA : " + fungsiKa);
		System.out.println("Total QMSL : " + total);

	}

}
