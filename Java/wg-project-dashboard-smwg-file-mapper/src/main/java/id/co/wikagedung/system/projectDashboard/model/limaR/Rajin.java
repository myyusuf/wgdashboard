package id.co.wikagedung.system.projectDashboard.model.limaR;

public class Rajin {

	private RajinKantorDanSekitarnya rajinKantorDanSekitarnya;
	private RajinKriteriaStandar rajinKriteriaStandar;
	private RajinKriteriaTambahan rajinKriteriaTambahan;
	private Double subTotal;

	public Rajin() {
	}

	public Rajin(RajinKantorDanSekitarnya rajinKantorDanSekitarnya,
			RajinKriteriaStandar rajinKriteriaStandar,
			RajinKriteriaTambahan rajinKriteriaTambahan, Double subTotal) {
		this.rajinKantorDanSekitarnya = rajinKantorDanSekitarnya;
		this.rajinKriteriaStandar = rajinKriteriaStandar;
		this.rajinKriteriaTambahan = rajinKriteriaTambahan;
		this.subTotal = subTotal;
	}

	public RajinKantorDanSekitarnya getRajinKantorDanSekitarnya() {
		return rajinKantorDanSekitarnya;
	}

	public void setRajinKantorDanSekitarnya(
			RajinKantorDanSekitarnya rajinKantorDanSekitarnya) {
		this.rajinKantorDanSekitarnya = rajinKantorDanSekitarnya;
	}

	public RajinKriteriaStandar getRajinKriteriaStandar() {
		return rajinKriteriaStandar;
	}

	public void setRajinKriteriaStandar(
			RajinKriteriaStandar rajinKriteriaStandar) {
		this.rajinKriteriaStandar = rajinKriteriaStandar;
	}

	public RajinKriteriaTambahan getRajinKriteriaTambahan() {
		return rajinKriteriaTambahan;
	}

	public void setRajinKriteriaTambahan(
			RajinKriteriaTambahan rajinKriteriaTambahan) {
		this.rajinKriteriaTambahan = rajinKriteriaTambahan;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "Rajin [rajinKantorDanSekitarnya=" + rajinKantorDanSekitarnya
				+ ", rajinKriteriaStandar=" + rajinKriteriaStandar
				+ ", rajinKriteriaTambahan=" + rajinKriteriaTambahan
				+ ", subTotal=" + subTotal + "]";
	}

}
