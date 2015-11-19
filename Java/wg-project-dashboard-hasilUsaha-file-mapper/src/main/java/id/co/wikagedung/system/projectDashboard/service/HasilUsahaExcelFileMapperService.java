package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.HasilUsaha;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface HasilUsahaExcelFileMapperService {

	List<HasilUsaha> hasilUsahaExcelFileMapping() throws IOException,
			InvalidFormatException;

}
