package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.BiayaTakLangsung;

import java.util.List;

public interface BiayaTakLangsungDao {

	void insertBiayaTakLangsung(BiayaTakLangsung biayaTakLangsung);

	List<BiayaTakLangsung> getAllBiayaTakLangsung();

	List<BiayaTakLangsung> getBiayaTakLangsungByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<BiayaTakLangsung> getBiayaTakLangsungByPeriode(String periode);

}
