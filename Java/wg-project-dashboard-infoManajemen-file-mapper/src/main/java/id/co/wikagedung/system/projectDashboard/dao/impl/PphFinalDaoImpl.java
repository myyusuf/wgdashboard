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

import id.co.wikagedung.system.projectDashboard.dao.PphFinalDao;
import id.co.wikagedung.system.projectDashboard.model.PphFinal;

public class PphFinalDaoImpl implements PphFinalDao {

	private static final Logger LOGGER = Logger
			.getLogger(PphFinalDaoImpl.class);

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public PphFinalDaoImpl(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	private RowMapper<PphFinal> PPH_FINAL_ROW_MAPPER = new RowMapper<PphFinal>() {

		public PphFinal mapRow(ResultSet resultSet, int rowNumber)
				throws SQLException {

			PphFinal pphFinal = new PphFinal();
			pphFinal.setId(resultSet.getString("id"));
			pphFinal.setNamaProyek(resultSet.getString("nama_proyek"));
			pphFinal.setPeriode(resultSet.getString("periode"));
			pphFinal.setRkpAwal(resultSet.getDouble("rkp_awal"));
			pphFinal.setRencanaSampaiBulanIni(resultSet
					.getDouble("rencana_sampai_bulan_ini"));
			pphFinal.setRealisasiSampaiBulanLalu(resultSet
					.getDouble("realisasi_sampai_bulan_lalu"));
			pphFinal.setRealisasiBulanIni(resultSet
					.getDouble("realisasi_bulan_ini"));
			pphFinal.setRealisasiSampaiBulanIni(resultSet
					.getDouble("realisasi_sampai_bulan_ini"));
			pphFinal.setProyeksi(resultSet.getDouble("proyeksi"));

			return pphFinal;

		}
	};

	public void insertPphFinal(PphFinal pphFinal) {

		String id = pphFinal.getId();
		String namaProyek = pphFinal.getNamaProyek();
		String periode = pphFinal.getPeriode();
		Double rkpAwal = pphFinal.getRkpAwal();
		Double rencanaSampaiBulanIni = pphFinal.getRencanaSampaiBulanIni();
		Double realisasiSampaiBulanLalu = pphFinal
				.getRealisasiSampaiBulanLalu();
		Double realisasiBulanIni = pphFinal.getRealisasiBulanIni();
		Double realisasiSampaiBulanIni = pphFinal.getRealisasiSampaiBulanIni();
		Double proyeksi = pphFinal.getProyeksi();

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

		String sql = "INSERT INTO wg_informasi_manajemen_pph_final (id, nama_proyek, "
				+ "periode, nama_proyek, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi) VALUES (:id, :namaProyek, :periode, :rkpAwal, "
				+ ":rencanaSampaiBulanIni, :realisasiSampaiBulanLalu, :realisasiBulanIni, "
				+ ":realisasiSampaiBulanIni, :proyeksi)";

		try {
			namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
		} catch (DataAccessException e) {
			LOGGER.error("Error inserting data into database on insertPphFinal : "
					+ e);
		}

	}

	public List<PphFinal> getAllPphFinal() {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_pph_final";

		List<PphFinal> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PPH_FINAL_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getAllPphFinal : "
					+ e);
		}

		return resultList;

	}

	public List<PphFinal> getPphFinalByNamaProyekAndPeriode(String namaProyek,
			String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_pph_final WHERE "
				+ "nama_proyek = :namaProyek AND periode = :periode";

		List<PphFinal> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PPH_FINAL_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getPphFinalByNamaProyekAndPeriode : "
					+ e);
		}

		return resultList;

	}

	public List<PphFinal> getPphFinalByPeriode(String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_pph_final WHERE periode = :periode";

		List<PphFinal> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PPH_FINAL_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getPphFinalByPeriode : "
					+ e);
		}

		return resultList;

	}

}
