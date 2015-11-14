package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.PembebananBiaya;

import java.util.List;

public interface PembebananBiayaDao {

	void insertPembebananBiaya(PembebananBiaya pembebananBiaya);

	List<PembebananBiaya> getAllPembebananBiaya();

	List<PembebananBiaya> getPembebananBiayaByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<PembebananBiaya> getPembebananBiayaByPeriode(String periode);

}
