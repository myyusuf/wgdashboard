package id.co.wikagedung.system.projectDashboard.model;

public class ManajemenRisiko {

	private String id;
	private String namaProyek;
	private String periode;
	private String risiko;
	private String stlTingkatRisiko;
	private Double stlNilaiRisiko;
	private String rtlRencanaTindakLanjut;
	private String rtlTingkatRisiko;
	private Double rtlRencanaBiayaMitigasiRisiko;
	private Double rtlRencanaSisaRisiko;
	private Double rtlTotalRencanaNilaiRisiko;
	private String htlRealisasiTindakLanjutSampaiSaatIni;
	private String htlStatus;
	private String htlPenanggungJawab;
	private Double htlBiayaMitigasi;
	private Double htlRealisasiSisaRisiko;
	private Double htlTotalRealisasiNilaiRisiko;

	public ManajemenRisiko() {
	}

	public ManajemenRisiko(String id, String namaProyek, String periode,
			String risiko, String stlTingkatRisiko, Double stlNilaiRisiko,
			String rtlRencanaTindakLanjut, String rtlTingkatRisiko,
			Double rtlRencanaBiayaMitigasiRisiko, Double rtlRencanaSisaRisiko,
			Double rtlTotalRencanaNilaiRisiko,
			String htlRealisasiTindakLanjutSampaiSaatIni, String htlStatus,
			String htlPenanggungJawab, Double htlBiayaMitigasi,
			Double htlRealisasiSisaRisiko, Double htlTotalRealisasiNilaiRisiko) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.risiko = risiko;
		this.stlTingkatRisiko = stlTingkatRisiko;
		this.stlNilaiRisiko = stlNilaiRisiko;
		this.rtlRencanaTindakLanjut = rtlRencanaTindakLanjut;
		this.rtlTingkatRisiko = rtlTingkatRisiko;
		this.rtlRencanaBiayaMitigasiRisiko = rtlRencanaBiayaMitigasiRisiko;
		this.rtlRencanaSisaRisiko = rtlRencanaSisaRisiko;
		this.rtlTotalRencanaNilaiRisiko = rtlTotalRencanaNilaiRisiko;
		this.htlRealisasiTindakLanjutSampaiSaatIni = htlRealisasiTindakLanjutSampaiSaatIni;
		this.htlStatus = htlStatus;
		this.htlPenanggungJawab = htlPenanggungJawab;
		this.htlBiayaMitigasi = htlBiayaMitigasi;
		this.htlRealisasiSisaRisiko = htlRealisasiSisaRisiko;
		this.htlTotalRealisasiNilaiRisiko = htlTotalRealisasiNilaiRisiko;
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

	public String getRisiko() {
		return risiko;
	}

	public void setRisiko(String risiko) {
		this.risiko = risiko;
	}

	public String getStlTingkatRisiko() {
		return stlTingkatRisiko;
	}

	public void setStlTingkatRisiko(String stlTingkatRisiko) {
		this.stlTingkatRisiko = stlTingkatRisiko;
	}

	public Double getStlNilaiRisiko() {
		return stlNilaiRisiko;
	}

	public void setStlNilaiRisiko(Double stlNilaiRisiko) {
		this.stlNilaiRisiko = stlNilaiRisiko;
	}

	public String getRtlRencanaTindakLanjut() {
		return rtlRencanaTindakLanjut;
	}

	public void setRtlRencanaTindakLanjut(String rtlRencanaTindakLanjut) {
		this.rtlRencanaTindakLanjut = rtlRencanaTindakLanjut;
	}

	public String getRtlTingkatRisiko() {
		return rtlTingkatRisiko;
	}

	public void setRtlTingkatRisiko(String rtlTingkatRisiko) {
		this.rtlTingkatRisiko = rtlTingkatRisiko;
	}

	public Double getRtlRencanaBiayaMitigasiRisiko() {
		return rtlRencanaBiayaMitigasiRisiko;
	}

