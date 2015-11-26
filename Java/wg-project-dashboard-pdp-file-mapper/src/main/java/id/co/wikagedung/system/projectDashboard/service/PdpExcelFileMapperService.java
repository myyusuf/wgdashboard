package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.Pdp;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface PdpExcelFileMapperService {

	List<Pdp> pdpExcelFileMapping() throws IOException, InvalidFormatException;

}
