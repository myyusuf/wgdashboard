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

import id.co.wikagedung.system.projectDashboard.dao.ProsentaseLkDao;
import id.co.wikagedung.system.projectDashboard.model.ProsentaseLk;

public class ProsentaseLkDaoImpl implements ProsentaseLkDao {

	private static final Logger LOGGER = Logger
			.getLogger(ProsentaseLkDaoImpl.class);

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public ProsentaseLkDaoImpl(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	private RowMapper<ProsentaseLk> PROSENTASE_LK_ROW_MAPPER = new RowMapper<ProsentaseLk>() {

		public ProsentaseLk mapRow(ResultSet resultSet, int rowNumber)
				throws SQLException {

			ProsentaseLk prosentaseLk = new ProsentaseLk();
			prosentaseLk.setId(resultSet.getString("id"));
			prosentaseLk.setNamaProyek(resultSet.getString("nama_proyek"));
			prosentaseLk.setPeriode(resultSet.getString("periode"));
			prosentaseLk.setRkpAwal(resultSet.getInt("rkp_awal"));
			prosentaseLk.setRencanaSampaiBulanIni(resultSet
					.getInt("rencana_sampai_bulan_ini"));
			prosentaseLk.setRealisasiSampaiBulanLalu(resultSet
					.getInt("realisasi_sampai_bulan_lalu"));
			prosentaseLk.setRealisasiBulanIni(resultSet
					.getInt("realisasi_bulan_ini"));
			prosentaseLk.setRealisasiSampaiBulanIni(resultSet
					.getInt("realisasi_sampai_bulan_ini"));
			prosentaseLk.setProyeksi(resultSet.getInt("proyeksi"));

			return prosentaseLk;

		}
	};

	public void insertProsentaseLk(ProsentaseLk prosentaseLk) {

		String id = prosentaseLk.getId();
		String namaProyek = prosentaseLk.getNamaProyek();
		String periode = prosentaseLk.getPeriode();
		Integer rkpAwal = prosentaseLk.getRkpAwal();
		Integer rencanaSampaiBulanIni = prosentaseLk.getRencanaSampaiBulanIni();
		Integer realisasiSampaiBulanLalu = prosentaseLk
				.getRealisasiSampaiBulanLalu();
		Integer realisasiBulanIni = prosentaseLk.getRealisasiBulanIni();
		Integer realisasiSampaiBulanIni = prosentaseLk
				.getRealisasiSampaiBulanIni();
		Integer proyeksi = prosentaseLk.getProyeksi();

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

		String sql = "INSERT INTO wg_informasi_manajemen_prosentase_lk (id, nama_proyek, "
				+ "periode, nama_proyek, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi) VALUES (:id, :namaProyek, :periode, :rkpAwal, "
				+ ":rencanaSampaiBulanIni, :realisasiSampaiBulanLalu, :realisasiBulanIni, "
				+ ":realisasiSampaiBulanIni, :proyeksi)";

		try {
			namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
		} catch (DataAccessException e) {
			LOGGER.error("Error inserting data into database on insertProsentaseLk : "
					+ e);
		}

	}

	public List<ProsentaseLk> getAllProsentaseLk() {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_prosentase_lk";

		List<ProsentaseLk> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PROSENTASE_LK_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getAllProsentaseLk : "
					+ e);
		}

		return resultList;

	}

	public List<ProsentaseLk> getProsentaseLkByNamaProyekAndPeriode(
			String namaProyek, String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_prosentase_lk WHERE "
				+ "nama_proyek = :namaProyek AND periode = :periode";

		List<ProsentaseLk> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PROSENTASE_LK_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getProsentaseLkByNamaProyekAndPeriode : "
					+ e);
		}

		return resultList;

	}

	public List<ProsentaseLk> getProsentaseLkByPeriode(String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_prosentase_lk WHERE periode = :periode";

		List<ProsentaseLk> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PROSENTASE_LK_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getProsentaseLkByPeriode : "
					+ e);
		}

		return resultList;

	}

}
