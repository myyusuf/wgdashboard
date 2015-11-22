package id.co.wikagedung.system.projectDashboard.test;

import id.co.wikagedung.system.projectDashboard.model.qPass.QPass;
import id.co.wikagedung.system.projectDashboard.service.QPassExcelFileMapperService;

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
public class QPassExcelFileMapperServiceTest {

	@Autowired
	private QPassExcelFileMapperService qPassExcelFileMapperService;

	@Test
	public void qPassExcelFileMapping() throws IOException,
			InvalidFormatException {

		List<QPass> result = qPassExcelFileMapperService
				.qPassExcelFileMapping();

		for (QPass qPass : result) {

			System.out.println("Q-Pass : " + qPass.toString());

		}

	}

}
