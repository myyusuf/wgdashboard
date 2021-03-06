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

import id.co.wikagedung.system.projectDashboard.dao.PembebananBiayaDao;
import id.co.wikagedung.system.projectDashboard.model.PembebananBiaya;

public class PembebananBiayaDaoImpl implements PembebananBiayaDao {

	private static final Logger LOGGER = Logger
			.getLogger(PembebananBiayaDaoImpl.class);

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public PembebananBiayaDaoImpl(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	private RowMapper<PembebananBiaya> PEMBEBANAN_BIAYA_ROW_MAPPER = new RowMapper<PembebananBiaya>() {

		public PembebananBiaya mapRow(ResultSet resultSet, int rowNumber)
				throws SQLException {

			PembebananBiaya pembebananBiaya = new PembebananBiaya();
			pembebananBiaya.setId(resultSet.getString("id"));
			pembebananBiaya.setNamaProyek(resultSet.getString("nama_proyek"));
			pembebananBiaya.setPeriode(resultSet.getString("periode"));
			pembebananBiaya.setRkpAwal(resultSet.getDouble("rkp_awal"));
			pembebananBiaya.setRencanaSampaiBulanIni(resultSet
					.getDouble("rencana_sampai_bulan_ini"));
			pembebananBiaya.setRealisasiSampaiBulanLalu(resultSet
					.getDouble("realisasi_sampai_bulan_lalu"));
			pembebananBiaya.setRealisasiBulanIni(resultSet
					.getDouble("realisasi_bulan_ini"));
			pembebananBiaya.setRealisasiSampaiBulanIni(resultSet
					.getDouble("realisasi_sampai_bulan_ini"));
			pembebananBiaya.setProyeksi(resultSet.getDouble("proyeksi"));

			return pembebananBiaya;

		}
	};

	public void insertPembebananBiaya(PembebananBiaya pembebananBiaya) {

		String id = pembebananBiaya.getId();
		String namaProyek = pembebananBiaya.getNamaProyek();
		String periode = pembebananBiaya.getPeriode();
		Double rkpAwal = pembebananBiaya.getRkpAwal();
		Double rencanaSampaiBulanIni = pembebananBiaya
				.getRencanaSampaiBulanIni();
		Double realisasiSampaiBulanLalu = pembebananBiaya
				.getRealisasiSampaiBulanLalu();
		Double realisasiBulanIni = pembebananBiaya.getRealisasiBulanIni();
		Double realisasiSampaiBulanIni = pembebananBiaya
				.getRealisasiSampaiBulanIni();
		Double proyeksi = pembebananBiaya.getProyeksi();

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

		String sql = "INSERT INTO wg_informasi_manajemen_pembebanan_biaya (id, nama_proyek, "
				+ "periode, nama_proyek, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi) VALUES (:id, :namaProyek, :periode, :rkpAwal, "
				+ ":rencanaSampaiBulanIni, :realisasiSampaiBulanLalu, :realisasiBulanIni, "
				+ ":realisasiSampaiBulanIni, :proyeksi)";

		try {
			namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
		} catch (DataAccessException e) {
			LOGGER.error("Error inserting data into database on insertPembebananBiaya : "
					+ e);
		}

	}

	public List<PembebananBiaya> getAllPembebananBiaya() {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_pembebanan_biaya";

		List<PembebananBiaya> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PEMBEBANAN_BIAYA_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getAllPembebananBiaya : "
					+ e);
		}

		return resultList;

	}

	public List<PembebananBiaya> getPembebananBiayaByNamaProyekAndPeriode(
			String namaProyek, String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_pembebanan_biaya WHERE "
				+ "nama_proyek = :namaProyek AND periode = :periode";

		List<PembebananBiaya> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PEMBEBANAN_BIAYA_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getPembebananBiayaByNamaProyekAndPeriode : "
					+ e);
		}

		return resultList;

	}

	public List<PembebananBiaya> getPembebananBiayaByPeriode(String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_pembebanan_biaya WHERE periode = :periode";

		List<PembebananBiaya> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PEMBEBANAN_BIAYA_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getPembebananBiayaByPeriode : "
					+ e);
		}

		return resultList;

	}

}
