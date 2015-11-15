package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.TambahKurangVoClaimPenjualanProsentase;

import java.util.List;

public interface TambahKurangVoClaimProsentaseDao {

	void insertTambahKurangVoClaimProsentase(
			TambahKurangVoClaimPenjualanProsentase tambahKurangVoClaimProsentase);

	List<TambahKurangVoClaimPenjualanProsentase> getAllTambahKurangVoClaimProsentase();

	List<TambahKurangVoClaimPenjualanProsentase> getTambahKurangVoClaimProsentaseByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<TambahKurangVoClaimPenjualanProsentase> getTambahKurangVoClaimProsentaseByPeriode(
			String periode);

}
