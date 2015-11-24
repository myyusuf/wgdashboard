package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.ProjectScoreCard;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface ProjectScoreCardExcelFileMapperService {

	List<ProjectScoreCard> projectScoreCardExcelFileMapping()
			throws IOException, InvalidFormatException;

}
