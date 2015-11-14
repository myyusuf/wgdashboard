package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.IndukAwalKonstruksi;

import java.util.List;

public interface IndukAwalKonstruksiDao {

	void insertIndukAwalKonstruksi(IndukAwalKonstruksi indukAwalKonstruksi);

	List<IndukAwalKonstruksi> getAllIndukAwalKonstruksi();

	List<IndukAwalKonstruksi> getIndukAwalKonstruksiByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<IndukAwalKonstruksi> getIndukAwalKonstruksiByPeriode(String periode);

}
