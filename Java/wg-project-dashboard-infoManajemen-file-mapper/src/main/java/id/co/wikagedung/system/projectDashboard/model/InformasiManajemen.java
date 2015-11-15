package id.co.wikagedung.system.projectDashboard.model;

public class InformasiManajemen {

	private String namaProyek;
	private String periode;
	private BiayaPelaksanaan biayaPelaksanaan;
	private BuPusatRisikoPphFinal buPusatRisikoPphFinal;
	private Dropping dropping;
	private LabaRugiLain labaRugiLain;
	private LkInduk lkInduk;
	private OmsetKontrakNetto omsetKontrakNetto;
	private Penerimaan penerimaan;
	private Penjualan penjualan;
	private Persekot persekot;
	private ProsentaseLk prosentaseLk;
	private RkPusat rkPusat;
	private SurplusDefisit surplusDefisit;
	private ProsentaseTerhadapProduksi prosentaseTerhadapProduksi;

	public InformasiManajemen() {
	}

	public InformasiManajemen(String namaProyek, String periode,
			BiayaPelaksanaan biayaPelaksanaan,
			BuPusatRisikoPphFinal buPusatRisikoPphFinal, Dropping dropping,
			LabaRugiLain labaRugiLain, LkInduk lkInduk,
			OmsetKontrakNetto omsetKontrakNetto, Penerimaan penerimaan,
			Penjualan penjualan, Persekot persekot, ProsentaseLk prosentaseLk,
			RkPusat rkPusat, SurplusDefisit surplusDefisit,
			ProsentaseTerhadapProduksi prosentaseTerhadapProduksi) {
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.biayaPelaksanaan = biayaPelaksanaan;
		this.buPusatRisikoPphFinal = buPusatRisikoPphFinal;
		this.dropping = dropping;
		this.labaRugiLain = labaRugiLain;
		this.lkInduk = lkInduk;
		this.omsetKontrakNetto = omsetKontrakNetto;
		this.penerimaan = penerimaan;
		this.penjualan = penjualan;
		this.persekot = persekot;
		this.prosentaseLk = prosentaseLk;
		this.rkPusat = rkPusat;
		this.surplusDefisit = surplusDefisit;
		this.prosentaseTerhadapProduksi = prosentaseTerhadapProduksi;
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

	public BiayaPelaksanaan getBiayaPelaksanaan() {
		return biayaPelaksanaan;
	}

	public void setBiayaPelaksanaan(BiayaPelaksanaan biayaPelaksanaan) {
		this.biayaPelaksanaan = biayaPelaksanaan;
	}

	public BuPusatRisikoPphFinal getBuPusatRisikoPphFinal() {
		return buPusatRisikoPphFinal;
	}

	public void setBuPusatRisikoPphFinal(
			BuPusatRisikoPphFinal buPusatRisikoPphFinal) {
		this.buPusatRisikoPphFinal = buPusatRisikoPphFinal;
	}

	public Dropping getDropping() {
		return dropping;
	}

	public void setDropping(Dropping dropping) {
		this.dropping = dropping;
	}

	public LabaRugiLain getLabaRugiLain() {
		return labaRugiLain;
	}

	public void setLabaRugiLain(LabaRugiLain labaRugiLain) {
		this.labaRugiLain = labaRugiLain;
	}

	public LkInduk getLkInduk() {
		return lkInduk;
	}

	public void setLkInduk(LkInduk lkInduk) {
		this.lkInduk = lkInduk;
	}

	public OmsetKontrakNetto getOmsetKontrakNetto() {
		return omsetKontrakNetto;
	}

	public void setOmsetKontrakNetto(OmsetKontrakNetto omsetKontrakNetto) {
		this.omsetKontrakNetto = omsetKontrakNetto;
	}

	public Penerimaan getPenerimaan() {
		return penerimaan;
	}

	public void setPenerimaan(Penerimaan penerimaan) {
		this.penerimaan = penerimaan;
	}

	public Penjualan getPenjualan() {
		return penjualan;
	}

	public void setPenjualan(Penjualan penjualan) {
		this.penjualan = penjualan;
	}

	public Persekot getPersekot() {
		return persekot;
	}

	public void setPersekot(Persekot persekot) {
		this.persekot = persekot;
	}

	public ProsentaseLk getProsentaseLk() {
		return prosentaseLk;
	}

	public void setProsentaseLk(ProsentaseLk prosentaseLk) {
		this.prosentaseLk = prosentaseLk;
	}

	public RkPusat getRkPusat() {
		return rkPusat;
	}

	public void setRkPusat(RkPusat rkPusat) {
		this.rkPusat = rkPusat;
	}

	public SurplusDefisit getSurplusDefisit() {
		return surplusDefisit;
	}

	public void setSurplusDefisit(SurplusDefisit surplusDefisit) {
		this.surplusDefisit = surplusDefisit;
	}

	public ProsentaseTerhadapProduksi getProsentaseTerhadapProduksi() {
		return prosentaseTerhadapProduksi;
	}

	public void setProsentaseTerhadapProduksi(
			ProsentaseTerhadapProduksi prosentaseTerhadapProduksi) {
		this.prosentaseTerhadapProduksi = prosentaseTerhadapProduksi;
	}

	@Override
	public String toString() {
		return "InformasiManajemen [namaProyek=" + namaProyek + ", periode="
				+ periode + ", biayaPelaksanaan=" + biayaPelaksanaan
				+ ", buPusatRisikoPphFinal=" + buPusatRisikoPphFinal
				+ ", dropping=" + dropping + ", labaRugiLain=" + labaRugiLain
				+ ", lkInduk=" + lkInduk + ", omsetKontrakNetto="
				+ omsetKontrakNetto + ", penerimaan=" + penerimaan
				+ ", penjualan=" + penjualan + ", persekot=" + persekot
				+ ", prosentaseLk=" + prosentaseLk + ", rkPusat=" + rkPusat
				+ ", surplusDefisit=" + surplusDefisit
				+ ", prosentaseTerhadapProduksi=" + prosentaseTerhadapProduksi
				+ "]";
	}

}
