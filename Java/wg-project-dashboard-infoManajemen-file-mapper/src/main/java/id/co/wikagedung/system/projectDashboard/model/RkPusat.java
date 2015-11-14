package id.co.wikagedung.system.projectDashboard.model;

public class RkPusat {

	private String id;
	private String namaProyek;
	private String periode;
	private Integer rkpAwal;
	private Integer rencanaSampaiBulanIni;
	private Integer realisasiSampaiBulanLalu;
	private Integer realisasiBulanIni;
	private Integer realisasiSampaiBulanIni;
	private Integer proyeksi;

	public RkPusat() {
	}

	public RkPusat(String id, String namaProyek, String periode,
			Integer rkpAwal, Integer rencanaSampaiBulanIni,
			Integer realisasiSampaiBulanLalu, Integer realisasiBulanIni,
			Integer realisasiSampaiBulanIni, Integer proyeksi) {
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

	public Integer getRkpAwal() {
		return rkpAwal;
	}

	public void setRkpAwal(Integer rkpAwal) {
		this.rkpAwal = rkpAwal;
	}

	public Integer getRencanaSampaiBulanIni() {
		return rencanaSampaiBulanIni;
	}

	public void setRencanaSampaiBulanIni(Integer rencanaSampaiBulanIni) {
		this.rencanaSampaiBulanIni = rencanaSampaiBulanIni;
	}

	public Integer getRealisasiSampaiBulanLalu() {
		return realisasiSampaiBulanLalu;
	}

	public void setRealisasiSampaiBulanLalu(Integer realisasiSampaiBulanLalu) {
		this.realisasiSampaiBulanLalu = realisasiSampaiBulanLalu;
	}

	public Integer getRealisasiBulanIni() {
		return realisasiBulanIni;
	}

	public void setRealisasiBulanIni(Integer realisasiBulanIni) {
		this.realisasiBulanIni = realisasiBulanIni;
	}

	public Integer getRealisasiSampaiBulanIni() {
		return realisasiSampaiBulanIni;
	}

	public void setRealisasiSampaiBulanIni(Integer realisasiSampaiBulanIni) {
		this.realisasiSampaiBulanIni = realisasiSampaiBulanIni;
	}

	public Integer getProyeksi() {
		return proyeksi;
	}

	public void setProyeksi(Integer proyeksi) {
		this.proyeksi = proyeksi;
	}

	@Override
	public String toString() {
		return "RkPusat [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", rkpAwal=" + rkpAwal
				+ ", rencanaSampaiBulanIni=" + rencanaSampaiBulanIni
				+ ", realisasiSampaiBulanLalu=" + realisasiSampaiBulanLalu
				+ ", realisasiBulanIni=" + realisasiBulanIni
				+ ", realisasiSampaiBulanIni=" + realisasiSampaiBulanIni
				+ ", proyeksi=" + proyeksi + "]";
	}

}
