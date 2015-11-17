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

import id.co.wikagedung.system.projectDashboard.dao.PendapatanBiayaDao;
import id.co.wikagedung.system.projectDashboard.model.PendapatanBiaya;

public class PendapatanBiayaDaoImpl implements PendapatanBiayaDao {

	private static final Logger LOGGER = Logger
			.getLogger(PendapatanBiayaDaoImpl.class);

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public PendapatanBiayaDaoImpl(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	private RowMapper<PendapatanBiaya> PENDAPATAN_BIAYA_ROW_MAPPER = new RowMapper<PendapatanBiaya>() {

		public PendapatanBiaya mapRow(ResultSet resultSet, int rowNumber)
				throws SQLException {

			PendapatanBiaya pendapatanBiaya = new PendapatanBiaya();
			pendapatanBiaya.setId(resultSet.getString("id"));
			pendapatanBiaya.setNamaProyek(resultSet.getString("nama_proyek"));
			pendapatanBiaya.setPeriode(resultSet.getString("periode"));
			pendapatanBiaya.setRkpAwal(resultSet.getDouble("rkp_awal"));
			pendapatanBiaya.setRencanaSampaiBulanIni(resultSet
					.getDouble("rencana_sampai_bulan_ini"));
			pendapatanBiaya.setRealisasiSampaiBulanLalu(resultSet
					.getDouble("realisasi_sampai_bulan_lalu"));
			pendapatanBiaya.setRealisasiBulanIni(resultSet
					.getDouble("realisasi_bulan_ini"));
			pendapatanBiaya.setRealisasiSampaiBulanIni(resultSet
					.getDouble("realisasi_sampai_bulan_ini"));
			pendapatanBiaya.setProyeksi(resultSet.getDouble("proyeksi"));

			return pendapatanBiaya;

		}
	};

	public void insertPendapatanBiaya(PendapatanBiaya pendapatanBiaya) {

		String id = pendapatanBiaya.getId();
		String namaProyek = pendapatanBiaya.getNamaProyek();
		String periode = pendapatanBiaya.getPeriode();
		Double rkpAwal = pendapatanBiaya.getRkpAwal();
		Double rencanaSampaiBulanIni = pendapatanBiaya
				.getRencanaSampaiBulanIni();
		Double realisasiSampaiBulanLalu = pendapatanBiaya
				.getRealisasiSampaiBulanLalu();
		Double realisasiBulanIni = pendapatanBiaya.getRealisasiBulanIni();
		Double realisasiSampaiBulanIni = pendapatanBiaya
				.getRealisasiSampaiBulanIni();
		Double proyeksi = pendapatanBiaya.getProyeksi();

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

		String sql = "INSERT INTO wg_informasi_manajemen_pendapatan_biaya (id, nama_proyek, "
				+ "periode, nama_proyek, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi) VALUES (:id, :namaProyek, :periode, :rkpAwal, "
				+ ":rencanaSampaiBulanIni, :realisasiSampaiBulanLalu, :realisasiBulanIni, "
				+ ":realisasiSampaiBulanIni, :proyeksi)";

		try {
			namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
		} catch (DataAccessException e) {
			LOGGER.error("Error inserting data into database on insertPendapatanBiaya : "
					+ e);
		}

	}

	public List<PendapatanBiaya> getAllPendapatanBiaya() {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_pendapatan_biaya";

		List<PendapatanBiaya> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PENDAPATAN_BIAYA_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getAllPendapatanBiaya : "
					+ e);
		}

		return resultList;

	}

	public List<PendapatanBiaya> getPendapatanBiayaByNamaProyekAndPeriode(
			String namaProyek, String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_pendapatan_biaya WHERE "
				+ "nama_proyek = :namaProyek AND periode = :periode";

		List<PendapatanBiaya> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PENDAPATAN_BIAYA_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getPendapatanBiayaByNamaProyekAndPeriode : "
					+ e);
		}

		return resultList;

	}

	public List<PendapatanBiaya> getPendapatanBiayaByPeriode(String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_pendapatan_biaya WHERE periode = :periode";

		List<PendapatanBiaya> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PENDAPATAN_BIAYA_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getPendapatanBiayaByPeriode : "
					+ e);
		}

		return resultList;

	}

}
