package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.TotalBuPusatRisikoPphFinal;

import java.util.List;

public interface TotalBuPusatRisikoPphFinalDao {

	void insertTotalBuPusatRisikoPphFinal(
			TotalBuPusatRisikoPphFinal totalBuPusatRisikoPphFinal);

	List<TotalBuPusatRisikoPphFinal> getAllTotalBuPusatRisikoPphFinal();

	List<TotalBuPusatRisikoPphFinal> getTotalBuPusatRisikoPphFinalByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<TotalBuPusatRisikoPphFinal> getTotalBuPusatRisikoPphFinalByPeriode(
			String periode);

}
