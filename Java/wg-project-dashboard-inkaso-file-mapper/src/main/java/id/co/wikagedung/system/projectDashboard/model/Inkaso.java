package id.co.wikagedung.system.projectDashboard.model;

import java.util.List;

public class Inkaso {

	private String id;
	private String namaProyek;
	private String periode;
	private List<InkasoResume> inkasoResume;
	private List<InkasoDetail> inkasoDetail;

	public Inkaso() {

	}

	public Inkaso(String id, String namaProyek, String periode,
			List<InkasoResume> inkasoResume, List<InkasoDetail> inkasoDetail) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.inkasoResume = inkasoResume;
		this.inkasoDetail = inkasoDetail;
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

	public List<InkasoResume> getInkasoResume() {
		return inkasoResume;
	}

	public void setInkasoResume(List<InkasoResume> inkasoResume) {
		this.inkasoResume = inkasoResume;
	}

	public List<InkasoDetail> getInkasoDetail() {
		return inkasoDetail;
	}

	public void setInkasoDetail(List<InkasoDetail> inkasoDetail) {
		this.inkasoDetail = inkasoDetail;
	}

	@Override
	public String toString() {
		return "Inkaso [id=" + id + ", namaProyek=" + namaProyek + ", periode="
				+ periode + ", inkasoResume=" + inkasoResume
				+ ", inkasoDetail=" + inkasoDetail + "]";
	}

}
