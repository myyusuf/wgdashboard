package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.Efisiensi;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface EfisiensiExcelFileMapperService {

	List<Efisiensi> efisiensiExcelFileMapping() throws IOException,
			InvalidFormatException;

}
