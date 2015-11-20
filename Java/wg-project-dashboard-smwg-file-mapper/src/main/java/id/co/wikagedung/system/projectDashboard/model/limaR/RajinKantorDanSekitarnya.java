package id.co.wikagedung.system.projectDashboard.model.limaR;

public class RajinKantorDanSekitarnya {

	private String id;
	private String namaProyek;
	private String periode;
	private Double pelaksanaan;
	private Double musholla;
	private Double toilet;

	public RajinKantorDanSekitarnya() {
	}

	public RajinKantorDanSekitarnya(String id, String namaProyek,
			String periode, Double pelaksanaan, Double musholla, Double toilet) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.pelaksanaan = pelaksanaan;
		this.musholla = musholla;
		this.toilet = toilet;
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

	public Double getPelaksanaan() {
		return pelaksanaan;
	}

	public void setPelaksanaan(Double pelaksanaan) {
		this.pelaksanaan = pelaksanaan;
	}

	public Double getMusholla() {
		return musholla;
	}

	public void setMusholla(Double musholla) {
		this.musholla = musholla;
	}

	public Double getToilet() {
		return toilet;
	}

	public void setToilet(Double toilet) {
		this.toilet = toilet;
	}

	@Override
	public String toString() {
		return "RajinKantorDanSekitarnya [id=" + id + ", namaProyek="
				+ namaProyek + ", periode=" + periode + ", pelaksanaan="
				+ pelaksanaan + ", musholla=" + musholla + ", toilet=" + toilet
				+ "]";
	}

}
