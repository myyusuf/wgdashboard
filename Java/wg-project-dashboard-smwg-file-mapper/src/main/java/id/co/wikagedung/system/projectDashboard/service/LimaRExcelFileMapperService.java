package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.limaR.LimaR;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface LimaRExcelFileMapperService {

	List<LimaR> limaRExcelFileMapping() throws IOException,
			InvalidFormatException;

}
