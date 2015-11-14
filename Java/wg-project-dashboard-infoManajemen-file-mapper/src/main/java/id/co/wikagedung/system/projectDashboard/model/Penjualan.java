package id.co.wikagedung.system.projectDashboard.model;

public class Penjualan {

	private String id;
	private String namaProyek;
	private String periode;
	private IndukAwalKonstruksiProsentase indukAwalKonstruksiProsentase;
	private TambahKurangVoClaimProsentase tambahKurangVOClaimProsentase;
	private TotalOp totalOP;

	public Penjualan() {
	}

	public Penjualan(String id, String namaProyek, String periode,
			IndukAwalKonstruksiProsentase indukAwalKonstruksiProsentase,
			TambahKurangVoClaimProsentase tambahKurangVOClaimProsentase,
			TotalOp totalOP) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.indukAwalKonstruksiProsentase = indukAwalKonstruksiProsentase;
		this.tambahKurangVOClaimProsentase = tambahKurangVOClaimProsentase;
		this.totalOP = totalOP;
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

	public IndukAwalKonstruksiProsentase getIndukAwalKonstruksiProsentase() {
		return indukAwalKonstruksiProsentase;
	}

	public void setIndukAwalKonstruksiProsentase(
			IndukAwalKonstruksiProsentase indukAwalKonstruksiProsentase) {
		this.indukAwalKonstruksiProsentase = indukAwalKonstruksiProsentase;
	}

	public TambahKurangVoClaimProsentase getTambahKurangVOClaimProsentase() {
		return tambahKurangVOClaimProsentase;
	}

	public void setTambahKurangVOClaimProsentase(
			TambahKurangVoClaimProsentase tambahKurangVOClaimProsentase) {
		this.tambahKurangVOClaimProsentase = tambahKurangVOClaimProsentase;
	}

	public TotalOp getTotalOP() {
		return totalOP;
	}

	public void setTotalOP(TotalOp totalOP) {
		this.totalOP = totalOP;
	}

	@Override
	public String toString() {
		return "Penjualan [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", indukAwalKonstruksiProsentase="
				+ indukAwalKonstruksiProsentase
				+ ", tambahKurangVOClaimProsentase="
				+ tambahKurangVOClaimProsentase + ", totalOP=" + totalOP + "]";
	}

}
