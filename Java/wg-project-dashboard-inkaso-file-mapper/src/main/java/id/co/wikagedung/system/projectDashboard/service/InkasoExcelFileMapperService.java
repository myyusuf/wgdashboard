package id.co.wikagedung.system.projectDashboard.service;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import id.co.wikagedung.system.projectDashboard.model.Inkaso;

public interface InkasoExcelFileMapperService {
	
	Inkaso inkasoExcelFileMapping() throws InvalidFormatException, IOException;

}
