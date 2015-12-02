package id.co.wikagedung.system.projectDashboard.test;

import id.co.wikagedung.system.projectDashboard.model.RekonBank;
import id.co.wikagedung.system.projectDashboard.service.RekonBankExcelFileMapperService;

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
public class RekonBankExcelFileMapperServiceTest {

	@Autowired
	private RekonBankExcelFileMapperService rekonBankExcelFileMapperService;

	@Test
	public void projectScoreCardExcelFileMapping() throws IOException,
			InvalidFormatException {

		List<RekonBank> result = rekonBankExcelFileMapperService
				.rekonBankExcelFileMapping();

		for (RekonBank rekonBank : result) {

			System.out.println("Menurut Bank : "
					+ rekonBank.getMenurutBank().toString());
			System.out.println("Menurut Register Bank WG : "
					+ rekonBank.getMenurutRegisterBankWg().toString());

		}

	}

}
