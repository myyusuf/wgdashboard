package id.co.wikagedung.system.projectDashboard.model.qPass;

public class PekerjaanArsitektur {

	private PekerjaanArsitekturInternalFinishes pekerjaanArsitekturInternalFinishes;
	private PekerjaanArsitekturEskternalWall pekerjaanArsitekturEskternalWall;
	private PekerjaanArsitekturEksternalWork pekerjaanArsitekturEksternalWork;
	private PekerjaanArsitekturTesFungsi pekerjaanArsitekturTesFungsi;
	private Double subTotal;

	public PekerjaanArsitektur() {
	}

	public PekerjaanArsitektur(
			PekerjaanArsitekturInternalFinishes pekerjaanArsitekturInternalFinishes,
			PekerjaanArsitekturEskternalWall pekerjaanArsitekturEskternalWall,
			PekerjaanArsitekturEksternalWork pekerjaanArsitekturEksternalWork,
			PekerjaanArsitekturTesFungsi pekerjaanArsitekturTesFungsi,
			Double subTotal) {
		this.pekerjaanArsitekturInternalFinishes = pekerjaanArsitekturInternalFinishes;
		this.pekerjaanArsitekturEskternalWall = pekerjaanArsitekturEskternalWall;
		this.pekerjaanArsitekturEksternalWork = pekerjaanArsitekturEksternalWork;
		this.pekerjaanArsitekturTesFungsi = pekerjaanArsitekturTesFungsi;
		this.subTotal = subTotal;
	}

	public PekerjaanArsitekturInternalFinishes getPekerjaanArsitekturInternalFinishes() {
		return pekerjaanArsitekturInternalFinishes;
	}

	public void setPekerjaanArsitekturInternalFinishes(
			PekerjaanArsitekturInternalFinishes pekerjaanArsitekturInternalFinishes) {
		this.pekerjaanArsitekturInternalFinishes = pekerjaanArsitekturInternalFinishes;
	}

	public PekerjaanArsitekturEskternalWall getPekerjaanArsitekturEskternalWall() {
		return pekerjaanArsitekturEskternalWall;
	}

	public void setPekerjaanArsitekturEskternalWall(
			PekerjaanArsitekturEskternalWall pekerjaanArsitekturEskternalWall) {
		this.pekerjaanArsitekturEskternalWall = pekerjaanArsitekturEskternalWall;
	}

	public PekerjaanArsitekturEksternalWork getPekerjaanArsitekturEksternalWork() {
		return pekerjaanArsitekturEksternalWork;
	}

	public void setPekerjaanArsitekturEksternalWork(
			PekerjaanArsitekturEksternalWork pekerjaanArsitekturEksternalWork) {
		this.pekerjaanArsitekturEksternalWork = pekerjaanArsitekturEksternalWork;
	}

	public PekerjaanArsitekturTesFungsi getPekerjaanArsitekturTesFungsi() {
		return pekerjaanArsitekturTesFungsi;
	}

	public void setPekerjaanArsitekturTesFungsi(
			PekerjaanArsitekturTesFungsi pekerjaanArsitekturTesFungsi) {
		this.pekerjaanArsitekturTesFungsi = pekerjaanArsitekturTesFungsi;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "PekerjaanArsitektur [pekerjaanArsitekturInternalFinishes="
				+ pekerjaanArsitekturInternalFinishes
				+ ", pekerjaanArsitekturEskternalWall="
				+ pekerjaanArsitekturEskternalWall
				+ ", pekerjaanArsitekturEksternalWork="
				+ pekerjaanArsitekturEksternalWork
				+ ", pekerjaanArsitekturTesFungsi="
				+ pekerjaanArsitekturTesFungsi + ", subTotal=" + subTotal + "]";
	}

}
