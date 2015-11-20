package id.co.wikagedung.system.projectDashboard.model.limaR;

public class Ringkas {

	private RingkasKantorDanSekitarnya ringkasKantorDanSekitarnya;
	private RingkasKriteriaStandar ringkasKriteriaStandar;
	private RingkasKriteriaTambahan ringkasKriteriaTambahan;
	private Double subTotal;

	public Ringkas() {
	}

	public Ringkas(RingkasKantorDanSekitarnya ringkasKantorDanSekitarnya,
			RingkasKriteriaStandar ringkasKriteriaStandar,
			RingkasKriteriaTambahan ringkasKriteriaTambahan, Double subTotal) {
		this.ringkasKantorDanSekitarnya = ringkasKantorDanSekitarnya;
		this.ringkasKriteriaStandar = ringkasKriteriaStandar;
		this.ringkasKriteriaTambahan = ringkasKriteriaTambahan;
		this.subTotal = subTotal;
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

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "Ringkas [ringkasKantorDanSekitarnya="
				+ ringkasKantorDanSekitarnya + ", ringkasKriteriaStandar="
				+ ringkasKriteriaStandar + ", ringkasKriteriaTambahan="
				+ ringkasKriteriaTambahan + ", subTotal=" + subTotal + "]";
	}

}
