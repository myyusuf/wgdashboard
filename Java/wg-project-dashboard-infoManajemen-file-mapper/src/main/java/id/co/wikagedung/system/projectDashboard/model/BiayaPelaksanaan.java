package id.co.wikagedung.system.projectDashboard.model;

public class BiayaPelaksanaan {

	private String namaProyek;
	private String periode;
	private BiayaLangsung biayaLangsung;
	private BiayaTakLangsung biayaTakLangsung;
	private TotalBiaya totalBiaya;

	public BiayaPelaksanaan() {
	}

	public BiayaPelaksanaan(String namaProyek, String periode,
			BiayaLangsung biayaLangsung, BiayaTakLangsung biayaTakLangsung,
			TotalBiaya totalBiaya) {
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.biayaLangsung = biayaLangsung;
		this.biayaTakLangsung = biayaTakLangsung;
		this.totalBiaya = totalBiaya;
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

	public BiayaLangsung getBiayaLangsung() {
		return biayaLangsung;
	}

	public void setBiayaLangsung(BiayaLangsung biayaLangsung) {
		this.biayaLangsung = biayaLangsung;
	}

	public BiayaTakLangsung getBiayaTakLangsung() {
		return biayaTakLangsung;
	}

	public void setBiayaTakLangsung(BiayaTakLangsung biayaTakLangsung) {
		this.biayaTakLangsung = biayaTakLangsung;
	}

	public TotalBiaya getTotalBiaya() {
		return totalBiaya;
	}

	public void setTotalBiaya(TotalBiaya totalBiaya) {
		this.totalBiaya = totalBiaya;
	}

	@Override
	public String toString() {
		return "BiayaPelaksanaan [namaProyek=" + namaProyek + ", periode="
				+ periode + ", biayaLangsung=" + biayaLangsung
				+ ", biayaTakLangsung=" + biayaTakLangsung + ", totalBiaya="
				+ totalBiaya + "]";
	}

}
