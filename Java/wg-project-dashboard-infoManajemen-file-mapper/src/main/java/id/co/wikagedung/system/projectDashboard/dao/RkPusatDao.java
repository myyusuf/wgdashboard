package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.RkPusat;

import java.util.List;

public interface RkPusatDao {

	void insertRkPusat(RkPusat rkPusat);

	List<RkPusat> getAllRkPusat();

	List<RkPusat> getRkPusatByNamaProyekAndPeriode(String namaProyek,
			String periode);

	List<RkPusat> getRkPusatByPeriode(String periode);

}
