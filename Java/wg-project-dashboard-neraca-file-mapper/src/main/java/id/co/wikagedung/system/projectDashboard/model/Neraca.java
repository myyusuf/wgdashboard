package id.co.wikagedung.system.projectDashboard.model;

public class Neraca {

	private String id;
	private String namaProyek;
	private String periode;
	private Double kode;
	private Double jumlah;

	public Neraca() {

	}

	public Neraca(String id, String namaProyek, String periode, Double kode,
			Double jumlah) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.kode = kode;
		this.jumlah = jumlah;
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

	public Double getKode() {
		return kode;
	}

	public void setKode(Double kode) {
		this.kode = kode;
	}

	public Double getJumlah() {
		return jumlah;
	}

	public void setJumlah(Double jumlah) {
		this.jumlah = jumlah;
	}

	@Override
	public String toString() {
		return "Neraca [id=" + id + ", namaProyek=" + namaProyek + ", periode="
				+ periode + ", kode=" + kode + ", jumlah=" + jumlah + "]";
	}

}
