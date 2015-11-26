package id.co.wikagedung.system.projectDashboard.model;

public class Pdp {

	private String id;
	private String namaProyek;
	private String periode;
	private String spk;
	private String proyek;
	private Double ok;
	private Double op;
	private Double duaSetengahPersenOp;
	private Double siVo;
	private Double siVoProsentase;
	private Double cutOff;
	private Double cutOffProsentase;
	private Double preliminaries;
	private Double investasi;
	private Double totalPdp;
	private Double totalPdpSebelumnya;
	private String keterangan;

	public Pdp() {
	}

	public Pdp(String id, String namaProyek, String periode, String spk,
			String proyek, Double ok, Double op, Double duaSetengahPersenOp,
			Double siVo, Double siVoProsentase, Double cutOff,
			Double cutOffProsentase, Double preliminaries, Double investasi,
			Double totalPdp, Double totalPdpSebelumnya, String keterangan) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.spk = spk;
		this.proyek = proyek;
		this.ok = ok;
		this.op = op;
		this.duaSetengahPersenOp = duaSetengahPersenOp;
		this.siVo = siVo;
		this.siVoProsentase = siVoProsentase;
		this.cutOff = cutOff;
		this.cutOffProsentase = cutOffProsentase;
		this.preliminaries = preliminaries;
		this.investasi = investasi;
		this.totalPdp = totalPdp;
		this.totalPdpSebelumnya = totalPdpSebelumnya;
		this.keterangan = keterangan;
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

	public String getSpk() {
		return spk;
	}

	public void setSpk(String spk) {
		this.spk = spk;
	}

	public String getProyek() {
		return proyek;
	}

	public void setProyek(String proyek) {
		this.proyek = proyek;
	}

	public Double getOk() {
		return ok;
	}

	public void setOk(Double ok) {
		this.ok = ok;
	}

	public Double getOp() {
		return op;
	}

	public void setOp(Double op) {
		this.op = op;
	}

	public Double getDuaSetengahPersenOp() {
		return duaSetengahPersenOp;
	}

	public void setDuaSetengahPersenOp(Double duaSetengahPersenOp) {
		this.duaSetengahPersenOp = duaSetengahPersenOp;
	}

	public Double getSiVo() {
		return siVo;
	}

	public void setSiVo(Double siVo) {
		this.siVo = siVo;
	}

	public Double getSiVoProsentase() {
		return siVoProsentase;
	}

	public void setSiVoProsentase(Double siVoProsentase) {
		this.siVoProsentase = siVoProsentase;
	}

	public Double getCutOff() {
		return cutOff;
	}

	public void setCutOff(Double cutOff) {
		this.cutOff = cutOff;
	}

	public Double getCutOffProsentase() {
		return cutOffProsentase;
	}

	public void setCutOffProsentase(Double cutOffProsentase) {
		this.cutOffProsentase = cutOffProsentase;
	}

	public Double getPreliminaries() {
		return preliminaries;
	}

	public void setPreliminaries(Double preliminaries) {
		this.preliminaries = preliminaries;
	}

	public Double getInvestasi() {
		return investasi;
	}

	public void setInvestasi(Double investasi) {
		this.investasi = investasi;
	}

	public Double getTotalPdp() {
		return totalPdp;
	}

	public void setTotalPdp(Double totalPdp) {
		this.totalPdp = totalPdp;
	}

	public Double getTotalPdpSebelumnya() {
		return totalPdpSebelumnya;
	}

	public void setTotalPdpSebelumnya(Double totalPdpSebelumnya) {
		this.totalPdpSebelumnya = totalPdpSebelumnya;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	@Override
	public String toString() {
		return "Pdp [id=" + id + ", namaProyek=" + namaProyek + ", periode="
				+ periode + ", spk=" + spk + ", proyek=" + proyek + ", ok="
				+ ok + ", op=" + op + ", duaSetengahPersenOp="
				+ duaSetengahPersenOp + ", siVo=" + siVo + ", siVoProsentase="
				+ siVoProsentase + ", cutOff=" + cutOff + ", cutOffProsentase="
				+ cutOffProsentase + ", preliminaries=" + preliminaries
				+ ", investasi=" + investasi + ", totalPdp=" + totalPdp
				+ ", totalPdpSebelumnya=" + totalPdpSebelumnya
				+ ", keterangan=" + keterangan + "]";
	}

}
