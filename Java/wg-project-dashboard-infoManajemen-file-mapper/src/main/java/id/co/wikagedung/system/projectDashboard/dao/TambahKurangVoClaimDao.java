package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.TambahKurangVoClaimOmsetKontrak;

import java.util.List;

public interface TambahKurangVoClaimDao {

	void insertTambahKurangVoClaim(TambahKurangVoClaimOmsetKontrak tambahKurangVoClaim);

	List<TambahKurangVoClaimOmsetKontrak> getAllTambahKurangVoClaim();

	List<TambahKurangVoClaimOmsetKontrak> getTambahKurangVoClaimByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<TambahKurangVoClaimOmsetKontrak> getTambahKurangVoClaimByPeriode(String periode);

}
