package id.co.wikagedung.system.projectDashboard.test;

import java.io.IOException;

import id.co.wikagedung.system.projectDashboard.model.Inkaso;
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

		System.out.println(inkaso);
	}

}
