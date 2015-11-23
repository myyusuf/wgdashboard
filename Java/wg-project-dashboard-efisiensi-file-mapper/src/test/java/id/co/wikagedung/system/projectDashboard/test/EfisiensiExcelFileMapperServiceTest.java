package id.co.wikagedung.system.projectDashboard.test;

import id.co.wikagedung.system.projectDashboard.model.Efisiensi;
import id.co.wikagedung.system.projectDashboard.service.EfisiensiExcelFileMapperService;

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
public class EfisiensiExcelFileMapperServiceTest {

	@Autowired
	private EfisiensiExcelFileMapperService efisiensiExcelFileMapperService;

	@Test
	public void informasiManajemenExcelFileMapping() throws IOException,
			InvalidFormatException {

		List<Efisiensi> result = efisiensiExcelFileMapperService
				.efisiensiExcelFileMapping();

		for (Efisiensi efisiensi : result) {

			System.out.println("Efisiensi : " + efisiensi.toString());

		}

	}

}
