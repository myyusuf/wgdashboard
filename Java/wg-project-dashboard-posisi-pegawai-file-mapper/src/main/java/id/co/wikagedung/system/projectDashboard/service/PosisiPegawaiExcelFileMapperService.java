package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.PosisiPegawai;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface PosisiPegawaiExcelFileMapperService {

	List<PosisiPegawai> posisiPegawaiExcelFileMapping() throws IOException,
			InvalidFormatException;

}
