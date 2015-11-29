package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.VO;
import id.co.wikagedung.system.projectDashboard.model.VOResume;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface VOExcelFileMapperService {
	
	VOResume voResumeExcelFileMapping() throws InvalidFormatException, IOException;

}
