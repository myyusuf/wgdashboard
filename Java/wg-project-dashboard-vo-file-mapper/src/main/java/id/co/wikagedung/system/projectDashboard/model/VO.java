package id.co.wikagedung.system.projectDashboard.model;

import java.util.Date;

public class VO {

	private String itemPengerjaan;
	private String noSuratPengajuan;
	private Date tanggalPengajuan;
	private String permohonanYangDiajukanBiaya;
	private String permohonanYangDiajukanWaktu;
	private Double besarnyaClaimAtasVODiajukan;
	private Double besarnyaClaimAtasVONegosiasi;
	private Double besarnyaClaimAtasVODisetujui;
	private Double besarnyaClaimAtasVODiprogress;
	private Double besarnyaClaimAtasVODibayar;
	private String pelaksanaanSudah;
	private String pelaksanaanBelum;
	private String keterangan;

	public VO() {

	}

	public VO(String itemPengerjaan, String noSuratPengajuan,
			Date tanggalPengajuan, String permohonanYangDiajukanBiaya,
			String permohonanYangDiajukanWaktu,
			Double besarnyaClaimAtasVODiajukan,
			Double besarnyaClaimAtasVONegosiasi,
			Double besarnyaClaimAtasVODisetujui,
			Double besarnyaClaimAtasVODiprogress,
			Double besarnyaClaimAtasVODibayar, String pelaksanaanSudah,
			String pelaksanaanBelum, String keterangan) {
		this.itemPengerjaan = itemPengerjaan;
		this.noSuratPengajuan = noSuratPengajuan;
		this.tanggalPengajuan = tanggalPengajuan;
		this.permohonanYangDiajukanBiaya = permohonanYangDiajukanBiaya;
		this.permohonanYangDiajukanWaktu = permohonanYangDiajukanWaktu;
		this.besarnyaClaimAtasVODiajukan = besarnyaClaimAtasVODiajukan;
		this.besarnyaClaimAtasVONegosiasi = besarnyaClaimAtasVONegosiasi;
		this.besarnyaClaimAtasVODisetujui = besarnyaClaimAtasVODisetujui;
		this.besarnyaClaimAtasVODiprogress = besarnyaClaimAtasVODiprogress;
		this.besarnyaClaimAtasVODibayar = besarnyaClaimAtasVODibayar;
		this.pelaksanaanSudah = pelaksanaanSudah;
		this.pelaksanaanBelum = pelaksanaanBelum;
		this.keterangan = keterangan;
	}

	public String getItemPengerjaan() {
		return itemPengerjaan;
	}

	public void setItemPengerjaan(String itemPengerjaan) {
		this.itemPengerjaan = itemPengerjaan;
	}

	public String getNoSuratPengajuan() {
		return noSuratPengajuan;
	}

	public void setNoSuratPengajuan(String noSuratPengajuan) {
		this.noSuratPengajuan = noSuratPengajuan;
	}

	public Date getTanggalPengajuan() {
		return tanggalPengajuan;
	}

	public void setTanggalPengajuan(Date tanggalPengajuan) {
		this.tanggalPengajuan = tanggalPengajuan;
	}

	public String getPermohonanYangDiajukanBiaya() {
		return permohonanYangDiajukanBiaya;
	}

	public void setPermohonanYangDiajukanBiaya(
			String permohonanYangDiajukanBiaya) {
		this.permohonanYangDiajukanBiaya = permohonanYangDiajukanBiaya;
	}

	public String getPermohonanYangDiajukanWaktu() {
		return permohonanYangDiajukanWaktu;
	}

	public void setPermohonanYangDiajukanWaktu(
			String permohonanYangDiajukanWaktu) {
		this.permohonanYangDiajukanWaktu = permohonanYangDiajukanWaktu;
	}

	public Double getBesarnyaClaimAtasVODiajukan() {
		return besarnyaClaimAtasVODiajukan;
	}

	public void setBesarnyaClaimAtasVODiajukan(
			Double besarnyaClaimAtasVODiajukan) {
		this.besarnyaClaimAtasVODiajukan = besarnyaClaimAtasVODiajukan;
	}

	public Double getBesarnyaClaimAtasVONegosiasi() {
		return besarnyaClaimAtasVONegosiasi;
	}

	public void setBesarnyaClaimAtasVONegosiasi(
			Double besarnyaClaimAtasVONegosiasi) {
		this.besarnyaClaimAtasVONegosiasi = besarnyaClaimAtasVONegosiasi;
	}

	public Double getBesarnyaClaimAtasVODisetujui() {
		return besarnyaClaimAtasVODisetujui;
	}

	public void setBesarnyaClaimAtasVODisetujui(
			Double besarnyaClaimAtasVODisetujui) {
		this.besarnyaClaimAtasVODisetujui = besarnyaClaimAtasVODisetujui;
	}

	public Double getBesarnyaClaimAtasVODiprogress() {
		return besarnyaClaimAtasVODiprogress;
	}

	public void setBesarnyaClaimAtasVODiprogress(
			Double besarnyaClaimAtasVODiprogress) {
		this.besarnyaClaimAtasVODiprogress = besarnyaClaimAtasVODiprogress;
	}

	public Double getBesarnyaClaimAtasVODibayar() {
		return besarnyaClaimAtasVODibayar;
	}

	public void setBesarnyaClaimAtasVODibayar(Double besarnyaClaimAtasVODibayar) {
		this.besarnyaClaimAtasVODibayar = besarnyaClaimAtasVODibayar;
	}

	public String getPelaksanaanSudah() {
		return pelaksanaanSudah;
	}

	public void setPelaksanaanSudah(String pelaksanaanSudah) {
		this.pelaksanaanSudah = pelaksanaanSudah;
	}

	public String getPelaksanaanBelum() {
		return pelaksanaanBelum;
	}

	public void setPelaksanaanBelum(String pelaksanaanBelum) {
		this.pelaksanaanBelum = pelaksanaanBelum;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	@Override
	public String toString() {
		return "VO [itemPengerjaan=" + itemPengerjaan + ", noSuratPengajuan="
				+ noSuratPengajuan + ", tanggalPengajuan=" + tanggalPengajuan
				+ ", permohonanYangDiajukanBiaya="
				+ permohonanYangDiajukanBiaya
				+ ", permohonanYangDiajukanWaktu="
				+ permohonanYangDiajukanWaktu
				+ ", besarnyaClaimAtasVODiajukan="
				+ besarnyaClaimAtasVODiajukan
				+ ", besarnyaClaimAtasVONegosiasi="
				+ besarnyaClaimAtasVONegosiasi
				+ ", besarnyaClaimAtasVODisetujui="
				+ besarnyaClaimAtasVODisetujui
				+ ", besarnyaClaimAtasVODiprogress="
				+ besarnyaClaimAtasVODiprogress
				+ ", besarnyaClaimAtasVODibayar=" + besarnyaClaimAtasVODibayar
				+ ", pelaksanaanSudah=" + pelaksanaanSudah
				+ ", pelaksanaanBelum=" + pelaksanaanBelum + ", keterangan="
				+ keterangan + "]";
	}

}
