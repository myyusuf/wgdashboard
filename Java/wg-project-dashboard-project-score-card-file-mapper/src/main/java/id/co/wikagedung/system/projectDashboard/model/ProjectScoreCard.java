package id.co.wikagedung.system.projectDashboard.model;

public class ProjectScoreCard {

	private HasilProdukdanJasa hasilProdukdanJasa;
	private HasilFokusPadaPelanggan hasilFokusPadaPelanggan;
	private HasilKeuanganDanPasar hasilKeuanganDanPasar;
	private HasilEfektifitasProses hasilEfektifitasProses;
	private HasilKepemimpinan hasilKepemimpinan;

	public ProjectScoreCard() {
	}

	public ProjectScoreCard(HasilProdukdanJasa hasilProdukdanJasa,
			HasilFokusPadaPelanggan hasilFokusPadaPelanggan,
			HasilKeuanganDanPasar hasilKeuanganDanPasar,
			HasilEfektifitasProses hasilEfektifitasProses,
			HasilKepemimpinan hasilKepemimpinan) {
		this.hasilProdukdanJasa = hasilProdukdanJasa;
		this.hasilFokusPadaPelanggan = hasilFokusPadaPelanggan;
		this.hasilKeuanganDanPasar = hasilKeuanganDanPasar;
		this.hasilEfektifitasProses = hasilEfektifitasProses;
		this.hasilKepemimpinan = hasilKepemimpinan;
	}

	public HasilProdukdanJasa getHasilProdukdanJasa() {
		return hasilProdukdanJasa;
	}

	public void setHasilProdukdanJasa(HasilProdukdanJasa hasilProdukdanJasa) {
		this.hasilProdukdanJasa = hasilProdukdanJasa;
	}

	public HasilFokusPadaPelanggan getHasilFokusPadaPelanggan() {
		return hasilFokusPadaPelanggan;
	}

	public void setHasilFokusPadaPelanggan(
			HasilFokusPadaPelanggan hasilFokusPadaPelanggan) {
		this.hasilFokusPadaPelanggan = hasilFokusPadaPelanggan;
	}

	public HasilKeuanganDanPasar getHasilKeuanganDanPasar() {
		return hasilKeuanganDanPasar;
	}

	public void setHasilKeuanganDanPasar(
			HasilKeuanganDanPasar hasilKeuanganDanPasar) {
		this.hasilKeuanganDanPasar = hasilKeuanganDanPasar;
	}

	public HasilEfektifitasProses getHasilEfektifitasProses() {
		return hasilEfektifitasProses;
	}

	public void setHasilEfektifitasProses(
			HasilEfektifitasProses hasilEfektifitasProses) {
		this.hasilEfektifitasProses = hasilEfektifitasProses;
	}

	public HasilKepemimpinan getHasilKepemimpinan() {
		return hasilKepemimpinan;
	}

	public void setHasilKepemimpinan(HasilKepemimpinan hasilKepemimpinan) {
		this.hasilKepemimpinan = hasilKepemimpinan;
	}

	@Override
	public String toString() {
		return "ProjectScoreCard [hasilProdukdanJasa=" + hasilProdukdanJasa
				+ ", hasilFokusPadaPelanggan=" + hasilFokusPadaPelanggan
				+ ", hasilKeuanganDanPasar=" + hasilKeuanganDanPasar
				+ ", hasilEfektifitasProses=" + hasilEfektifitasProses
				+ ", hasilKepemimpinan=" + hasilKepemimpinan + "]";
	}

}
