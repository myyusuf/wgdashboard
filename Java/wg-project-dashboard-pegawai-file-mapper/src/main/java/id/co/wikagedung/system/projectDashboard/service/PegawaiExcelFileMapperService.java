package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.Pegawai;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface PegawaiExcelFileMapperService {
	
	List<Pegawai> pegawaiExcelFileMapping() throws InvalidFormatException, IOException;

}
