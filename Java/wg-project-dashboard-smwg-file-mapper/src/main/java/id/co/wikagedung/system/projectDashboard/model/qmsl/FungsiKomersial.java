package id.co.wikagedung.system.projectDashboard.model.qmsl;

public class FungsiKomersial {

	private String id;
	private String namaProyek;
	private String periode;
	private Double laporanBulanan;
	private Double variationOrderDanPekerjaanTambahKurang;
	private Double schedulingReschedulingInternal;
	private Double administrasiKontrak;
	private Double manajemenRisiko;
	private Double subTotal;

	public FungsiKomersial() {
	}

	public FungsiKomersial(String id, String namaProyek, String periode,
			Double laporanBulanan,
			Double variationOrderDanPekerjaanTambahKurang,
			Double schedulingReschedulingInternal, Double administrasiKontrak,
			Double manajemenRisiko, Double subTotal) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.laporanBulanan = laporanBulanan;
		this.variationOrderDanPekerjaanTambahKurang = variationOrderDanPekerjaanTambahKurang;
		this.schedulingReschedulingInternal = schedulingReschedulingInternal;
		this.administrasiKontrak = administrasiKontrak;
		this.manajemenRisiko = manajemenRisiko;
		this.subTotal = subTotal;
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

	public Double getLaporanBulanan() {
		return laporanBulanan;
	}

	public void setLaporanBulanan(Double laporanBulanan) {
		this.laporanBulanan = laporanBulanan;
	}

	public Double getVariationOrderDanPekerjaanTambahKurang() {
		return variationOrderDanPekerjaanTambahKurang;
	}

	public void setVariationOrderDanPekerjaanTambahKurang(
			Double variationOrderDanPekerjaanTambahKurang) {
		this.variationOrderDanPekerjaanTambahKurang = variationOrderDanPekerjaanTambahKurang;
	}

	public Double getSchedulingReschedulingInternal() {
		return schedulingReschedulingInternal;
	}

	public void setSchedulingReschedulingInternal(
			Double schedulingReschedulingInternal) {
		this.schedulingReschedulingInternal = schedulingReschedulingInternal;
	}

	public Double getAdministrasiKontrak() {
		return administrasiKontrak;
	}

	public void setAdministrasiKontrak(Double administrasiKontrak) {
		this.administrasiKontrak = administrasiKontrak;
	}

	public Double getManajemenRisiko() {
		return manajemenRisiko;
	}

	public void setManajemenRisiko(Double manajemenRisiko) {
		this.manajemenRisiko = manajemenRisiko;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "FungsiKomersial [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", laporanBulanan=" + laporanBulanan
				+ ", variationOrderDanPekerjaanTambahKurang="
				+ variationOrderDanPekerjaanTambahKurang
				+ ", schedulingReschedulingInternal="
				+ schedulingReschedulingInternal + ", administrasiKontrak="
				+ administrasiKontrak + ", manajemenRisiko=" + manajemenRisiko
				+ ", subTotal=" + subTotal + "]";
	}

}
