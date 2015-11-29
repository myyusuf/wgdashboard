package id.co.wikagedung.system.projectDashboard.test;

import java.io.IOException;
import java.util.List;

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
		
		for(Neraca neraca : result){
			System.out.println("Neraca: " + neraca.toString());
		}
	}
}
