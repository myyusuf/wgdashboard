package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.IndukAwalKonstruksiOmsetKontrak;

import java.util.List;

public interface IndukAwalKonstruksiDao {

	void insertIndukAwalKonstruksi(IndukAwalKonstruksiOmsetKontrak indukAwalKonstruksi);

	List<IndukAwalKonstruksiOmsetKontrak> getAllIndukAwalKonstruksi();

	List<IndukAwalKonstruksiOmsetKontrak> getIndukAwalKonstruksiByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<IndukAwalKonstruksiOmsetKontrak> getIndukAwalKonstruksiByPeriode(String periode);

}
