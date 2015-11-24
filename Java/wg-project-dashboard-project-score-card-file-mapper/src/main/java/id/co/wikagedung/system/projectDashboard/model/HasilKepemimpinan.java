package id.co.wikagedung.system.projectDashboard.model;

public class HasilKepemimpinan {

	private RiskManagement riskManagement;

	public HasilKepemimpinan() {
	}

	public HasilKepemimpinan(RiskManagement riskManagement) {
		this.riskManagement = riskManagement;
	}

	public RiskManagement getRiskManagement() {
		return riskManagement;
	}

	public void setRiskManagement(RiskManagement riskManagement) {
		this.riskManagement = riskManagement;
	}

	@Override
	public String toString() {
		return "HasilKepemimpinan [riskManagement=" + riskManagement + "]";
	}

}
