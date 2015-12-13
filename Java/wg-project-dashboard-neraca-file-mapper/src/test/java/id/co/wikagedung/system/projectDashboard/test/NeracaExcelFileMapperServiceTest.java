package id.co.wikagedung.system.projectDashboard.test;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import id.co.wikagedung.system.projectDashboard.model.Neraca;
import id.co.wikagedung.system.projectDashboard.service.NeracaExcelFileMapperService;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/spring-ctx.xml" })
public class NeracaExcelFileMapperServiceTest {

	@Autowired
	private NeracaExcelFileMapperService neracaExcelFileMapperService;
	
	@Test
	public void neracaExcelFileMapping() throws InvalidFormatException, IOException{
		List<Neraca> result = neracaExcelFileMapperService.neracaExcelFileMapping();
		Double piutangUsaha = new Double(0);
		Double piutangRetensi = new Double(0);
		Double tagihanBruto = new Double(0);
		Double pdp = new Double(0);
		Double bdd = new Double(0);
		Double persediaanPerProyek = new Double(0);
		for(Neraca neraca : result){
			System.out.println("Id : " + UUID.randomUUID().toString());
			System.out.println("Nama Proyek : " + "Proyek 1");
			System.out.println("Periode : " + "Jan 2016");
			System.out.println("Kode : " + neraca.getKode());
			System.out.println("Jumlah : " + neraca.getJumlah());
			System.out.println("---------------------------");
			if(neraca.getKode().equals("11211")){
				piutangUsaha += neraca.getJumlah();
			}
			if(neraca.getKode().equals("11212")){
				piutangRetensi += neraca.getJumlah();
			}
			if(neraca.getKode().equals("11261")){
				tagihanBruto += neraca.getJumlah();
			}
			if(neraca.getKode().equals("11711") || neraca.getKode().equals("11712") || 
					neraca.getKode().equals("11713") || neraca.getKode().equals("11714")){
				pdp += neraca.getJumlah();
			}
			if(neraca.getKode().equals("11591") || neraca.getKode().equals("11551")){
				bdd += neraca.getJumlah();
			}
			if(neraca.getKode().equals("11411")){
				persediaanPerProyek += neraca.getJumlah();
			}
				
		}
		
		System.out.println("-------Informasi Management------");
		System.out.println("Piutang Usaha : " + piutangUsaha);
		System.out.println("Piutang Retensi : " + piutangRetensi);
		System.out.println("Tagihan Bruto : " + tagihanBruto);
		System.out.println("PDP : " + pdp);
		System.out.println("BDD : " + bdd);
		System.out.println("Persediaan Per Proyek : " + persediaanPerProyek);
	}
}
