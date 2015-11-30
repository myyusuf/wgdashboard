package id.co.wikagedung.system.projectDashboard.test;

import id.co.wikagedung.system.projectDashboard.model.PosisiKeuangan;
import id.co.wikagedung.system.projectDashboard.service.PosisiKeuanganExcelFileMapperService;

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
public class PosisiKeuanganExcelFileMapperServiceTest {

	@Autowired
	private PosisiKeuanganExcelFileMapperService hasilUsahaExcelFileMapperService;

	@Test
	public void hasilUsahaExcelFileMapping() throws InvalidFormatException,
			IOException {

		List<PosisiKeuangan> posisiKeuanganList = hasilUsahaExcelFileMapperService
				.posisiKeuanganExcelFileMapping();

		for (PosisiKeuangan posisiKeuangan : posisiKeuanganList) {

			System.out
					.println("Posisi Keuangan : " + posisiKeuangan.toString());

		}

	}
}
