package id.co.wikagedung.system.projectDashboard.model.limaR;

public class Rajin {

	private RajinKantorDanSekitarnya rajinKantorDanSekitarnya;
	private RajinKriteriaStandar rajinKriteriaStandar;
	private RajinKriteriaTambahan rajinKriteriaTambahan;

	public Rajin() {
	}

	public Rajin(RajinKantorDanSekitarnya rajinKantorDanSekitarnya,
			RajinKriteriaStandar rajinKriteriaStandar,
			RajinKriteriaTambahan rajinKriteriaTambahan) {
		this.rajinKantorDanSekitarnya = rajinKantorDanSekitarnya;
		this.rajinKriteriaStandar = rajinKriteriaStandar;
		this.rajinKriteriaTambahan = rajinKriteriaTambahan;
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

	@Override
	public String toString() {
		return "Rajin [rajinKantorDanSekitarnya=" + rajinKantorDanSekitarnya
				+ ", rajinKriteriaStandar=" + rajinKriteriaStandar
				+ ", rajinKriteriaTambahan=" + rajinKriteriaTambahan + "]";
	}

}
