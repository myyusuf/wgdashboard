package id.co.wikagedung.system.projectDashboard.model.qmsl;

public class ManajerKepalaProyek {

	private String id;
	private String namaProyek;
	private String periode;
	private Double prosesPersiapan;
	private Double prosesRkp;
	private Double prosesManajemenReview;
	private Double prosesRoleModel;
	private Double prosesScoreCard;
	private Double resultMutu;
	private Double resultWaktu;
	private Double resultBiaya;
	private Double subTotal;

	public ManajerKepalaProyek() {
	}

	public ManajerKepalaProyek(String id, String namaProyek, String periode,
			Double prosesPersiapan, Double prosesRkp,
			Double prosesManajemenReview, Double prosesRoleModel,
			Double prosesScoreCard, Double resultMutu, Double resultWaktu,
			Double resultBiaya, Double subTotal) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.prosesPersiapan = prosesPersiapan;
		this.prosesRkp = prosesRkp;
		this.prosesManajemenReview = prosesManajemenReview;
		this.prosesRoleModel = prosesRoleModel;
		this.prosesScoreCard = prosesScoreCard;
		this.resultMutu = resultMutu;
		this.resultWaktu = resultWaktu;
		this.resultBiaya = resultBiaya;
		this.subTotal = subTotal;
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

	public Double getProsesPersiapan() {
		return prosesPersiapan;
	}

	public void setProsesPersiapan(Double prosesPersiapan) {
		this.prosesPersiapan = prosesPersiapan;
	}

	public Double getProsesRkp() {
		return prosesRkp;
	}

	public void setProsesRkp(Double prosesRkp) {
		this.prosesRkp = prosesRkp;
	}

	public Double getProsesManajemenReview() {
		return prosesManajemenReview;
	}

	public void setProsesManajemenReview(Double prosesManajemenReview) {
		this.prosesManajemenReview = prosesManajemenReview;
	}

	public Double getProsesRoleModel() {
		return prosesRoleModel;
	}

	public void setProsesRoleModel(Double prosesRoleModel) {
		this.prosesRoleModel = prosesRoleModel;
	}

	public Double getProsesScoreCard() {
		return prosesScoreCard;
	}

	public void setProsesScoreCard(Double prosesScoreCard) {
		this.prosesScoreCard = prosesScoreCard;
	}

	public Double getResultMutu() {
		return resultMutu;
	}

	public void setResultMutu(Double resultMutu) {
		this.resultMutu = resultMutu;
	}

	public Double getResultWaktu() {
		return resultWaktu;
	}

	public void setResultWaktu(Double resultWaktu) {
		this.resultWaktu = resultWaktu;
	}

	public Double getResultBiaya() {
		return resultBiaya;
	}

	public void setResultBiaya(Double resultBiaya) {
		this.resultBiaya = resultBiaya;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "ManajerKepalaProyek [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", prosesPersiapan="
				+ prosesPersiapan + ", prosesRkp=" + prosesRkp
				+ ", prosesManajemenReview=" + prosesManajemenReview
				+ ", prosesRoleModel=" + prosesRoleModel + ", prosesScoreCard="
				+ prosesScoreCard + ", resultMutu=" + resultMutu
				+ ", resultWaktu=" + resultWaktu + ", resultBiaya="
				+ resultBiaya + ", subTotal=" + subTotal + "]";
	}

}
