package id.co.wikagedung.system.projectDashboard.service;

import id.co.wikagedung.system.projectDashboard.model.MonitoringPenjualan;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface MonitoringPenjualanFileMapperService {

	List<MonitoringPenjualan> monitoringPenjualanExcelFileMapping() throws InvalidFormatException, IOException;

}
