package id.co.wikagedung.system.projectDashboard.service;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import jxl.read.biff.BiffException;
import id.co.wikagedung.system.projectDashboard.model.InformasiManajemen;

public interface InformasiManajemenExcelFileMapperService {

	List<InformasiManajemen> informasiManajemenExcelFileMapping()
			throws BiffException, IOException, InvalidFormatException;

}
