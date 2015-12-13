package id.co.wikagedung.system.projectDashboard.test;

import id.co.wikagedung.system.projectDashboard.model.qPass.QPass;
import id.co.wikagedung.system.projectDashboard.service.QPassExcelFileMapperService;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/spring-ctx.xml" })
public class QPassExcelFileMapperServiceTest {

	@Autowired
	private QPassExcelFileMapperService qPassExcelFileMapperService;

	// @Test
	public void qPassExcelFileMapping() throws IOException,
			InvalidFormatException {

		List<QPass> result = qPassExcelFileMapperService
				.qPassExcelFileMapping();

		for (QPass qPass : result) {

			System.out.println("Q-Pass : " + qPass.toString());

		}

	}

	@Test
	public void getDataQPass() throws IOException, InvalidFormatException {

		List<QPass> result = qPassExcelFileMapperService
				.qPassExcelFileMapping();

		Double jumlahSampelRencanaBekisting = 0.0;
		Double jumlahSampelSampaiBulanIniBekisting = 0.0;
		Double jumlahItemPenilaianBekisting = 0.0;
		Double jumlahItemDiterimaBekisting = 0.0;
		Double bobotProsentaseSatuBekisting = 0.0;
		Double bobotProsentaseDuaBekisting = 0.0;
		Double dataAssesTotalMemenuhiSyaratBekisting = 0.0;
		Double dataAssesTotalJumlahDicekBekisting = 0.0;
		Double dataAssesBobotBekisting = 0.0;
		Double prosentaseDiterimaBekisting = 0.0;
		Double pointBekisting = 0.0;
		Double scoreBekisting = 0.0;

		Double jumlahSampelRencanaBesi = 0.0;
		Double jumlahSampelSampaiBulanIniBesi = 0.0;
		Double jumlahItemPenilaianBesi = 0.0;
		Double jumlahItemDiterimaBesi = 0.0;
		Double bobotProsentaseSatuBesi = 0.0;
		Double bobotProsentaseDuaBesi = 0.0;
		Double dataAssesTotalMemenuhiSyaratBesi = 0.0;
		Double dataAssesTotalJumlahDicekBesi = 0.0;
		Double dataAssesBobotBesi = 0.0;
		Double prosentaseDiterimaBesi = 0.0;
		Double pointBesi = 0.0;
		Double scoreBesi = 0.0;

		Double jumlahSampelRencanaBetonFinish = 0.0;
		Double jumlahSampelSampaiBulanIniBetonFinish = 0.0;
		Double jumlahItemPenilaianBetonFinish = 0.0;
		Double jumlahItemDiterimaBetonFinish = 0.0;
		Double bobotProsentaseSatuBetonFinish = 0.0;
		Double bobotProsentaseDuaBetonFinish = 0.0;
		Double dataAssesTotalMemenuhiSyaratBetonFinish = 0.0;
		Double dataAssesTotalJumlahDicekBetonFinish = 0.0;
		Double dataAssesBobotBetonFinish = 0.0;
		Double prosentaseDiterimaBetonFinish = 0.0;
		Double pointBetonFinish = 0.0;
		Double scoreBetonFinish = 0.0;

		Double jumlahSampelRencanaMutuBeton = 0.0;
		Double jumlahSampelSampaiBulanIniMutuBeton = 0.0;
		Double jumlahItemPenilaianMutuBeton = 0.0;
		Double jumlahItemDiterimaMutuBeton = 0.0;
		Double bobotProsentaseSatuMutuBeton = 0.0;
		Double bobotProsentaseDuaMutuBeton = 0.0;
		Double dataAssesTotalMemenuhiSyaratMutuBeton = 0.0;
		Double dataAssesTotalJumlahDicekMutuBeton = 0.0;
		Double dataAssesBobotMutuBeton = 0.0;
		Double prosentaseDiterimaMutuBeton = 0.0;
		Double pointMutuBeton = 0.0;
		Double scoreMutuBeton = 0.0;

		Double jumlahSampelRencanaMutuBesi = 0.0;
		Double jumlahSampelSampaiBulanIniMutuBesi = 0.0;
		Double jumlahItemPenilaianMutuBesi = 0.0;
		Double jumlahItemDiterimaMutuBesi = 0.0;
		Double bobotProsentaseSatuMutuBesi = 0.0;
		Double bobotProsentaseDuaMutuBesi = 0.0;
		Double dataAssesTotalMemenuhiSyaratMutuBesi = 0.0;
		Double dataAssesTotalJumlahDicekMutuBesi = 0.0;
		Double dataAssesBobotMutuBesi = 0.0;
		Double prosentaseDiterimaMutuBesi = 0.0;
		Double pointMutuBesi = 0.0;
		Double scoreMutuBesi = 0.0;

		Double jumlahSampelRencanaInternalFinishes = 0.0;
		Double jumlahSampelSampaiBulanIniInternalFinishes = 0.0;
		Double jumlahItemPenilaianInternalFinishes = 0.0;
		Double jumlahItemDiterimaInternalFinishes = 0.0;
		Double bobotProsentaseSatuInternalFinishes = 0.0;
		Double bobotProsentaseDuaInternalFinishes = 0.0;
		Double dataAssesTotalMemenuhiSyaratInternalFinishes = 0.0;
		Double dataAssesTotalJumlahDicekInternalFinishes = 0.0;
		Double dataAssesBobotInternalFinishes = 0.0;
		Double prosentaseDiterimaInternalFinishes = 0.0;
		Double pointInternalFinishes = 0.0;
		Double scoreInternalFinishes = 0.0;

		Double jumlahSampelRencanaEksternalWall = 0.0;
		Double jumlahSampelSampaiBulanIniEksternalWall = 0.0;
		Double jumlahItemPenilaianEksternalWall = 0.0;
		Double jumlahItemDiterimaEksternalWall = 0.0;
		Double bobotProsentaseSatuEksternalWall = 0.0;
		Double bobotProsentaseDuaEksternalWall = 0.0;
		Double dataAssesTotalMemenuhiSyaratEksternalWall = 0.0;
		Double dataAssesTotalJumlahDicekEksternalWall = 0.0;
		Double dataAssesBobotEksternalWall = 0.0;
		Double prosentaseDiterimaEksternalWall = 0.0;
		Double pointEksternalWall = 0.0;
		Double scoreEksternalWall = 0.0;

		Double jumlahSampelRencanaEksternalWork = 0.0;
		Double jumlahSampelSampaiBulanIniEksternalWork = 0.0;
		Double jumlahItemPenilaianEksternalWork = 0.0;
		Double jumlahItemDiterimaEksternalWork = 0.0;
		Double bobotProsentaseSatuEksternalWork = 0.0;
		Double bobotProsentaseDuaEksternalWork = 0.0;
		Double dataAssesTotalMemenuhiSyaratEksternalWork = 0.0;
		Double dataAssesTotalJumlahDicekEksternalWork = 0.0;
		Double dataAssesBobotEksternalWork = 0.0;
		Double prosentaseDiterimaEksternalWork = 0.0;
		Double pointEksternalWork = 0.0;
		Double scoreEksternalWork = 0.0;

		Double jumlahSampelRencanaTesFungsi = 0.0;
		Double jumlahSampelSampaiBulanIniTesFungsi = 0.0;
		Double jumlahItemPenilaianTesFungsi = 0.0;
		Double jumlahItemDiterimaTesFungsi = 0.0;
		Double bobotProsentaseSatuTesFungsi = 0.0;
		Double bobotProsentaseDuaTesFungsi = 0.0;
		Double dataAssesTotalMemenuhiSyaratTesFungsi = 0.0;
		Double dataAssesTotalJumlahDicekTesFungsi = 0.0;
		Double dataAssesBobotTesFungsi = 0.0;
		Double prosentaseDiterimaTesFungsi = 0.0;
		Double pointTesFungsi = 0.0;
		Double scoreTesFungsi = 0.0;

		Double subTotalPerStruktur = 0.0;
		Double subTotalPerArsitektur = 0.0;

		Double scoreQpass = 0.0;

		for (QPass qPass : result) {

			jumlahSampelRencanaBekisting = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBekisting().getJumlahSampelRencana();
			jumlahSampelSampaiBulanIniBekisting = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBekisting()
					.getJumlahSampeSampaiBulanIniRealisasi();
			jumlahItemPenilaianBekisting = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBekisting().getJumlahItemPenilaian();
			jumlahItemDiterimaBekisting = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBekisting().getJumlahItemDiterima();
			bobotProsentaseSatuBekisting = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBekisting().getBobotProsentaseSatu();
			bobotProsentaseDuaBekisting = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBekisting().getBobotProsentaseDua();
			dataAssesTotalMemenuhiSyaratBekisting = qPass
					.getPekerjaanStruktur().getPekerjaanStrukturBekisting()
					.getDataAssesTotalMemenuhiSyarat();
			dataAssesTotalJumlahDicekBekisting = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBekisting()
					.getDataAssesTotalJumlahItemDicek();
			dataAssesBobotBekisting = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBekisting().getDataAssesBobot();
			prosentaseDiterimaBekisting = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBekisting().getProsentaseDiterima();
			pointBekisting = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBekisting().getPoint();
			scoreBekisting = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBekisting().getScore();

			jumlahSampelRencanaBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBesi().getJumlahSampelRencana();
			jumlahSampelSampaiBulanIniBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBesi()
					.getJumlahSampeSampaiBulanIniRealisasi();
			jumlahItemPenilaianBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBesi().getJumlahItemPenilaian();
			jumlahItemDiterimaBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBesi().getJumlahItemDiterima();
			bobotProsentaseSatuBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBesi().getBobotProsentaseSatu();
			bobotProsentaseDuaBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBesi().getBobotProsentaseDua();
			dataAssesTotalMemenuhiSyaratBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBesi()
					.getDataAssesTotalMemenuhiSyarat();
			dataAssesTotalJumlahDicekBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBesi()
					.getDataAssesTotalJumlahItemDicek();
			dataAssesBobotBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBesi().getDataAssesBobot();
			prosentaseDiterimaBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBesi().getProsentaseDiterima();
			pointBesi = qPass.getPekerjaanStruktur().getPekerjaanStrukturBesi()
					.getPoint();
			scoreBesi = qPass.getPekerjaanStruktur().getPekerjaanStrukturBesi()
					.getScore();

			jumlahSampelRencanaBetonFinish = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBetonFinish().getJumlahSampelRencana();
			jumlahSampelSampaiBulanIniBetonFinish = qPass
					.getPekerjaanStruktur().getPekerjaanStrukturBetonFinish()
					.getJumlahSampeSampaiBulanIniRealisasi();
			jumlahItemPenilaianBetonFinish = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBetonFinish().getJumlahItemPenilaian();
			jumlahItemDiterimaBetonFinish = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBetonFinish().getJumlahItemDiterima();
			bobotProsentaseSatuBetonFinish = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBetonFinish().getBobotProsentaseSatu();
			bobotProsentaseDuaBetonFinish = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBetonFinish().getBobotProsentaseDua();
			dataAssesTotalMemenuhiSyaratBetonFinish = qPass
					.getPekerjaanStruktur().getPekerjaanStrukturBetonFinish()
					.getDataAssesTotalMemenuhiSyarat();
			dataAssesTotalJumlahDicekBetonFinish = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBetonFinish()
					.getDataAssesTotalJumlahItemDicek();
			dataAssesBobotBetonFinish = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBetonFinish().getDataAssesBobot();
			prosentaseDiterimaBetonFinish = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBetonFinish().getProsentaseDiterima();
			pointBetonFinish = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBetonFinish().getPoint();
			scoreBetonFinish = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturBetonFinish().getScore();

			jumlahSampelRencanaMutuBeton = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBeton().getJumlahSampelRencana();
			jumlahSampelSampaiBulanIniMutuBeton = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBeton()
					.getJumlahSampeSampaiBulanIniRealisasi();
			jumlahItemPenilaianMutuBeton = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBeton().getJumlahItemPenilaian();
			jumlahItemDiterimaMutuBeton = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBeton().getJumlahItemDiterima();
			bobotProsentaseSatuMutuBeton = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBeton().getBobotProsentaseSatu();
			bobotProsentaseDuaMutuBeton = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBeton().getBobotProsentaseDua();
			dataAssesTotalMemenuhiSyaratMutuBeton = qPass
					.getPekerjaanStruktur().getPekerjaanStrukturMutuBeton()
					.getDataAssesTotalMemenuhiSyarat();
			dataAssesTotalJumlahDicekMutuBeton = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBeton()
					.getDataAssesTotalJumlahItemDicek();
			dataAssesBobotMutuBeton = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBeton().getDataAssesBobot();
			prosentaseDiterimaMutuBeton = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBeton().getProsentaseDiterima();
			pointMutuBeton = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBeton().getPoint();
			scoreMutuBeton = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBeton().getScore();

			jumlahSampelRencanaMutuBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBesi().getJumlahSampelRencana();
			jumlahSampelSampaiBulanIniMutuBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBesi()
					.getJumlahSampeSampaiBulanIniRealisasi();
			jumlahItemPenilaianMutuBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBesi().getJumlahItemPenilaian();
			jumlahItemDiterimaMutuBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBesi().getJumlahItemDiterima();
			bobotProsentaseSatuMutuBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBesi().getBobotProsentaseSatu();
			bobotProsentaseDuaMutuBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBesi().getBobotProsentaseDua();
			dataAssesTotalMemenuhiSyaratMutuBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBesi()
					.getDataAssesTotalMemenuhiSyarat();
			dataAssesTotalJumlahDicekMutuBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBesi()
					.getDataAssesTotalJumlahItemDicek();
			dataAssesBobotMutuBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBesi().getDataAssesBobot();
			prosentaseDiterimaMutuBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBesi().getProsentaseDiterima();
			pointMutuBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBesi().getPoint();
			scoreMutuBesi = qPass.getPekerjaanStruktur()
					.getPekerjaanStrukturMutuBesi().getScore();

			jumlahSampelRencanaInternalFinishes = qPass
					.getPekerjaanArsitektur()
					.getPekerjaanArsitekturInternalFinishes()
					.getJumlahSampelRencana();
			jumlahSampelSampaiBulanIniInternalFinishes = qPass
					.getPekerjaanArsitektur()
					.getPekerjaanArsitekturInternalFinishes()
					.getJumlahSampeSampaiBulanIniRealisasi();
			jumlahItemPenilaianInternalFinishes = qPass
					.getPekerjaanArsitektur()
					.getPekerjaanArsitekturInternalFinishes()
					.getJumlahItemPenilaian();
			jumlahItemDiterimaInternalFinishes = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturInternalFinishes()
					.getJumlahItemDiterima();
			bobotProsentaseSatuInternalFinishes = qPass
					.getPekerjaanArsitektur()
					.getPekerjaanArsitekturInternalFinishes()
					.getBobotProsentaseSatu();
			bobotProsentaseDuaInternalFinishes = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturInternalFinishes()
					.getBobotProsentaseDua();
			dataAssesTotalMemenuhiSyaratInternalFinishes = qPass
					.getPekerjaanArsitektur()
					.getPekerjaanArsitekturInternalFinishes()
					.getDataAssesTotalMemenuhiSyarat();
			dataAssesTotalJumlahDicekInternalFinishes = qPass
					.getPekerjaanArsitektur()
					.getPekerjaanArsitekturInternalFinishes()
					.getDataAssesTotalJumlahItemDicek();
			dataAssesBobotInternalFinishes = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturInternalFinishes()
					.getDataAssesBobot();
			prosentaseDiterimaInternalFinishes = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturInternalFinishes()
					.getProsentaseDiterima();
			pointInternalFinishes = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturInternalFinishes().getPoint();
			scoreInternalFinishes = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturInternalFinishes().getScore();

			jumlahSampelRencanaEksternalWall = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEskternalWall()
					.getJumlahSampelRencana();
			jumlahSampelSampaiBulanIniEksternalWall = qPass
					.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEskternalWall()
					.getJumlahSampeSampaiBulanIniRealisasi();
			jumlahItemPenilaianEksternalWall = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEskternalWall()
					.getJumlahItemPenilaian();
			jumlahItemDiterimaEksternalWall = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEskternalWall()
					.getJumlahItemDiterima();
			bobotProsentaseSatuEksternalWall = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEskternalWall()
					.getBobotProsentaseSatu();
			bobotProsentaseDuaEksternalWall = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEskternalWall()
					.getBobotProsentaseDua();
			dataAssesTotalMemenuhiSyaratEksternalWall = qPass
					.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEskternalWall()
					.getDataAssesTotalMemenuhiSyarat();
			dataAssesTotalJumlahDicekEksternalWall = qPass
					.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEskternalWall()
					.getDataAssesTotalJumlahItemDicek();
			dataAssesBobotEksternalWall = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEskternalWall().getDataAssesBobot();
			prosentaseDiterimaEksternalWall = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEskternalWall()
					.getProsentaseDiterima();
			pointEksternalWall = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEskternalWall().getPoint();
			scoreEksternalWall = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEskternalWall().getScore();

			jumlahSampelRencanaEksternalWork = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEksternalWork()
					.getJumlahSampelRencana();
			jumlahSampelSampaiBulanIniEksternalWork = qPass
					.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEksternalWork()
					.getJumlahSampeSampaiBulanIniRealisasi();
			jumlahItemPenilaianEksternalWork = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEksternalWork()
					.getJumlahItemPenilaian();
			jumlahItemDiterimaEksternalWork = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEksternalWork()
					.getJumlahItemDiterima();
			bobotProsentaseSatuEksternalWork = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEksternalWork()
					.getBobotProsentaseSatu();
			bobotProsentaseDuaEksternalWork = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEksternalWork()
					.getBobotProsentaseDua();
			dataAssesTotalMemenuhiSyaratEksternalWork = qPass
					.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEksternalWork()
					.getDataAssesTotalMemenuhiSyarat();
			dataAssesTotalJumlahDicekEksternalWork = qPass
					.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEksternalWork()
					.getDataAssesTotalJumlahItemDicek();
			dataAssesBobotEksternalWork = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEksternalWork().getDataAssesBobot();
			prosentaseDiterimaEksternalWork = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEksternalWork()
					.getProsentaseDiterima();
			pointEksternalWork = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEksternalWork().getPoint();
			scoreEksternalWork = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturEksternalWork().getScore();

			jumlahSampelRencanaTesFungsi = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturTesFungsi().getJumlahSampelRencana();
			jumlahSampelSampaiBulanIniTesFungsi = qPass
					.getPekerjaanArsitektur().getPekerjaanArsitekturTesFungsi()
					.getJumlahSampeSampaiBulanIniRealisasi();
			jumlahItemPenilaianTesFungsi = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturTesFungsi().getJumlahItemPenilaian();
			jumlahItemDiterimaTesFungsi = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturTesFungsi().getJumlahItemDiterima();
			bobotProsentaseSatuTesFungsi = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturTesFungsi().getBobotProsentaseSatu();
			bobotProsentaseDuaTesFungsi = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturTesFungsi().getBobotProsentaseDua();
			dataAssesTotalMemenuhiSyaratTesFungsi = qPass
					.getPekerjaanArsitektur().getPekerjaanArsitekturTesFungsi()
					.getDataAssesTotalMemenuhiSyarat();
			dataAssesTotalJumlahDicekTesFungsi = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturTesFungsi()
					.getDataAssesTotalJumlahItemDicek();
			dataAssesBobotTesFungsi = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturTesFungsi().getDataAssesBobot();
			prosentaseDiterimaTesFungsi = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturTesFungsi().getProsentaseDiterima();
			pointTesFungsi = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturTesFungsi().getPoint();
			scoreTesFungsi = qPass.getPekerjaanArsitektur()
					.getPekerjaanArsitekturTesFungsi().getScore();

			subTotalPerStruktur = scoreBekisting + scoreBesi + scoreBetonFinish
					+ scoreMutuBeton + scoreMutuBesi;
			subTotalPerArsitektur = scoreInternalFinishes + scoreEksternalWall
					+ scoreEksternalWork + scoreTesFungsi;

			scoreQpass = subTotalPerStruktur + subTotalPerArsitektur;

		}

		System.out.println("Sub Total Per Struktur : " + subTotalPerStruktur);
		System.out.println("Sub Total Per Arsitektur : "
				+ subTotalPerArsitektur);
		System.out.println("Score Q-Pass : " + scoreQpass);

	}

}
