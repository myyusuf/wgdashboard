package id.co.wikagedung.system.projectDashboard.model.qmsl;

public class FungsiEnjinering {

	private String id;
	private String namaProyek;
	private String periode;
	private Double designDanRedesign;
	private Double pengendalianGambar;
	private Double metodeKerjaDanMetodePelaksanaan;
	private Double veDanInovasiKm;
	private Double subTotal;

	public FungsiEnjinering() {
	}

	public FungsiEnjinering(String id, String namaProyek, String periode,
			Double designDanRedesign, Double pengendalianGambar,
			Double metodeKerjaDanMetodePelaksanaan, Double veDanInovasiKm,
			Double subTotal) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.designDanRedesign = designDanRedesign;
		this.pengendalianGambar = pengendalianGambar;
		this.metodeKerjaDanMetodePelaksanaan = metodeKerjaDanMetodePelaksanaan;
		this.veDanInovasiKm = veDanInovasiKm;
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

	public Double getDesignDanRedesign() {
		return designDanRedesign;
	}

	public void setDesignDanRedesign(Double designDanRedesign) {
		this.designDanRedesign = designDanRedesign;
	}

	public Double getPengendalianGambar() {
		return pengendalianGambar;
	}

	public void setPengendalianGambar(Double pengendalianGambar) {
		this.pengendalianGambar = pengendalianGambar;
	}

	public Double getMetodeKerjaDanMetodePelaksanaan() {
		return metodeKerjaDanMetodePelaksanaan;
	}

	public void setMetodeKerjaDanMetodePelaksanaan(
			Double metodeKerjaDanMetodePelaksanaan) {
		this.metodeKerjaDanMetodePelaksanaan = metodeKerjaDanMetodePelaksanaan;
	}

	public Double getVeDanInovasiKm() {
		return veDanInovasiKm;
	}

	public void setVeDanInovasiKm(Double veDanInovasiKm) {
		this.veDanInovasiKm = veDanInovasiKm;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "FungsiEnjinering [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", designDanRedesign="
				+ designDanRedesign + ", pengendalianGambar="
				+ pengendalianGambar + ", metodeKerjaDanMetodePelaksanaan="
				+ metodeKerjaDanMetodePelaksanaan + ", veDanInovasiKm="
				+ veDanInovasiKm + ", subTotal=" + subTotal + "]";
	}

}
