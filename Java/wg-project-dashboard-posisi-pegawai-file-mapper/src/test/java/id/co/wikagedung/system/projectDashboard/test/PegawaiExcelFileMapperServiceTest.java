package id.co.wikagedung.system.projectDashboard.test;

import java.io.IOException;
import java.util.List;

import id.co.wikagedung.system.projectDashboard.model.Pegawai;
import id.co.wikagedung.system.projectDashboard.service.PegawaiExcelFileMapperService;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/spring-ctx.xml" })
public class PegawaiExcelFileMapperServiceTest {

	@Autowired
	private PegawaiExcelFileMapperService pegawaiExcelFileMapperService;

	@Test
	public void pegawaioExcelFileMapping() throws InvalidFormatException,
			IOException {
		List<Pegawai> result = pegawaiExcelFileMapperService
				.pegawaiExcelFileMapping();

		for (Pegawai pegawai : result) {
			System.out.println("Pegawai: " + pegawai.toString());
		}
	}
}
