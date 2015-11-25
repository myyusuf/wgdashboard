package id.co.wikagedung.system.projectDashboard.model;

public class PosisiPegawai {

	private String id;
	private String namaProyek;
	private String periode;
	private Integer row;
	private String jabatan;
	private String nama;
	private String nip;
	private String pendidikan;

	public PosisiPegawai() {
	}

	public PosisiPegawai(String id, String namaProyek, String periode,
			Integer row, String jabatan, String nama, String nip,
			String pendidikan) {
		super();
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.row = row;
		this.jabatan = jabatan;
		this.nama = nama;
		this.nip = nip;
		this.pendidikan = pendidikan;
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

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public String getJabatan() {
		return jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
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

	public String getPendidikan() {
		return pendidikan;
	}

	public void setPendidikan(String pendidikan) {
		this.pendidikan = pendidikan;
	}

	@Override
	public String toString() {
		return "PosisiPegawai [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", row=" + row + ", jabatan="
				+ jabatan + ", nama=" + nama + ", nip=" + nip + ", pendidikan="
				+ pendidikan + "]";
	}

}
