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

import id.co.wikagedung.system.projectDashboard.dao.BiayaTakLangsungDao;
import id.co.wikagedung.system.projectDashboard.model.BiayaTakLangsung;

public class BiayaTakLangsungDaoImpl implements BiayaTakLangsungDao {

	private static final Logger LOGGER = Logger
			.getLogger(BiayaTakLangsungDaoImpl.class);

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public BiayaTakLangsungDaoImpl(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	private RowMapper<BiayaTakLangsung> BIAYA_TAK_LANGSUNG_ROW_MAPPER = new RowMapper<BiayaTakLangsung>() {

		public BiayaTakLangsung mapRow(ResultSet resultSet, int rowNumber)
				throws SQLException {

			BiayaTakLangsung biayaTakLangsung = new BiayaTakLangsung();
			biayaTakLangsung.setId(resultSet.getString("id"));
			biayaTakLangsung.setNamaProyek(resultSet.getString("nama_proyek"));
			biayaTakLangsung.setPeriode(resultSet.getString("periode"));
			biayaTakLangsung.setRkpAwal(resultSet.getDouble("rkp_awal"));
			biayaTakLangsung.setRencanaSampaiBulanIni(resultSet
					.getDouble("rencana_sampai_bulan_ini"));
			biayaTakLangsung.setRealisasiSampaiBulanLalu(resultSet
					.getDouble("realisasi_sampai_bulan_lalu"));
			biayaTakLangsung.setRealisasiBulanIni(resultSet
					.getDouble("realisasi_bulan_ini"));
			biayaTakLangsung.setRealisasiSampaiBulanIni(resultSet
					.getDouble("realisasi_sampai_bulan_ini"));
			biayaTakLangsung.setProyeksi(resultSet.getDouble("proyeksi"));

			return biayaTakLangsung;

		}
	};

	public void insertBiayaTakLangsung(BiayaTakLangsung biayaTakLangsung) {

		String id = biayaTakLangsung.getId();
		String namaProyek = biayaTakLangsung.getNamaProyek();
		String periode = biayaTakLangsung.getPeriode();
		Double rkpAwal = biayaTakLangsung.getRkpAwal();
		Double rencanaSampaiBulanIni = biayaTakLangsung
				.getRencanaSampaiBulanIni();
		Double realisasiSampaiBulanLalu = biayaTakLangsung
				.getRealisasiSampaiBulanLalu();
		Double realisasiBulanIni = biayaTakLangsung.getRealisasiBulanIni();
		Double realisasiSampaiBulanIni = biayaTakLangsung
				.getRealisasiSampaiBulanIni();
		Double proyeksi = biayaTakLangsung.getProyeksi();

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("id", id, Types.VARCHAR);
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);
		mapSqlParameterSource.addValue("rkpAwal", rkpAwal, Types.DOUBLE);
		mapSqlParameterSource.addValue("rencanaSampaiBulanIni",
				rencanaSampaiBulanIni, Types.DOUBLE);
		mapSqlParameterSource.addValue("realisasiSampaiBulanLalu",
				realisasiSampaiBulanLalu, Types.DOUBLE);
		mapSqlParameterSource.addValue("realisasiBulanIni", realisasiBulanIni,
				Types.DOUBLE);
		mapSqlParameterSource.addValue("realisasiSampaiBulanIni",
				realisasiSampaiBulanIni, Types.DOUBLE);
		mapSqlParameterSource.addValue("proyeksi", proyeksi, Types.DOUBLE);

		String sql = "INSERT INTO wg_informasi_manajemen_biaya_tak_langsung (id, nama_proyek, "
				+ "periode, nama_proyek, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi) VALUES (:id, :namaProyek, :periode, :rkpAwal, "
				+ ":rencanaSampaiBulanIni, :realisasiSampaiBulanLalu, :realisasiBulanIni, "
				+ ":realisasiSampaiBulanIni, :proyeksi)";

		try {
			namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
		} catch (DataAccessException e) {
			LOGGER.error("Error inserting data into database on insertBiayaTakLangsung : "
					+ e);
		}

	}

	public List<BiayaTakLangsung> getAllBiayaTakLangsung() {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_biaya_tak_langsung";

		List<BiayaTakLangsung> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, BIAYA_TAK_LANGSUNG_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getAllBiayaTakLangsung : "
					+ e);
		}

		return resultList;

	}

	public List<BiayaTakLangsung> getBiayaTakLangsungByNamaProyekAndPeriode(
			String namaProyek, String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_biaya_tak_langsung WHERE "
				+ "nama_proyek = :namaProyek AND periode = :periode";

		List<BiayaTakLangsung> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, BIAYA_TAK_LANGSUNG_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getBiayaTakLangsungByNamaProyekAndPeriode : "
					+ e);
		}

		return resultList;

	}

	public List<BiayaTakLangsung> getBiayaTakLangsungByPeriode(String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_biaya_tak_langsung WHERE periode = :periode";

		List<BiayaTakLangsung> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, BIAYA_TAK_LANGSUNG_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getBiayaTakLangsungByPeriode : "
					+ e);
		}

		return resultList;

	}

}
