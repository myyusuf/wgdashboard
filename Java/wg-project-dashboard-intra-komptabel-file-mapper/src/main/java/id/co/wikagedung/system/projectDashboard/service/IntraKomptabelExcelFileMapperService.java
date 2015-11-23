package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.IntraKomptabel;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface IntraKomptabelExcelFileMapperService {

	List<IntraKomptabel> intraKomptabelExcelFileMapping() throws IOException,
			InvalidFormatException;

}
