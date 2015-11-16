package id.co.wikagedung.system.projectDashboard.model;

public class TotalOk {

	private String id;
	private String namaProyek;
	private String periode;
	private Double rkpAwal;
	private Double rencanaSampaiBulanIni;
	private Double realisasiSampaiBulanLalu;
	private Double realisasiBulanIni;
	private Double realisasiSampaiBulanIni;
	private Double proyeksi;

	public TotalOk() {
	}

	public TotalOk(String id, String namaProyek, String periode,
			Double rkpAwal, Double rencanaSampaiBulanIni,
			Double realisasiSampaiBulanLalu, Double realisasiBulanIni,
			Double realisasiSampaiBulanIni, Double proyeksi) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.rkpAwal = rkpAwal;
		this.rencanaSampaiBulanIni = rencanaSampaiBulanIni;
		this.realisasiSampaiBulanLalu = realisasiSampaiBulanLalu;
		this.realisasiBulanIni = realisasiBulanIni;
		this.realisasiSampaiBulanIni = realisasiSampaiBulanIni;
		this.proyeksi = proyeksi;
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

	public Double getRkpAwal() {
		return rkpAwal;
	}

	public void setRkpAwal(Double rkpAwal) {
		this.rkpAwal = rkpAwal;
	}

	public Double getRencanaSampaiBulanIni() {
		return rencanaSampaiBulanIni;
	}

	public void setRencanaSampaiBulanIni(Double rencanaSampaiBulanIni) {
		this.rencanaSampaiBulanIni = rencanaSampaiBulanIni;
	}

	public Double getRealisasiSampaiBulanLalu() {
		return realisasiSampaiBulanLalu;
	}

	public void setRealisasiSampaiBulanLalu(Double realisasiSampaiBulanLalu) {
		this.realisasiSampaiBulanLalu = realisasiSampaiBulanLalu;
	}

	public Double getRealisasiBulanIni() {
		return realisasiBulanIni;
	}

	public void setRealisasiBulanIni(Double realisasiBulanIni) {
		this.realisasiBulanIni = realisasiBulanIni;
	}

	public Double getRealisasiSampaiBulanIni() {
		return realisasiSampaiBulanIni;
	}

	public void setRealisasiSampaiBulanIni(Double realisasiSampaiBulanIni) {
		this.realisasiSampaiBulanIni = realisasiSampaiBulanIni;
	}

	public Double getProyeksi() {
		return proyeksi;
	}

	public void setProyeksi(Double proyeksi) {
		this.proyeksi = proyeksi;
	}

	@Override
	public String toString() {
		return "TotalOK [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", rkpAwal=" + rkpAwal
				+ ", rencanaSampaiBulanIni=" + rencanaSampaiBulanIni
				+ ", realisasiSampaiBulanLalu=" + realisasiSampaiBulanLalu
				+ ", realisasiBulanIni=" + realisasiBulanIni
				+ ", realisasiSampaiBulanIni=" + realisasiSampaiBulanIni
				+ ", proyeksi=" + proyeksi + "]";
	}

}
