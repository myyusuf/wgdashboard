package id.co.wikagedung.system.projectDashboard.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import id.co.wikagedung.system.projectDashboard.dao.IndukAwalKonstruksiProsentaseDao;
import id.co.wikagedung.system.projectDashboard.model.IndukAwalKonstruksiPenjualanProsentase;

public class IndukAwalKonstruksiProsentaseDaoImpl implements
		IndukAwalKonstruksiProsentaseDao {

	private static final Logger LOGGER = Logger
			.getLogger(IndukAwalKonstruksiProsentaseDaoImpl.class);

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public IndukAwalKonstruksiProsentaseDaoImpl(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	private RowMapper<IndukAwalKonstruksiPenjualanProsentase> INDUK_AWAL_KONSTRUKSI_PROSENTASE_ROW_MAPPER = new RowMapper<IndukAwalKonstruksiPenjualanProsentase>() {

		public IndukAwalKonstruksiPenjualanProsentase mapRow(ResultSet resultSet,
				int rowNumber) throws SQLException {

			IndukAwalKonstruksiPenjualanProsentase indukAwalKonstruksiProsentase = new IndukAwalKonstruksiPenjualanProsentase();
			indukAwalKonstruksiProsentase.setId(resultSet.getString("id"));
			indukAwalKonstruksiProsentase.setNamaProyek(resultSet
					.getString("nama_proyek"));
			indukAwalKonstruksiProsentase.setPeriode(resultSet
					.getString("periode"));
			indukAwalKonstruksiProsentase.setRkpAwal(resultSet
					.getInt("rkp_awal"));
			indukAwalKonstruksiProsentase.setRencanaSampaiBulanIni(resultSet
					.getInt("rencana_sampai_bulan_ini"));
			indukAwalKonstruksiProsentase.setRealisasiSampaiBulanLalu(resultSet
					.getInt("realisasi_sampai_bulan_lalu"));
			indukAwalKonstruksiProsentase.setRealisasiBulanIni(resultSet
					.getInt("realisasi_bulan_ini"));
			indukAwalKonstruksiProsentase.setRealisasiSampaiBulanIni(resultSet
					.getInt("realisasi_sampai_bulan_ini"));
			indukAwalKonstruksiProsentase.setProyeksi(resultSet
					.getInt("proyeksi"));

			return indukAwalKonstruksiProsentase;

		}
	};

	public void insertIndukAwalKonstruksiProsentase(
			IndukAwalKonstruksiPenjualanProsentase indukAwalKonstruksiProsentase) {

		String id = indukAwalKonstruksiProsentase.getId();
		String namaProyek = indukAwalKonstruksiProsentase.getNamaProyek();
		String periode = indukAwalKonstruksiProsentase.getPeriode();
		Integer rkpAwal = indukAwalKonstruksiProsentase.getRkpAwal();
		Integer rencanaSampaiBulanIni = indukAwalKonstruksiProsentase
				.getRencanaSampaiBulanIni();
		Integer realisasiSampaiBulanLalu = indukAwalKonstruksiProsentase
				.getRealisasiSampaiBulanLalu();
		Integer realisasiBulanIni = indukAwalKonstruksiProsentase
				.getRealisasiBulanIni();
		Integer realisasiSampaiBulanIni = indukAwalKonstruksiProsentase
				.getRealisasiSampaiBulanIni();
		Integer proyeksi = indukAwalKonstruksiProsentase.getProyeksi();

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("id", id, Types.VARCHAR);
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);
		mapSqlParameterSource.addValue("rkpAwal", rkpAwal, Types.INTEGER);
		mapSqlParameterSource.addValue("rencanaSampaiBulanIni",
				rencanaSampaiBulanIni, Types.INTEGER);
		mapSqlParameterSource.addValue("realisasiSampaiBulanLalu",
				realisasiSampaiBulanLalu, Types.INTEGER);
		mapSqlParameterSource.addValue("realisasiBulanIni", realisasiBulanIni,
				Types.INTEGER);
		mapSqlParameterSource.addValue("realisasiSampaiBulanIni",
				realisasiSampaiBulanIni, Types.INTEGER);
		mapSqlParameterSource.addValue("proyeksi", proyeksi, Types.INTEGER);

		String sql = "INSERT INTO wg_informasi_manajemen_induk_awal_konstruksi_prosentase (id, nama_proyek, "
				+ "periode, nama_proyek, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi) VALUES (:id, :namaProyek, :periode, :rkpAwal, "
				+ ":rencanaSampaiBulanIni, :realisasiSampaiBulanLalu, :realisasiBulanIni, "
				+ ":realisasiSampaiBulanIni, :proyeksi)";

		try {
			namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
		} catch (DataAccessException e) {
			LOGGER.error("Error inserting data into database on insertIndukAwalKonstruksiProsentase : "
					+ e);
		}

	}

	public List<IndukAwalKonstruksiPenjualanProsentase> getAllIndukAwalKonstruksiProsentase() {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_induk_awal_konstruksi_prosentase";

		List<IndukAwalKonstruksiPenjualanProsentase> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource,
					INDUK_AWAL_KONSTRUKSI_PROSENTASE_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getAllIndukAwalKonstruksiProsentase : "
					+ e);
		}

		return resultList;

	}

	public List<IndukAwalKonstruksiPenjualanProsentase> getIndukAwalKonstruksiProsentaseByNamaProyekAndPeriode(
			String namaProyek, String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_induk_awal_konstruksi_prosentase WHERE "
				+ "nama_proyek = :namaProyek AND periode = :periode";

		List<IndukAwalKonstruksiPenjualanProsentase> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource,
					INDUK_AWAL_KONSTRUKSI_PROSENTASE_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getIndukAwalKonstruksiProsentaseByNamaProyekAndPeriode : "
					+ e);
		}

		return resultList;

	}

	public List<IndukAwalKonstruksiPenjualanProsentase> getIndukAwalKonstruksiProsentaseByPeriode(
			String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_induk_awal_konstruksi_prosentase WHERE periode = :periode";

		List<IndukAwalKonstruksiPenjualanProsentase> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource,
					INDUK_AWAL_KONSTRUKSI_PROSENTASE_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getIndukAwalKonstruksiProsentaseByPeriode : "
					+ e);
		}

		return resultList;

	}

}
