package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.LabaRugi;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface LabaRugiExcelFileMapperService {

	List<LabaRugi> labaRugiExcelFileMapping() throws IOException, InvalidFormatException;

}
