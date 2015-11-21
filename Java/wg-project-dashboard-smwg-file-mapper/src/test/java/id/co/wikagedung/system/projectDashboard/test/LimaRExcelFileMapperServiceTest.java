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

	@Test
	public void limaRExcelFileMapping() throws IOException,
			InvalidFormatException {

		List<LimaR> result = limaRExcelFileMapperService
				.limaRExcelFileMapping();

		for (LimaR limaR : result) {

			System.out.println("5R : " + limaR.toString());

		}

	}

}
