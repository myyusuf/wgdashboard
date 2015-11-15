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

import id.co.wikagedung.system.projectDashboard.dao.BungaJasaGiroDao;
import id.co.wikagedung.system.projectDashboard.model.BungaJasaGiro;

public class BungaJasaGiroDaoImpl implements BungaJasaGiroDao {

	private static final Logger LOGGER = Logger
			.getLogger(BungaJasaGiroDaoImpl.class);

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public BungaJasaGiroDaoImpl(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	private RowMapper<BungaJasaGiro> BUNGA_JASA_GIRO_ROW_MAPPER = new RowMapper<BungaJasaGiro>() {

		public BungaJasaGiro mapRow(ResultSet resultSet, int rowNumber)
				throws SQLException {

			BungaJasaGiro bungaJasaGiro = new BungaJasaGiro();
			bungaJasaGiro.setId(resultSet.getString("id"));
			bungaJasaGiro.setNamaProyek(resultSet.getString("nama_proyek"));
			bungaJasaGiro.setPeriode(resultSet.getString("periode"));
			bungaJasaGiro.setRkpAwal(resultSet.getInt("rkp_awal"));
			bungaJasaGiro.setRencanaSampaiBulanIni(resultSet
					.getInt("rencana_sampai_bulan_ini"));
			bungaJasaGiro.setRealisasiSampaiBulanLalu(resultSet
					.getInt("realisasi_sampai_bulan_lalu"));
			bungaJasaGiro.setRealisasiBulanIni(resultSet
					.getInt("realisasi_bulan_ini"));
			bungaJasaGiro.setRealisasiSampaiBulanIni(resultSet
					.getInt("realisasi_sampai_bulan_ini"));
			bungaJasaGiro.setProyeksi(resultSet.getInt("proyeksi"));

			return bungaJasaGiro;

		}
	};

	public void insertBungaJasaGiro(BungaJasaGiro bungaJasaGiro) {

		String id = bungaJasaGiro.getId();
		String namaProyek = bungaJasaGiro.getNamaProyek();
		String periode = bungaJasaGiro.getPeriode();
		Integer rkpAwal = bungaJasaGiro.getRkpAwal();
		Integer rencanaSampaiBulanIni = bungaJasaGiro
				.getRencanaSampaiBulanIni();
		Integer realisasiSampaiBulanLalu = bungaJasaGiro
				.getRealisasiSampaiBulanLalu();
		Integer realisasiBulanIni = bungaJasaGiro.getRealisasiBulanIni();
		Integer realisasiSampaiBulanIni = bungaJasaGiro
				.getRealisasiSampaiBulanIni();
		Integer proyeksi = bungaJasaGiro.getProyeksi();

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

		String sql = "INSERT INTO wg_informasi_manajemen_bunga_jasa_giro (id, nama_proyek, "
				+ "periode, nama_proyek, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi) VALUES (:id, :namaProyek, :periode, :rkpAwal, "
				+ ":rencanaSampaiBulanIni, :realisasiSampaiBulanLalu, :realisasiBulanIni, "
				+ ":realisasiSampaiBulanIni, :proyeksi)";

		try {
			namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
		} catch (DataAccessException e) {
			LOGGER.error("Error inserting data into database on insertBungaJasaGiro : "
					+ e);
		}

	}

	public List<BungaJasaGiro> getAllBungaJasaGiro() {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_bunga_jasa_giro";

		List<BungaJasaGiro> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, BUNGA_JASA_GIRO_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getAllBungaJasaGiro : "
					+ e);
		}

		return resultList;

	}

	public List<BungaJasaGiro> getBungaJasaGiroByNamaProyekAndPeriode(
			String namaProyek, String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_bunga_jasa_giro WHERE "
				+ "nama_proyek = :namaProyek AND periode = :periode";

		List<BungaJasaGiro> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, BUNGA_JASA_GIRO_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getBungaJasaGiroByNamaProyekAndPeriode : "
					+ e);
		}

		return resultList;

	}

	public List<BungaJasaGiro> getBungaJasaGiroByPeriode(String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_bunga_jasa_giro WHERE periode = :periode";

		List<BungaJasaGiro> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, BUNGA_JASA_GIRO_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getBungaJasaGiroByPeriode : "
					+ e);
		}

		return resultList;

	}

}
