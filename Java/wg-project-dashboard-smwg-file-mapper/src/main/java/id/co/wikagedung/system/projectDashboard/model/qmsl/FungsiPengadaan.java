package id.co.wikagedung.system.projectDashboard.model.qmsl;

public class FungsiPengadaan {

	private String id;
	private String namaProyek;
	private String periode;
	private Double polaPembelanjaan;
	private Double rencanaPengadaan;
	private Double evaluasiPenyediaJasaDanPemasok;
	private Double pemeliharaanAlat;
	private Double subTotal;

	public FungsiPengadaan() {
	}

	public FungsiPengadaan(String id, String namaProyek, String periode,
			Double polaPembelanjaan, Double rencanaPengadaan,
			Double evaluasiPenyediaJasaDanPemasok, Double pemeliharaanAlat,
			Double subTotal) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.polaPembelanjaan = polaPembelanjaan;
		this.rencanaPengadaan = rencanaPengadaan;
		this.evaluasiPenyediaJasaDanPemasok = evaluasiPenyediaJasaDanPemasok;
		this.pemeliharaanAlat = pemeliharaanAlat;
		this.subTotal = subTotal;
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

	public Double getPolaPembelanjaan() {
		return polaPembelanjaan;
	}

	public void setPolaPembelanjaan(Double polaPembelanjaan) {
		this.polaPembelanjaan = polaPembelanjaan;
	}

	public Double getRencanaPengadaan() {
		return rencanaPengadaan;
	}

	public void setRencanaPengadaan(Double rencanaPengadaan) {
		this.rencanaPengadaan = rencanaPengadaan;
	}

	public Double getEvaluasiPenyediaJasaDanPemasok() {
		return evaluasiPenyediaJasaDanPemasok;
	}

	public void setEvaluasiPenyediaJasaDanPemasok(
			Double evaluasiPenyediaJasaDanPemasok) {
		this.evaluasiPenyediaJasaDanPemasok = evaluasiPenyediaJasaDanPemasok;
	}

	public Double getPemeliharaanAlat() {
		return pemeliharaanAlat;
	}

	public void setPemeliharaanAlat(Double pemeliharaanAlat) {
		this.pemeliharaanAlat = pemeliharaanAlat;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "FungsiPengadaan [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", polaPembelanjaan="
				+ polaPembelanjaan + ", rencanaPengadaan=" + rencanaPengadaan
				+ ", evaluasiPenyediaJasaDanPemasok="
				+ evaluasiPenyediaJasaDanPemasok + ", pemeliharaanAlat="
				+ pemeliharaanAlat + ", subTotal=" + subTotal + "]";
	}

}
