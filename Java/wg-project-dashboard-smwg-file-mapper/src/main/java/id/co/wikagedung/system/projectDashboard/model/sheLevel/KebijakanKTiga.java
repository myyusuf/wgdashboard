package id.co.wikagedung.system.projectDashboard.model.sheLevel;

public class KebijakanKTiga {

	private String id;
	private String namaProyek;
	private String periode;
	private Double kebijakanShe;

	public KebijakanKTiga() {
	}

	public KebijakanKTiga(String id, String namaProyek, String periode,
			Double kebijakanShe) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.kebijakanShe = kebijakanShe;
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

	public Double getKebijakanShe() {
		return kebijakanShe;
	}

	public void setKebijakanShe(Double kebijakanShe) {
		this.kebijakanShe = kebijakanShe;
	}

	@Override
	public String toString() {
		return "KebijakanKTiga [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", kebijakanShe=" + kebijakanShe
				+ "]";
	}

}
