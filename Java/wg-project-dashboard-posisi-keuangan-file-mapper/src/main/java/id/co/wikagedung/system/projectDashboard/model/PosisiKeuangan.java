package id.co.wikagedung.system.projectDashboard.model;

public class PosisiKeuangan {

	private String id;
	private String namaProyek;
	private String periode;
	private Double uangMukaInduk;
	private Double termijn;
	private Double uangMukaVo;
	private Double termijnVo;
	private Double potonganRetensi;
	private Double potonganUangMuka;
	private Double potonganPpn;
	private Double potonganPphTermijn;
	private Double persekot;
	private Double dropping;
	private Double pembebananRk;
	private Double pekerjaanInduk;
	private Double pekerjaanVoClaim;
	private Double prestasiEksternPekerjaanInduk;
	private Double prestasiEksternPekerjaanVo;
	private Double biayaLangsung;
	private Double biayaTakLangsung;
	private Double uangMukaPemasok;
	private Double uangMukaSubkontraktor;
	private Double utangPemasok;
	private Double utangSubkontraktor;
	private Double utangMandor;
	private Double persediaan;
	private Double biayaAkanDibayar;
	private Double piutangFaktur;
	private Double pdpkMaterial;
	private Double pdpkUpah;
	private Double pdpkPeralatan;
	private Double pdpkSubkontraktor;

	public PosisiKeuangan() {
	}

	public PosisiKeuangan(String id, String namaProyek, String periode,
			Double uangMukaInduk, Double termijn, Double uangMukaVo,
			Double termijnVo, Double potonganRetensi, Double potonganUangMuka,
			Double potonganPpn, Double potonganPphTermijn, Double persekot,
			Double dropping, Double pembebananRk, Double pekerjaanInduk,
			Double pekerjaanVoClaim, Double prestasiEksternPekerjaanInduk,
			Double prestasiEksternPekerjaanVo, Double biayaLangsung,
			Double biayaTakLangsung, Double uangMukaPemasok,
			Double uangMukaSubkontraktor, Double utangPemasok,
			Double utangSubkontraktor, Double utangMandor, Double persediaan,
			Double biayaAkanDibayar, Double piutangFaktur, Double pdpkMaterial,
			Double pdpkUpah, Double pdpkPeralatan, Double pdpkSubkontraktor) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.uangMukaInduk = uangMukaInduk;
		this.termijn = termijn;
		this.uangMukaVo = uangMukaVo;
		this.termijnVo = termijnVo;
		this.potonganRetensi = potonganRetensi;
		this.potonganUangMuka = potonganUangMuka;
		this.potonganPpn = potonganPpn;
		this.potonganPphTermijn = potonganPphTermijn;
		this.persekot = persekot;
		this.dropping = dropping;
		this.pembebananRk = pembebananRk;
		this.pekerjaanInduk = pekerjaanInduk;
		this.pekerjaanVoClaim = pekerjaanVoClaim;
		this.prestasiEksternPekerjaanInduk = prestasiEksternPekerjaanInduk;
		this.prestasiEksternPekerjaanVo = prestasiEksternPekerjaanVo;
		this.biayaLangsung = biayaLangsung;
		this.biayaTakLangsung = biayaTakLangsung;
		this.uangMukaPemasok = uangMukaPemasok;
		this.uangMukaSubkontraktor = uangMukaSubkontraktor;
		this.utangPemasok = utangPemasok;
		this.utangSubkontraktor = utangSubkontraktor;
		this.utangMandor = utangMandor;
		this.persediaan = persediaan;
		this.biayaAkanDibayar = biayaAkanDibayar;
		this.piutangFaktur = piutangFaktur;
		this.pdpkMaterial = pdpkMaterial;
		this.pdpkUpah = pdpkUpah;
		this.pdpkPeralatan = pdpkPeralatan;
		this.pdpkSubkontraktor = pdpkSubkontraktor;
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

