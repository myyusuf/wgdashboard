package id.co.wikagedung.system.projectDashboard.model.qPass;

public class QPass {

	private PekerjaanStruktur pekerjaanStruktur;
	private PekerjaanArsitektur pekerjaanArsitektur;
	private Double totalScore;

	public QPass() {
	}

	public QPass(PekerjaanStruktur pekerjaanStruktur,
			PekerjaanArsitektur pekerjaanArsitektur, Double totalScore) {
		this.pekerjaanStruktur = pekerjaanStruktur;
		this.pekerjaanArsitektur = pekerjaanArsitektur;
		this.totalScore = totalScore;
	}

	public PekerjaanStruktur getPekerjaanStruktur() {
		return pekerjaanStruktur;
	}

	public void setPekerjaanStruktur(PekerjaanStruktur pekerjaanStruktur) {
		this.pekerjaanStruktur = pekerjaanStruktur;
	}

	public PekerjaanArsitektur getPekerjaanArsitektur() {
		return pekerjaanArsitektur;
	}

	public void setPekerjaanArsitektur(PekerjaanArsitektur pekerjaanArsitektur) {
		this.pekerjaanArsitektur = pekerjaanArsitektur;
	}

	public Double getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Double totalScore) {
		this.totalScore = totalScore;
	}

	@Override
	public String toString() {
		return "QPass [pekerjaanStruktur=" + pekerjaanStruktur
				+ ", pekerjaanArsitektur=" + pekerjaanArsitektur
				+ ", totalScore=" + totalScore + "]";
	}

}
