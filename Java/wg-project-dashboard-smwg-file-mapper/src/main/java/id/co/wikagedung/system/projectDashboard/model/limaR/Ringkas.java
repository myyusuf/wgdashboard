package id.co.wikagedung.system.projectDashboard.model.limaR;

public class Ringkas {

	private RingkasKantorDanSekitarnya ringkasKantorDanSekitarnya;
	private RingkasKriteriaStandar ringkasKriteriaStandar;
	private RingkasKriteriaTambahan ringkasKriteriaTambahan;

	public Ringkas() {
	}

	public Ringkas(RingkasKantorDanSekitarnya ringkasKantorDanSekitarnya,
			RingkasKriteriaStandar ringkasKriteriaStandar,
			RingkasKriteriaTambahan ringkasKriteriaTambahan) {
		this.ringkasKantorDanSekitarnya = ringkasKantorDanSekitarnya;
		this.ringkasKriteriaStandar = ringkasKriteriaStandar;
		this.ringkasKriteriaTambahan = ringkasKriteriaTambahan;
	}

	public RingkasKantorDanSekitarnya getRingkasKantorDanSekitarnya() {
		return ringkasKantorDanSekitarnya;
	}

	public void setRingkasKantorDanSekitarnya(
			RingkasKantorDanSekitarnya ringkasKantorDanSekitarnya) {
		this.ringkasKantorDanSekitarnya = ringkasKantorDanSekitarnya;
	}

	public RingkasKriteriaStandar getRingkasKriteriaStandar() {
		return ringkasKriteriaStandar;
	}

	public void setRingkasKriteriaStandar(
			RingkasKriteriaStandar ringkasKriteriaStandar) {
		this.ringkasKriteriaStandar = ringkasKriteriaStandar;
	}

	public RingkasKriteriaTambahan getRingkasKriteriaTambahan() {
		return ringkasKriteriaTambahan;
	}

	public void setRingkasKriteriaTambahan(
			RingkasKriteriaTambahan ringkasKriteriaTambahan) {
		this.ringkasKriteriaTambahan = ringkasKriteriaTambahan;
	}

	@Override
	public String toString() {
		return "Ringkas [ringkasKantorDanSekitarnya="
				+ ringkasKantorDanSekitarnya + ", ringkasKriteriaStandar="
				+ ringkasKriteriaStandar + ", ringkasKriteriaTambahan="
				+ ringkasKriteriaTambahan + "]";
	}

}
