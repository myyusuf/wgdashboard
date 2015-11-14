package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.TotalBiaya;

import java.util.List;

public interface TotalBiayaDao {

	void insertTotalBiaya(TotalBiaya totalBiaya);

	List<TotalBiaya> getAllTotalBiaya();

	List<TotalBiaya> getTotalBiayaByNamaProyekAndPeriode(String namaProyek,
			String periode);

	List<TotalBiaya> getTotalBiayaByPeriode(String periode);

}
