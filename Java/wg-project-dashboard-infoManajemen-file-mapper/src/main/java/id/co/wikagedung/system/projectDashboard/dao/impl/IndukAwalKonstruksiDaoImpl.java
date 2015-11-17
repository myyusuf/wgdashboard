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

import id.co.wikagedung.system.projectDashboard.dao.IndukAwalKonstruksiDao;
import id.co.wikagedung.system.projectDashboard.model.IndukAwalKonstruksiOmsetKontrak;

public class IndukAwalKonstruksiDaoImpl implements IndukAwalKonstruksiDao {

	private static final Logger LOGGER = Logger
			.getLogger(IndukAwalKonstruksiDaoImpl.class);

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public IndukAwalKonstruksiDaoImpl(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	private RowMapper<IndukAwalKonstruksiOmsetKontrak> INDUK_AWAL_KONSTRUKSI_ROW_MAPPER = new RowMapper<IndukAwalKonstruksiOmsetKontrak>() {

		public IndukAwalKonstruksiOmsetKontrak mapRow(ResultSet resultSet,
				int rowNumber) throws SQLException {

			IndukAwalKonstruksiOmsetKontrak indukAwalKonstruksi = new IndukAwalKonstruksiOmsetKontrak();
			indukAwalKonstruksi.setId(resultSet.getString("id"));
			indukAwalKonstruksi.setNamaProyek(resultSet
					.getString("nama_proyek"));
			indukAwalKonstruksi.setPeriode(resultSet.getString("periode"));
			indukAwalKonstruksi.setRkpAwal(resultSet.getDouble("rkp_awal"));
			indukAwalKonstruksi.setRencanaSampaiBulanIni(resultSet
					.getDouble("rencana_sampai_bulan_ini"));
			indukAwalKonstruksi.setRealisasiSampaiBulanLalu(resultSet
					.getDouble("realisasi_sampai_bulan_lalu"));
			indukAwalKonstruksi.setRealisasiBulanIni(resultSet
					.getDouble("realisasi_bulan_ini"));
			indukAwalKonstruksi.setRealisasiSampaiBulanIni(resultSet
					.getDouble("realisasi_sampai_bulan_ini"));
			indukAwalKonstruksi.setProyeksi(resultSet.getDouble("proyeksi"));

			return indukAwalKonstruksi;

		}
	};

	public void insertIndukAwalKonstruksi(
			IndukAwalKonstruksiOmsetKontrak indukAwalKonstruksi) {

		String id = indukAwalKonstruksi.getId();
		String namaProyek = indukAwalKonstruksi.getNamaProyek();
		String periode = indukAwalKonstruksi.getPeriode();
		Double rkpAwal = indukAwalKonstruksi.getRkpAwal();
		Double rencanaSampaiBulanIni = indukAwalKonstruksi
				.getRencanaSampaiBulanIni();
		Double realisasiSampaiBulanLalu = indukAwalKonstruksi
				.getRealisasiSampaiBulanLalu();
		Double realisasiBulanIni = indukAwalKonstruksi.getRealisasiBulanIni();
		Double realisasiSampaiBulanIni = indukAwalKonstruksi
				.getRealisasiSampaiBulanIni();
		Double proyeksi = indukAwalKonstruksi.getProyeksi();

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

		String sql = "INSERT INTO wg_informasi_manajemen_induk_awal_konstruksi (id, nama_proyek, "
				+ "periode, nama_proyek, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi) VALUES (:id, :namaProyek, :periode, :rkpAwal, "
				+ ":rencanaSampaiBulanIni, :realisasiSampaiBulanLalu, :realisasiBulanIni, "
				+ ":realisasiSampaiBulanIni, :proyeksi)";

		try {
			namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
		} catch (DataAccessException e) {
			LOGGER.error("Error inserting data into database on insertIndukAwalKonstruksi : "
					+ e);
		}

	}

	public List<IndukAwalKonstruksiOmsetKontrak> getAllIndukAwalKonstruksi() {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_induk_awal_konstruksi";

		List<IndukAwalKonstruksiOmsetKontrak> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, INDUK_AWAL_KONSTRUKSI_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getAllIndukAwalKonstruksi : "
					+ e);
		}

		return resultList;

	}

	public List<IndukAwalKonstruksiOmsetKontrak> getIndukAwalKonstruksiByNamaProyekAndPeriode(
			String namaProyek, String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_induk_awal_konstruksi WHERE "
				+ "nama_proyek = :namaProyek AND periode = :periode";

		List<IndukAwalKonstruksiOmsetKontrak> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, INDUK_AWAL_KONSTRUKSI_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getIndukAwalKonstruksiByNamaProyekAndPeriode : "
					+ e);
		}

		return resultList;

	}

	public List<IndukAwalKonstruksiOmsetKontrak> getIndukAwalKonstruksiByPeriode(
			String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_induk_awal_konstruksi WHERE periode = :periode";

		List<IndukAwalKonstruksiOmsetKontrak> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, INDUK_AWAL_KONSTRUKSI_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getIndukAwalKonstruksiByPeriode : "
					+ e);
		}

		return resultList;

	}

}
