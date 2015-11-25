package id.co.wikagedung.system.projectDashboard.test;

import id.co.wikagedung.system.projectDashboard.model.PosisiPegawai;
import id.co.wikagedung.system.projectDashboard.service.PosisiPegawaiExcelFileMapperService;

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
public class PosisiPegawaiExcelFileMapperServiceTest {

	@Autowired
	private PosisiPegawaiExcelFileMapperService posisiPegawaiExcelFileMapperService;

	@Test
	public void posisiPegawaiFileMapping() throws IOException,
			InvalidFormatException {

		List<PosisiPegawai> result = posisiPegawaiExcelFileMapperService
				.posisiPegawaiExcelFileMapping();

		for (PosisiPegawai posisiPegawai : result) {

			System.out.println("Posisi Pegawai : " + posisiPegawai.toString());

		}

	}

}
