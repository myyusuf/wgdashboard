package id.co.wikagedung.system.projectDashboard.model.limaR;

public class RingkasKantorDanSekitarnya {

	private String id;
	private String namaProyek;
	private String periode;
	private Double kantorTempatKerja;
	private Double kantorAtkMesinAlatPenunjang;
	private Double kantorBahanRujukanReferensiArsip;
	private Double kantorDokumen;
	private Double musholla;
	private Double toilet;

	public RingkasKantorDanSekitarnya() {
	}

	public RingkasKantorDanSekitarnya(String id, String namaProyek, String periode,
			Double kantorTempatKerja, Double kantorAtkMesinAlatPenunjang,
			Double kantorBahanRujukanReferensiArsip, Double kantorDokumen,
			Double musholla, Double toilet) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.kantorTempatKerja = kantorTempatKerja;
		this.kantorAtkMesinAlatPenunjang = kantorAtkMesinAlatPenunjang;
		this.kantorBahanRujukanReferensiArsip = kantorBahanRujukanReferensiArsip;
		this.kantorDokumen = kantorDokumen;
		this.musholla = musholla;
		this.toilet = toilet;
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

	public Double getKantorTempatKerja() {
		return kantorTempatKerja;
	}

	public void setKantorTempatKerja(Double kantorTempatKerja) {
		this.kantorTempatKerja = kantorTempatKerja;
	}

	public Double getKantorAtkMesinAlatPenunjang() {
		return kantorAtkMesinAlatPenunjang;
	}

	public void setKantorAtkMesinAlatPenunjang(
			Double kantorAtkMesinAlatPenunjang) {
		this.kantorAtkMesinAlatPenunjang = kantorAtkMesinAlatPenunjang;
	}

	public Double getKantorBahanRujukanReferensiArsip() {
		return kantorBahanRujukanReferensiArsip;
	}

	public void setKantorBahanRujukanReferensiArsip(
			Double kantorBahanRujukanReferensiArsip) {
		this.kantorBahanRujukanReferensiArsip = kantorBahanRujukanReferensiArsip;
	}

	public Double getKantorDokumen() {
		return kantorDokumen;
	}

	public void setKantorDokumen(Double kantorDokumen) {
		this.kantorDokumen = kantorDokumen;
	}

	public Double getMusholla() {
		return musholla;
	}

	public void setMusholla(Double musholla) {
		this.musholla = musholla;
	}

	public Double getToilet() {
		return toilet;
	}

	public void setToilet(Double toilet) {
		this.toilet = toilet;
	}

	@Override
	public String toString() {
		return "KantorDanSekitarnya [id=" + id + ", namaProyek=" + namaProyek
				+ ", periode=" + periode + ", kantorTempatKerja="
				+ kantorTempatKerja + ", kantorAtkMesinAlatPenunjang="
				+ kantorAtkMesinAlatPenunjang
				+ ", kantorBahanRujukanReferensiArsip="
				+ kantorBahanRujukanReferensiArsip + ", kantorDokumen="
				+ kantorDokumen + ", musholla=" + musholla + ", toilet="
				+ toilet + "]";
	}

}
