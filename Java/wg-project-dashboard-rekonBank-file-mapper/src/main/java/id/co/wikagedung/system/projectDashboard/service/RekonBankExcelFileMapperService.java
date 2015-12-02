package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.RekonBank;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface RekonBankExcelFileMapperService {

	List<RekonBank> rekonBankExcelFileMapping() throws IOException,
			InvalidFormatException;

}
