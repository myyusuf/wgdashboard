package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.PphFinal;

import java.util.List;

public interface PphFinalDao {

	void insertPphFinal(PphFinal pphFinal);

	List<PphFinal> getAllPphFinal();

	List<PphFinal> getPphFinalByNamaProyekAndPeriode(String namaProyek,
			String periode);

	List<PphFinal> getPphFinalByPeriode(String periode);

}
