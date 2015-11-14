package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.BiayaUsahaPusat;

import java.util.List;

public interface BiayaUsahaPusatDao {

	void insertBiayaUsahaPusat(BiayaUsahaPusat biayaUsahaPusat);

	List<BiayaUsahaPusat> getAllBiayaUsahaPusat();

	List<BiayaUsahaPusat> getBiayaUsahaPusatByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<BiayaUsahaPusat> getBiayaUsahaPusatByPeriode(String periode);

}
