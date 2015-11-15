package id.co.wikagedung.system.projectDashboard.model;

public class OmsetKontrakNetto {

	private String id;
	private String namaProyek;
	private String periode;
	private IndukAwalKonstruksiOmsetKontrak indukAwalKonstruksiOmsetKontrak;
	private TambahKurangVoClaimOmsetKontrak tambahKurangVoClaimOmsetKontrak;
	private TotalOk totalOk;

	public OmsetKontrakNetto() {
	}

	public OmsetKontrakNetto(String id, String namaProyek, String periode,
			IndukAwalKonstruksiOmsetKontrak indukAwalKonstruksiOmsetKontrak,
			TambahKurangVoClaimOmsetKontrak tambahKurangVoClaimOmsetKontrak,
			TotalOk totalOk) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.indukAwalKonstruksiOmsetKontrak = indukAwalKonstruksiOmsetKontrak;
		this.tambahKurangVoClaimOmsetKontrak = tambahKurangVoClaimOmsetKontrak;
		this.totalOk = totalOk;
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

	public IndukAwalKonstruksiOmsetKontrak getIndukAwalKonstruksiOmsetKontrak() {
		return indukAwalKonstruksiOmsetKontrak;
	}

	public void setIndukAwalKonstruksiOmsetKontrak(
			IndukAwalKonstruksiOmsetKontrak indukAwalKonstruksiOmsetKontrak) {
		this.indukAwalKonstruksiOmsetKontrak = indukAwalKonstruksiOmsetKontrak;
	}

	public TambahKurangVoClaimOmsetKontrak getTambahKurangVoClaimOmsetKontrak() {
		return tambahKurangVoClaimOmsetKontrak;
	}

	public void setTambahKurangVoClaimOmsetKontrak(
			TambahKurangVoClaimOmsetKontrak tambahKurangVoClaimOmsetKontrak) {
		this.tambahKurangVoClaimOmsetKontrak = tambahKurangVoClaimOmsetKontrak;
	}

	public TotalOk getTotalOk() {
		return totalOk;
	}

	public void setTotalOk(TotalOk totalOk) {
		this.totalOk = totalOk;
	}

	@Override
	public String toString() {
		return "OmsetKontrakNetto [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", indukAwalKonstruksiOmsetKontrak="
				+ indukAwalKonstruksiOmsetKontrak
				+ ", tambahKurangVoClaimOmsetKontrak="
				+ tambahKurangVoClaimOmsetKontrak + ", totalOk=" + totalOk
				+ "]";
	}

}
