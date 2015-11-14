package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.LkInduk;

import java.util.List;

public interface LkIndukDao {

	void insertLkInduk(LkInduk lkInduk);

	List<LkInduk> getAllLkInduk();

	List<LkInduk> getLkIndukByNamaProyekAndPeriode(String namaProyek,
			String periode);

	List<LkInduk> getLkIndukByPeriode(String periode);

}
