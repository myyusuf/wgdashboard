package id.co.wikagedung.system.projectDashboard.model;

public class HasilKeuanganDanPasar {

	private LabaKotor labaKotor;
	private NetCashFlow netCashFlow;
	private RatioTagihanBrutto ratioTagihanBrutto;
	private Penjualan penjualan;

	public HasilKeuanganDanPasar() {
	}

	public HasilKeuanganDanPasar(LabaKotor labaKotor, NetCashFlow netCashFlow,
			RatioTagihanBrutto ratioTagihanBrutto, Penjualan penjualan) {
		this.labaKotor = labaKotor;
		this.netCashFlow = netCashFlow;
		this.ratioTagihanBrutto = ratioTagihanBrutto;
		this.penjualan = penjualan;
	}

	public LabaKotor getLabaKotor() {
		return labaKotor;
	}

	public void setLabaKotor(LabaKotor labaKotor) {
		this.labaKotor = labaKotor;
	}

	public NetCashFlow getNetCashFlow() {
		return netCashFlow;
	}

	public void setNetCashFlow(NetCashFlow netCashFlow) {
		this.netCashFlow = netCashFlow;
	}

	public RatioTagihanBrutto getRatioTagihanBrutto() {
		return ratioTagihanBrutto;
	}

	public void setRatioTagihanBrutto(RatioTagihanBrutto ratioTagihanBrutto) {
		this.ratioTagihanBrutto = ratioTagihanBrutto;
	}

	public Penjualan getPenjualan() {
		return penjualan;
	}

	public void setPenjualan(Penjualan penjualan) {
		this.penjualan = penjualan;
	}

	@Override
	public String toString() {
		return "HasilKeuanganDanPasar [labaKotor=" + labaKotor
				+ ", netCashFlow=" + netCashFlow + ", ratioTagihanBrutto="
				+ ratioTagihanBrutto + ", penjualan=" + penjualan + "]";
	}

}
