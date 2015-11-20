package id.co.wikagedung.system.projectDashboard.model.limaR;

public class LimaR {

	private Ringkas ringkas;
	private Rapi rapi;
	private Resik resik;
	private Rawat rawat;
	private Rajin rajin;

	public LimaR() {
	}

	public LimaR(Ringkas ringkas, Rapi rapi, Resik resik, Rawat rawat,
			Rajin rajin) {
		this.ringkas = ringkas;
		this.rapi = rapi;
		this.resik = resik;
		this.rawat = rawat;
		this.rajin = rajin;
	}

	public Ringkas getRingkas() {
		return ringkas;
	}

	public void setRingkas(Ringkas ringkas) {
		this.ringkas = ringkas;
	}

	public Rapi getRapi() {
		return rapi;
	}

	public void setRapi(Rapi rapi) {
		this.rapi = rapi;
	}

	public Resik getResik() {
		return resik;
	}

	public void setResik(Resik resik) {
		this.resik = resik;
	}

	public Rawat getRawat() {
		return rawat;
	}

	public void setRawat(Rawat rawat) {
		this.rawat = rawat;
	}

	public Rajin getRajin() {
		return rajin;
	}

	public void setRajin(Rajin rajin) {
		this.rajin = rajin;
	}

	@Override
	public String toString() {
		return "LimaR [ringkas=" + ringkas + ", rapi=" + rapi + ", resik="
				+ resik + ", rawat=" + rawat + ", rajin=" + rajin + "]";
	}

}
