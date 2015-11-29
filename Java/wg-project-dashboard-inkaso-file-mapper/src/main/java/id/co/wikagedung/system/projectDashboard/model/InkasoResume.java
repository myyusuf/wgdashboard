package id.co.wikagedung.system.projectDashboard.model;

public class InkasoResume {

	private String keterangan;
	private String uraian;
	private Double netto;
	private Double ppn;
	private Double bruto;

	public InkasoResume() {

	}

	public InkasoResume(String keterangan, String uraian, Double netto,
			Double ppn, Double bruto) {
		this.keterangan = keterangan;
		this.uraian = uraian;
		this.netto = netto;
		this.ppn = ppn;
		this.bruto = bruto;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	public String getUraian() {
		return uraian;
	}

	public void setUraian(String uraian) {
		this.uraian = uraian;
	}

	public Double getNetto() {
		return netto;
	}

	public void setNetto(Double netto) {
		this.netto = netto;
	}

	public Double getPpn() {
		return ppn;
	}

	public void setPpn(Double ppn) {
		this.ppn = ppn;
	}

	public Double getBruto() {
		return bruto;
	}

	public void setBruto(Double bruto) {
		this.bruto = bruto;
	}

	@Override
	public String toString() {
		return "InkasoResume [keterangan=" + keterangan + ", uraian=" + uraian
				+ ", netto=" + netto + ", ppn=" + ppn + ", bruto=" + bruto
				+ "]";
	}

}
