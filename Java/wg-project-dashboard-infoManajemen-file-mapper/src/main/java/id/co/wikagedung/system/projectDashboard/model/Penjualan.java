package id.co.wikagedung.system.projectDashboard.model;

public class Penjualan {

	private String id;
	private String namaProyek;
	private String periode;
	private IndukAwalKonstruksiPenjualan indukAwalKonstruksiPenjualan;
	private IndukAwalKonstruksiPenjualanProsentase indukAwalKonstruksiPenjualanProsentase;
	private TambahKurangVoClaimPenjualan tambahKurangVoClaimPenjualan;
	private TambahKurangVoClaimPenjualanProsentase tambahKurangVoClaimPenjualanProsentase;
	private TotalOp totalOp;

	public Penjualan() {
	}

	public Penjualan(
			String id,
			String namaProyek,
			String periode,
			IndukAwalKonstruksiPenjualan indukAwalKonstruksiPenjualan,
			IndukAwalKonstruksiPenjualanProsentase indukAwalKonstruksiPenjualanProsentase,
			TambahKurangVoClaimPenjualan tambahKurangVoClaimPenjualan,
			TambahKurangVoClaimPenjualanProsentase tambahKurangVoClaimPenjualanProsentase,
			TotalOp totalOp) {
		super();
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.indukAwalKonstruksiPenjualan = indukAwalKonstruksiPenjualan;
		this.indukAwalKonstruksiPenjualanProsentase = indukAwalKonstruksiPenjualanProsentase;
		this.tambahKurangVoClaimPenjualan = tambahKurangVoClaimPenjualan;
		this.tambahKurangVoClaimPenjualanProsentase = tambahKurangVoClaimPenjualanProsentase;
		this.totalOp = totalOp;
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

	public IndukAwalKonstruksiPenjualan getIndukAwalKonstruksiPenjualan() {
		return indukAwalKonstruksiPenjualan;
	}

	public void setIndukAwalKonstruksiPenjualan(
			IndukAwalKonstruksiPenjualan indukAwalKonstruksiPenjualan) {
		this.indukAwalKonstruksiPenjualan = indukAwalKonstruksiPenjualan;
	}

	public IndukAwalKonstruksiPenjualanProsentase getIndukAwalKonstruksiPenjualanProsentase() {
		return indukAwalKonstruksiPenjualanProsentase;
	}

	public void setIndukAwalKonstruksiPenjualanProsentase(
			IndukAwalKonstruksiPenjualanProsentase indukAwalKonstruksiPenjualanProsentase) {
		this.indukAwalKonstruksiPenjualanProsentase = indukAwalKonstruksiPenjualanProsentase;
	}

	public TambahKurangVoClaimPenjualan getTambahKurangVoClaimPenjualan() {
		return tambahKurangVoClaimPenjualan;
	}

	public void setTambahKurangVoClaimPenjualan(
			TambahKurangVoClaimPenjualan tambahKurangVoClaimPenjualan) {
		this.tambahKurangVoClaimPenjualan = tambahKurangVoClaimPenjualan;
	}

	public TambahKurangVoClaimPenjualanProsentase getTambahKurangVoClaimPenjualanProsentase() {
		return tambahKurangVoClaimPenjualanProsentase;
	}

	public void setTambahKurangVoClaimPenjualanProsentase(
			TambahKurangVoClaimPenjualanProsentase tambahKurangVoClaimPenjualanProsentase) {
		this.tambahKurangVoClaimPenjualanProsentase = tambahKurangVoClaimPenjualanProsentase;
	}

	public TotalOp getTotalOp() {
		return totalOp;
	}

	public void setTotalOp(TotalOp totalOp) {
		this.totalOp = totalOp;
	}

	@Override
	public String toString() {
		return "Penjualan [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", indukAwalKonstruksiPenjualan="
				+ indukAwalKonstruksiPenjualan
				+ ", indukAwalKonstruksiPenjualanProsentase="
				+ indukAwalKonstruksiPenjualanProsentase
				+ ", tambahKurangVoClaimPenjualan="
				+ tambahKurangVoClaimPenjualan
				+ ", tambahKurangVoClaimPenjualanProsentase="
				+ tambahKurangVoClaimPenjualanProsentase + ", totalOp="
				+ totalOp + "]";
	}

}
