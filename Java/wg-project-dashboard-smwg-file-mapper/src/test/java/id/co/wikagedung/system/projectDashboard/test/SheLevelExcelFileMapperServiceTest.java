package id.co.wikagedung.system.projectDashboard.test;

import id.co.wikagedung.system.projectDashboard.model.sheLevel.SheLevel;
import id.co.wikagedung.system.projectDashboard.service.SheLevelExcelFileMapperService;

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
public class SheLevelExcelFileMapperServiceTest {

	@Autowired
	private SheLevelExcelFileMapperService sheLevelExcelFileMapperService;

	// @Test
	public void sheLevelExcelFileMapping() throws IOException,
			InvalidFormatException {

		List<SheLevel> result = sheLevelExcelFileMapperService
				.sheLevelExcelFileMapping();

		for (SheLevel sheLevel : result) {

			System.out.println("SHE Level : " + sheLevel.toString());

		}

	}

	@Test
	public void getDataSheLevel() throws IOException, InvalidFormatException {

		List<SheLevel> result = sheLevelExcelFileMapperService
				.sheLevelExcelFileMapping();

		Double skorSheLevel = 0.0;

		for (SheLevel sheLevel : result) {

			skorSheLevel = sheLevel.getKebijakanKTiga().getKebijakanShe()
					+ sheLevel.getPerencanaan()
							.getHirarcDanAspectImpactIdentification()
					+ sheLevel.getPerencanaan()
							.getIdentifikasiPersyaratanHukumDanAturannya()
					+ sheLevel.getPerencanaan().getSasaranShe()
					+ sheLevel.getPerencanaan().getProgramManajemenShe()
					+ sheLevel.getPenerapanDanOperasional()
							.getStrukturDanTanggungJawab()
					+ sheLevel.getPenerapanDanOperasional().getPelatihan()
					+ sheLevel.getPenerapanDanOperasional()
							.getKompetensiPersonil()
					+ sheLevel.getPenerapanDanOperasional()
							.getPapanInformasiDanKomunikasiPapanInformasiShe()
					+ sheLevel.getPenerapanDanOperasional()
							.getPapanInformasiDanKomunikasiKomunikasiEkstern()
					+ sheLevel.getPenerapanDanOperasional()
							.getPapanInformasiDanKomunikasiSheInduction()
					+ sheLevel.getPenerapanDanOperasional()
							.getDokumentasiPedokumentasian()
					+ sheLevel.getPenerapanDanOperasional()
							.getDokumentasiStatistik()
					+ sheLevel.getPenerapanDanOperasional()
							.getPengadaanBarangDanJasa()
					+ sheLevel.getPenerapanDanOperasional()
							.getPengendalianPekerjaanRambuRambu()
					+ sheLevel.getPenerapanDanOperasional()
							.getPengendalianPekerjaanSpandukPoster()
					+ sheLevel.getPenerapanDanOperasional()
							.getPengendalianPekerjaanSistemIjinKerja()
					+ sheLevel.getPenerapanDanOperasional()
							.getPengendalianPekerjaanPengawasanPekerjaan()
					+ sheLevel.getPenerapanDanOperasional()
							.getPengendalianPekerjaanGudang()
					+ sheLevel.getPenerapanDanOperasional()
							.getPengendalianPekerjaanLayOutManagement()
					+ sheLevel.getPenerapanDanOperasional()
							.getPengendalianPekerjaanInspeksiPekerjaan()
					+ sheLevel.getPenerapanDanOperasional()
							.getPengedalianMaterialBerbahaya()
					+ sheLevel.getPenerapanDanOperasional()
							.getKelayakanAlatBerat()
					+ sheLevel.getPenerapanDanOperasional().getKeadaanDarurat()
					+ sheLevel.getTindakanPemeriksaanDanPerbaikan().getAudit()
					+ sheLevel.getTindakanPemeriksaanDanPerbaikan()
							.getInspeksiSheAlatBantu()
					+ sheLevel.getTindakanPemeriksaanDanPerbaikan()
							.getInspeksiShePeralatanShe()
					+ sheLevel.getTindakanPemeriksaanDanPerbaikan()
							.getInspeksiShePemantauanLingkungan()
					+ sheLevel.getTindakanPemeriksaanDanPerbaikan()
							.getPenangananKecelakaan()
					+ sheLevel.getTindakanPemeriksaanDanPerbaikan()
							.getPenangananPencemaranLingkungan()
					+ sheLevel.getTindakanPemeriksaanDanPerbaikan()
							.getPenyakitAkibatKerja()
					+ sheLevel.getTindakanPemeriksaanDanPerbaikan()
							.getKlinikKesehatan()
					+ sheLevel.getTindakanPemeriksaanDanPerbaikan()
							.getKantinWarungPekerjaKatering()
					+ sheLevel.getEvaluasiPenataan()
							.getEvaluasiPemenuhanPeraturanPerundangan()
					+ sheLevel.getResultShe().getResultShe()
					+ sheLevel.getImplementasiBenchmarkProject()
							.getKegiatanRutinQsheMorningTalk()
					+ sheLevel.getImplementasiBenchmarkProject()
							.getKegiatanRutinToolboxMeeting()
					+ sheLevel.getImplementasiBenchmarkProject()
							.getKegiatanRutinQsheMeeting()
					+ sheLevel.getImplementasiBenchmarkProject()
							.getKegiatanRutinQshePatrol()
					+ sheLevel.getImplementasiBenchmarkProject()
							.getKegiatanRutinKebersihanSerentak()
					+ sheLevel.getImplementasiBenchmarkProject()
							.getKegiatanRutinDailyMeeting()
					+ sheLevel
							.getImplementasiBenchmarkProject()
							.getPimpinanRoleModelPelaksanaanTerlibatSheMorningTalk()
					+ sheLevel
							.getImplementasiBenchmarkProject()
							.getPimpinanRoleModelPelaksanaanMemimpinQsheMeeting()
					+ sheLevel
							.getImplementasiBenchmarkProject()
							.getPimpinanRoleModelPelaksanaanTerlibatQshePatrol()
					+ sheLevel
							.getImplementasiBenchmarkProject()
							.getPimpinanRoleModelPelaksanaanMemimpinToolboxMeeting()
					+ sheLevel
							.getImplementasiBenchmarkProject()
							.getPimpinanRoleModelPelaksanaanPelaksanaToolboxMeeting()
					+ sheLevel
							.getImplementasiBenchmarkProject()
							.getPimpinanRoleModelPelaksanaanTerlibatKebersihanSerentak()
					+ sheLevel.getImplementasiBenchmarkProject()
							.getPerlengkapanStandarPegawaiMenggunakanApd()
					+ sheLevel.getImplementasiBenchmarkProject()
							.getPerlengkapanStandarPekerjaMenggunakanApd()
					+ sheLevel.getImplementasiBenchmarkProject()
							.getKeterlibatanSubkonMandorMemilikiSheOfficer()
					+ sheLevel
							.getImplementasiBenchmarkProject()
							.getKeterlibatanSubkonMandorMenghadiriMorningTalkToolboxMeeting()
					+ sheLevel.getImplementasiBenchmarkProject()
							.getKeterlibatanSubkonMandorMelaksanakanLimaR();

		}

		System.out.println("Skor SHE Level : " + skorSheLevel);

	}
}
