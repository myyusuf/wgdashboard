package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.TotalLabaRugiLain;

import java.util.List;

public interface TotalLabaRugiLainDao {

	void insertTotalLabaRugiLain(TotalLabaRugiLain totalLabaRugiLain);

	List<TotalLabaRugiLain> getAllTotalLabaRugiLain();

	List<TotalLabaRugiLain> getTotalLabaRugiLainByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<TotalLabaRugiLain> getTotalLabaRugiLainByPeriode(String periode);

}
