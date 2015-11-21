package id.co.wikagedung.system.projectDashboard.service;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import id.co.wikagedung.system.projectDashboard.model.sheLevel.SheLevel;

public interface SheLevelExcelFileMapperService {

	List<SheLevel> sheLevelExcelFileMapping() throws IOException,
			InvalidFormatException;

}
