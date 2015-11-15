package id.co.wikagedung.system.projectDashboard.service;

import java.io.IOException;

import jxl.read.biff.BiffException;
import id.co.wikagedung.system.projectDashboard.model.InformasiManajemen;

public interface InformasiManajemenExcelFileMapperService {

	InformasiManajemen informasiManajemenExcelFileMapping()
			throws BiffException, IOException;

}
