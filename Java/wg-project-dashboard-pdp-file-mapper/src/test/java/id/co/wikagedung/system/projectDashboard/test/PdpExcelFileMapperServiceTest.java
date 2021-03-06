package id.co.wikagedung.system.projectDashboard.test;

import id.co.wikagedung.system.projectDashboard.model.Pdp;
import id.co.wikagedung.system.projectDashboard.service.PdpExcelFileMapperService;

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
public class PdpExcelFileMapperServiceTest {

	@Autowired
	private PdpExcelFileMapperService pdpExcelFileMapperService;

	@Test
	public void pdpExcelFileMapping() throws IOException,
			InvalidFormatException {

		List<Pdp> result = pdpExcelFileMapperService.pdpExcelFileMapping();

		for (Pdp pdp : result) {

			System.out.println("PDP : " + pdp.toString());

		}

	}

}
