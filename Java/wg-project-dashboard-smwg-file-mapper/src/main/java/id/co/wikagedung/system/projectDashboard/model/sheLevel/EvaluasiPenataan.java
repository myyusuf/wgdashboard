package id.co.wikagedung.system.projectDashboard.model.sheLevel;

public class EvaluasiPenataan {

	private String id;
	private String namaProyek;
	private String periode;
	private Double evaluasiPemenuhanPeraturanPerundangan;

	public EvaluasiPenataan() {
	}

	public EvaluasiPenataan(String id, String namaProyek, String periode,
			Double evaluasiPemenuhanPeraturanPerundangan) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.evaluasiPemenuhanPeraturanPerundangan = evaluasiPemenuhanPeraturanPerundangan;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNamaProyek() {
		return namaProyek;
	}

	public void setNamaProyek(String namaProyek) {
		this.namaProyek = namaProyek;
	}

	public String getPeriode() {
		return periode;
	}

	public void setPeriode(String periode) {
		this.periode = periode;
	}

	public Double getEvaluasiPemenuhanPeraturanPerundangan() {
		return evaluasiPemenuhanPeraturanPerundangan;
	}

	public void setEvaluasiPemenuhanPeraturanPerundangan(
			Double evaluasiPemenuhanPeraturanPerundangan) {
		this.evaluasiPemenuhanPeraturanPerundangan = evaluasiPemenuhanPeraturanPerundangan;
	}

	@Override
	public String toString() {
		return "EvaluasiPenataan [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode
				+ ", evaluasiPemenuhanPeraturanPerundangan="
				+ evaluasiPemenuhanPeraturanPerundangan + "]";
	}

}
