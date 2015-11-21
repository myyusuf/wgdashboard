package id.co.wikagedung.system.projectDashboard.model.qmsl;

public class FungsiQa {

	private String id;
	private String namaProyek;
	private String periode;
	private Double qPlan;
	private Double aktivitasCppPtkp;
	private Double aktivitasPelaksanaanQplan;
	private Double kalibrasi;
	private Double auditInternalDanAuditEksternal;
	private Double pengendalianDokumenDanRekaman;
	private Double kepuasanPelanggan;
	private Double subTotal;

	public FungsiQa() {
	}

	public FungsiQa(String id, String namaProyek, String periode, Double qPlan,
			Double aktivitasCppPtkp, Double aktivitasPelaksanaanQplan,
			Double kalibrasi, Double auditInternalDanAuditEksternal,
			Double pengendalianDokumenDanRekaman, Double kepuasanPelanggan,
			Double subTotal) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.qPlan = qPlan;
		this.aktivitasCppPtkp = aktivitasCppPtkp;
		this.aktivitasPelaksanaanQplan = aktivitasPelaksanaanQplan;
		this.kalibrasi = kalibrasi;
		this.auditInternalDanAuditEksternal = auditInternalDanAuditEksternal;
		this.pengendalianDokumenDanRekaman = pengendalianDokumenDanRekaman;
		this.kepuasanPelanggan = kepuasanPelanggan;
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

	public Double getqPlan() {
		return qPlan;
	}

	public void setqPlan(Double qPlan) {
		this.qPlan = qPlan;
	}

	public Double getAktivitasCppPtkp() {
		return aktivitasCppPtkp;
	}

	public void setAktivitasCppPtkp(Double aktivitasCppPtkp) {
		this.aktivitasCppPtkp = aktivitasCppPtkp;
	}

	public Double getAktivitasPelaksanaanQplan() {
		return aktivitasPelaksanaanQplan;
	}

	public void setAktivitasPelaksanaanQplan(Double aktivitasPelaksanaanQplan) {
		this.aktivitasPelaksanaanQplan = aktivitasPelaksanaanQplan;
	}

	public Double getKalibrasi() {
		return kalibrasi;
	}

	public void setKalibrasi(Double kalibrasi) {
		this.kalibrasi = kalibrasi;
	}

	public Double getAuditInternalDanAuditEksternal() {
		return auditInternalDanAuditEksternal;
	}

	public void setAuditInternalDanAuditEksternal(
			Double auditInternalDanAuditEksternal) {
		this.auditInternalDanAuditEksternal = auditInternalDanAuditEksternal;
	}

	public Double getPengendalianDokumenDanRekaman() {
		return pengendalianDokumenDanRekaman;
	}

	public void setPengendalianDokumenDanRekaman(
			Double pengendalianDokumenDanRekaman) {
		this.pengendalianDokumenDanRekaman = pengendalianDokumenDanRekaman;
	}

	public Double getKepuasanPelanggan() {
		return kepuasanPelanggan;
	}

	public void setKepuasanPelanggan(Double kepuasanPelanggan) {
		this.kepuasanPelanggan = kepuasanPelanggan;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "FungsiQa [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", qPlan=" + qPlan
				+ ", aktivitasCppPtkp=" + aktivitasCppPtkp
				+ ", aktivitasPelaksanaanQplan=" + aktivitasPelaksanaanQplan
				+ ", kalibrasi=" + kalibrasi
				+ ", auditInternalDanAuditEksternal="
				+ auditInternalDanAuditEksternal
				+ ", pengendalianDokumenDanRekaman="
				+ pengendalianDokumenDanRekaman + ", kepuasanPelanggan="
				+ kepuasanPelanggan + ", subTotal=" + subTotal + "]";
	}

}
