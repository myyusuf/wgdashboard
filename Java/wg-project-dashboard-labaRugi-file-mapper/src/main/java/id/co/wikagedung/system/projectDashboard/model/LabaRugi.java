package id.co.wikagedung.system.projectDashboard.model;

public class LabaRugi {

	private String id;
	private String namaProyek;
	private String periode;
	private Double rkp;
	private Double sampaiTahunLalu;
	private Double bulanLalu;
	private Double bulanIni;
	private Double sampaiBulanIni;
	private Double sampaiTahunIni;
	private String kodeUraian;

	public LabaRugi() {
	}

	public LabaRugi(String id, String namaProyek, String periode, Double rkp,
			Double sampaiTahunLalu, Double bulanLalu, Double bulanIni,
			Double sampaiBulanIni, Double sampaiTahunIni, String kodeUraian) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.rkp = rkp;
		this.sampaiTahunLalu = sampaiTahunLalu;
		this.bulanLalu = bulanLalu;
		this.bulanIni = bulanIni;
		this.sampaiBulanIni = sampaiBulanIni;
		this.sampaiTahunIni = sampaiTahunIni;
		this.kodeUraian = kodeUraian;
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

	public Double getRkp() {
		return rkp;
	}

	public void setRkp(Double rkp) {
		this.rkp = rkp;
	}

	public Double getSampaiTahunLalu() {
		return sampaiTahunLalu;
	}

	public void setSampaiTahunLalu(Double sampaiTahunLalu) {
		this.sampaiTahunLalu = sampaiTahunLalu;
	}

	public Double getBulanLalu() {
		return bulanLalu;
	}

	public void setBulanLalu(Double bulanLalu) {
		this.bulanLalu = bulanLalu;
	}

	public Double getBulanIni() {
		return bulanIni;
	}

	public void setBulanIni(Double bulanIni) {
		this.bulanIni = bulanIni;
	}

	public Double getSampaiBulanIni() {
		return sampaiBulanIni;
	}

	public void setSampaiBulanIni(Double sampaiBulanIni) {
		this.sampaiBulanIni = sampaiBulanIni;
	}

	public Double getSampaiTahunIni() {
		return sampaiTahunIni;
	}

	public void setSampaiTahunIni(Double sampaiTahunIni) {
		this.sampaiTahunIni = sampaiTahunIni;
	}

	public String getKodeUraian() {
		return kodeUraian;
	}

	public void setKodeUraian(String kodeUraian) {
		this.kodeUraian = kodeUraian;
	}

	@Override
	public String toString() {
		return "LabaRugi [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", rkp=" + rkp
				+ ", sampaiTahunLalu=" + sampaiTahunLalu + ", bulanLalu="
				+ bulanLalu + ", bulanIni=" + bulanIni + ", sampaiBulanIni="
				+ sampaiBulanIni + ", sampaiTahunIni=" + sampaiTahunIni
				+ ", kodeUraian=" + kodeUraian + "]";
	}

}
