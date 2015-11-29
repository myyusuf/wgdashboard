package id.co.wikagedung.system.projectDashboard.model;

import java.util.List;

public class VOResume {

	private String id;
	private String namaProyek;
	private String periode;
	private Double okAwal;
	private Double voDisetujui;
	private Double okSaatIni;
	private List<VO> vo;

	public VOResume() {

	}

	public VOResume(String id, String namaProyek, String periode,
			Double okAwal, Double voDisetujui, Double okSaatIni, List<VO> vo) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.okAwal = okAwal;
		this.voDisetujui = voDisetujui;
		this.okSaatIni = okSaatIni;
		this.vo = vo;
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

	public Double getOkAwal() {
		return okAwal;
	}

	public void setOkAwal(Double okAwal) {
		this.okAwal = okAwal;
	}

	public Double getVoDisetujui() {
		return voDisetujui;
	}

	public void setVoDisetujui(Double voDisetujui) {
		this.voDisetujui = voDisetujui;
	}

	public Double getOkSaatIni() {
		return okSaatIni;
	}

	public void setOkSaatIni(Double okSaatIni) {
		this.okSaatIni = okSaatIni;
	}

	public List<VO> getVo() {
		return vo;
	}

	public void setVo(List<VO> vo) {
		this.vo = vo;
	}

	@Override
	public String toString() {
		return "VOResume [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", okAwal=" + okAwal
				+ ", voDisetujui=" + voDisetujui + ", okSaatIni=" + okSaatIni
				+ ", vo=" + vo + "]";
	}

}
