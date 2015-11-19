package id.co.wikagedung.system.projectDashboard.test;

import id.co.wikagedung.system.projectDashboard.model.HasilUsaha;
import id.co.wikagedung.system.projectDashboard.service.HasilUsahaExcelFileMapperService;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/spring-ctx.xml" })
public class HasilUsahaExcelFileMapperServiceTest {

	@Autowired
	private HasilUsahaExcelFileMapperService hasilUsahaExcelFileMapperService;

	@SuppressWarnings("resource")
	// @Test
	public void readExcelFileByColumn() throws InvalidFormatException,
			IOException {

		File file = new File("D:/Book1.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		for (int row = 2; row < sheet.getLastRowNum(); row++) {

			XSSFRow rows = sheet.getRow(row);

			for (int column = 0; column < rows.getLastCellNum(); column++) {

				XSSFCell cell = rows.getCell(column);

				if (cell != null) {

					if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {

						if (row == 3) {

							System.out.println("-- Uang Muka 1 --");

							if (column != 0) {

								System.out.println("Bulan 1 : "
										+ cell.getNumericCellValue());

							}

						}

						if (row == 4) {

							System.out.println("-- Uang Muka 2 --");

							if (column != 0) {

								System.out.println("Bulan 1 : "
										+ cell.getNumericCellValue());

							}

						}

						if (row == 5) {

							System.out.println("-- Uang Muka 3 --");

							if (column != 0) {

								System.out.println("Bulan 1 : "
										+ cell.getNumericCellValue());

							}

						}

					}

				}

			}

		}

	}

	@Test
	public void hasilUsahaExcelFileMapping() throws InvalidFormatException,
			IOException {

		List<HasilUsaha> hasilUsahaList = hasilUsahaExcelFileMapperService
				.hasilUsahaExcelFileMapping();

		for (HasilUsaha hasilUsaha : hasilUsahaList) {

			System.out.println("Hasil Usaha : " + hasilUsaha.toString());

		}

	}
}
