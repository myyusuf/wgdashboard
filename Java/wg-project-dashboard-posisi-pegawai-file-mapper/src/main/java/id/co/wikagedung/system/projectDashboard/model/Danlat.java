package id.co.wikagedung.system.projectDashboard.model;

public class Danlat {

	private String id;
	private String namaProyek;
	private String periode;
	private String nama;
	private String nip;
	private String statusPendidikan;

	public Danlat() {
	}

	public Danlat(String id, String namaProyek, String periode, String nama,
			String nip, String statusPendidikan) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.nama = nama;
		this.nip = nip;
		this.statusPendidikan = statusPendidikan;
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

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getStatusPendidikan() {
		return statusPendidikan;
	}

	public void setStatusPendidikan(String statusPendidikan) {
		this.statusPendidikan = statusPendidikan;
	}

	@Override
	public String toString() {
		return "ManajerProyek [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", nama=" + nama + ", nip=" + nip
				+ ", statusPendidikan=" + statusPendidikan + "]";
	}

}
