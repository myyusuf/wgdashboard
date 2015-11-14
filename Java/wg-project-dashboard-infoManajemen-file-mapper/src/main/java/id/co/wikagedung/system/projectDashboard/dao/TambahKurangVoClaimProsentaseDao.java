package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.TambahKurangVoClaimProsentase;

import java.util.List;

public interface TambahKurangVoClaimProsentaseDao {

	void insertTambahKurangVoClaimProsentase(
			TambahKurangVoClaimProsentase tambahKurangVoClaimProsentase);

	List<TambahKurangVoClaimProsentase> getAllTambahKurangVoClaimProsentase();

	List<TambahKurangVoClaimProsentase> getTambahKurangVoClaimProsentaseByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<TambahKurangVoClaimProsentase> getTambahKurangVoClaimProsentaseByPeriode(
			String periode);

}
