package id.co.wikagedung.system.projectDashboard.dao;

import java.util.List;

import id.co.wikagedung.system.projectDashboard.model.BiayaLangsung;

public interface BiayaLangsungDao {

	void insertBiayaLangsung(BiayaLangsung biayaLangsung);

	List<BiayaLangsung> getAllBiayaLangsung();

	List<BiayaLangsung> getBiayaLangsungByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<BiayaLangsung> getBiayaLangsungByPeriode(String periode);

}
