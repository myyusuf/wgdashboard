package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.TotalOp;

import java.util.List;

public interface TotalOpDao {

	void insertTotalOp(TotalOp totalOp);

	List<TotalOp> getAllTotalOp();

	List<TotalOp> getTotalOpByNamaProyekAndPeriode(String namaProyek,
			String periode);

	List<TotalOp> getTotalOpByPeriode(String periode);

}
