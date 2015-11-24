package id.co.wikagedung.system.projectDashboard.model;

public class HasilProdukdanJasa {

	private Mutu mutu;

	public HasilProdukdanJasa() {
	}

	public HasilProdukdanJasa(Mutu mutu) {
		this.mutu = mutu;
	}

	public Mutu getMutu() {
		return mutu;
	}

	public void setMutu(Mutu mutu) {
		this.mutu = mutu;
	}

	@Override
	public String toString() {
		return "HasilProdukdanJasa [mutu=" + mutu + "]";
	}

}
