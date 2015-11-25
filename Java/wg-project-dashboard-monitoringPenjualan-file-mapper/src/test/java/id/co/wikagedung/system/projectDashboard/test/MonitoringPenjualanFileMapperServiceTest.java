package id.co.wikagedung.system.projectDashboard.test;

import java.io.IOException;
import java.util.List;

import id.co.wikagedung.system.projectDashboard.model.MonitoringPenjualan;
import id.co.wikagedung.system.projectDashboard.service.MonitoringPenjualanFileMapperService;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/spring-ctx.xml" })
public class MonitoringPenjualanFileMapperServiceTest {
	
	@Autowired
	private MonitoringPenjualanFileMapperService monitoringPenjualanFileMapperService;
	
	@Test
	public void monitoringPenjualanExcelFileMapping() throws InvalidFormatException, IOException{
		List<MonitoringPenjualan> result = monitoringPenjualanFileMapperService.monitoringPenjualanExcelFileMapping();
		for(MonitoringPenjualan mp : result){
			System.out.println("Monitoring Penjualan: " +mp.toString());
		}
	}

}
