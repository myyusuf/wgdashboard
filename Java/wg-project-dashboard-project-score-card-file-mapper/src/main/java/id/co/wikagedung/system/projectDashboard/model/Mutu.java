package id.co.wikagedung.system.projectDashboard.model;

public class Mutu {

	private String id;
	private String namaProyek;
	private String periode;
	private Double targetRkp;
	private Double targetPeriodikRencana;
	private Double targetPeriodikRealisasi;
	private Double targetPeriodikProsentase;
	private Double nilai;
	private Double bobotKpi;
	private Double scoreRencana;
	private Double scoreRealisasi;
	private String upjFungsi;
	private String level;

	public Mutu() {
	}

	public Mutu(String id, String namaProyek, String periode, Double targetRkp,
			Double targetPeriodikRencana, Double targetPeriodikRealisasi,
			Double targetPeriodikProsentase, Double nilai, Double bobotKpi,
			Double scoreRencana, Double scoreRealisasi, String upjFungsi,
			String level) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.targetRkp = targetRkp;
		this.targetPeriodikRencana = targetPeriodikRencana;
		this.targetPeriodikRealisasi = targetPeriodikRealisasi;
		this.targetPeriodikProsentase = targetPeriodikProsentase;
		this.nilai = nilai;
		this.bobotKpi = bobotKpi;
		this.scoreRencana = scoreRencana;
		this.scoreRealisasi = scoreRealisasi;
		this.upjFungsi = upjFungsi;
		this.level = level;
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

	public Double getTargetRkp() {
		return targetRkp;
	}

	public void setTargetRkp(Double targetRkp) {
		this.targetRkp = targetRkp;
	}

	public Double getTargetPeriodikRencana() {
		return targetPeriodikRencana;
	}

	public void setTargetPeriodikRencana(Double targetPeriodikRencana) {
		this.targetPeriodikRencana = targetPeriodikRencana;
	}

	public Double getTargetPeriodikRealisasi() {
		return targetPeriodikRealisasi;
	}

	public void setTargetPeriodikRealisasi(Double targetPeriodikRealisasi) {
		this.targetPeriodikRealisasi = targetPeriodikRealisasi;
	}

	public Double getTargetPeriodikProsentase() {
		return targetPeriodikProsentase;
	}

	public void setTargetPeriodikProsentase(Double targetPeriodikProsentase) {
		this.targetPeriodikProsentase = targetPeriodikProsentase;
	}

	public Double getNilai() {
		return nilai;
	}

	public void setNilai(Double nilai) {
		this.nilai = nilai;
	}

	public Double getBobotKpi() {
		return bobotKpi;
	}

	public void setBobotKpi(Double bobotKpi) {
		this.bobotKpi = bobotKpi;
	}

	public Double getScoreRencana() {
		return scoreRencana;
	}

	public void setScoreRencana(Double scoreRencana) {
		this.scoreRencana = scoreRencana;
	}

	public Double getScoreRealisasi() {
		return scoreRealisasi;
	}

	public void setScoreRealisasi(Double scoreRealisasi) {
		this.scoreRealisasi = scoreRealisasi;
	}

	public String getUpjFungsi() {
		return upjFungsi;
	}

	public void setUpjFungsi(String upjFungsi) {
		this.upjFungsi = upjFungsi;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Mutu [id=" + id + ", namaProyek=" + namaProyek + ", periode="
				+ periode + ", targetRkp=" + targetRkp
				+ ", targetPeriodikRencana=" + targetPeriodikRencana
				+ ", targetPeriodikRealisasi=" + targetPeriodikRealisasi
				+ ", targetPeriodikProsentase=" + targetPeriodikProsentase
				+ ", nilai=" + nilai + ", bobotKpi=" + bobotKpi
				+ ", scoreRencana=" + scoreRencana + ", scoreRealisasi="
				+ scoreRealisasi + ", upjFungsi=" + upjFungsi + ", level="
				+ level + "]";
	}

}
