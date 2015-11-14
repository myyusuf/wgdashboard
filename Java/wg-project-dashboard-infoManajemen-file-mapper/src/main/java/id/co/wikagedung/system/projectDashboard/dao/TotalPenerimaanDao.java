package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.TotalPenerimaan;

import java.util.List;

public interface TotalPenerimaanDao {

	void insertTotalPenerimaan(TotalPenerimaan totalPenerimaan);

	List<TotalPenerimaan> getAllTotalPenerimaan();

	List<TotalPenerimaan> getTotalPenerimaanByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<TotalPenerimaan> getTotalPenerimaanByPeriode(String periode);

}
