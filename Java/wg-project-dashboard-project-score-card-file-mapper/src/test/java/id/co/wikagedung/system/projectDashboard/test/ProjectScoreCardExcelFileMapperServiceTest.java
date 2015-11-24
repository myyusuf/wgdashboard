package id.co.wikagedung.system.projectDashboard.test;

import id.co.wikagedung.system.projectDashboard.model.ProjectScoreCard;
import id.co.wikagedung.system.projectDashboard.service.ProjectScoreCardExcelFileMapperService;

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
public class ProjectScoreCardExcelFileMapperServiceTest {

	@Autowired
	private ProjectScoreCardExcelFileMapperService projectScoreCardExcelFileMapperService;

	@Test
	public void projectScoreCardExcelFileMapping() throws IOException,
			InvalidFormatException {

		List<ProjectScoreCard> result = projectScoreCardExcelFileMapperService
				.projectScoreCardExcelFileMapping();

		for (ProjectScoreCard projectScoreCard : result) {

			System.out.println("Project Score Card : "
					+ projectScoreCard.toString());

		}

	}

}
