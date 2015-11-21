package id.co.wikagedung.system.projectDashboard.model.sheLevel;

public class TindakanPemeriksaanDanPerbaikan {

	private String id;
	private String namaProyek;
	private String periode;
	private Double audit;
	private Double inspeksiSheAlatBantu;
	private Double inspeksiShePeralatanShe;
	private Double inspeksiShePemantauanLingkungan;
	private Double penangananKecelakaan;
	private Double penangananPencemaranLingkungan;
	private Double penyakitAkibatKerja;
	private Double klinikKesehatan;
	private Double kantinWarungPekerjaKatering;

	public TindakanPemeriksaanDanPerbaikan() {
	}

	public TindakanPemeriksaanDanPerbaikan(String id, String namaProyek,
			String periode, Double audit, Double inspeksiSheAlatBantu,
			Double inspeksiShePeralatanShe,
			Double inspeksiShePemantauanLingkungan,
			Double penangananKecelakaan, Double penangananPencemaranLingkungan,
			Double penyakitAkibatKerja, Double klinikKesehatan,
			Double kantinWarungPekerjaKatering) {
		this.id = id;
		this.namaProyek = namaProyek;
		this.periode = periode;
		this.audit = audit;
		this.inspeksiSheAlatBantu = inspeksiSheAlatBantu;
		this.inspeksiShePeralatanShe = inspeksiShePeralatanShe;
		this.inspeksiShePemantauanLingkungan = inspeksiShePemantauanLingkungan;
		this.penangananKecelakaan = penangananKecelakaan;
		this.penangananPencemaranLingkungan = penangananPencemaranLingkungan;
		this.penyakitAkibatKerja = penyakitAkibatKerja;
		this.klinikKesehatan = klinikKesehatan;
		this.kantinWarungPekerjaKatering = kantinWarungPekerjaKatering;
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

	public Double getAudit() {
		return audit;
	}

	public void setAudit(Double audit) {
		this.audit = audit;
	}

	public Double getInspeksiSheAlatBantu() {
		return inspeksiSheAlatBantu;
	}

	public void setInspeksiSheAlatBantu(Double inspeksiSheAlatBantu) {
		this.inspeksiSheAlatBantu = inspeksiSheAlatBantu;
	}

	public Double getInspeksiShePeralatanShe() {
		return inspeksiShePeralatanShe;
	}

	public void setInspeksiShePeralatanShe(Double inspeksiShePeralatanShe) {
		this.inspeksiShePeralatanShe = inspeksiShePeralatanShe;
	}

	public Double getInspeksiShePemantauanLingkungan() {
		return inspeksiShePemantauanLingkungan;
	}

	public void setInspeksiShePemantauanLingkungan(
			Double inspeksiShePemantauanLingkungan) {
		this.inspeksiShePemantauanLingkungan = inspeksiShePemantauanLingkungan;
	}

	public Double getPenangananKecelakaan() {
		return penangananKecelakaan;
	}

	public void setPenangananKecelakaan(Double penangananKecelakaan) {
		this.penangananKecelakaan = penangananKecelakaan;
	}

	public Double getPenangananPencemaranLingkungan() {
		return penangananPencemaranLingkungan;
	}

	public void setPenangananPencemaranLingkungan(
			Double penangananPencemaranLingkungan) {
		this.penangananPencemaranLingkungan = penangananPencemaranLingkungan;
	}

	public Double getPenyakitAkibatKerja() {
		return penyakitAkibatKerja;
	}

	public void setPenyakitAkibatKerja(Double penyakitAkibatKerja) {
		this.penyakitAkibatKerja = penyakitAkibatKerja;
	}

	public Double getKlinikKesehatan() {
		return klinikKesehatan;
	}

	public void setKlinikKesehatan(Double klinikKesehatan) {
		this.klinikKesehatan = klinikKesehatan;
	}

	public Double getKantinWarungPekerjaKatering() {
		return kantinWarungPekerjaKatering;
	}

	public void setKantinWarungPekerjaKatering(
			Double kantinWarungPekerjaKatering) {
		this.kantinWarungPekerjaKatering = kantinWarungPekerjaKatering;
	}

	@Override
	public String toString() {
		return "TindakanPemeriksaanDanPerbaikan [id=" + id + ", namaProyek="
				+ namaProyek + ", periode=" + periode + ", audit=" + audit
				+ ", inspeksiSheAlatBantu=" + inspeksiSheAlatBantu
				+ ", inspeksiShePeralatanShe=" + inspeksiShePeralatanShe
				+ ", inspeksiShePemantauanLingkungan="
				+ inspeksiShePemantauanLingkungan + ", penangananKecelakaan="
				+ penangananKecelakaan + ", penangananPencemaranLingkungan="
				+ penangananPencemaranLingkungan + ", penyakitAkibatKerja="
				+ penyakitAkibatKerja + ", klinikKesehatan=" + klinikKesehatan
				+ ", kantinWarungPekerjaKatering="
				+ kantinWarungPekerjaKatering + "]";
	}

}
