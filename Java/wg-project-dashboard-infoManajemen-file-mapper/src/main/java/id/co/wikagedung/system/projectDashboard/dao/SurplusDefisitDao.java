package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.SurplusDefisit;

import java.util.List;

public interface SurplusDefisitDao {

	void insertSurplusDefisit(SurplusDefisit surplusDefisit);

	List<SurplusDefisit> getAllSurplusDefisit();

	List<SurplusDefisit> getSurplusDefisitByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<SurplusDefisit> getSurplusDefisitByPeriode(String periode);

}
