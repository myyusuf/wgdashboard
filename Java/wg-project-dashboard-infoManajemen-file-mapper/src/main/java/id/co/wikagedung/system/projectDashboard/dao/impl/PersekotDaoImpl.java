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

import id.co.wikagedung.system.projectDashboard.dao.PersekotDao;
import id.co.wikagedung.system.projectDashboard.model.Persekot;

public class PersekotDaoImpl implements PersekotDao {

	private static final Logger LOGGER = Logger
			.getLogger(PersekotDaoImpl.class);

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public PersekotDaoImpl(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	private RowMapper<Persekot> PERSEKOT_ROW_MAPPER = new RowMapper<Persekot>() {

		public Persekot mapRow(ResultSet resultSet, int rowNumber)
				throws SQLException {

			Persekot persekot = new Persekot();
			persekot.setId(resultSet.getString("id"));
			persekot.setNamaProyek(resultSet.getString("nama_proyek"));
			persekot.setPeriode(resultSet.getString("periode"));
			persekot.setRkpAwal(resultSet.getDouble("rkp_awal"));
			persekot.setRencanaSampaiBulanIni(resultSet
					.getDouble("rencana_sampai_bulan_ini"));
			persekot.setRealisasiSampaiBulanLalu(resultSet
					.getDouble("realisasi_sampai_bulan_lalu"));
			persekot.setRealisasiBulanIni(resultSet
					.getDouble("realisasi_bulan_ini"));
			persekot.setRealisasiSampaiBulanIni(resultSet
					.getDouble("realisasi_sampai_bulan_ini"));
			persekot.setProyeksi(resultSet.getDouble("proyeksi"));

			return persekot;

		}
	};

	public void insertPersekot(Persekot persekot) {

		String id = persekot.getId();
		String namaProyek = persekot.getNamaProyek();
		String periode = persekot.getPeriode();
		Double rkpAwal = persekot.getRkpAwal();
		Double rencanaSampaiBulanIni = persekot.getRencanaSampaiBulanIni();
		Double realisasiSampaiBulanLalu = persekot
				.getRealisasiSampaiBulanLalu();
		Double realisasiBulanIni = persekot.getRealisasiBulanIni();
		Double realisasiSampaiBulanIni = persekot.getRealisasiSampaiBulanIni();
		Double proyeksi = persekot.getProyeksi();

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

		String sql = "INSERT INTO wg_informasi_manajemen_persekot (id, nama_proyek, "
				+ "periode, nama_proyek, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi) VALUES (:id, :namaProyek, :periode, :rkpAwal, "
				+ ":rencanaSampaiBulanIni, :realisasiSampaiBulanLalu, :realisasiBulanIni, "
				+ ":realisasiSampaiBulanIni, :proyeksi)";

		try {
			namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
		} catch (DataAccessException e) {
			LOGGER.error("Error inserting data into database on insertPersekot : "
					+ e);
		}

	}

	public List<Persekot> getAllPersekot() {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_persekot";

		List<Persekot> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PERSEKOT_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getAllPersekot : "
					+ e);
		}

		return resultList;

	}

	public List<Persekot> getPersekotByNamaProyekAndPeriode(String namaProyek,
			String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_persekot WHERE "
				+ "nama_proyek = :namaProyek AND periode = :periode";

		List<Persekot> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PERSEKOT_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getPersekotByNamaProyekAndPeriode : "
					+ e);
		}

		return resultList;

	}

	public List<Persekot> getPersekotByPeriode(String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_persekot WHERE periode = :periode";

		List<Persekot> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PERSEKOT_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getPersekotByPeriode : "
					+ e);
		}

		return resultList;

	}

}
