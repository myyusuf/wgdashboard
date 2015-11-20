package id.co.wikagedung.system.projectDashboard.model.limaR;

public class Resik {

	private ResikKantorDanSekitarnya resikKantorDanSekitarnya;
	private ResikKriteriaStandar resikKriteriaStandar;
	private ResikKriteriaTambahan resikKriteriaTambahan;

	public Resik() {
	}

	public Resik(ResikKantorDanSekitarnya resikKantorDanSekitarnya,
			ResikKriteriaStandar resikKriteriaStandar,
			ResikKriteriaTambahan resikKriteriaTambahan) {
		this.resikKantorDanSekitarnya = resikKantorDanSekitarnya;
		this.resikKriteriaStandar = resikKriteriaStandar;
		this.resikKriteriaTambahan = resikKriteriaTambahan;
	}

	public ResikKantorDanSekitarnya getResikKantorDanSekitarnya() {
		return resikKantorDanSekitarnya;
	}

	public void setResikKantorDanSekitarnya(
			ResikKantorDanSekitarnya resikKantorDanSekitarnya) {
		this.resikKantorDanSekitarnya = resikKantorDanSekitarnya;
	}

	public ResikKriteriaStandar getResikKriteriaStandar() {
		return resikKriteriaStandar;
	}

	public void setResikKriteriaStandar(
			ResikKriteriaStandar resikKriteriaStandar) {
		this.resikKriteriaStandar = resikKriteriaStandar;
	}

	public ResikKriteriaTambahan getResikKriteriaTambahan() {
		return resikKriteriaTambahan;
	}

	public void setResikKriteriaTambahan(
			ResikKriteriaTambahan resikKriteriaTambahan) {
		this.resikKriteriaTambahan = resikKriteriaTambahan;
	}

	@Override
	public String toString() {
		return "Resik [resikKantorDanSekitarnya=" + resikKantorDanSekitarnya
				+ ", resikKriteriaStandar=" + resikKriteriaStandar
				+ ", resikKriteriaTambahan=" + resikKriteriaTambahan + "]";
	}

}
