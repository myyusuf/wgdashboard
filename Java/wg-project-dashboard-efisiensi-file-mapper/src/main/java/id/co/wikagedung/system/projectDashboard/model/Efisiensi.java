package id.co.wikagedung.system.projectDashboard.model;

public class Efisiensi {

	private String id;
	private String namaProyek;
	private String periode;
	private String itemPekerjaan;
	private Double rabtRabp;
	private Double perolehan;
	private Double efisiensi;
	private String penggunaanEfisiensiPosting;
	private String penggunaanEfisiensiKeterangan;
	private Double penggunaanEfisiensiNilai;
	private Double saldo;
	private String keterangan;

	public Efisiensi() {
	}

	public Efisiensi(String id, String namaProyek, String periode,
			String itemPekerjaan, Double rabtRabp, Double perolehan,
			Double efisiensi, String penggunaanEfisiensiPosting,
			String penggunaanEfisiensiKeterangan,
			Double penggunaanEfisiensiNilai, Double saldo, String keterangan) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.itemPekerjaan = itemPekerjaan;
		this.rabtRabp = rabtRabp;
		this.perolehan = perolehan;
		this.efisiensi = efisiensi;
		this.penggunaanEfisiensiPosting = penggunaanEfisiensiPosting;
		this.penggunaanEfisiensiKeterangan = penggunaanEfisiensiKeterangan;
		this.penggunaanEfisiensiNilai = penggunaanEfisiensiNilai;
		this.saldo = saldo;
		this.keterangan = keterangan;
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

	public String getItemPekerjaan() {
		return itemPekerjaan;
	}

	public void setItemPekerjaan(String itemPekerjaan) {
		this.itemPekerjaan = itemPekerjaan;
	}

	public Double getRabtRabp() {
		return rabtRabp;
	}

	public void setRabtRabp(Double rabtRabp) {
		this.rabtRabp = rabtRabp;
	}

	public Double getPerolehan() {
		return perolehan;
	}

	public void setPerolehan(Double perolehan) {
		this.perolehan = perolehan;
	}

	public Double getEfisiensi() {
		return efisiensi;
	}

	public void setEfisiensi(Double efisiensi) {
		this.efisiensi = efisiensi;
	}

	public String getPenggunaanEfisiensiPosting() {
		return penggunaanEfisiensiPosting;
	}

	public void setPenggunaanEfisiensiPosting(String penggunaanEfisiensiPosting) {
		this.penggunaanEfisiensiPosting = penggunaanEfisiensiPosting;
	}

	public String getPenggunaanEfisiensiKeterangan() {
		return penggunaanEfisiensiKeterangan;
	}

	public void setPenggunaanEfisiensiKeterangan(
			String penggunaanEfisiensiKeterangan) {
		this.penggunaanEfisiensiKeterangan = penggunaanEfisiensiKeterangan;
	}

	public Double getPenggunaanEfisiensiNilai() {
		return penggunaanEfisiensiNilai;
	}

	public void setPenggunaanEfisiensiNilai(Double penggunaanEfisiensiNilai) {
		this.penggunaanEfisiensiNilai = penggunaanEfisiensiNilai;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	@Override
	public String toString() {
		return "Efisiensi [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", itemPekerjaan=" + itemPekerjaan
				+ ", rabtRabp=" + rabtRabp + ", perolehan=" + perolehan
				+ ", efisiensi=" + efisiensi + ", penggunaanEfisiensiPosting="
				+ penggunaanEfisiensiPosting
				+ ", penggunaanEfisiensiKeterangan="
				+ penggunaanEfisiensiKeterangan + ", penggunaanEfisiensiNilai="
				+ penggunaanEfisiensiNilai + ", saldo=" + saldo
				+ ", keterangan=" + keterangan + "]";
	}

}
