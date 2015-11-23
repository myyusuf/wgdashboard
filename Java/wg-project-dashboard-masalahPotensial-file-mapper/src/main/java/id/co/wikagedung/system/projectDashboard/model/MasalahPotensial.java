package id.co.wikagedung.system.projectDashboard.model;

public class MasalahPotensial {

	private String id;
	private String namaProyek;
	private String periode;
	private String butiranMasalah;
	private String usulanPemecahan;
	private String targetPenyelesaian;

	public MasalahPotensial() {
	}

	public MasalahPotensial(String id, String namaProyek, String periode,
			String butiranMasalah, String usulanPemecahan,
			String targetPenyelesaian) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.butiranMasalah = butiranMasalah;
		this.usulanPemecahan = usulanPemecahan;
		this.targetPenyelesaian = targetPenyelesaian;
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

	public String getButiranMasalah() {
		return butiranMasalah;
	}

	public void setButiranMasalah(String butiranMasalah) {
		this.butiranMasalah = butiranMasalah;
	}

	public String getUsulanPemecahan() {
		return usulanPemecahan;
	}

	public void setUsulanPemecahan(String usulanPemecahan) {
		this.usulanPemecahan = usulanPemecahan;
	}

	public String getTargetPenyelesaian() {
		return targetPenyelesaian;
	}

	public void setTargetPenyelesaian(String targetPenyelesaian) {
		this.targetPenyelesaian = targetPenyelesaian;
	}

	@Override
	public String toString() {
		return "MasalahPotensial [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", butiranMasalah=" + butiranMasalah
				+ ", usulanPemecahan=" + usulanPemecahan
				+ ", targetPenyelesaian=" + targetPenyelesaian + "]";
	}

}
