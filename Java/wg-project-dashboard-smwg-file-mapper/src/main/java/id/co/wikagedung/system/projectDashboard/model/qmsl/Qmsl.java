package id.co.wikagedung.system.projectDashboard.model.qmsl;

public class Qmsl {

	private ManajerKepalaProyek manajerKepalaProyek;
	private FungsiKomersial fungsiKomersial;
	private FungsiQa fungsiQa;
	private FungsiProduksi fungsiProduksi;
	private FungsiEnjinering fungsiEnjinering;
	private FungsiPengadaan fungsiPengadaan;
	private FungsiKa fungsiKa;
	private Double total;

	public Qmsl() {
	}

	public Qmsl(ManajerKepalaProyek manajerKepalaProyek,
			FungsiKomersial fungsiKomersial, FungsiQa fungsiQa,
			FungsiProduksi fungsiProduksi, FungsiEnjinering fungsiEnjinering,
			FungsiPengadaan fungsiPengadaan, FungsiKa fungsiKa, Double total) {
		this.manajerKepalaProyek = manajerKepalaProyek;
		this.fungsiKomersial = fungsiKomersial;
		this.fungsiQa = fungsiQa;
		this.fungsiProduksi = fungsiProduksi;
		this.fungsiEnjinering = fungsiEnjinering;
		this.fungsiPengadaan = fungsiPengadaan;
		this.fungsiKa = fungsiKa;
		this.total = total;
	}

	public ManajerKepalaProyek getManajerKepalaProyek() {
		return manajerKepalaProyek;
	}

	public void setManajerKepalaProyek(ManajerKepalaProyek manajerKepalaProyek) {
		this.manajerKepalaProyek = manajerKepalaProyek;
	}

	public FungsiKomersial getFungsiKomersial() {
		return fungsiKomersial;
	}

	public void setFungsiKomersial(FungsiKomersial fungsiKomersial) {
		this.fungsiKomersial = fungsiKomersial;
	}

	public FungsiQa getFungsiQa() {
		return fungsiQa;
	}

	public void setFungsiQa(FungsiQa fungsiQa) {
		this.fungsiQa = fungsiQa;
	}

	public FungsiProduksi getFungsiProduksi() {
		return fungsiProduksi;
	}

	public void setFungsiProduksi(FungsiProduksi fungsiProduksi) {
		this.fungsiProduksi = fungsiProduksi;
	}

	public FungsiEnjinering getFungsiEnjinering() {
		return fungsiEnjinering;
	}

	public void setFungsiEnjinering(FungsiEnjinering fungsiEnjinering) {
		this.fungsiEnjinering = fungsiEnjinering;
	}

	public FungsiPengadaan getFungsiPengadaan() {
		return fungsiPengadaan;
	}

	public void setFungsiPengadaan(FungsiPengadaan fungsiPengadaan) {
		this.fungsiPengadaan = fungsiPengadaan;
	}

	public FungsiKa getFungsiKa() {
		return fungsiKa;
	}

	public void setFungsiKa(FungsiKa fungsiKa) {
		this.fungsiKa = fungsiKa;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Qmsl [manajerKepalaProyek=" + manajerKepalaProyek
				+ ", fungsiKomersial=" + fungsiKomersial + ", fungsiQa="
				+ fungsiQa + ", fungsiProduksi=" + fungsiProduksi
				+ ", fungsiEnjinering=" + fungsiEnjinering
				+ ", fungsiPengadaan=" + fungsiPengadaan + ", fungsiKa="
				+ fungsiKa + ", total=" + total + "]";
	}

}
