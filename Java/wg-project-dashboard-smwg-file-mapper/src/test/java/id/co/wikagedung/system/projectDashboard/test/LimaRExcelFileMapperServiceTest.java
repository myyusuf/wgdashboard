package id.co.wikagedung.system.projectDashboard.test;

import id.co.wikagedung.system.projectDashboard.model.limaR.LimaR;
import id.co.wikagedung.system.projectDashboard.service.LimaRExcelFileMapperService;

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
public class LimaRExcelFileMapperServiceTest {

	@Autowired
	private LimaRExcelFileMapperService limaRExcelFileMapperService;

	// @Test
	public void limaRExcelFileMapping() throws IOException,
			InvalidFormatException {

		List<LimaR> result = limaRExcelFileMapperService
				.limaRExcelFileMapping();

		for (LimaR limaR : result) {

			System.out.println("5R : " + limaR.toString());

		}

	}

	@Test
	public void getDatalimaR() throws IOException, InvalidFormatException {

		List<LimaR> result = limaRExcelFileMapperService
				.limaRExcelFileMapping();

		Double ringkas = 0.0;
		Double rapi = 0.0;
		Double resik = 0.0;
		Double rawat = 0.0;
		Double rajin = 0.0;
		Double total = 0.0;

		for (LimaR limaR : result) {

			ringkas = limaR.getRingkas().getRingkasKantorDanSekitarnya()
					.getKantorTempatKerja()
					+ limaR.getRingkas().getRingkasKantorDanSekitarnya()
							.getKantorAtkMesinAlatPenunjang()
					+ limaR.getRingkas().getRingkasKantorDanSekitarnya()
							.getKantorBahanRujukanReferensiArsip()
					+ limaR.getRingkas().getRingkasKantorDanSekitarnya()
							.getKantorDokumen()
					+ limaR.getRingkas().getRingkasKantorDanSekitarnya()
							.getMusholla()
					+ limaR.getRingkas().getRingkasKantorDanSekitarnya()
							.getToilet()
					+ limaR.getRingkas().getRingkasKriteriaStandar()
							.getPagarProyek()
					+ limaR.getRingkas().getRingkasKriteriaStandar()
							.getRambuDanSpanduk()
					+ limaR.getRingkas().getRingkasKriteriaStandar()
							.getGudang()
					+ limaR.getRingkas().getRingkasKriteriaStandar()
							.getPosSatpam()
					+ limaR.getRingkas().getRingkasKriteriaStandar()
							.getBarakPekerja()
					+ limaR.getRingkas().getRingkasKriteriaTambahan()
							.getWorkshop()
					+ limaR.getRingkas().getRingkasKriteriaTambahan()
							.getSisaMaterialDanSampah()
					+ limaR.getRingkas().getRingkasKriteriaTambahan()
							.getJalanKerjaDanTba()
					+ limaR.getRingkas().getRingkasKriteriaTambahan()
							.getJalurKabel()
					+ limaR.getRingkas().getRingkasKriteriaTambahan()
							.getJalurDewatering()
					+ limaR.getRingkas().getRingkasKriteriaTambahan()
							.getAreaPengecoran()
					+ limaR.getRingkas().getRingkasKriteriaTambahan()
							.getSafetyLineDanToloTolo();

			rapi = limaR.getRapi().getRapiKantorDanSekitarnya()
					.getKantorTempatKerja()
					+ limaR.getRapi().getRapiKantorDanSekitarnya()
							.getKantorAtkMesinAlatPenunjang()
					+ limaR.getRapi().getRapiKantorDanSekitarnya()
							.getKantorBahanRujukanReferensiArsip()
					+ limaR.getRapi().getRapiKantorDanSekitarnya()
							.getKantorDokumen()
					+ limaR.getRapi().getRapiKantorDanSekitarnya()
							.getMusholla()
					+ limaR.getRapi().getRapiKantorDanSekitarnya().getToilet()
					+ limaR.getRapi().getRapiKriteriaStandar().getPagarProyek()
					+ limaR.getRapi().getRapiKriteriaStandar()
							.getRambuDanSpanduk()
					+ limaR.getRapi().getRapiKriteriaStandar().getGudang()
					+ limaR.getRapi().getRapiKriteriaStandar().getPosSatpam()
					+ limaR.getRapi().getRapiKriteriaStandar()
							.getBarakPekerja()
					+ limaR.getRapi().getRapiKriteriaTambahan().getWorkshop()
					+ limaR.getRapi().getRapiKriteriaTambahan()
							.getSisaMaterialDanSampah()
					+ limaR.getRapi().getRapiKriteriaTambahan().getJalanUmum()
					+ limaR.getRapi().getRapiKriteriaTambahan().getPerancah()
					+ limaR.getRapi().getRapiKriteriaTambahan()
							.getJalanKerjaDanTba()
					+ limaR.getRapi().getRapiKriteriaTambahan().getJalurKabel()
					+ limaR.getRapi().getRapiKriteriaTambahan()
							.getJalurDewatering()
					+ limaR.getRapi().getRapiKriteriaTambahan()
							.getAreaPengecoran()
					+ limaR.getRapi().getRapiKriteriaTambahan()
							.getSafetyLineDanToloTolo();

			resik = limaR.getResik().getResikKantorDanSekitarnya()
					.getKantorTempatKerja()
					+ limaR.getResik().getResikKantorDanSekitarnya()
							.getKantorAtkMesinAlatPenunjang()
					+ limaR.getResik().getResikKantorDanSekitarnya()
							.getKantorBahanRujukanReferensiArsip()
					+ limaR.getResik().getResikKantorDanSekitarnya()
							.getKantorDokumen()
					+ limaR.getResik().getResikKantorDanSekitarnya()
							.getMusholla()
					+ limaR.getResik().getResikKantorDanSekitarnya()
							.getToilet()
					+ limaR.getResik().getResikKriteriaStandar()
							.getPagarProyek()
					+ limaR.getResik().getResikKriteriaStandar()
							.getRambuDanSpanduk()
					+ limaR.getResik().getResikKriteriaStandar().getGudang()
					+ limaR.getResik().getResikKriteriaStandar().getPosSatpam()
					+ limaR.getResik().getResikKriteriaStandar()
							.getBarakPekerja()
					+ limaR.getResik().getResikKriteriaTambahan().getWorkshop()
					+ limaR.getResik().getResikKriteriaTambahan()
							.getSisaMaterialDanSampah()
					+ limaR.getResik().getResikKriteriaTambahan()
							.getJalanUmum()
					+ limaR.getResik().getResikKriteriaTambahan().getPerancah()
					+ limaR.getResik().getResikKriteriaTambahan()
							.getJalanKerjaDanTba()
					+ limaR.getResik().getResikKriteriaTambahan()
							.getJalurKabel()
					+ limaR.getResik().getResikKriteriaTambahan()
							.getJalurDewatering()
					+ limaR.getResik().getResikKriteriaTambahan()
							.getAreaPengecoran()
					+ limaR.getResik().getResikKriteriaTambahan()
							.getSafetyLineDanToloTolo();

			rawat = limaR.getRawat().getRawatKantorDanSekitarnya()
					.getPelaksanaan()
					+ limaR.getRawat().getRawatKantorDanSekitarnya()
							.getMusholla()
					+ limaR.getRawat().getRawatKantorDanSekitarnya()
							.getToilet()
					+ limaR.getRawat().getRawatKriteriaStandar()
							.getPagarProyek()
					+ limaR.getRawat().getRawatKriteriaStandar()
							.getRambuDanSpanduk()
					+ limaR.getRawat().getRawatKriteriaStandar().getGudang()
					+ limaR.getRawat().getRawatKriteriaStandar().getPosSatpam()
					+ limaR.getRawat().getRawatKriteriaStandar()
							.getBarakPekerja()
					+ limaR.getRawat().getRawatKriteriaTambahan().getWorkshop()
					+ limaR.getRawat().getRawatKriteriaTambahan()
							.getSisaMaterialDanSampah()
					+ limaR.getRawat().getRawatKriteriaTambahan()
							.getJalanUmum()
					+ limaR.getRawat().getRawatKriteriaTambahan().getPerancah()
					+ limaR.getRawat().getRawatKriteriaTambahan()
							.getJalanKerjaDanTba()
					+ limaR.getRawat().getRawatKriteriaTambahan()
							.getJalurKabel()
					+ limaR.getRawat().getRawatKriteriaTambahan()
							.getJalurDewatering()
					+ limaR.getRawat().getRawatKriteriaTambahan()
							.getAreaPengecoran()
					+ limaR.getRawat().getRawatKriteriaTambahan()
							.getSafetyLineDanToloTolo();

			rajin = limaR.getRajin().getRajinKantorDanSekitarnya()
					.getPelaksanaan()
					+ limaR.getRajin().getRajinKantorDanSekitarnya()
							.getMusholla()
					+ limaR.getRajin().getRajinKantorDanSekitarnya()
							.getToilet()
					+ limaR.getRajin().getRajinKriteriaStandar()
							.getPagarProyek()
					+ limaR.getRajin().getRajinKriteriaStandar()
							.getRambuDanSpanduk()
					+ limaR.getRajin().getRajinKriteriaStandar().getGudang()
					+ limaR.getRajin().getRajinKriteriaStandar().getPosSatpam()
					+ limaR.getRajin().getRajinKriteriaStandar()
							.getBarakPekerja()
					+ limaR.getRajin().getRajinKriteriaTambahan().getWorkshop()
					+ limaR.getRajin().getRajinKriteriaTambahan()
							.getSisaMaterialDanSampah()
					+ limaR.getRajin().getRajinKriteriaTambahan()
							.getJalanUmum()
					+ limaR.getRajin().getRajinKriteriaTambahan().getPerancah()
					+ limaR.getRajin().getRajinKriteriaTambahan()
							.getJalanKerjaDanTba()
					+ limaR.getRajin().getRajinKriteriaTambahan()
							.getJalurKabel()
					+ limaR.getRajin().getRajinKriteriaTambahan()
							.getJalurDewatering()
					+ limaR.getRajin().getRajinKriteriaTambahan()
							.getAreaPengecoran()
					+ limaR.getRajin().getRajinKriteriaTambahan()
							.getSafetyLineDanToloTolo();

			total = ringkas + rapi + resik + rawat + rajin;

		}

		System.out.println("Sub Total Ringkas : " + ringkas);
		System.out.println("Sub Total Rapi : " + rapi);
		System.out.println("Sub Total Resik : " + resik);
		System.out.println("Sub Total Rawat : " + rawat);
		System.out.println("Sub Total Rajin : " + rajin);
		System.out.println("Total 5R : " + total);

	}
}
