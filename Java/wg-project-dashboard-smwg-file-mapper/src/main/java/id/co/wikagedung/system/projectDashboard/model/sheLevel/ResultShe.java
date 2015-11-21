package id.co.wikagedung.system.projectDashboard.model.sheLevel;

public class ResultShe {

	private String id;
	private String namaProyek;
	private String periode;
	private Double resultShe;

	public ResultShe() {
	}

	public ResultShe(String id, String namaProyek, String periode,
			Double resultShe) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.resultShe = resultShe;
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

	public Double getResultShe() {
		return resultShe;
	}

	public void setResultShe(Double resultShe) {
		this.resultShe = resultShe;
	}

	@Override
	public String toString() {
		return "ResultShe [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", resultShe=" + resultShe + "]";
	}

}
