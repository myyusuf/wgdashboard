package id.co.wikagedung.system.projectDashboard.model.limaR;

public class Rapi {

	private RapiKantorDanSekitarnya rapiKantorDanSekitarnya;
	private RapiKriteriaStandar rapiKriteriaStandar;
	private RapiKriteriaTambahan rapiKriteriaTambahan;

	public Rapi() {
	}

	public Rapi(RapiKantorDanSekitarnya rapiKantorDanSekitarnya,
			RapiKriteriaStandar rapiKriteriaStandar,
			RapiKriteriaTambahan rapiKriteriaTambahan) {
		this.rapiKantorDanSekitarnya = rapiKantorDanSekitarnya;
		this.rapiKriteriaStandar = rapiKriteriaStandar;
		this.rapiKriteriaTambahan = rapiKriteriaTambahan;
	}

	public RapiKantorDanSekitarnya getRapiKantorDanSekitarnya() {
		return rapiKantorDanSekitarnya;
	}

	public void setRapiKantorDanSekitarnya(
			RapiKantorDanSekitarnya rapiKantorDanSekitarnya) {
		this.rapiKantorDanSekitarnya = rapiKantorDanSekitarnya;
	}

	public RapiKriteriaStandar getRapiKriteriaStandar() {
		return rapiKriteriaStandar;
	}

	public void setRapiKriteriaStandar(RapiKriteriaStandar rapiKriteriaStandar) {
		this.rapiKriteriaStandar = rapiKriteriaStandar;
	}

	public RapiKriteriaTambahan getRapiKriteriaTambahan() {
		return rapiKriteriaTambahan;
	}

	public void setRapiKriteriaTambahan(
			RapiKriteriaTambahan rapiKriteriaTambahan) {
		this.rapiKriteriaTambahan = rapiKriteriaTambahan;
	}

	@Override
	public String toString() {
		return "Rapi [rapiKantorDanSekitarnya=" + rapiKantorDanSekitarnya
				+ ", rapiKriteriaStandar=" + rapiKriteriaStandar
				+ ", rapiKriteriaTambahan=" + rapiKriteriaTambahan + "]";
	}

}
