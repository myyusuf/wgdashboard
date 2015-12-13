package id.co.wikagedung.system.projectDashboard.test;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import id.co.wikagedung.system.projectDashboard.model.DaftarIndukAlat;
import id.co.wikagedung.system.projectDashboard.service.DaftarIndukAlatExcelFileMapperService;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.SystemOutLogger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/spring-ctx.xml" })
public class DaftarIndukAlatExcelFileMapperServiceTest {
	
	@Autowired
	private DaftarIndukAlatExcelFileMapperService daftarIndukAlatExcelFileMapperService;
	
	@Test
	public void daftarIndukAlatExcelFileMapping() throws InvalidFormatException, IOException{
		
		List<DaftarIndukAlat> result = daftarIndukAlatExcelFileMapperService.daftarIndukAlatExcelFileMapping();
		
		for(DaftarIndukAlat daftarIndukAlat : result){
			System.out.println("Id : " + UUID.randomUUID().toString());
			System.out.println("Nama Proyek : " + "Proyek 1");
			System.out.println("Periode : " + "Jan 2016");
			System.out.println("Keterangan : " + daftarIndukAlat.getKeterangan());
			System.out.println("No Inventaris : " + daftarIndukAlat.getNoInventaris());
			System.out.println("Nama Alat : " + daftarIndukAlat.getNamaAlat());
			System.out.println("Merk Alat : " + daftarIndukAlat.getMerkAlat());
			System.out.println("Model No Seri : " + daftarIndukAlat.getModelNoSeri());
			System.out.println("Spesifikasi : " + daftarIndukAlat.getSpesifikasi());
			System.out.println("Tahun Beli : " + daftarIndukAlat.getTahunBeli());
			System.out.println("Nama Agen : " + daftarIndukAlat.getNamaAgen());
			System.out.println("Alamat Agen : " + daftarIndukAlat.getAlamatAgen());
			System.out.println("No Instruksi Kerja : " + daftarIndukAlat.getNoInstruksiKerja());
			System.out.println("Lokasi ALat : " + daftarIndukAlat.getLokasiAlat());
			System.out.println("-----------------------");
			
			
		}
	}

}
