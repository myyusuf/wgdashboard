package id.co.wikagedung.system.projectDashboard.model;

public class MonitoringPenjualan {

	private String id;
	private String namaProyek;
	private String periode;
	private String noBuktiMemorial;
	private String bulan;
	private Double prestThdOkAkhirBulan;
	private Double prestThdOkAkhirKumulatif;
	private Double produksiBulan;
	private Double produksiKumulatif;

	public MonitoringPenjualan() {

	}

	public MonitoringPenjualan(String id, String namaProyek, String periode,
			String noBuktiMemorial, String bulan, Double prestThdOkAkhirBulan,
			Double prestThdOkAkhirKumulatif, Double produksiBulan,
			Double produksiKumulatif) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.noBuktiMemorial = noBuktiMemorial;
		this.bulan = bulan;
		this.prestThdOkAkhirBulan = prestThdOkAkhirBulan;
		this.prestThdOkAkhirKumulatif = prestThdOkAkhirKumulatif;
		this.produksiBulan = produksiBulan;
		this.produksiKumulatif = produksiKumulatif;
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

	public String getNoBuktiMemorial() {
		return noBuktiMemorial;
	}

	public void setNoBuktiMemorial(String noBuktiMemorial) {
		this.noBuktiMemorial = noBuktiMemorial;
	}

	public String getBulan() {
		return bulan;
	}

	public void setBulan(String bulan) {
		this.bulan = bulan;
	}

	public Double getPrestThdOkAkhirBulan() {
		return prestThdOkAkhirBulan;
	}

	public void setPrestThdOkAkhirBulan(Double prestThdOkAkhirBulan) {
		this.prestThdOkAkhirBulan = prestThdOkAkhirBulan;
	}

	public Double getPrestThdOkAkhirKumulatif() {
		return prestThdOkAkhirKumulatif;
	}

	public void setPrestThdOkAkhirKumulatif(Double prestThdOkAkhirKumulatif) {
		this.prestThdOkAkhirKumulatif = prestThdOkAkhirKumulatif;
	}

	public Double getProduksiBulan() {
		return produksiBulan;
	}

	public void setProduksiBulan(Double produksiBulan) {
		this.produksiBulan = produksiBulan;
	}

	public Double getProduksiKumulatif() {
		return produksiKumulatif;
	}

	public void setProduksiKumulatif(Double produksiKumulatif) {
		this.produksiKumulatif = produksiKumulatif;
	}

	@Override
	public String toString() {
		return "MonitoringPenjualan [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", noBuktiMemorial="
				+ noBuktiMemorial + ", bulan=" + bulan
				+ ", prestThdOkAkhirBulan=" + prestThdOkAkhirBulan
				+ ", prestThdOkAkhirKumulatif=" + prestThdOkAkhirKumulatif
				+ ", produksiBulan=" + produksiBulan + ", produksiKumulatif="
				+ produksiKumulatif + "]";
	}

}
