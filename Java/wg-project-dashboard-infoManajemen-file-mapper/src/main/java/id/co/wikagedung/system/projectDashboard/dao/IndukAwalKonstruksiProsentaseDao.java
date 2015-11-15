package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.IndukAwalKonstruksiPenjualanProsentase;

import java.util.List;

public interface IndukAwalKonstruksiProsentaseDao {

	void insertIndukAwalKonstruksiProsentase(
			IndukAwalKonstruksiPenjualanProsentase indukAwalKonstruksiProsentase);

	List<IndukAwalKonstruksiPenjualanProsentase> getAllIndukAwalKonstruksiProsentase();

	List<IndukAwalKonstruksiPenjualanProsentase> getIndukAwalKonstruksiProsentaseByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<IndukAwalKonstruksiPenjualanProsentase> getIndukAwalKonstruksiProsentaseByPeriode(
			String periode);

}
