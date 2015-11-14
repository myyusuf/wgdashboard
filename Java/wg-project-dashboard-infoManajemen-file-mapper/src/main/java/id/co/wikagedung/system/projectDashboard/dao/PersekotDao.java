package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.Persekot;

import java.util.List;

public interface PersekotDao {

	void insertPersekot(Persekot persekot);

	List<Persekot> getAllPersekot();

	List<Persekot> getPersekotByNamaProyekAndPeriode(String namaProyek,
			String periode);

	List<Persekot> getPersekotByPeriode(String periode);

}
