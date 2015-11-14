package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.PendapatanBiaya;

import java.util.List;

public interface PendapatanBiayaDao {

	void insertPendapatanBiaya(PendapatanBiaya pendapatanBiaya);

	List<PendapatanBiaya> getAllPendapatanBiaya();

	List<PendapatanBiaya> getPendapatanBiayaByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<PendapatanBiaya> getPendapatanBiayaByPeriode(String periode);

}
