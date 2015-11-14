package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.Risiko;

import java.util.List;

public interface RisikoDao {

	void insertRisiko(Risiko risiko);

	List<Risiko> getAllRisiko();

	List<Risiko> getRisikoByNamaProyekAndPeriode(String namaProyek,
			String periode);

	List<Risiko> getRisikoByPeriode(String periode);

}
