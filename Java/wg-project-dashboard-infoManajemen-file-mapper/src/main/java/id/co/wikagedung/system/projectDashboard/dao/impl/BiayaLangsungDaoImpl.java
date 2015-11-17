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
			biayaLangsung.setRkpAwal(resultSet.getDouble("rkp_awal"));
			biayaLangsung.setRencanaSampaiBulanIni(resultSet
					.getDouble("rencana_sampai_bulan_ini"));
			biayaLangsung.setRealisasiSampaiBulanLalu(resultSet
					.getDouble("realisasi_sampai_bulan_lalu"));
			biayaLangsung.setRealisasiBulanIni(resultSet
					.getDouble("realisasi_bulan_ini"));
			biayaLangsung.setRealisasiSampaiBulanIni(resultSet
					.getDouble("realisasi_sampai_bulan_ini"));
			biayaLangsung.setProyeksi(resultSet.getDouble("proyeksi"));

			return biayaLangsung;

		}
	};

	public void insertBiayaLangsung(BiayaLangsung biayaLangsung) {

		String id = biayaLangsung.getId();
		String namaProyek = biayaLangsung.getNamaProyek();
		String periode = biayaLangsung.getPeriode();
		Double rkpAwal = biayaLangsung.getRkpAwal();
		Double rencanaSampaiBulanIni = biayaLangsung
				.getRencanaSampaiBulanIni();
		Double realisasiSampaiBulanLalu = biayaLangsung
				.getRealisasiSampaiBulanLalu();
		Double realisasiBulanIni = biayaLangsung.getRealisasiBulanIni();
		Double realisasiSampaiBulanIni = biayaLangsung
				.getRealisasiSampaiBulanIni();
		Double proyeksi = biayaLangsung.getProyeksi();

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
				realisasiSampaiBulanIni, Types.INTEGER);
		mapSqlParameterSource.addValue("proyeksi", proyeksi, Types.DOUBLE);

		String sql = "INSERT INTO wg_informasi_manajemen_biaya_langsung (id, nama_proyek, "
				+ "periode, nama_proyek, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi) VALUES (:id, :namaProyek, :periode, :rkpAwal, "
				+ ":rencanaSampaiBulanIni, :realisasiSampaiBulanLalu, :realisasiBulanIni, "
				+ ":realisasiSampaiBulanIni, :proyeksi)";

		try {
			namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
		} catch (DataAccessException e) {
			LOGGER.error("Error inserting data into database on insertBiayaLangsung : "
					+ e);
		}

	}

	public List<BiayaLangsung> getAllBiayaLangsung() {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_biaya_langsung";

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

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_biaya_langsung WHERE "
				+ "nama_proyek = :namaProyek AND periode = :periode";

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

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_biaya_langsung WHERE periode = :periode";

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
