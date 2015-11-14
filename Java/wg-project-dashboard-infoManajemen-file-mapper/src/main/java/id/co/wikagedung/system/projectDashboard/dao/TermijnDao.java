package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.Termijn;

import java.util.List;

public interface TermijnDao {

	void insertTermijn(Termijn termijn);

	List<Termijn> getAllTermijn();

	List<Termijn> getTermijnByNamaProyekAndPeriode(String namaProyek,
			String periode);

	List<Termijn> getTermijnByPeriode(String periode);

}
