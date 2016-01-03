package id.co.wikagedung.system.projectDashboard.test;

import id.co.wikagedung.system.projectDashboard.model.InformasiManajemen;
import id.co.wikagedung.system.projectDashboard.service.InformasiManajemenExcelFileMapperService;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/spring-ctx.xml" })
public class InformasiManajemenExcelFileMapperServiceTest {

	@Autowired
	private InformasiManajemenExcelFileMapperService informasiManajemenExcelFileMapperService;

	// @Test
	public void renameFile() {

		File repository = new File("D:/Project Dashboard/");
		File[] list = repository.listFiles();
		ArrayList<String> filenames = new ArrayList<String>();

		for (int i = 0; i < list.length; i++) {
			filenames.add(list[i].getAbsolutePath());
		}

		for (int i = 0; i < filenames.size(); i++) {

			String pathName = filenames.get(i);

			System.out.println("Path Name : " + pathName);

			File file = new File(pathName);

			if (file.getAbsolutePath().contains("READ")) {

				System.out.println(file.getAbsolutePath());

			} else {

				File renameFile = new File("D:/Project Dashboard/(READ) "
						+ file.getName());

				file.renameTo(renameFile);

			}

		}

	}

	// @Test
	public void informasiManajemenExcelFileMapping() throws IOException,
			InvalidFormatException {

		List<InformasiManajemen> result = informasiManajemenExcelFileMapperService
				.informasiManajemenExcelFileMapping();

		for (InformasiManajemen informasiManajemen : result) {

			System.out.println("Informasi Manajemen : "
					+ informasiManajemen.toString());

		}

	}

	@Test
	public void getSurplusDevisitData() throws IOException,
			InvalidFormatException {

		List<InformasiManajemen> result = informasiManajemenExcelFileMapperService
				.informasiManajemenExcelFileMapping();

		Double rencanaSampaiBulanIni = 0.0;
		Double realisasiSampaiBulanLalu = 0.0;
		Double realisasiBulanIni = 0.0;
		Double realisasiSampaiBulanIni = 0.0;

		for (InformasiManajemen informasiManajemen : result) {

			rencanaSampaiBulanIni = informasiManajemen.getSurplusDefisit()
					.getRencanaSampaiBulanIni();
			realisasiSampaiBulanLalu = informasiManajemen.getSurplusDefisit()
					.getRealisasiSampaiBulanLalu();
			realisasiBulanIni = informasiManajemen.getSurplusDefisit()
					.getRealisasiBulanIni();
			realisasiSampaiBulanIni = informasiManajemen.getSurplusDefisit()
					.getRealisasiSampaiBulanIni();

		}

		System.out.println("Rencana Sampai Bulan Ini : "
				+ rencanaSampaiBulanIni);
		System.out.println("Realisasi Sampai Bulan Lalu : "
				+ realisasiSampaiBulanLalu);
		System.out.println("Realisasi Bulan Ini : " + realisasiBulanIni);
		System.out.println("Realisasi Sampai Bulan Ini : "
				+ realisasiSampaiBulanIni);

	}

}
