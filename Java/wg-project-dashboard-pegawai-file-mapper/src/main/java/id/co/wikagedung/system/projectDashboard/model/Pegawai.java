package id.co.wikagedung.system.projectDashboard.model;

public class Pegawai {

	private String id;
	private String namaProyek;
	private String periode;
	private String jabatan;
	private String subJabatan;
	private String nama;
	private String nip;
	private String statusPendidikan;

	public Pegawai() {

	}

	public Pegawai(String id, String namaProyek, String periode,
			String jabatan, String subJabatan, String nama, String nip,
			String statusPendidikan) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.jabatan = jabatan;
		this.subJabatan = subJabatan;
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

	public String getJabatan() {
		return jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}

	public String getSubJabatan() {
		return subJabatan;
	}

	public void setSubJabatan(String subJabatan) {
		this.subJabatan = subJabatan;
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
		return "Pegawai [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", jabatan=" + jabatan
				+ ", subJabatan=" + subJabatan + ", nama=" + nama + ", nip="
				+ nip + ", statusPendidikan=" + statusPendidikan + "]";
	}

}
