package id.co.wikagedung.system.projectDashboard.test;

import java.io.IOException;
import java.util.List;

import id.co.wikagedung.system.projectDashboard.model.VO;
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
		
		List<VO> result = voExcelFileMapperService.voExcelFileMapping();
		
		for(VO vo: result){
			System.out.println("VO: " + vo.toString());
		}
	}

}
