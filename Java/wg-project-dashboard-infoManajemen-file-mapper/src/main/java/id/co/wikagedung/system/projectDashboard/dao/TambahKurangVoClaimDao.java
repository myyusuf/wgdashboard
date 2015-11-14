package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.TambahKurangVoClaim;

import java.util.List;

public interface TambahKurangVoClaimDao {

	void insertTambahKurangVoClaim(TambahKurangVoClaim tambahKurangVoClaim);

	List<TambahKurangVoClaim> getAllTambahKurangVoClaim();

	List<TambahKurangVoClaim> getTambahKurangVoClaimByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<TambahKurangVoClaim> getTambahKurangVoClaimByPeriode(String periode);

}
