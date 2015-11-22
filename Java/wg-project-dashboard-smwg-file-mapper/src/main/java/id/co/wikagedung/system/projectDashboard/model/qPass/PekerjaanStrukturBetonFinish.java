package id.co.wikagedung.system.projectDashboard.model.qPass;

public class PekerjaanStrukturBetonFinish {

	private String id;
	private String namaProyek;
	private String periode;
	private Double jumlahSampelRencana;
	private Double jumlahSampeSampaiBulanIniRealisasi;
	private Double jumlahItemPenilaian;
	private Double jumlahItemDiterima;
	private Double bobotProsentaseSatu;
	private Double bobotProsentaseDua;
	private Double dataAssesTotalMemenuhiSyarat;
	private Double dataAssesTotalJumlahItemDicek;
	private Double dataAssesBobot;
	private Double prosentaseDiterima;
	private Double point;
	private Double score;
	private Double total;

	public PekerjaanStrukturBetonFinish() {
	}

	public PekerjaanStrukturBetonFinish(String id, String namaProyek,
			String periode, Double jumlahSampelRencana,
			Double jumlahSampeSampaiBulanIniRealisasi,
			Double jumlahItemPenilaian, Double jumlahItemDiterima,
			Double bobotProsentaseSatu, Double bobotProsentaseDua,
			Double dataAssesTotalMemenuhiSyarat,
			Double dataAssesTotalJumlahItemDicek, Double dataAssesBobot,
			Double prosentaseDiterima, Double point, Double score, Double total) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.jumlahSampelRencana = jumlahSampelRencana;
		this.jumlahSampeSampaiBulanIniRealisasi = jumlahSampeSampaiBulanIniRealisasi;
		this.jumlahItemPenilaian = jumlahItemPenilaian;
		this.jumlahItemDiterima = jumlahItemDiterima;
		this.bobotProsentaseSatu = bobotProsentaseSatu;
		this.bobotProsentaseDua = bobotProsentaseDua;
		this.dataAssesTotalMemenuhiSyarat = dataAssesTotalMemenuhiSyarat;
		this.dataAssesTotalJumlahItemDicek = dataAssesTotalJumlahItemDicek;
		this.dataAssesBobot = dataAssesBobot;
		this.prosentaseDiterima = prosentaseDiterima;
		this.point = point;
		this.score = score;
		this.total = total;
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

	public Double getJumlahSampelRencana() {
		return jumlahSampelRencana;
	}

	public void setJumlahSampelRencana(Double jumlahSampelRencana) {
		this.jumlahSampelRencana = jumlahSampelRencana;
	}

	public Double getJumlahSampeSampaiBulanIniRealisasi() {
		return jumlahSampeSampaiBulanIniRealisasi;
	}

	public void setJumlahSampeSampaiBulanIniRealisasi(
			Double jumlahSampeSampaiBulanIniRealisasi) {
		this.jumlahSampeSampaiBulanIniRealisasi = jumlahSampeSampaiBulanIniRealisasi;
	}

	public Double getJumlahItemPenilaian() {
		return jumlahItemPenilaian;
	}

	public void setJumlahItemPenilaian(Double jumlahItemPenilaian) {
		this.jumlahItemPenilaian = jumlahItemPenilaian;
	}

	public Double getJumlahItemDiterima() {
		return jumlahItemDiterima;
	}

	public void setJumlahItemDiterima(Double jumlahItemDiterima) {
		this.jumlahItemDiterima = jumlahItemDiterima;
	}

	public Double getBobotProsentaseSatu() {
		return bobotProsentaseSatu;
	}

	public void setBobotProsentaseSatu(Double bobotProsentaseSatu) {
		this.bobotProsentaseSatu = bobotProsentaseSatu;
	}

	public Double getBobotProsentaseDua() {
		return bobotProsentaseDua;
	}

	public void setBobotProsentaseDua(Double bobotProsentaseDua) {
		this.bobotProsentaseDua = bobotProsentaseDua;
	}

	public Double getDataAssesTotalMemenuhiSyarat() {
		return dataAssesTotalMemenuhiSyarat;
	}

	public void setDataAssesTotalMemenuhiSyarat(
			Double dataAssesTotalMemenuhiSyarat) {
		this.dataAssesTotalMemenuhiSyarat = dataAssesTotalMemenuhiSyarat;
	}

	public Double getDataAssesTotalJumlahItemDicek() {
		return dataAssesTotalJumlahItemDicek;
	}

	public void setDataAssesTotalJumlahItemDicek(
			Double dataAssesTotalJumlahItemDicek) {
		this.dataAssesTotalJumlahItemDicek = dataAssesTotalJumlahItemDicek;
	}

	public Double getDataAssesBobot() {
		return dataAssesBobot;
	}

	public void setDataAssesBobot(Double dataAssesBobot) {
		this.dataAssesBobot = dataAssesBobot;
	}

	public Double getProsentaseDiterima() {
		return prosentaseDiterima;
	}

	public void setProsentaseDiterima(Double prosentaseDiterima) {
		this.prosentaseDiterima = prosentaseDiterima;
	}

	public Double getPoint() {
		return point;
	}

	public void setPoint(Double point) {
		this.point = point;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "PekerjaanStrukturBetonFinish [id=" + id + ", namaProyek="
				+ namaProyek + ", periode=" + periode
				+ ", jumlahSampelRencana=" + jumlahSampelRencana
				+ ", jumlahSampeSampaiBulanIniRealisasi="
				+ jumlahSampeSampaiBulanIniRealisasi + ", jumlahItemPenilaian="
				+ jumlahItemPenilaian + ", jumlahItemDiterima="
				+ jumlahItemDiterima + ", bobotProsentaseSatu="
				+ bobotProsentaseSatu + ", bobotProsentaseDua="
				+ bobotProsentaseDua + ", dataAssesTotalMemenuhiSyarat="
				+ dataAssesTotalMemenuhiSyarat
				+ ", dataAssesTotalJumlahItemDicek="
				+ dataAssesTotalJumlahItemDicek + ", dataAssesBobot="
				+ dataAssesBobot + ", prosentaseDiterima=" + prosentaseDiterima
				+ ", point=" + point + ", score=" + score + ", total=" + total
				+ "]";
	}

}
