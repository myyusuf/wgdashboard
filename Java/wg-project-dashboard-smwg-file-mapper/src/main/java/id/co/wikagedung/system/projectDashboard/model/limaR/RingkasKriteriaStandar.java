package id.co.wikagedung.system.projectDashboard.model.limaR;

public class RingkasKriteriaStandar {

	private String id;
	private String namaProyek;
	private String periode;
	private Double pagarProyek;
	private Double rambuDanSpanduk;
	private Double gudang;
	private Double posSatpam;
	private Double barakPekerja;

	public RingkasKriteriaStandar() {
	}

	public RingkasKriteriaStandar(String id, String namaProyek, String periode,
			Double pagarProyek, Double rambuDanSpanduk, Double gudang,
			Double posSatpam, Double barakPekerja) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.pagarProyek = pagarProyek;
		this.rambuDanSpanduk = rambuDanSpanduk;
		this.gudang = gudang;
		this.posSatpam = posSatpam;
		this.barakPekerja = barakPekerja;
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

	public Double getPagarProyek() {
		return pagarProyek;
	}

	public void setPagarProyek(Double pagarProyek) {
		this.pagarProyek = pagarProyek;
	}

	public Double getRambuDanSpanduk() {
		return rambuDanSpanduk;
	}

	public void setRambuDanSpanduk(Double rambuDanSpanduk) {
		this.rambuDanSpanduk = rambuDanSpanduk;
	}

	public Double getGudang() {
		return gudang;
	}

	public void setGudang(Double gudang) {
		this.gudang = gudang;
	}

	public Double getPosSatpam() {
		return posSatpam;
	}

	public void setPosSatpam(Double posSatpam) {
		this.posSatpam = posSatpam;
	}

	public Double getBarakPekerja() {
		return barakPekerja;
	}

	public void setBarakPekerja(Double barakPekerja) {
		this.barakPekerja = barakPekerja;
	}

	@Override
	public String toString() {
		return "KriteriaStandar [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", pagarProyek=" + pagarProyek
				+ ", rambuDanSpanduk=" + rambuDanSpanduk + ", gudang=" + gudang
				+ ", posSatpam=" + posSatpam + ", barakPekerja=" + barakPekerja
				+ "]";
	}

}
