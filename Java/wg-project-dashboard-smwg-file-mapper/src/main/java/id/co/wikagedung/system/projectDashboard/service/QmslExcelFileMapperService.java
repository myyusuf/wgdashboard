package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.qmsl.Qmsl;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface QmslExcelFileMapperService {
	
	List<Qmsl> qmslExcelFileMapping() throws IOException,
	InvalidFormatException;

}
