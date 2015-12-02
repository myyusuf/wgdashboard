package id.co.wikagedung.system.projectDashboard.model;

public class RekonBank {

	private String id;
	private String namaProyek;
	private String periode;
	private MenurutBank menurutBank;
	private MenurutRegisterBankWg menurutRegisterBankWg;

	public RekonBank() {
	}

	public RekonBank(String id, String namaProyek, String periode,
			MenurutBank menurutBank, MenurutRegisterBankWg menurutRegisterBankWg) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.menurutBank = menurutBank;
		this.menurutRegisterBankWg = menurutRegisterBankWg;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNamaProyek() {
		return namaProyek;
	}

	public void setNamaProyek(String namaProyek) {
		this.namaProyek = namaProyek;
	}

	public String getPeriode() {
		return periode;
	}

	public void setPeriode(String periode) {
		this.periode = periode;
	}

	public MenurutBank getMenurutBank() {
		return menurutBank;
	}

	public void setMenurutBank(MenurutBank menurutBank) {
		this.menurutBank = menurutBank;
	}

	public MenurutRegisterBankWg getMenurutRegisterBankWg() {
		return menurutRegisterBankWg;
	}

	public void setMenurutRegisterBankWg(
			MenurutRegisterBankWg menurutRegisterBankWg) {
		this.menurutRegisterBankWg = menurutRegisterBankWg;
	}

	@Override
	public String toString() {
		return "RekonBank [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", menurutBank=" + menurutBank
				+ ", menurutRegisterBankWg=" + menurutRegisterBankWg + "]";
	}

}
