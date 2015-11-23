package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.EkstraKomptabel;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface EkstraKomptabelExcelFileMapperService {

	List<EkstraKomptabel> ekstraKomptabelExcelFileMapping() throws IOException,
			InvalidFormatException;

}
