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

import id.co.wikagedung.system.projectDashboard.dao.DroppingDao;
import id.co.wikagedung.system.projectDashboard.model.Dropping;

public class DroppingDaoImpl implements DroppingDao {

	private static final Logger LOGGER = Logger
			.getLogger(DroppingDaoImpl.class);

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public DroppingDaoImpl(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	private RowMapper<Dropping> DROPPING_ROW_MAPPER = new RowMapper<Dropping>() {

		public Dropping mapRow(ResultSet resultSet, int rowNumber)
				throws SQLException {

			Dropping dropping = new Dropping();
			dropping.setId(resultSet.getString("id"));
			dropping.setNamaProyek(resultSet.getString("nama_proyek"));
			dropping.setPeriode(resultSet.getString("periode"));
			dropping.setRkpAwal(resultSet.getDouble("rkp_awal"));
			dropping.setRencanaSampaiBulanIni(resultSet
					.getDouble("rencana_sampai_bulan_ini"));
			dropping.setRealisasiSampaiBulanLalu(resultSet
					.getDouble("realisasi_sampai_bulan_lalu"));
			dropping.setRealisasiBulanIni(resultSet
					.getDouble("realisasi_bulan_ini"));
			dropping.setRealisasiSampaiBulanIni(resultSet
					.getDouble("realisasi_sampai_bulan_ini"));
			dropping.setProyeksi(resultSet.getDouble("proyeksi"));

			return dropping;

		}
	};

	public void insertDropping(Dropping dropping) {

		String id = dropping.getId();
		String namaProyek = dropping.getNamaProyek();
		String periode = dropping.getPeriode();
		Double rkpAwal = dropping.getRkpAwal();
		Double rencanaSampaiBulanIni = dropping.getRencanaSampaiBulanIni();
		Double realisasiSampaiBulanLalu = dropping
				.getRealisasiSampaiBulanLalu();
		Double realisasiBulanIni = dropping.getRealisasiBulanIni();
		Double realisasiSampaiBulanIni = dropping.getRealisasiSampaiBulanIni();
		Double proyeksi = dropping.getProyeksi();

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

		String sql = "INSERT INTO wg_informasi_manajemen_dropping (id, nama_proyek, "
				+ "periode, nama_proyek, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi) VALUES (:id, :namaProyek, :periode, :rkpAwal, "
				+ ":rencanaSampaiBulanIni, :realisasiSampaiBulanLalu, :realisasiBulanIni, "
				+ ":realisasiSampaiBulanIni, :proyeksi)";

		try {
			namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
		} catch (DataAccessException e) {
			LOGGER.error("Error inserting data into database on insertDropping : "
					+ e);
		}

	}

	public List<Dropping> getAllDropping() {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_dropping";

		List<Dropping> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, DROPPING_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getAllDropping : "
					+ e);
		}

		return resultList;

	}

	public List<Dropping> getDroppingByNamaProyekAndPeriode(String namaProyek,
			String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_dropping WHERE "
				+ "nama_proyek = :namaProyek AND periode = :periode";

		List<Dropping> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, DROPPING_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getDroppingByNamaProyekAndPeriode : "
					+ e);
		}

		return resultList;

	}

	public List<Dropping> getDroppingByPeriode(String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_dropping WHERE periode = :periode";

		List<Dropping> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, DROPPING_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getDroppingByPeriode : "
					+ e);
		}

		return resultList;

	}

}
