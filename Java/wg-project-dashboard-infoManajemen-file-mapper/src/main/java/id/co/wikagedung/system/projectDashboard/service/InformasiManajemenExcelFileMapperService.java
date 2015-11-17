package id.co.wikagedung.system.projectDashboard.service;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import id.co.wikagedung.system.projectDashboard.model.InformasiManajemen;

public interface InformasiManajemenExcelFileMapperService {

	List<InformasiManajemen> informasiManajemenExcelFileMapping()
			throws IOException, InvalidFormatException;

}
