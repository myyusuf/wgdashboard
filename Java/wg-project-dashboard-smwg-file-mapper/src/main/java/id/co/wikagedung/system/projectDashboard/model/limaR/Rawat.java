package id.co.wikagedung.system.projectDashboard.model.limaR;

public class Rawat {

	private RawatKantorDanSekitarnya rawatKantorDanSekitarnya;
	private RawatKriteriaStandar rawatKriteriaStandar;
	private RawatKriteriaTambahan rawatKriteriaTambahan;
	private Double subTotal;

	public Rawat() {
	}

	public Rawat(RawatKantorDanSekitarnya rawatKantorDanSekitarnya,
			RawatKriteriaStandar rawatKriteriaStandar,
			RawatKriteriaTambahan rawatKriteriaTambahan, Double subTotal) {
		this.rawatKantorDanSekitarnya = rawatKantorDanSekitarnya;
		this.rawatKriteriaStandar = rawatKriteriaStandar;
		this.rawatKriteriaTambahan = rawatKriteriaTambahan;
		this.subTotal = subTotal;
	}

	public RawatKantorDanSekitarnya getRawatKantorDanSekitarnya() {
		return rawatKantorDanSekitarnya;
	}

	public void setRawatKantorDanSekitarnya(
			RawatKantorDanSekitarnya rawatKantorDanSekitarnya) {
		this.rawatKantorDanSekitarnya = rawatKantorDanSekitarnya;
	}

	public RawatKriteriaStandar getRawatKriteriaStandar() {
		return rawatKriteriaStandar;
	}

	public void setRawatKriteriaStandar(
			RawatKriteriaStandar rawatKriteriaStandar) {
		this.rawatKriteriaStandar = rawatKriteriaStandar;
	}

	public RawatKriteriaTambahan getRawatKriteriaTambahan() {
		return rawatKriteriaTambahan;
	}

	public void setRawatKriteriaTambahan(
			RawatKriteriaTambahan rawatKriteriaTambahan) {
		this.rawatKriteriaTambahan = rawatKriteriaTambahan;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "Rawat [rawatKantorDanSekitarnya=" + rawatKantorDanSekitarnya
				+ ", rawatKriteriaStandar=" + rawatKriteriaStandar
				+ ", rawatKriteriaTambahan=" + rawatKriteriaTambahan
				+ ", subTotal=" + subTotal + "]";
	}

}
