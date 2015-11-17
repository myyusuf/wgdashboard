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

import id.co.wikagedung.system.projectDashboard.dao.BiayaUsahaPusatDao;
import id.co.wikagedung.system.projectDashboard.model.BiayaUsahaPusat;

public class BiayaUsahaPusatDaoImpl implements BiayaUsahaPusatDao {

	private static final Logger LOGGER = Logger
			.getLogger(BiayaUsahaPusatDaoImpl.class);

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public BiayaUsahaPusatDaoImpl(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	private RowMapper<BiayaUsahaPusat> BIAYA_USAHA_PUSAT_ROW_MAPPER = new RowMapper<BiayaUsahaPusat>() {

		public BiayaUsahaPusat mapRow(ResultSet resultSet, int rowNumber)
				throws SQLException {

			BiayaUsahaPusat biayaUsahaPusat = new BiayaUsahaPusat();
			biayaUsahaPusat.setId(resultSet.getString("id"));
			biayaUsahaPusat.setNamaProyek(resultSet.getString("nama_proyek"));
			biayaUsahaPusat.setPeriode(resultSet.getString("periode"));
			biayaUsahaPusat.setRkpAwal(resultSet.getDouble("rkp_awal"));
			biayaUsahaPusat.setRencanaSampaiBulanIni(resultSet
					.getDouble("rencana_sampai_bulan_ini"));
			biayaUsahaPusat.setRealisasiSampaiBulanLalu(resultSet
					.getDouble("realisasi_sampai_bulan_lalu"));
			biayaUsahaPusat.setRealisasiBulanIni(resultSet
					.getDouble("realisasi_bulan_ini"));
			biayaUsahaPusat.setRealisasiSampaiBulanIni(resultSet
					.getDouble("realisasi_sampai_bulan_ini"));
			biayaUsahaPusat.setProyeksi(resultSet.getDouble("proyeksi"));

			return biayaUsahaPusat;

		}
	};

	public void insertBiayaUsahaPusat(BiayaUsahaPusat biayaUsahaPusat) {

		String id = biayaUsahaPusat.getId();
		String namaProyek = biayaUsahaPusat.getNamaProyek();
		String periode = biayaUsahaPusat.getPeriode();
		Double rkpAwal = biayaUsahaPusat.getRkpAwal();
		Double rencanaSampaiBulanIni = biayaUsahaPusat
				.getRencanaSampaiBulanIni();
		Double realisasiSampaiBulanLalu = biayaUsahaPusat
				.getRealisasiSampaiBulanLalu();
		Double realisasiBulanIni = biayaUsahaPusat.getRealisasiBulanIni();
		Double realisasiSampaiBulanIni = biayaUsahaPusat
				.getRealisasiSampaiBulanIni();
		Double proyeksi = biayaUsahaPusat.getProyeksi();

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

		String sql = "INSERT INTO wg_informasi_manajemen_biaya_usaha_pusat (id, nama_proyek, "
				+ "periode, nama_proyek, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi) VALUES (:id, :namaProyek, :periode, :rkpAwal, "
				+ ":rencanaSampaiBulanIni, :realisasiSampaiBulanLalu, :realisasiBulanIni, "
				+ ":realisasiSampaiBulanIni, :proyeksi)";

		try {
			namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
		} catch (DataAccessException e) {
			LOGGER.error("Error inserting data into database on insertBiayaUsahaPusat : "
					+ e);
		}

	}

	public List<BiayaUsahaPusat> getAllBiayaUsahaPusat() {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_biaya_usaha_pusat";

		List<BiayaUsahaPusat> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, BIAYA_USAHA_PUSAT_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getAllBiayaUsahaPusat : "
					+ e);
		}

		return resultList;

	}

	public List<BiayaUsahaPusat> getBiayaUsahaPusatByNamaProyekAndPeriode(
			String namaProyek, String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_biaya_usaha_pusat WHERE "
				+ "nama_proyek = :namaProyek AND periode = :periode";

		List<BiayaUsahaPusat> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, BIAYA_USAHA_PUSAT_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getBiayaUsahaPusatByNamaProyekAndPeriode : "
					+ e);
		}

		return resultList;

	}

	public List<BiayaUsahaPusat> getBiayaUsahaPusatByPeriode(String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_biaya_usaha_pusat WHERE periode = :periode";

		List<BiayaUsahaPusat> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, BIAYA_USAHA_PUSAT_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getBiayaUsahaPusatByPeriode : "
					+ e);
		}

		return resultList;

	}

}
