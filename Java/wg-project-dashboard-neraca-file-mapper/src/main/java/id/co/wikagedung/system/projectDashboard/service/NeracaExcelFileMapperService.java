package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.Neraca;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface NeracaExcelFileMapperService {
	
	List<Neraca> neracaExcelFileMapping() throws InvalidFormatException, IOException;

}
