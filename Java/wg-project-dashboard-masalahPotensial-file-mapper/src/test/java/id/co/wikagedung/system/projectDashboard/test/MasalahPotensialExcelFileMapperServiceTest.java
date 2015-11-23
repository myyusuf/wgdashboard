package id.co.wikagedung.system.projectDashboard.test;

import id.co.wikagedung.system.projectDashboard.model.MasalahPotensial;
import id.co.wikagedung.system.projectDashboard.service.MasalahPotensialExcelFileMapperService;

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
public class MasalahPotensialExcelFileMapperServiceTest {

	@Autowired
	private MasalahPotensialExcelFileMapperService masalahPotensialExcelFileMapperService;

	@Test
	public void informasiManajemenExcelFileMapping() throws IOException,
			InvalidFormatException {

		List<MasalahPotensial> result = masalahPotensialExcelFileMapperService
				.masalahPotensialExcelFileMapping();

		for (MasalahPotensial masalahPotensial : result) {

			System.out.println("Masalah Potensial : "
					+ masalahPotensial.toString());

		}

	}

}
