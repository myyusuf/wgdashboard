package id.co.wikagedung.system.projectDashboard.test;

import java.io.IOException;
import java.util.List;

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
			System.out.println("LabaRugi: " + labaRugi.toString());
		}
	}
}