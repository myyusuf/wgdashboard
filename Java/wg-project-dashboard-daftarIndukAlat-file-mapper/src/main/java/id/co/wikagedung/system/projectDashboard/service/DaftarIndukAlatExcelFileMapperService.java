package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.DaftarIndukAlat;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface DaftarIndukAlatExcelFileMapperService {
	
	List<DaftarIndukAlat> daftarIndukAlatExcelFileMapping() throws InvalidFormatException, IOException;

}
