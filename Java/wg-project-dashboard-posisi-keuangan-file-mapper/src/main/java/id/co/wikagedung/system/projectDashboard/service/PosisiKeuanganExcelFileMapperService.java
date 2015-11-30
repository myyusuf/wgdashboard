package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.PosisiKeuangan;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface PosisiKeuanganExcelFileMapperService {

	List<PosisiKeuangan> posisiKeuanganExcelFileMapping() throws IOException,
			InvalidFormatException;

}
