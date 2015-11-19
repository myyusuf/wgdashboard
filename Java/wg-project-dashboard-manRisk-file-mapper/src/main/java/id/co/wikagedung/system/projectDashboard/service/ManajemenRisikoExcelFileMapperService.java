package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.ManajemenRisiko;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface ManajemenRisikoExcelFileMapperService {

	List<ManajemenRisiko> manajemenRisikoExcelFileMapping() throws IOException,
			InvalidFormatException;

}
