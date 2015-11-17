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

import id.co.wikagedung.system.projectDashboard.dao.LkIndukDao;
import id.co.wikagedung.system.projectDashboard.model.LkInduk;

public class LkIndukDaoImpl implements LkIndukDao {

	private static final Logger LOGGER = Logger.getLogger(LkIndukDaoImpl.class);

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public LkIndukDaoImpl(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	private RowMapper<LkInduk> LK_INDUK_ROW_MAPPER = new RowMapper<LkInduk>() {

		public LkInduk mapRow(ResultSet resultSet, int rowNumber)
				throws SQLException {

			LkInduk lkInduk = new LkInduk();
			lkInduk.setId(resultSet.getString("id"));
			lkInduk.setNamaProyek(resultSet.getString("nama_proyek"));
			lkInduk.setPeriode(resultSet.getString("periode"));
			lkInduk.setRkpAwal(resultSet.getDouble("rkp_awal"));
			lkInduk.setRencanaSampaiBulanIni(resultSet
					.getDouble("rencana_sampai_bulan_ini"));
			lkInduk.setRealisasiSampaiBulanLalu(resultSet
					.getDouble("realisasi_sampai_bulan_lalu"));
			lkInduk.setRealisasiBulanIni(resultSet
					.getDouble("realisasi_bulan_ini"));
			lkInduk.setRealisasiSampaiBulanIni(resultSet
					.getDouble("realisasi_sampai_bulan_ini"));
			lkInduk.setProyeksi(resultSet.getDouble("proyeksi"));

			return lkInduk;

		}
	};

	public void insertLkInduk(LkInduk lkInduk) {

		String id = lkInduk.getId();
		String namaProyek = lkInduk.getNamaProyek();
		String periode = lkInduk.getPeriode();
		Double rkpAwal = lkInduk.getRkpAwal();
		Double rencanaSampaiBulanIni = lkInduk.getRencanaSampaiBulanIni();
		Double realisasiSampaiBulanLalu = lkInduk.getRealisasiSampaiBulanLalu();
		Double realisasiBulanIni = lkInduk.getRealisasiBulanIni();
		Double realisasiSampaiBulanIni = lkInduk.getRealisasiSampaiBulanIni();
		Double proyeksi = lkInduk.getProyeksi();

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

		String sql = "INSERT INTO wg_informasi_manajemen_lk_induk (id, nama_proyek, "
				+ "periode, nama_proyek, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi) VALUES (:id, :namaProyek, :periode, :rkpAwal, "
				+ ":rencanaSampaiBulanIni, :realisasiSampaiBulanLalu, :realisasiBulanIni, "
				+ ":realisasiSampaiBulanIni, :proyeksi)";

		try {
			namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
		} catch (DataAccessException e) {
			LOGGER.error("Error inserting data into database on insertLkInduk : "
					+ e);
		}

	}

	public List<LkInduk> getAllLkInduk() {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_lk_induk";

		List<LkInduk> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, LK_INDUK_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getAllLkInduk : "
					+ e);
		}

		return resultList;

	}

	public List<LkInduk> getLkIndukByNamaProyekAndPeriode(String namaProyek,
			String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_lk_induk WHERE "
				+ "nama_proyek = :namaProyek AND periode = :periode";

		List<LkInduk> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, LK_INDUK_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getLkIndukByNamaProyekAndPeriode : "
					+ e);
		}

		return resultList;

	}

	public List<LkInduk> getLkIndukByPeriode(String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_lk_induk WHERE periode = :periode";

		List<LkInduk> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, LK_INDUK_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getLkIndukByPeriode : "
					+ e);
		}

		return resultList;

	}

}
