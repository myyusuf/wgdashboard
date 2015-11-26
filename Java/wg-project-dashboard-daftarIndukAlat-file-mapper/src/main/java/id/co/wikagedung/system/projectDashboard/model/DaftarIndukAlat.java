package id.co.wikagedung.system.projectDashboard.model;

public class DaftarIndukAlat {

	private String id;
	private String namaProyek;
	private String periode;
	private String keterangan;
	private String noInventaris;
	private String namaAlat;
	private String merkAlat;
	private String modelNoSeri;
	private String spesifikasi;
	private Double tahunBeli;
	private String namaAgen;
	private String alamatAgen;
	private String noInstruksiKerja;
	private String lokasiAlat;

	public DaftarIndukAlat() {

	}

	public DaftarIndukAlat(String id, String namaProyek, String periode,
			String keterangan, String noInventaris, String namaAlat,
			String merkAlat, String modelNoSeri, String spesifikasi,
			Double tahunBeli, String namaAgen, String alamatAgen,
			String noInstruksiKerja, String lokasiAlat) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.keterangan = keterangan;
		this.noInventaris = noInventaris;
		this.namaAlat = namaAlat;
		this.merkAlat = merkAlat;
		this.modelNoSeri = modelNoSeri;
		this.spesifikasi = spesifikasi;
		this.tahunBeli = tahunBeli;
		this.namaAgen = namaAgen;
		this.alamatAgen = alamatAgen;
		this.noInstruksiKerja = noInstruksiKerja;
		this.lokasiAlat = lokasiAlat;
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

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	public String getNoInventaris() {
		return noInventaris;
	}

	public void setNoInventaris(String noInventaris) {
		this.noInventaris = noInventaris;
	}

	public String getNamaAlat() {
		return namaAlat;
	}

	public void setNamaAlat(String namaAlat) {
		this.namaAlat = namaAlat;
	}

	public String getMerkAlat() {
		return merkAlat;
	}

	public void setMerkAlat(String merkAlat) {
		this.merkAlat = merkAlat;
	}

	public String getModelNoSeri() {
		return modelNoSeri;
	}

	public void setModelNoSeri(String modelNoSeri) {
		this.modelNoSeri = modelNoSeri;
	}

	public String getSpesifikasi() {
		return spesifikasi;
	}

	public void setSpesifikasi(String spesifikasi) {
		this.spesifikasi = spesifikasi;
	}

	public Double getTahunBeli() {
		return tahunBeli;
	}

	public void setTahunBeli(Double tahunBeli) {
		this.tahunBeli = tahunBeli;
	}

	public String getNamaAgen() {
		return namaAgen;
	}

	public void setNamaAgen(String namaAgen) {
		this.namaAgen = namaAgen;
	}

	public String getAlamatAgen() {
		return alamatAgen;
	}

	public void setAlamatAgen(String alamatAgen) {
		this.alamatAgen = alamatAgen;
	}

	public String getNoInstruksiKerja() {
		return noInstruksiKerja;
	}

	public void setNoInstruksiKerja(String noInstruksiKerja) {
		this.noInstruksiKerja = noInstruksiKerja;
	}

	public String getLokasiAlat() {
		return lokasiAlat;
	}

	public void setLokasiAlat(String lokasiAlat) {
		this.lokasiAlat = lokasiAlat;
	}

	@Override
	public String toString() {
		return "DaftarIndukAlat [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", keterangan=" + keterangan
				+ ", noInventaris=" + noInventaris + ", namaAlat=" + namaAlat
				+ ", merkAlat=" + merkAlat + ", modelNoSeri=" + modelNoSeri
				+ ", spesifikasi=" + spesifikasi + ", tahunBeli=" + tahunBeli
				+ ", namaAgen=" + namaAgen + ", alamatAgen=" + alamatAgen
				+ ", noInstruksiKerja=" + noInstruksiKerja + ", lokasiAlat="
				+ lokasiAlat + "]";
	}

}