	public Double getUangMukaInduk() {
		return uangMukaInduk;
	}

	public void setUangMukaInduk(Double uangMukaInduk) {
		this.uangMukaInduk = uangMukaInduk;
	}

	public Double getTermijn() {
		return termijn;
	}

	public void setTermijn(Double termijn) {
		this.termijn = termijn;
	}

	public Double getUangMukaVo() {
		return uangMukaVo;
	}

	public void setUangMukaVo(Double uangMukaVo) {
		this.uangMukaVo = uangMukaVo;
	}

	public Double getTermijnVo() {
		return termijnVo;
	}

	public void setTermijnVo(Double termijnVo) {
		this.termijnVo = termijnVo;
	}

	public Double getPotonganRetensi() {
		return potonganRetensi;
	}

	public void setPotonganRetensi(Double potonganRetensi) {
		this.potonganRetensi = potonganRetensi;
	}

	public Double getPotonganUangMuka() {
		return potonganUangMuka;
	}

	public void setPotonganUangMuka(Double potonganUangMuka) {
		this.potonganUangMuka = potonganUangMuka;
	}

	public Double getPotonganPpn() {
		return potonganPpn;
	}

	public void setPotonganPpn(Double potonganPpn) {
		this.potonganPpn = potonganPpn;
	}

	public Double getPotonganPphTermijn() {
		return potonganPphTermijn;
	}

	public void setPotonganPphTermijn(Double potonganPphTermijn) {
		this.potonganPphTermijn = potonganPphTermijn;
	}

	public Double getPersekot() {
		return persekot;
	}

	public void setPersekot(Double persekot) {
		this.persekot = persekot;
	}

	public Double getDropping() {
		return dropping;
	}

	public void setDropping(Double dropping) {
		this.dropping = dropping;
	}

	public Double getPembebananRk() {
		return pembebananRk;
	}

	public void setPembebananRk(Double pembebananRk) {
		this.pembebananRk = pembebananRk;
	}

	public Double getPekerjaanInduk() {
		return pekerjaanInduk;
	}

	public void setPekerjaanInduk(Double pekerjaanInduk) {
		this.pekerjaanInduk = pekerjaanInduk;
	}

	public Double getPekerjaanVoClaim() {
		return pekerjaanVoClaim;
	}

	public void setPekerjaanVoClaim(Double pekerjaanVoClaim) {
		this.pekerjaanVoClaim = pekerjaanVoClaim;
	}

	public Double getPrestasiEksternPekerjaanInduk() {
		return prestasiEksternPekerjaanInduk;
	}

	public void setPrestasiEksternPekerjaanInduk(
			Double prestasiEksternPekerjaanInduk) {
		this.prestasiEksternPekerjaanInduk = prestasiEksternPekerjaanInduk;
	}

	public Double getPrestasiEksternPekerjaanVo() {
		return prestasiEksternPekerjaanVo;
	}

	public void setPrestasiEksternPekerjaanVo(Double prestasiEksternPekerjaanVo) {
		this.prestasiEksternPekerjaanVo = prestasiEksternPekerjaanVo;
	}

	public Double getBiayaLangsung() {
		return biayaLangsung;
	}

	public void setBiayaLangsung(Double biayaLangsung) {
		this.biayaLangsung = biayaLangsung;
	}

	public Double getBiayaTakLangsung() {
		return biayaTakLangsung;
	}

	public void setBiayaTakLangsung(Double biayaTakLangsung) {
		this.biayaTakLangsung = biayaTakLangsung;
	}

	public Double getUangMukaPemasok() {
		return uangMukaPemasok;
	}

	public void setUangMukaPemasok(Double uangMukaPemasok) {
		this.uangMukaPemasok = uangMukaPemasok;
	}

	public Double getUangMukaSubkontraktor() {
		return uangMukaSubkontraktor;
	}

	public void setUangMukaSubkontraktor(Double uangMukaSubkontraktor) {
		this.uangMukaSubkontraktor = uangMukaSubkontraktor;
	}

