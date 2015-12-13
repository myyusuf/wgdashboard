package id.co.wikagedung.system.projectDashboard.test;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import id.co.wikagedung.system.projectDashboard.model.LabaRugi;
import id.co.wikagedung.system.projectDashboard.service.LabaRugiExcelFileMapperService;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/spring-ctx.xml" })
public class LabaRugiExcelFileMapperServiceTest {

	@Autowired
	private LabaRugiExcelFileMapperService labaRugiExcelFileMapperService;
	
	@Test
	public void labaRugiExcelFileMapping() throws InvalidFormatException, IOException{
		List<LabaRugi> result = labaRugiExcelFileMapperService.labaRugiExcelFileMapping();
		
		for(LabaRugi labaRugi:result){
			//System.out.println("LabaRugi: " + labaRugi.toString());
			System.out.println("Id : " + UUID.randomUUID().toString());
			System.out.println("Nama Proyek : " + "Proyek 1");
			System.out.println("Periode : " + "Jan 2016");
			System.out.println("Uraian : " + labaRugi.getKodeUraian());
			System.out.println("RKP : " + labaRugi.getRkp());
			System.out.println("S/D Tahun Lalu: " +labaRugi.getSampaiTahunLalu());
			System.out.println("Tahun ini - Bulan Lalu : " + labaRugi.getBulanLalu());
			System.out.println("Tahun ini - Bulan Ini : " + labaRugi.getBulanIni());
			System.out.println("Tahun ini - S/D Bulan ini : " + labaRugi.getSampaiBulanIni());
			System.out.println("S/D Tahun ini : " + labaRugi.getSampaiTahunIni());
			System.out.println("---------------------------------------");
		}
	}
}
