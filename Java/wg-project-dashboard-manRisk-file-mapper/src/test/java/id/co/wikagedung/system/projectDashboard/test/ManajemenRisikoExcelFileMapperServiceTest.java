package id.co.wikagedung.system.projectDashboard.test;

import id.co.wikagedung.system.projectDashboard.model.ManajemenRisiko;
import id.co.wikagedung.system.projectDashboard.service.ManajemenRisikoExcelFileMapperService;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/spring-ctx.xml" })
public class ManajemenRisikoExcelFileMapperServiceTest {

	@Autowired
	private ManajemenRisikoExcelFileMapperService manajemenRisikoExcelFileMapperService;

	// @Test
	public void informasiManajemenExcelFileMapping() throws IOException,
			InvalidFormatException {

		List<ManajemenRisiko> result = manajemenRisikoExcelFileMapperService
				.manajemenRisikoExcelFileMapping();

		for (ManajemenRisiko manajemenRisiko : result) {

			System.out.println("Manajemen Risiko : "
					+ manajemenRisiko.toString());

		}

	}

	// @Test
	public void getDataResikoEkstrimYangMasihOpen()
			throws InvalidFormatException, IOException {

		List<ManajemenRisiko> result = manajemenRisikoExcelFileMapperService
				.manajemenRisikoExcelFileMapping();

		int nomor = 0;

		for (ManajemenRisiko manajemenRisiko : result) {

			if (manajemenRisiko.getStlTingkatRisiko().equals("Ekstrim")) {

				System.out.println(nomor + "." + " Nama Risiko : "
						+ manajemenRisiko.getRisiko() + " , Nilai Risiko : "
						+ manajemenRisiko.getStlNilaiRisiko()
						+ " , Status Risiko : "
						+ manajemenRisiko.getHtlStatus());

				nomor++;

			}

		}

	}

	// @Test
	public void getDataJumlahRisikoEsktrimPerProyek()
			throws InvalidFormatException, IOException {

		List<ManajemenRisiko> result = manajemenRisikoExcelFileMapperService
				.manajemenRisikoExcelFileMapping();

		int jumlahRisikoProyekSatu = 0;
		int jumlahRisikoProyekDua = 0;

		for (ManajemenRisiko manajemenRisiko : result) {

			if (manajemenRisiko.getHtlStatus().equals("Open")) {

				manajemenRisiko.setId(UUID.randomUUID().toString());
				manajemenRisiko.setNamaProyek("Proyek 1");
				manajemenRisiko.setPeriode("Desember-2015");

			} else {

				manajemenRisiko.setId(UUID.randomUUID().toString());
				manajemenRisiko.setNamaProyek("Proyek 2");
				manajemenRisiko.setPeriode("Desember-2015");

			}

		}

		for (ManajemenRisiko manajemenRisiko : result) {

			if ((manajemenRisiko.getNamaProyek().equals("Proyek 1"))
					&& (manajemenRisiko.getStlTingkatRisiko().equals("Ekstrim"))) {

				jumlahRisikoProyekSatu++;

			} else if ((manajemenRisiko.getNamaProyek().equals("Proyek 2"))
					&& (manajemenRisiko.getStlTingkatRisiko().equals("Ekstrim"))) {

				jumlahRisikoProyekDua++;

			}

		}

		System.out.println("Jumlah Risiko Ekstrim Proyek 1 : "
				+ jumlahRisikoProyekSatu);
		System.out.println("Jumlah Risiko Ekstrim Proyek 2 : "
				+ jumlahRisikoProyekDua);

	}

	@Test
	public void getDataJumlahProyekDenganRisikoEkstrim()
			throws InvalidFormatException, IOException {

		List<ManajemenRisiko> result = manajemenRisikoExcelFileMapperService
				.manajemenRisikoExcelFileMapping();

		int jumlahRisikoNovember = 0;
		int jumlahRisikoDesember = 0;

		for (ManajemenRisiko manajemenRisiko : result) {

			if (manajemenRisiko.getHtlStatus().equals("Open")) {

				manajemenRisiko.setId(UUID.randomUUID().toString());
				manajemenRisiko.setNamaProyek("Proyek 1");
				manajemenRisiko.setPeriode("Desember-2015");

			} else {

				manajemenRisiko.setId(UUID.randomUUID().toString());
				manajemenRisiko.setNamaProyek("Proyek 2");
				manajemenRisiko.setPeriode("November-2015");

			}

		}

		for (ManajemenRisiko manajemenRisiko : result) {

			if ((manajemenRisiko.getPeriode().equals("November-2015"))
					&& (manajemenRisiko.getStlTingkatRisiko().equals("Ekstrim"))) {

				jumlahRisikoNovember++;

			} else if ((manajemenRisiko.getPeriode().equals("Desember-2015"))
					&& (manajemenRisiko.getStlTingkatRisiko().equals("Ekstrim"))) {

				jumlahRisikoDesember++;

			}

		}

		System.out
				.println("Jumlah Proyek Dengan Risiko Ekstrim Bulan November : "
						+ jumlahRisikoNovember);
		System.out
				.println("Jumlah Proyek Dengan Risiko Ekstrim Bulan Desember : "
						+ jumlahRisikoDesember);

	}

}
