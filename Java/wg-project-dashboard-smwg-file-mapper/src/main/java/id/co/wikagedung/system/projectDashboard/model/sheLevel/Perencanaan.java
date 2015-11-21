package id.co.wikagedung.system.projectDashboard.model.sheLevel;

public class Perencanaan {

	private String id;
	private String namaProyek;
	private String periode;
	private Double hirarcDanAspectImpactIdentification;
	private Double identifikasiPersyaratanHukumDanAturannya;
	private Double sasaranShe;
	private Double programManajemenShe;

	public Perencanaan() {
	}

	public Perencanaan(String id, String namaProyek, String periode,
			Double hirarcDanAspectImpactIdentification,
			Double identifikasiPersyaratanHukumDanAturannya, Double sasaranShe,
			Double programManajemenShe) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.hirarcDanAspectImpactIdentification = hirarcDanAspectImpactIdentification;
		this.identifikasiPersyaratanHukumDanAturannya = identifikasiPersyaratanHukumDanAturannya;
		this.sasaranShe = sasaranShe;
		this.programManajemenShe = programManajemenShe;
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

	public Double getHirarcDanAspectImpactIdentification() {
		return hirarcDanAspectImpactIdentification;
	}

	public void setHirarcDanAspectImpactIdentification(
			Double hirarcDanAspectImpactIdentification) {
		this.hirarcDanAspectImpactIdentification = hirarcDanAspectImpactIdentification;
	}

	public Double getIdentifikasiPersyaratanHukumDanAturannya() {
		return identifikasiPersyaratanHukumDanAturannya;
	}

	public void setIdentifikasiPersyaratanHukumDanAturannya(
			Double identifikasiPersyaratanHukumDanAturannya) {
		this.identifikasiPersyaratanHukumDanAturannya = identifikasiPersyaratanHukumDanAturannya;
	}

	public Double getSasaranShe() {
		return sasaranShe;
	}

	public void setSasaranShe(Double sasaranShe) {
		this.sasaranShe = sasaranShe;
	}

	public Double getProgramManajemenShe() {
		return programManajemenShe;
	}

	public void setProgramManajemenShe(Double programManajemenShe) {
		this.programManajemenShe = programManajemenShe;
	}

	@Override
	public String toString() {
		return "Perencanaan [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode
				+ ", hirarcDanAspectImpactIdentification="
				+ hirarcDanAspectImpactIdentification
				+ ", identifikasiPersyaratanHukumDanAturannya="
				+ identifikasiPersyaratanHukumDanAturannya + ", sasaranShe="
				+ sasaranShe + ", programManajemenShe=" + programManajemenShe
				+ "]";
	}

}