	public void setRtlRencanaBiayaMitigasiRisiko(
			Double rtlRencanaBiayaMitigasiRisiko) {
		this.rtlRencanaBiayaMitigasiRisiko = rtlRencanaBiayaMitigasiRisiko;
	}

	public Double getRtlRencanaSisaRisiko() {
		return rtlRencanaSisaRisiko;
	}

	public void setRtlRencanaSisaRisiko(Double rtlRencanaSisaRisiko) {
		this.rtlRencanaSisaRisiko = rtlRencanaSisaRisiko;
	}

	public Double getRtlTotalRencanaNilaiRisiko() {
		return rtlTotalRencanaNilaiRisiko;
	}

	public void setRtlTotalRencanaNilaiRisiko(Double rtlTotalRencanaNilaiRisiko) {
		this.rtlTotalRencanaNilaiRisiko = rtlTotalRencanaNilaiRisiko;
	}

	public String getHtlRealisasiTindakLanjutSampaiSaatIni() {
		return htlRealisasiTindakLanjutSampaiSaatIni;
	}

	public void setHtlRealisasiTindakLanjutSampaiSaatIni(
			String htlRealisasiTindakLanjutSampaiSaatIni) {
		this.htlRealisasiTindakLanjutSampaiSaatIni = htlRealisasiTindakLanjutSampaiSaatIni;
	}

	public String getHtlStatus() {
		return htlStatus;
	}

	public void setHtlStatus(String htlStatus) {
		this.htlStatus = htlStatus;
	}

	public String getHtlPenanggungJawab() {
		return htlPenanggungJawab;
	}

	public void setHtlPenanggungJawab(String htlPenanggungJawab) {
		this.htlPenanggungJawab = htlPenanggungJawab;
	}

	public Double getHtlBiayaMitigasi() {
		return htlBiayaMitigasi;
	}

	public void setHtlBiayaMitigasi(Double htlBiayaMitigasi) {
		this.htlBiayaMitigasi = htlBiayaMitigasi;
	}

	public Double getHtlRealisasiSisaRisiko() {
		return htlRealisasiSisaRisiko;
	}

	public void setHtlRealisasiSisaRisiko(Double htlRealisasiSisaRisiko) {
		this.htlRealisasiSisaRisiko = htlRealisasiSisaRisiko;
	}

	public Double getHtlTotalRealisasiNilaiRisiko() {
		return htlTotalRealisasiNilaiRisiko;
	}

	public void setHtlTotalRealisasiNilaiRisiko(
			Double htlTotalRealisasiNilaiRisiko) {
		this.htlTotalRealisasiNilaiRisiko = htlTotalRealisasiNilaiRisiko;
	}

	@Override
	public String toString() {
		return "ManajemenRisiko [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", risiko=" + risiko
				+ ", stlTingkatRisiko=" + stlTingkatRisiko
				+ ", stlNilaiRisiko=" + stlNilaiRisiko
				+ ", rtlRencanaTindakLanjut=" + rtlRencanaTindakLanjut
				+ ", rtlTingkatRisiko=" + rtlTingkatRisiko
				+ ", rtlRencanaBiayaMitigasiRisiko="
				+ rtlRencanaBiayaMitigasiRisiko + ", rtlRencanaSisaRisiko="
				+ rtlRencanaSisaRisiko + ", rtlTotalRencanaNilaiRisiko="
				+ rtlTotalRencanaNilaiRisiko
				+ ", htlRealisasiTindakLanjutSampaiSaatIni="
				+ htlRealisasiTindakLanjutSampaiSaatIni + ", htlStatus="
				+ htlStatus + ", htlPenanggungJawab=" + htlPenanggungJawab
				+ ", htlBiayaMitigasi=" + htlBiayaMitigasi
				+ ", htlRealisasiSisaRisiko=" + htlRealisasiSisaRisiko
				+ ", htlTotalRealisasiNilaiRisiko="
				+ htlTotalRealisasiNilaiRisiko + "]";
	}

}
