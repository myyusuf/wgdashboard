package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.ProsentaseTerhadapProduksi;

import java.util.List;

public interface ProsentaseTerhadapProduksiDao {

	void insertProsentaseTerhadapProduksi(
			ProsentaseTerhadapProduksi prosentaseTerhadapProduksi);

	List<ProsentaseTerhadapProduksi> getAllProsentaseTerhadapProduksi();

	List<ProsentaseTerhadapProduksi> getProsentaseTerhadapProduksiByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<ProsentaseTerhadapProduksi> getProsentaseTerhadapProduksiByPeriode(
			String periode);

}