	public Double getUtangPemasok() {
		return utangPemasok;
	}

	public void setUtangPemasok(Double utangPemasok) {
		this.utangPemasok = utangPemasok;
	}

	public Double getUtangSubkontraktor() {
		return utangSubkontraktor;
	}

	public void setUtangSubkontraktor(Double utangSubkontraktor) {
		this.utangSubkontraktor = utangSubkontraktor;
	}

	public Double getUtangMandor() {
		return utangMandor;
	}

	public void setUtangMandor(Double utangMandor) {
		this.utangMandor = utangMandor;
	}

	public Double getPersediaan() {
		return persediaan;
	}

	public void setPersediaan(Double persediaan) {
		this.persediaan = persediaan;
	}

	public Double getBiayaAkanDibayar() {
		return biayaAkanDibayar;
	}

	public void setBiayaAkanDibayar(Double biayaAkanDibayar) {
		this.biayaAkanDibayar = biayaAkanDibayar;
	}

	public Double getPiutangFaktur() {
		return piutangFaktur;
	}

	public void setPiutangFaktur(Double piutangFaktur) {
		this.piutangFaktur = piutangFaktur;
	}

	public Double getPdpkMaterial() {
		return pdpkMaterial;
	}

	public void setPdpkMaterial(Double pdpkMaterial) {
		this.pdpkMaterial = pdpkMaterial;
	}

	public Double getPdpkUpah() {
		return pdpkUpah;
	}

	public void setPdpkUpah(Double pdpkUpah) {
		this.pdpkUpah = pdpkUpah;
	}

	public Double getPdpkPeralatan() {
		return pdpkPeralatan;
	}

	public void setPdpkPeralatan(Double pdpkPeralatan) {
		this.pdpkPeralatan = pdpkPeralatan;
	}

	public Double getPdpkSubkontraktor() {
		return pdpkSubkontraktor;
	}

	public void setPdpkSubkontraktor(Double pdpkSubkontraktor) {
		this.pdpkSubkontraktor = pdpkSubkontraktor;
	}

	@Override
	public String toString() {
		return "PosisiKeuangan [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", uangMukaInduk=" + uangMukaInduk
				+ ", termijn=" + termijn + ", uangMukaVo=" + uangMukaVo
				+ ", termijnVo=" + termijnVo + ", potonganRetensi="
				+ potonganRetensi + ", potonganUangMuka=" + potonganUangMuka
				+ ", potonganPpn=" + potonganPpn + ", potonganPphTermijn="
				+ potonganPphTermijn + ", persekot=" + persekot + ", dropping="
				+ dropping + ", pembebananRk=" + pembebananRk
				+ ", pekerjaanInduk=" + pekerjaanInduk + ", pekerjaanVoClaim="
				+ pekerjaanVoClaim + ", prestasiEksternPekerjaanInduk="
				+ prestasiEksternPekerjaanInduk
				+ ", prestasiEksternPekerjaanVo=" + prestasiEksternPekerjaanVo
				+ ", biayaLangsung=" + biayaLangsung + ", biayaTakLangsung="
				+ biayaTakLangsung + ", uangMukaPemasok=" + uangMukaPemasok
				+ ", uangMukaSubkontraktor=" + uangMukaSubkontraktor
				+ ", utangPemasok=" + utangPemasok + ", utangSubkontraktor="
				+ utangSubkontraktor + ", utangMandor=" + utangMandor
				+ ", persediaan=" + persediaan + ", biayaAkanDibayar="
				+ biayaAkanDibayar + ", piutangFaktur=" + piutangFaktur
				+ ", pdpkMaterial=" + pdpkMaterial + ", pdpkUpah=" + pdpkUpah
				+ ", pdpkPeralatan=" + pdpkPeralatan + ", pdpkSubkontraktor="
				+ pdpkSubkontraktor + "]";
	}

}
