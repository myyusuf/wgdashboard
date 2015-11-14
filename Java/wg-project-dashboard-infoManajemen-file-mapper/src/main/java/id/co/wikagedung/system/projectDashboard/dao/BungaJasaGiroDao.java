package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.BungaJasaGiro;

import java.util.List;

public interface BungaJasaGiroDao {

	void insertBungaJasaGiro(BungaJasaGiro bungaJasaGiro);

	List<BungaJasaGiro> getAllBungaJasaGiro();

	List<BungaJasaGiro> getBungaJasaGiroByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<BungaJasaGiro> getBungaJasaGiroByPeriode(String periode);

}
