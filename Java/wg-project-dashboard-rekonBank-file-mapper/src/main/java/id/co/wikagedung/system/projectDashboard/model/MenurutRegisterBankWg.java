package id.co.wikagedung.system.projectDashboard.model;

public class MenurutRegisterBankWg {

	private String keterangan;
	private Double jumlah;

	public MenurutRegisterBankWg() {
	}

	public MenurutRegisterBankWg(String keterangan, Double jumlah) {
		this.keterangan = keterangan;
		this.jumlah = jumlah;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	public Double getJumlah() {
		return jumlah;
	}

	public void setJumlah(Double jumlah) {
		this.jumlah = jumlah;
	}

	@Override
	public String toString() {
		return "MenurutRegisterBankWg [keterangan=" + keterangan + ", jumlah="
				+ jumlah + "]";
	}

}
