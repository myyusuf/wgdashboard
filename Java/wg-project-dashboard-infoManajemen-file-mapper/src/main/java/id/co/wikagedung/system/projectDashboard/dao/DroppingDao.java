package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.Dropping;

import java.util.List;

public interface DroppingDao {

	void insertDropping(Dropping dropping);

	List<Dropping> getAllDropping();

	List<Dropping> getDroppingByNamaProyekAndPeriode(String namaProyek,
			String periode);

	List<Dropping> getDroppingByPeriode(String periode);

}
