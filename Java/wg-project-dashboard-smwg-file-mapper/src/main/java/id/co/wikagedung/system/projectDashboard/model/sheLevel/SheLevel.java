package id.co.wikagedung.system.projectDashboard.model.sheLevel;

public class SheLevel {

	private KebijakanKTiga kebijakanKTiga;
	private Perencanaan perencanaan;
	private PenerapanDanOperasional penerapanDanOperasional;
	private TindakanPemeriksaanDanPerbaikan tindakanPemeriksaanDanPerbaikan;
	private EvaluasiPenataan evaluasiPenataan;
	private ResultShe resultShe;
	private ImplementasiBenchmarkProject implementasiBenchmarkProject;
	private Double total;

	public SheLevel() {
	}

	public SheLevel(KebijakanKTiga kebijakanKTiga, Perencanaan perencanaan,
			PenerapanDanOperasional penerapanDanOperasional,
			TindakanPemeriksaanDanPerbaikan tindakanPemeriksaanDanPerbaikan,
			EvaluasiPenataan evaluasiPenataan, ResultShe resultShe,
			ImplementasiBenchmarkProject implementasiBenchmarkProject,
			Double total) {
		this.kebijakanKTiga = kebijakanKTiga;
		this.perencanaan = perencanaan;
		this.penerapanDanOperasional = penerapanDanOperasional;
		this.tindakanPemeriksaanDanPerbaikan = tindakanPemeriksaanDanPerbaikan;
		this.evaluasiPenataan = evaluasiPenataan;
		this.resultShe = resultShe;
		this.implementasiBenchmarkProject = implementasiBenchmarkProject;
		this.total = total;
	}

	public KebijakanKTiga getKebijakanKTiga() {
		return kebijakanKTiga;
	}

	public void setKebijakanKTiga(KebijakanKTiga kebijakanKTiga) {
		this.kebijakanKTiga = kebijakanKTiga;
	}

	public Perencanaan getPerencanaan() {
		return perencanaan;
	}

	public void setPerencanaan(Perencanaan perencanaan) {
		this.perencanaan = perencanaan;
	}

	public PenerapanDanOperasional getPenerapanDanOperasional() {
		return penerapanDanOperasional;
	}

	public void setPenerapanDanOperasional(
			PenerapanDanOperasional penerapanDanOperasional) {
		this.penerapanDanOperasional = penerapanDanOperasional;
	}

	public TindakanPemeriksaanDanPerbaikan getTindakanPemeriksaanDanPerbaikan() {
		return tindakanPemeriksaanDanPerbaikan;
	}

	public void setTindakanPemeriksaanDanPerbaikan(
			TindakanPemeriksaanDanPerbaikan tindakanPemeriksaanDanPerbaikan) {
		this.tindakanPemeriksaanDanPerbaikan = tindakanPemeriksaanDanPerbaikan;
	}

	public EvaluasiPenataan getEvaluasiPenataan() {
		return evaluasiPenataan;
	}

	public void setEvaluasiPenataan(EvaluasiPenataan evaluasiPenataan) {
		this.evaluasiPenataan = evaluasiPenataan;
	}

	public ResultShe getResultShe() {
		return resultShe;
	}

	public void setResultShe(ResultShe resultShe) {
		this.resultShe = resultShe;
	}

	public ImplementasiBenchmarkProject getImplementasiBenchmarkProject() {
		return implementasiBenchmarkProject;
	}

	public void setImplementasiBenchmarkProject(
			ImplementasiBenchmarkProject implementasiBenchmarkProject) {
		this.implementasiBenchmarkProject = implementasiBenchmarkProject;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "SheLevel [kebijakanKTiga=" + kebijakanKTiga + ", perencanaan="
				+ perencanaan + ", penerapanDanOperasional="
				+ penerapanDanOperasional
				+ ", tindakanPemeriksaanDanPerbaikan="
				+ tindakanPemeriksaanDanPerbaikan + ", evaluasiPenataan="
				+ evaluasiPenataan + ", resultShe=" + resultShe
				+ ", implementasiBenchmarkProject="
				+ implementasiBenchmarkProject + ", total=" + total + "]";
	}

}
