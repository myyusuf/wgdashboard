package id.co.wikagedung.system.projectDashboard.model;

public class EkstraKomptabel {

	private String id;
	private String namaProyek;
	private String periode;
	private String uraian;
	private Double jumlah;
	private String merk;
	private String kodeInventaris;
	private Double tahunBeli;
	private Double hargaBeli;
	private String kondisi;
	private String keterangan;

	public EkstraKomptabel() {
	}

	public EkstraKomptabel(String id, String namaProyek, String periode,
			String uraian, Double jumlah, String merk, String kodeInventaris,
			Double tahunBeli, Double hargaBeli, String kondisi,
			String keterangan) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.uraian = uraian;
		this.jumlah = jumlah;
		this.merk = merk;
		this.kodeInventaris = kodeInventaris;
		this.tahunBeli = tahunBeli;
		this.hargaBeli = hargaBeli;
		this.kondisi = kondisi;
		this.keterangan = keterangan;
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

	public String getUraian() {
		return uraian;
	}

	public void setUraian(String uraian) {
		this.uraian = uraian;
	}

	public Double getJumlah() {
		return jumlah;
	}

	public void setJumlah(Double jumlah) {
		this.jumlah = jumlah;
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public String getKodeInventaris() {
		return kodeInventaris;
	}

	public void setKodeInventaris(String kodeInventaris) {
		this.kodeInventaris = kodeInventaris;
	}

	public Double getTahunBeli() {
		return tahunBeli;
	}

	public void setTahunBeli(Double tahunBeli) {
		this.tahunBeli = tahunBeli;
	}

	public Double getHargaBeli() {
		return hargaBeli;
	}

	public void setHargaBeli(Double hargaBeli) {
		this.hargaBeli = hargaBeli;
	}

	public String getKondisi() {
		return kondisi;
	}

	public void setKondisi(String kondisi) {
		this.kondisi = kondisi;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	@Override
	public String toString() {
		return "IntraKomptabel [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", uraian=" + uraian + ", jumlah="
				+ jumlah + ", merk=" + merk + ", kodeInventaris="
				+ kodeInventaris + ", tahunBeli=" + tahunBeli + ", hargaBeli="
				+ hargaBeli + ", kondisi=" + kondisi + ", keterangan="
				+ keterangan + "]";
	}

}
