package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.PphPenerimaan;

import java.util.List;

public interface PphPenerimaanDao {

	void inserPphPenerimaan(PphPenerimaan pphPenerimaan);

	List<PphPenerimaan> getAllPphPenerimaan();

	List<PphPenerimaan> getPphPenerimaanByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<PphPenerimaan> getPphPenerimaanByPeriode(String periode);

}
