package id.co.wikagedung.system.projectDashboard.model.qPass;

public class PekerjaanStruktur {

	private PekerjaanStrukturBekisting pekerjaanStrukturBekisting;
	private PekerjaanStrukturBesi pekerjaanStrukturBesi;
	private PekerjaanStrukturBetonFinish pekerjaanStrukturBetonFinish;
	private PekerjaanStrukturMutuBeton pekerjaanStrukturMutuBeton;
	private PekerjaanStrukturMutuBesi pekerjaanStrukturMutuBesi;
	private Double subTotal;

	public PekerjaanStruktur() {
	}

	public PekerjaanStruktur(
			PekerjaanStrukturBekisting pekerjaanStrukturBekisting,
			PekerjaanStrukturBesi pekerjaanStrukturBesi,
			PekerjaanStrukturBetonFinish pekerjaanStrukturBetonFinish,
			PekerjaanStrukturMutuBeton pekerjaanStrukturMutuBeton,
			PekerjaanStrukturMutuBesi pekerjaanStrukturMutuBesi, Double subTotal) {
		this.pekerjaanStrukturBekisting = pekerjaanStrukturBekisting;
		this.pekerjaanStrukturBesi = pekerjaanStrukturBesi;
		this.pekerjaanStrukturBetonFinish = pekerjaanStrukturBetonFinish;
		this.pekerjaanStrukturMutuBeton = pekerjaanStrukturMutuBeton;
		this.pekerjaanStrukturMutuBesi = pekerjaanStrukturMutuBesi;
		this.subTotal = subTotal;
	}

	public PekerjaanStrukturBekisting getPekerjaanStrukturBekisting() {
		return pekerjaanStrukturBekisting;
	}

	public void setPekerjaanStrukturBekisting(
			PekerjaanStrukturBekisting pekerjaanStrukturBekisting) {
		this.pekerjaanStrukturBekisting = pekerjaanStrukturBekisting;
	}

	public PekerjaanStrukturBesi getPekerjaanStrukturBesi() {
		return pekerjaanStrukturBesi;
	}

	public void setPekerjaanStrukturBesi(
			PekerjaanStrukturBesi pekerjaanStrukturBesi) {
		this.pekerjaanStrukturBesi = pekerjaanStrukturBesi;
	}

	public PekerjaanStrukturBetonFinish getPekerjaanStrukturBetonFinish() {
		return pekerjaanStrukturBetonFinish;
	}

	public void setPekerjaanStrukturBetonFinish(
			PekerjaanStrukturBetonFinish pekerjaanStrukturBetonFinish) {
		this.pekerjaanStrukturBetonFinish = pekerjaanStrukturBetonFinish;
	}

	public PekerjaanStrukturMutuBeton getPekerjaanStrukturMutuBeton() {
		return pekerjaanStrukturMutuBeton;
	}

	public void setPekerjaanStrukturMutuBeton(
			PekerjaanStrukturMutuBeton pekerjaanStrukturMutuBeton) {
		this.pekerjaanStrukturMutuBeton = pekerjaanStrukturMutuBeton;
	}

	public PekerjaanStrukturMutuBesi getPekerjaanStrukturMutuBesi() {
		return pekerjaanStrukturMutuBesi;
	}

	public void setPekerjaanStrukturMutuBesi(
			PekerjaanStrukturMutuBesi pekerjaanStrukturMutuBesi) {
		this.pekerjaanStrukturMutuBesi = pekerjaanStrukturMutuBesi;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "PekerjaanStruktur [pekerjaanStrukturBekisting="
				+ pekerjaanStrukturBekisting + ", pekerjaanStrukturBesi="
				+ pekerjaanStrukturBesi + ", pekerjaanStrukturBetonFinish="
				+ pekerjaanStrukturBetonFinish
				+ ", pekerjaanStrukturMutuBeton=" + pekerjaanStrukturMutuBeton
				+ ", pekerjaanStrukturMutuBesi=" + pekerjaanStrukturMutuBesi
				+ ", subTotal=" + subTotal + "]";
	}

}
