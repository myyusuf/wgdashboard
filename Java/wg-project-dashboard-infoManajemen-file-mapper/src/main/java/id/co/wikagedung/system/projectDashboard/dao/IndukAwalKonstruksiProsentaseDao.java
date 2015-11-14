package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.IndukAwalKonstruksiProsentase;

import java.util.List;

public interface IndukAwalKonstruksiProsentaseDao {

	void insertIndukAwalKonstruksiProsentase(
			IndukAwalKonstruksiProsentase indukAwalKonstruksiProsentase);

	List<IndukAwalKonstruksiProsentase> getAllIndukAwalKonstruksiProsentase();

	List<IndukAwalKonstruksiProsentase> getIndukAwalKonstruksiProsentaseByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<IndukAwalKonstruksiProsentase> getIndukAwalKonstruksiProsentaseByPeriode(
			String periode);

}
