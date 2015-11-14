package id.co.wikagedung.system.projectDashboard.model;

public class OmsetKontrakNetto {

	private String id;
	private String namaProyek;
	private String periode;
	private IndukAwalKonstruksi indukAwalKonstruksi;
	private TambahKurangVoClaim tambahKurangVOClaim;
	private TotalOk totalOK;

	public OmsetKontrakNetto() {
	}

	public OmsetKontrakNetto(String id, String namaProyek, String periode,
			IndukAwalKonstruksi indukAwalKonstruksi,
			TambahKurangVoClaim tambahKurangVOClaim, TotalOk totalOK) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.indukAwalKonstruksi = indukAwalKonstruksi;
		this.tambahKurangVOClaim = tambahKurangVOClaim;
		this.totalOK = totalOK;
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

	public IndukAwalKonstruksi getIndukAwalKonstruksi() {
		return indukAwalKonstruksi;
	}

	public void setIndukAwalKonstruksi(IndukAwalKonstruksi indukAwalKonstruksi) {
		this.indukAwalKonstruksi = indukAwalKonstruksi;
	}

	public TambahKurangVoClaim getTambahKurangVOClaim() {
		return tambahKurangVOClaim;
	}

	public void setTambahKurangVOClaim(TambahKurangVoClaim tambahKurangVOClaim) {
		this.tambahKurangVOClaim = tambahKurangVOClaim;
	}

	public TotalOk getTotalOK() {
		return totalOK;
	}

	public void setTotalOK(TotalOk totalOK) {
		this.totalOK = totalOK;
	}

	@Override
	public String toString() {
		return "OmsetKontrakNetto [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", indukAwalKonstruksi="
				+ indukAwalKonstruksi + ", tambahKurangVOClaim="
				+ tambahKurangVOClaim + ", totalOK=" + totalOK + "]";
	}

}
