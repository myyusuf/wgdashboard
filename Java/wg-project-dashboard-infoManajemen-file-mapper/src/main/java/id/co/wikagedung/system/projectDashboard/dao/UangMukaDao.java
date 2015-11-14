package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.UangMuka;

import java.util.List;

public interface UangMukaDao {

	void insertUangMuka(UangMuka uangMuka);

	List<UangMuka> getAllUangMuka();

	List<UangMuka> getUangMukaByNamaProyekAndPeriode(String namaProyek,
			String periode);

	List<UangMuka> getUangMukaByPeriode(String periode);

}
