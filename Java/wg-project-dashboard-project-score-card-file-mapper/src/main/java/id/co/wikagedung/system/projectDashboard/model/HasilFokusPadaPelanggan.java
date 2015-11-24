package id.co.wikagedung.system.projectDashboard.model;

public class HasilFokusPadaPelanggan {

	private CustomerEngagement customerEngagement;
	private ResponseRate responseRate;

	public HasilFokusPadaPelanggan() {
	}

	public HasilFokusPadaPelanggan(CustomerEngagement customerEngagement,
			ResponseRate responseRate) {
		this.customerEngagement = customerEngagement;
		this.responseRate = responseRate;
	}

	public CustomerEngagement getCustomerEngagement() {
		return customerEngagement;
	}

	public void setCustomerEngagement(CustomerEngagement customerEngagement) {
		this.customerEngagement = customerEngagement;
	}

	public ResponseRate getResponseRate() {
		return responseRate;
	}

	public void setResponseRate(ResponseRate responseRate) {
		this.responseRate = responseRate;
	}

	@Override
	public String toString() {
		return "HasilFokusPadaPelanggan [customerEngagement="
				+ customerEngagement + ", responseRate=" + responseRate + "]";
	}

}
