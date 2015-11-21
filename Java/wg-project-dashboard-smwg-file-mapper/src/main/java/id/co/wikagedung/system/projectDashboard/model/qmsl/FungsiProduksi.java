package id.co.wikagedung.system.projectDashboard.model.qmsl;

public class FungsiProduksi {

	private String id;
	private String namaProyek;
	private String periode;
	private Double pengendalianSumberDaya;
	private Double pengendalianProduksi;
	private Double pengendalianGambarLapangan;
	private Double metodeKerja;
	private Double pengendalianMutuPekerja;
	private Double rapatKoordinasiProduksi;
	private Double subTotal;

	public FungsiProduksi() {
	}

	public FungsiProduksi(String id, String namaProyek, String periode,
			Double pengendalianSumberDaya, Double pengendalianProduksi,
			Double pengendalianGambarLapangan, Double metodeKerja,
			Double pengendalianMutuPekerja, Double rapatKoordinasiProduksi,
			Double subTotal) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.pengendalianSumberDaya = pengendalianSumberDaya;
		this.pengendalianProduksi = pengendalianProduksi;
		this.pengendalianGambarLapangan = pengendalianGambarLapangan;
		this.metodeKerja = metodeKerja;
		this.pengendalianMutuPekerja = pengendalianMutuPekerja;
		this.rapatKoordinasiProduksi = rapatKoordinasiProduksi;
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

	public Double getPengendalianSumberDaya() {
		return pengendalianSumberDaya;
	}

	public void setPengendalianSumberDaya(Double pengendalianSumberDaya) {
		this.pengendalianSumberDaya = pengendalianSumberDaya;
	}

	public Double getPengendalianProduksi() {
		return pengendalianProduksi;
	}

	public void setPengendalianProduksi(Double pengendalianProduksi) {
		this.pengendalianProduksi = pengendalianProduksi;
	}

	public Double getPengendalianGambarLapangan() {
		return pengendalianGambarLapangan;
	}

	public void setPengendalianGambarLapangan(Double pengendalianGambarLapangan) {
		this.pengendalianGambarLapangan = pengendalianGambarLapangan;
	}

	public Double getMetodeKerja() {
		return metodeKerja;
	}

	public void setMetodeKerja(Double metodeKerja) {
		this.metodeKerja = metodeKerja;
	}

	public Double getPengendalianMutuPekerja() {
		return pengendalianMutuPekerja;
	}

	public void setPengendalianMutuPekerja(Double pengendalianMutuPekerja) {
		this.pengendalianMutuPekerja = pengendalianMutuPekerja;
	}

	public Double getRapatKoordinasiProduksi() {
		return rapatKoordinasiProduksi;
	}

	public void setRapatKoordinasiProduksi(Double rapatKoordinasiProduksi) {
		this.rapatKoordinasiProduksi = rapatKoordinasiProduksi;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "FungsiProduksi [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", pengendalianSumberDaya="
				+ pengendalianSumberDaya + ", pengendalianProduksi="
				+ pengendalianProduksi + ", pengendalianGambarLapangan="
				+ pengendalianGambarLapangan + ", metodeKerja=" + metodeKerja
				+ ", pengendalianMutuPekerja=" + pengendalianMutuPekerja
				+ ", rapatKoordinasiProduksi=" + rapatKoordinasiProduksi
				+ ", subTotal=" + subTotal + "]";
	}

}
