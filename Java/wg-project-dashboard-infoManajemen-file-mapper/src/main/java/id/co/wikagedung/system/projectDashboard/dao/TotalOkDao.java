package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.TotalOk;

import java.util.List;

public interface TotalOkDao {

	void insertTotalOk(TotalOk totalOk);

	List<TotalOk> getAllTotalOk();

	List<TotalOk> getTotalOkByNamaProyekAndPeriode(String namaProyek,
			String periode);

	List<TotalOk> getTotalOkByPeriode(String periode);

}
