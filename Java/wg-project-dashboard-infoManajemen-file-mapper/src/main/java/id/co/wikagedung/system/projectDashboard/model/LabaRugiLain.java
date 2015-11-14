package id.co.wikagedung.system.projectDashboard.model;

public class LabaRugiLain {

	private String id;
	private String namaProyek;
	private String periode;
	private BungaJasaGiro bungaJasaGiro;
	private PendapatanBiaya pendapatanBiaya;
	private PembebananBiaya pembebananBiaya;
	private TotalLabaRugiLain totalLabaRugiLain;

	public LabaRugiLain() {
	}

	public LabaRugiLain(String id, String namaProyek, String periode,
			BungaJasaGiro bungaJasaGiro, PendapatanBiaya pendapatanBiaya,
			PembebananBiaya pembebananBiaya, TotalLabaRugiLain totalLabaRugiLain) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.bungaJasaGiro = bungaJasaGiro;
		this.pendapatanBiaya = pendapatanBiaya;
		this.pembebananBiaya = pembebananBiaya;
		this.totalLabaRugiLain = totalLabaRugiLain;
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

	public BungaJasaGiro getBungaJasaGiro() {
		return bungaJasaGiro;
	}

	public void setBungaJasaGiro(BungaJasaGiro bungaJasaGiro) {
		this.bungaJasaGiro = bungaJasaGiro;
	}

	public PendapatanBiaya getPendapatanBiaya() {
		return pendapatanBiaya;
	}

	public void setPendapatanBiaya(PendapatanBiaya pendapatanBiaya) {
		this.pendapatanBiaya = pendapatanBiaya;
	}

	public PembebananBiaya getPembebananBiaya() {
		return pembebananBiaya;
	}

	public void setPembebananBiaya(PembebananBiaya pembebananBiaya) {
		this.pembebananBiaya = pembebananBiaya;
	}

	public TotalLabaRugiLain getTotalLabaRugiLain() {
		return totalLabaRugiLain;
	}

	public void setTotalLabaRugiLain(TotalLabaRugiLain totalLabaRugiLain) {
		this.totalLabaRugiLain = totalLabaRugiLain;
	}

	@Override
	public String toString() {
		return "LabaRugiLain [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", bungaJasaGiro=" + bungaJasaGiro
				+ ", pendapatanBiaya=" + pendapatanBiaya + ", pembebananBiaya="
				+ pembebananBiaya + ", totalLabaRugiLain=" + totalLabaRugiLain
				+ "]";
	}

}
