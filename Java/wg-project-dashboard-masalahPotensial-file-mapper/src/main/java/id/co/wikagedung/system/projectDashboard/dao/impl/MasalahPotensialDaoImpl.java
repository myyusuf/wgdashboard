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

import id.co.wikagedung.system.projectDashboard.dao.MasalahPotensialDao;
import id.co.wikagedung.system.projectDashboard.model.MasalahPotensial;

public class MasalahPotensialDaoImpl implements MasalahPotensialDao {

	private static final Logger LOGGER = Logger
			.getLogger(MasalahPotensialDaoImpl.class);

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public MasalahPotensialDaoImpl(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	private RowMapper<MasalahPotensial> MASALAH_POTENSIAL_ROW_MAPPER = new RowMapper<MasalahPotensial>() {

		public MasalahPotensial mapRow(ResultSet resultSet, int rowNumber)
				throws SQLException {

			MasalahPotensial masalahPotensial = new MasalahPotensial();
			masalahPotensial.setId(resultSet.getString("id"));
			masalahPotensial.setNamaProyek(resultSet.getString("nama_proyek"));
			masalahPotensial.setPeriode(resultSet.getString("periode"));
			masalahPotensial.setButiranMasalah(resultSet
					.getString("butiran_masalah"));
			masalahPotensial.setUsulanPemecahan(resultSet
					.getString("usulan_pemecahan"));
			masalahPotensial.setTargetPenyelesaian(resultSet
					.getString("target_penyelesaian"));

			return masalahPotensial;

		}
	};

	public void insertMasalahPotensial(MasalahPotensial masalahPotensial) {

		String id = masalahPotensial.getId();
		String namaProyek = masalahPotensial.getNamaProyek();
		String periode = masalahPotensial.getPeriode();
		String butiranMasalah = masalahPotensial.getButiranMasalah();
		String usulanPemecahan = masalahPotensial.getUsulanPemecahan();
		String targetPenyelesaian = masalahPotensial.getTargetPenyelesaian();

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("id", id, Types.VARCHAR);
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);
		mapSqlParameterSource.addValue("butiranMasalah", butiranMasalah,
				Types.VARCHAR);
		mapSqlParameterSource.addValue("usulanPemecahan", usulanPemecahan,
				Types.VARCHAR);
		mapSqlParameterSource.addValue("targetPenyelesaian",
				targetPenyelesaian, Types.VARCHAR);

		String sql = "INSERT INTO wg_masalah_potensial (id, nama_proyek, "
				+ "periode, butiran_masalah, usulan_pemecahan, target_penyelesaian) "
				+ "VALUES (:id, :namaProyek, :periode, :butiranMasalah, "
				+ ":usulanPemecahan, :targetPenyelesaian)";

		try {
			namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
		} catch (DataAccessException e) {
			LOGGER.error("Error inserting data into database on insertMasalahPotensial : "
					+ e);
		}

	}

	public List<MasalahPotensial> getAllMasalahPotensial() {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

		String sql = "SELECT id, nama_proyek, periode, butiran_masalah, usulan_pemecahan, "
				+ "target_penyelesaian FROM wg_masalah_potensial";

		List<MasalahPotensial> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, MASALAH_POTENSIAL_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getAllMasalahPotensial : "
					+ e);
		}

		return resultList;

	}

	public List<MasalahPotensial> getMasalahPotensialByNamaProyekAndPeriode(
			String namaProyek, String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, butiran_masalah, usulan_pemecahan, "
				+ "target_penyelesaian FROM wg_masalah_potensial WHERE "
				+ "nama_proyek = :namaProyek AND periode = :periode";

		List<MasalahPotensial> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, MASALAH_POTENSIAL_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getMasalahPotensialByNamaProyekAndPeriode : "
					+ e);
		}

		return resultList;

	}

	public List<MasalahPotensial> getMasalahPotensialByPeriode(String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, butiran_masalah, usulan_pemecahan, "
				+ "target_penyelesaian FROM wg_masalah_potensial WHERE periode = :periode";

		List<MasalahPotensial> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, MASALAH_POTENSIAL_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getMasalahPotensialByPeriode : "
					+ e);
		}

		return resultList;

	}

}
