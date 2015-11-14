package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.ProsentaseLk;

import java.util.List;

public interface ProsentaseLkDao {

	void insertProsentaseLk(ProsentaseLk prosentaseLk);

	List<ProsentaseLk> getAllProsentaseLk();

	List<ProsentaseLk> getProsentaseLkByNamaProyekAndPeriode(String namaProyek,
			String periode);

	List<ProsentaseLk> getProsentaseLkByPeriode(String periode);

}
