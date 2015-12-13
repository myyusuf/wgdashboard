package id.co.wikagedung.system.projectDashboard.test;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import id.co.wikagedung.system.projectDashboard.model.Inkaso;
import id.co.wikagedung.system.projectDashboard.model.InkasoDetail;
import id.co.wikagedung.system.projectDashboard.model.InkasoResume;
import id.co.wikagedung.system.projectDashboard.service.InkasoExcelFileMapperService;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/spring-ctx.xml" })
public class InkasoExcelFileMapperServiceTest {

	@Autowired
	private InkasoExcelFileMapperService inkasoExcelFileMapperService;

	@Test
	public void InkasoExcelFileMapping() throws InvalidFormatException,
			IOException {
		Inkaso inkaso = inkasoExcelFileMapperService.inkasoExcelFileMapping();
		List<InkasoResume> inkasoResumes = inkaso.getInkasoResume();
		List<InkasoDetail> inkasoDetails = inkaso.getInkasoDetail();
		
		System.out.println("Id : " + UUID.randomUUID().toString());
		System.out.println("Nama Proyek : " + "Proyek 1");
		System.out.println("Periode : " + "Jan 2016");
		System.out.println("----Tabel Atas----");
		for(InkasoResume inkasoResume : inkasoResumes){
			System.out.println("Uraian : " + inkasoResume.getKeterangan() + " - " + inkasoResume.getUraian());
			System.out.println("netto : " + inkasoResume.getNetto());
			System.out.println("ppn : " + inkasoResume.getPpn());
			System.out.println("bruto : " + inkasoResume.getBruto());
			System.out.println("------------");
		}
		System.out.println("------------");
		System.out.println("------------");
		System.out.println("------------");
		System.out.println("----Tabel Bawah----");
		for(InkasoDetail inkasoDetail : inkasoDetails){
			System.out.println("Uraian : " + inkasoDetail.getKeterangan() + " - " + inkasoDetail.getUraian());
			System.out.println("Prestasi Bruto(%) : " + inkasoDetail.getPrestasiBrutoPersentase());
			System.out.println("Prestasi Bruto(Rp) : " +inkasoDetail.getPrestasiBrutoRupiah());
			System.out.println("Angsuran UM : " + inkasoDetail.getAngsuranUM());
			System.out.println("Retensi : " + inkasoDetail.getRetensi());
			System.out.println("Kuitansi Bruto : " + inkasoDetail.getKuitansiBruto());
			System.out.println("Kuitansi Netto : " + inkasoDetail.getKuitansiNetto());
			System.out.println("Kuitansi PPN : " + inkasoDetail.getKuitansiPpn());
			System.out.println("Potongan PPH Final : " + inkasoDetail.getPotonganPphFinal());
			System.out.println("Penerimaan Bersih : " + inkasoDetail.getPenerimaanBersih());
			System.out.println("Pembayaran : " + inkasoDetail.getPembayaran());
			System.out.println("Tagihan Belum Cair : " + inkasoDetail.getTagihanBelumCair());
			System.out.println("Tanggal Masuk : " + inkasoDetail.getMonitorWaktuTanggalMasuk());
			System.out.println("Tanggal Jatuh Tempo : " + inkasoDetail.getMonitorWaktuTanggalJatuhTempo());
			System.out.println("Tanggal Cair : " + inkasoDetail.getMonitorWaktuTanggalCair());
			System.out.println("Jangka Waktu : " + inkasoDetail.getJangkaWaktu());
			System.out.println("------------");
			
		}
		System.out.println("");
	}

}
