package id.co.wikagedung.system.projectDashboard.dao;

import id.co.wikagedung.system.projectDashboard.model.PenerimaanBersih;

import java.util.List;

public interface PenerimaanBersihDao {

	void insertPenerimaanBersih(PenerimaanBersih penerimaanBersih);

	List<PenerimaanBersih> getAllPenerimaanBersih();

	List<PenerimaanBersih> getPenerimaanBersihByNamaProyekAndPeriode(
			String namaProyek, String periode);

	List<PenerimaanBersih> getPenerimaanBersihByPeriode(String periode);

}
