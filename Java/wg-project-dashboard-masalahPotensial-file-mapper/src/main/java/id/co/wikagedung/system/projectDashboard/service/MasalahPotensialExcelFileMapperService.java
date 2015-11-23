package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.MasalahPotensial;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface MasalahPotensialExcelFileMapperService {

	List<MasalahPotensial> masalahPotensialExcelFileMapping()
			throws IOException, InvalidFormatException;

}
