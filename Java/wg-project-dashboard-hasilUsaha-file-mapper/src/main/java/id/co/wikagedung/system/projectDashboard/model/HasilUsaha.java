package id.co.wikagedung.system.projectDashboard.model;

public class HasilUsaha {

	private String id;
	private String namaProyek;
	private String periode;
	private Double bulanKe;
	private Double okAwal;
	private Double okAdd;
	private Double opRaRp;
	private Double opRaProsentase;
	private Double opRiRp;
	private Double opRiProsentase;
	private Double lkRaRp;
	private Double lkRaProsentase;
	private Double lkRiRp;
	private Double lkRiProsentase;

	public HasilUsaha() {
	}

	public HasilUsaha(String id, String namaProyek, String periode,
			Double bulanKe, Double okAwal, Double okAdd, Double opRaRp,
			Double opRaProsentase, Double opRiRp, Double opRiProsentase,
			Double lkRaRp, Double lkRaProsentase, Double lkRiRp,
			Double lkRiProsentase) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.bulanKe = bulanKe;
		this.okAwal = okAwal;
		this.okAdd = okAdd;
		this.opRaRp = opRaRp;
		this.opRaProsentase = opRaProsentase;
		this.opRiRp = opRiRp;
		this.opRiProsentase = opRiProsentase;
		this.lkRaRp = lkRaRp;
		this.lkRaProsentase = lkRaProsentase;
		this.lkRiRp = lkRiRp;
		this.lkRiProsentase = lkRiProsentase;
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

	public Double getBulanKe() {
		return bulanKe;
	}

	public void setBulanKe(Double bulanKe) {
		this.bulanKe = bulanKe;
	}

	public Double getOkAwal() {
		return okAwal;
	}

	public void setOkAwal(Double okAwal) {
		this.okAwal = okAwal;
	}

	public Double getOkAdd() {
		return okAdd;
	}

	public void setOkAdd(Double okAdd) {
		this.okAdd = okAdd;
	}

	public Double getOpRaRp() {
		return opRaRp;
	}

	public void setOpRaRp(Double opRaRp) {
		this.opRaRp = opRaRp;
	}

	public Double getOpRaProsentase() {
		return opRaProsentase;
	}

	public void setOpRaProsentase(Double opRaProsentase) {
		this.opRaProsentase = opRaProsentase;
	}

	public Double getOpRiRp() {
		return opRiRp;
	}

	public void setOpRiRp(Double opRiRp) {
		this.opRiRp = opRiRp;
	}

	public Double getOpRiProsentase() {
		return opRiProsentase;
	}

	public void setOpRiProsentase(Double opRiProsentase) {
		this.opRiProsentase = opRiProsentase;
	}

	public Double getLkRaRp() {
		return lkRaRp;
	}

	public void setLkRaRp(Double lkRaRp) {
		this.lkRaRp = lkRaRp;
	}

	public Double getLkRaProsentase() {
		return lkRaProsentase;
	}

	public void setLkRaProsentase(Double lkRaProsentase) {
		this.lkRaProsentase = lkRaProsentase;
	}

	public Double getLkRiRp() {
		return lkRiRp;
	}

	public void setLkRiRp(Double lkRiRp) {
		this.lkRiRp = lkRiRp;
	}

	public Double getLkRiProsentase() {
		return lkRiProsentase;
	}

	public void setLkRiProsentase(Double lkRiProsentase) {
		this.lkRiProsentase = lkRiProsentase;
	}

	@Override
	public String toString() {
		return "HasilUsaha [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", bulanKe=" + bulanKe + ", okAwal="
				+ okAwal + ", okAdd=" + okAdd + ", opRaRp=" + opRaRp
				+ ", opRaProsentase=" + opRaProsentase + ", opRiRp=" + opRiRp
				+ ", opRiProsentase=" + opRiProsentase + ", lkRaRp=" + lkRaRp
				+ ", lkRaProsentase=" + lkRaProsentase + ", lkRiRp=" + lkRiRp
				+ ", lkRiProsentase=" + lkRiProsentase + "]";
	}

}
