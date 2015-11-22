package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.VO;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface VOExcelFileMapperService {

	List<VO> voExcelFileMapping() throws InvalidFormatException, IOException;

}
