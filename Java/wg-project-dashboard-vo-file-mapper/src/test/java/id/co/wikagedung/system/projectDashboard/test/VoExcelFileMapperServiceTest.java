package id.co.wikagedung.system.projectDashboard.test;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import id.co.wikagedung.system.projectDashboard.model.VO;
import id.co.wikagedung.system.projectDashboard.model.VOResume;
import id.co.wikagedung.system.projectDashboard.service.VOExcelFileMapperService;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/spring-ctx.xml" })
public class VoExcelFileMapperServiceTest {
	
	@Autowired
	private VOExcelFileMapperService voExcelFileMapperService;
	
	@Test
	public void voExcelFileMapping() throws InvalidFormatException, IOException{
		
		VOResume result = voExcelFileMapperService.voResumeExcelFileMapping();
		List<VO> vos = result.getVo();
		System.out.println("Id : " + UUID.randomUUID().toString());
		System.out.println("Nama Proyek : " + "Proyek 1");
		System.out.println("Periode : " + "Jan 2016");
		System.out.println("OK AWAL : " + result.getOkAwal());
		System.out.println("VO YANG TELAH DISETUJUI / SERTIFIKAT : " + result.getVoDisetujui());
		System.out.println("OK S/D SAAT INI : " + result.getOkSaatIni());
		
		System.out.println("---- Isi Tabel ----");
		for(VO vo : vos){
			System.out.println("Item Pekerjaan : " + vo.getItemPengerjaan());
			System.out.println("No Surat Pengajuan : " + vo.getNoSuratPengajuan());
			System.out.println("Tanggal Pengajuan : " + vo.getTanggalPengajuan());
			System.out.println("Permohonan Yang Diajukan (Biaya) : " + vo.getPermohonanYangDiajukanBiaya());
			System.out.println("Permohonan Yang Diajukan (Waktu) : " + vo.getPermohonanYangDiajukanWaktu());
			System.out.println("Besarnya Claim Atas VO (Diajukan) : " + vo.getBesarnyaClaimAtasVODiajukan());
			System.out.println("Besarnya Claim Atas VO (Negosiasi) : " + vo.getBesarnyaClaimAtasVONegosiasi());
			System.out.println("Besarnya Claim Atas VO (Disetujui) : " + vo.getBesarnyaClaimAtasVODisetujui());
			System.out.println("Besarnya Claim Atas VO (Diprogress) : " + vo.getBesarnyaClaimAtasVODiprogress());
			System.out.println("Besarnya Claim Atas VO (Dibayar) : " + vo.getBesarnyaClaimAtasVODibayar());
			System.out.println("Pelaksanaan (Sudah) : " + vo.getPelaksanaanSudah());
			System.out.println("Pelaksanaan (Belum) : " + vo.getPelaksanaanBelum());
			System.out.println("Keterangan : " + vo.getKeterangan());
			System.out.println("-----------------------------");
		}
		//System.out.println("VO Resume: " + result.toString());
	}

}
