package id.co.wikagedung.system.projectDashboard.model;

public class HasilEfektifitasProses {

	private SheComplianceLevel sheComplianceLevel;
	private InovasiKM inovasiKM;
	private EfisiensiPengadaan efisiensiPengadaan;

	public HasilEfektifitasProses() {
	}

	public HasilEfektifitasProses(SheComplianceLevel sheComplianceLevel,
			InovasiKM inovasiKM, EfisiensiPengadaan efisiensiPengadaan) {
		this.sheComplianceLevel = sheComplianceLevel;
		this.inovasiKM = inovasiKM;
		this.efisiensiPengadaan = efisiensiPengadaan;
	}

	public SheComplianceLevel getSheComplianceLevel() {
		return sheComplianceLevel;
	}

	public void setSheComplianceLevel(SheComplianceLevel sheComplianceLevel) {
		this.sheComplianceLevel = sheComplianceLevel;
	}

	public InovasiKM getInovasiKM() {
		return inovasiKM;
	}

	public void setInovasiKM(InovasiKM inovasiKM) {
		this.inovasiKM = inovasiKM;
	}

	public EfisiensiPengadaan getEfisiensiPengadaan() {
		return efisiensiPengadaan;
	}

	public void setEfisiensiPengadaan(EfisiensiPengadaan efisiensiPengadaan) {
		this.efisiensiPengadaan = efisiensiPengadaan;
	}

	@Override
	public String toString() {
		return "HasilEfektifitasProses [sheComplianceLevel="
				+ sheComplianceLevel + ", inovasiKM=" + inovasiKM
				+ ", efisiensiPengadaan=" + efisiensiPengadaan + "]";
	}

}
