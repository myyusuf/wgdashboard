package id.co.wikagedung.system.projectDashboard.test;

import id.co.wikagedung.system.projectDashboard.model.IntraKomptabel;
import id.co.wikagedung.system.projectDashboard.service.IntraKomptabelExcelFileMapperService;

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
public class IntraKomptabelExcelFileMapperServiceTest {

	@Autowired
	private IntraKomptabelExcelFileMapperService intraKomptabelExcelFileMapperService;

	@Test
	public void informasiManajemenExcelFileMapping() throws IOException,
			InvalidFormatException {

		List<IntraKomptabel> result = intraKomptabelExcelFileMapperService
				.intraKomptabelExcelFileMapping();

		for (IntraKomptabel intraKomptabel : result) {

			System.out
					.println("Intra Komptabel : " + intraKomptabel.toString());

		}

	}

}
