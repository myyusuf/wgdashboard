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

import id.co.wikagedung.system.projectDashboard.dao.BiayaLangsungDao;
import id.co.wikagedung.system.projectDashboard.model.BiayaLangsung;

public class BiayaLangsungDaoImpl implements BiayaLangsungDao {

	private static final Logger LOGGER = Logger
			.getLogger(BiayaLangsungDaoImpl.class);

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public BiayaLangsungDaoImpl(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	private RowMapper<BiayaLangsung> BIAYA_LANGSUNG_ROW_MAPPER = new RowMapper<BiayaLangsung>() {

		public BiayaLangsung mapRow(ResultSet resultSet, int rowNumber)
				throws SQLException {

			BiayaLangsung biayaLangsung = new BiayaLangsung();
			biayaLangsung.setId(resultSet.getString("id"));
			biayaLangsung.setNamaProyek(resultSet.getString("nama_proyek"));
			biayaLangsung.setPeriode(resultSet.getString("periode"));
			biayaLangsung.setRkpAwal(resultSet.getInt("rkp_awal"));
			biayaLangsung.setRencanaSampaiBulanIni(resultSet
					.getInt("rencana_sampai_bulan_ini"));
			biayaLangsung.setRealisasiSampaiBulanLalu(resultSet
					.getInt("realisasi_sampai_bulan_lalu"));
			biayaLangsung.setRealisasiBulanIni(resultSet
					.getInt("realisasi_bulan_ini"));
			biayaLangsung.setRealisasiSampaiBulanIni(resultSet
					.getInt("realisasi_sampai_bulan_ini"));
			biayaLangsung.setProyeksi(resultSet.getInt("proyeksi"));

			return biayaLangsung;

		}
	};

	public void insertBiayaLangsung(BiayaLangsung biayaLangsung) {

		String id = biayaLangsung.getId();
		String namaProyek = biayaLangsung.getNamaProyek();
		String periode = biayaLangsung.getPeriode();
		Integer rkpAwal = biayaLangsung.getRkpAwal();
		Integer rencanaSampaiBulanIni = biayaLangsung
				.getRencanaSampaiBulanIni();
		Integer realisasiSampaiBulanLalu = biayaLangsung
				.getRealisasiSampaiBulanLalu();
		Integer realisasiBulanIni = biayaLangsung.getRealisasiBulanIni();
		Integer realisasiSampaiBulanIni = biayaLangsung
				.getRealisasiSampaiBulanIni();
		Integer proyeksi = biayaLangsung.getProyeksi();

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

		String sql = "";

		try {
			namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
		} catch (DataAccessException e) {
			LOGGER.error("Error inserting data into database on insertBiayaLangsung : "
					+ e);
		}

	}

	public List<BiayaLangsung> getAllBiayaLangsung() {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

		String sql = "";

		List<BiayaLangsung> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, BIAYA_LANGSUNG_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getAllBiayaLangsung : "
					+ e);
		}

		return resultList;

	}

	public List<BiayaLangsung> getBiayaLangsungByNamaProyekAndPeriode(
			String namaProyek, String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "";

		List<BiayaLangsung> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, BIAYA_LANGSUNG_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getBiayaLangsungByNamaProyekAndPeriode : "
					+ e);
		}

		return resultList;

	}

	public List<BiayaLangsung> getBiayaLangsungByPeriode(String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "";

		List<BiayaLangsung> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, BIAYA_LANGSUNG_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getBiayaLangsungByPeriode : "
					+ e);
		}

		return resultList;

	}

}
