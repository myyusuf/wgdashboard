package id.co.wikagedung.system.projectDashboard.model;

import java.util.Date;

public class InkasoDetail {

	private String keterangan;
	private String uraian;
	private Double prestasiBrutoPersentase;
	private Double prestasiBrutoRupiah;
	private Double angsuranTM;
	private Double retensi;
	private Double kuitansiBruto;
	private Double kuitansiNetto;
	private Double kuitansiPpn;
	private Double potonganPphFinal;
	private Double penerimaanBersih;
	private Double pembayaran;
	private Double tagihanBelumCair;
	private Date monitorWaktuTanggalMasuk;
	private Date monitorWaktuTanggalJatuhTempo;
	private Date monitorWaktuTanggalCair;
	private Double jangkaWaktu;

	public InkasoDetail() {

	}

	public InkasoDetail(String keterangan, String uraian,
			Double prestasiBrutoPersentase, Double prestasiBrutoRupiah,
			Double angsuranTM, Double retensi, Double kuitansiBruto,
			Double kuitansiNetto, Double kuitansiPpn, Double potonganPphFinal,
			Double penerimaanBersih, Double pembayaran,
			Double tagihanBelumCair, Date monitorWaktuTanggalMasuk,
			Date monitorWaktuTanggalJatuhTempo, Date monitorWaktuTanggalCair,
			Double jangkaWaktu) {
		super();
		this.keterangan = keterangan;
		this.uraian = uraian;
		this.prestasiBrutoPersentase = prestasiBrutoPersentase;
		this.prestasiBrutoRupiah = prestasiBrutoRupiah;
		this.angsuranTM = angsuranTM;
		this.retensi = retensi;
		this.kuitansiBruto = kuitansiBruto;
		this.kuitansiNetto = kuitansiNetto;
		this.kuitansiPpn = kuitansiPpn;
		this.potonganPphFinal = potonganPphFinal;
		this.penerimaanBersih = penerimaanBersih;
		this.pembayaran = pembayaran;
		this.tagihanBelumCair = tagihanBelumCair;
		this.monitorWaktuTanggalMasuk = monitorWaktuTanggalMasuk;
		this.monitorWaktuTanggalJatuhTempo = monitorWaktuTanggalJatuhTempo;
		this.monitorWaktuTanggalCair = monitorWaktuTanggalCair;
		this.jangkaWaktu = jangkaWaktu;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	public String getUraian() {
		return uraian;
	}

	public void setUraian(String uraian) {
		this.uraian = uraian;
	}

	public Double getPrestasiBrutoPersentase() {
		return prestasiBrutoPersentase;
	}

	public void setPrestasiBrutoPersentase(Double prestasiBrutoPersentase) {
		this.prestasiBrutoPersentase = prestasiBrutoPersentase;
	}

	public Double getPrestasiBrutoRupiah() {
		return prestasiBrutoRupiah;
	}

	public void setPrestasiBrutoRupiah(Double prestasiBrutoRupiah) {
		this.prestasiBrutoRupiah = prestasiBrutoRupiah;
	}

	public Double getAngsuranTM() {
		return angsuranTM;
	}

	public void setAngsuranTM(Double angsuranTM) {
		this.angsuranTM = angsuranTM;
	}

	public Double getRetensi() {
		return retensi;
	}

	public void setRetensi(Double retensi) {
		this.retensi = retensi;
	}

	public Double getKuitansiBruto() {
		return kuitansiBruto;
	}

	public void setKuitansiBruto(Double kuitansiBruto) {
		this.kuitansiBruto = kuitansiBruto;
	}

	public Double getKuitansiNetto() {
		return kuitansiNetto;
	}

	public void setKuitansiNetto(Double kuitansiNetto) {
		this.kuitansiNetto = kuitansiNetto;
	}

	public Double getKuitansiPpn() {
		return kuitansiPpn;
	}

	public void setKuitansiPpn(Double kuitansiPpn) {
		this.kuitansiPpn = kuitansiPpn;
	}

	public Double getPotonganPphFinal() {
		return potonganPphFinal;
	}

	public void setPotonganPphFinal(Double potonganPphFinal) {
		this.potonganPphFinal = potonganPphFinal;
	}

	public Double getPenerimaanBersih() {
		return penerimaanBersih;
	}

	public void setPenerimaanBersih(Double penerimaanBersih) {
		this.penerimaanBersih = penerimaanBersih;
	}

	public Double getPembayaran() {
		return pembayaran;
	}

	public void setPembayaran(Double pembayaran) {
		this.pembayaran = pembayaran;
	}

	public Double getTagihanBelumCair() {
		return tagihanBelumCair;
	}

	public void setTagihanBelumCair(Double tagihanBelumCair) {
		this.tagihanBelumCair = tagihanBelumCair;
	}

	public Date getMonitorWaktuTanggalMasuk() {
		return monitorWaktuTanggalMasuk;
	}

	public void setMonitorWaktuTanggalMasuk(Date monitorWaktuTanggalMasuk) {
		this.monitorWaktuTanggalMasuk = monitorWaktuTanggalMasuk;
	}

	public Date getMonitorWaktuTanggalJatuhTempo() {
		return monitorWaktuTanggalJatuhTempo;
	}

	public void setMonitorWaktuTanggalJatuhTempo(
			Date monitorWaktuTanggalJatuhTempo) {
		this.monitorWaktuTanggalJatuhTempo = monitorWaktuTanggalJatuhTempo;
	}

	public Date getMonitorWaktuTanggalCair() {
		return monitorWaktuTanggalCair;
	}

	public void setMonitorWaktuTanggalCair(Date monitorWaktuTanggalCair) {
		this.monitorWaktuTanggalCair = monitorWaktuTanggalCair;
	}

	public Double getJangkaWaktu() {
		return jangkaWaktu;
	}

	public void setJangkaWaktu(Double jangkaWaktu) {
		this.jangkaWaktu = jangkaWaktu;
	}

	@Override
	public String toString() {
		return "InkasoDetail [keterangan=" + keterangan + ", uraian=" + uraian
				+ ", prestasiBrutoPersentase=" + prestasiBrutoPersentase
				+ ", prestasiBrutoRupiah=" + prestasiBrutoRupiah
				+ ", angsuranTM=" + angsuranTM + ", retensi=" + retensi
				+ ", kuitansiBruto=" + kuitansiBruto + ", kuitansiNetto="
				+ kuitansiNetto + ", kuitansiPpn=" + kuitansiPpn
				+ ", potonganPphFinal=" + potonganPphFinal
				+ ", penerimaanBersih=" + penerimaanBersih + ", pembayaran="
				+ pembayaran + ", tagihanBelumCair=" + tagihanBelumCair
				+ ", monitorWaktuTanggalMasuk=" + monitorWaktuTanggalMasuk
				+ ", monitorWaktuTanggalJatuhTempo="
				+ monitorWaktuTanggalJatuhTempo + ", monitorWaktuTanggalCair="
				+ monitorWaktuTanggalCair + ", jangkaWaktu=" + jangkaWaktu
				+ "]";
	}

}
