package id.co.wikagedung.system.projectDashboard.model;

public class BuPusatRisikoPphFinal {

	private String id;
	private String namaProyek;
	private String periode;
	private BiayaUsahaPusat biayaUsahaPusat;
	private Risiko risiko;
	private PphFinal pphFinal;
	private TotalBuPusatRisikoPphFinal totalBuPusatRisikoPphFinal;

	public BuPusatRisikoPphFinal() {
	}

	public BuPusatRisikoPphFinal(String id, String namaProyek, String periode,
			BiayaUsahaPusat biayaUsahaPusat, Risiko risiko, PphFinal pphFinal,
			TotalBuPusatRisikoPphFinal totalBuPusatRisikoPphFinal) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.biayaUsahaPusat = biayaUsahaPusat;
		this.risiko = risiko;
		this.pphFinal = pphFinal;
		this.totalBuPusatRisikoPphFinal = totalBuPusatRisikoPphFinal;
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

	public BiayaUsahaPusat getBiayaUsahaPusat() {
		return biayaUsahaPusat;
	}

	public void setBiayaUsahaPusat(BiayaUsahaPusat biayaUsahaPusat) {
		this.biayaUsahaPusat = biayaUsahaPusat;
	}

	public Risiko getRisiko() {
		return risiko;
	}

	public void setRisiko(Risiko risiko) {
		this.risiko = risiko;
	}

	public PphFinal getPphFinal() {
		return pphFinal;
	}

	public void setPphFinal(PphFinal pphFinal) {
		this.pphFinal = pphFinal;
	}

	public TotalBuPusatRisikoPphFinal getTotalBuPusatRisikoPphFinal() {
		return totalBuPusatRisikoPphFinal;
	}

	public void setTotalBuPusatRisikoPphFinal(
			TotalBuPusatRisikoPphFinal totalBuPusatRisikoPphFinal) {
		this.totalBuPusatRisikoPphFinal = totalBuPusatRisikoPphFinal;
	}

	@Override
	public String toString() {
		return "BuPusatRisikoPphFinal [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", biayaUsahaPusat="
				+ biayaUsahaPusat + ", risiko=" + risiko + ", pphFinal="
				+ pphFinal + ", totalBuPusatRisikoPphFinal="
				+ totalBuPusatRisikoPphFinal + "]";
	}

}
