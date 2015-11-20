package id.co.wikagedung.system.projectDashboard.model.limaR;

public class ResikKriteriaTambahan {

	private String id;
	private String namaProyek;
	private String periode;
	private Double workshop;
	private Double sisaMaterialDanSampah;
	private Double jalanUmum;
	private Double perancah;
	private Double jalanKerjaDanTba;
	private Double jalurKabel;
	private Double jalurDewatering;
	private Double areaPengecoran;
	private Double safetyLineDanToloTolo;

	public ResikKriteriaTambahan() {
	}

	public ResikKriteriaTambahan(String id, String namaProyek, String periode,
			Double workshop, Double sisaMaterialDanSampah, Double jalanUmum,
			Double perancah, Double jalanKerjaDanTba, Double jalurKabel,
			Double jalurDewatering, Double areaPengecoran,
			Double safetyLineDanToloTolo) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.workshop = workshop;
		this.sisaMaterialDanSampah = sisaMaterialDanSampah;
		this.jalanUmum = jalanUmum;
		this.perancah = perancah;
		this.jalanKerjaDanTba = jalanKerjaDanTba;
		this.jalurKabel = jalurKabel;
		this.jalurDewatering = jalurDewatering;
		this.areaPengecoran = areaPengecoran;
		this.safetyLineDanToloTolo = safetyLineDanToloTolo;
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

	public Double getWorkshop() {
		return workshop;
	}

	public void setWorkshop(Double workshop) {
		this.workshop = workshop;
	}

	public Double getSisaMaterialDanSampah() {
		return sisaMaterialDanSampah;
	}

	public void setSisaMaterialDanSampah(Double sisaMaterialDanSampah) {
		this.sisaMaterialDanSampah = sisaMaterialDanSampah;
	}

	public Double getJalanUmum() {
		return jalanUmum;
	}

	public void setJalanUmum(Double jalanUmum) {
		this.jalanUmum = jalanUmum;
	}

	public Double getPerancah() {
		return perancah;
	}

	public void setPerancah(Double perancah) {
		this.perancah = perancah;
	}

	public Double getJalanKerjaDanTba() {
		return jalanKerjaDanTba;
	}

	public void setJalanKerjaDanTba(Double jalanKerjaDanTba) {
		this.jalanKerjaDanTba = jalanKerjaDanTba;
	}

	public Double getJalurKabel() {
		return jalurKabel;
	}

	public void setJalurKabel(Double jalurKabel) {
		this.jalurKabel = jalurKabel;
	}

	public Double getJalurDewatering() {
		return jalurDewatering;
	}

	public void setJalurDewatering(Double jalurDewatering) {
		this.jalurDewatering = jalurDewatering;
	}

	public Double getAreaPengecoran() {
		return areaPengecoran;
	}

	public void setAreaPengecoran(Double areaPengecoran) {
		this.areaPengecoran = areaPengecoran;
	}

	public Double getSafetyLineDanToloTolo() {
		return safetyLineDanToloTolo;
	}

	public void setSafetyLineDanToloTolo(Double safetyLineDanToloTolo) {
		this.safetyLineDanToloTolo = safetyLineDanToloTolo;
	}

	@Override
	public String toString() {
		return "ResikKriteriaTambahan [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", workshop=" + workshop
				+ ", sisaMaterialDanSampah=" + sisaMaterialDanSampah
				+ ", jalanUmum=" + jalanUmum + ", perancah=" + perancah
				+ ", jalanKerjaDanTba=" + jalanKerjaDanTba + ", jalurKabel="
				+ jalurKabel + ", jalurDewatering=" + jalurDewatering
				+ ", areaPengecoran=" + areaPengecoran
				+ ", safetyLineDanToloTolo=" + safetyLineDanToloTolo + "]";
	}

}
