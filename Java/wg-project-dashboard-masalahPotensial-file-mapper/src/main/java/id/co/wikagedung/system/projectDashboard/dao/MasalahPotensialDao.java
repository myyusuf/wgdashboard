package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.MasalahPotensial;

import java.util.List;

public interface MasalahPotensialDao {
	
	void insertMasalahPotensial(MasalahPotensial masalahPotensial);

	List<MasalahPotensial> getAllMasalahPotensial();

	List<MasalahPotensial> getMasalahPotensialByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<MasalahPotensial> getMasalahPotensialByPeriode(String periode);

}
