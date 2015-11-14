package id.co.wikagedung.system.projectDashboard.model;

public class Penerimaan {

	private String id;
	private String namaProyek;
	private String periode;
	private UangMuka uangMuka;
	private Termijn termijn;
	private TotalPenerimaan totalPenerimaan;
	private PphPenerimaan pphPenerimaan;
	private PenerimaanBersih penerimaanBersih;

	public Penerimaan() {
	}

	public Penerimaan(String id, String namaProyek, String periode,
			UangMuka uangMuka, Termijn termijn,
			TotalPenerimaan totalPenerimaan, PphPenerimaan pphPenerimaan,
			PenerimaanBersih penerimaanBersih) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.uangMuka = uangMuka;
		this.termijn = termijn;
		this.totalPenerimaan = totalPenerimaan;
		this.pphPenerimaan = pphPenerimaan;
		this.penerimaanBersih = penerimaanBersih;
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

	public UangMuka getUangMuka() {
		return uangMuka;
	}

	public void setUangMuka(UangMuka uangMuka) {
		this.uangMuka = uangMuka;
	}

	public Termijn getTermijn() {
		return termijn;
	}

	public void setTermijn(Termijn termijn) {
		this.termijn = termijn;
	}

	public TotalPenerimaan getTotalPenerimaan() {
		return totalPenerimaan;
	}

	public void setTotalPenerimaan(TotalPenerimaan totalPenerimaan) {
		this.totalPenerimaan = totalPenerimaan;
	}

	public PphPenerimaan getPphPenerimaan() {
		return pphPenerimaan;
	}

	public void setPphPenerimaan(PphPenerimaan pphPenerimaan) {
		this.pphPenerimaan = pphPenerimaan;
	}

	public PenerimaanBersih getPenerimaanBersih() {
		return penerimaanBersih;
	}

	public void setPenerimaanBersih(PenerimaanBersih penerimaanBersih) {
		this.penerimaanBersih = penerimaanBersih;
	}

	@Override
	public String toString() {
		return "Penerimaan [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", uangMuka=" + uangMuka
				+ ", termijn=" + termijn + ", totalPenerimaan="
				+ totalPenerimaan + ", pphPenerimaan=" + pphPenerimaan
				+ ", penerimaanBersih=" + penerimaanBersih + "]";
	}

}
