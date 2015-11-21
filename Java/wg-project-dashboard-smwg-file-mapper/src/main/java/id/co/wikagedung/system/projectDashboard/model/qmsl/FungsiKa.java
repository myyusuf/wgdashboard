package id.co.wikagedung.system.projectDashboard.model.qmsl;

public class FungsiKa {

	private String id;
	private String namaProyek;
	private String periode;
	private Double penerimaanDanPenangananMaterial;
	private Double gudang;
	private Double keuangan;
	private Double akuntansi;
	private Double pelatihanDanKompetensi;
	private Double kepersonaliaan;
	private Double subTotal;

	public FungsiKa() {
	}

	public FungsiKa(String id, String namaProyek, String periode,
			Double penerimaanDanPenangananMaterial, Double gudang,
			Double keuangan, Double akuntansi, Double pelatihanDanKompetensi,
			Double kepersonaliaan, Double subTotal) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.penerimaanDanPenangananMaterial = penerimaanDanPenangananMaterial;
		this.gudang = gudang;
		this.keuangan = keuangan;
		this.akuntansi = akuntansi;
		this.pelatihanDanKompetensi = pelatihanDanKompetensi;
		this.kepersonaliaan = kepersonaliaan;
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

	public Double getPenerimaanDanPenangananMaterial() {
		return penerimaanDanPenangananMaterial;
	}

	public void setPenerimaanDanPenangananMaterial(
			Double penerimaanDanPenangananMaterial) {
		this.penerimaanDanPenangananMaterial = penerimaanDanPenangananMaterial;
	}

	public Double getGudang() {
		return gudang;
	}

	public void setGudang(Double gudang) {
		this.gudang = gudang;
	}

	public Double getKeuangan() {
		return keuangan;
	}

	public void setKeuangan(Double keuangan) {
		this.keuangan = keuangan;
	}

	public Double getAkuntansi() {
		return akuntansi;
	}

	public void setAkuntansi(Double akuntansi) {
		this.akuntansi = akuntansi;
	}

	public Double getPelatihanDanKompetensi() {
		return pelatihanDanKompetensi;
	}

	public void setPelatihanDanKompetensi(Double pelatihanDanKompetensi) {
		this.pelatihanDanKompetensi = pelatihanDanKompetensi;
	}

	public Double getKepersonaliaan() {
		return kepersonaliaan;
	}

	public void setKepersonaliaan(Double kepersonaliaan) {
		this.kepersonaliaan = kepersonaliaan;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "FungsiKa [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", penerimaanDanPenangananMaterial="
				+ penerimaanDanPenangananMaterial + ", gudang=" + gudang
				+ ", keuangan=" + keuangan + ", akuntansi=" + akuntansi
				+ ", pelatihanDanKompetensi=" + pelatihanDanKompetensi
				+ ", kepersonaliaan=" + kepersonaliaan + ", subTotal="
				+ subTotal + "]";
	}

}
