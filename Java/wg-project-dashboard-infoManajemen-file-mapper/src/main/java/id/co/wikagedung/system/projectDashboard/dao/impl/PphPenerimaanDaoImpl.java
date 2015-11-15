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

import id.co.wikagedung.system.projectDashboard.dao.PphPenerimaanDao;
import id.co.wikagedung.system.projectDashboard.model.PphPenerimaan;

public class PphPenerimaanDaoImpl implements PphPenerimaanDao {

	private static final Logger LOGGER = Logger
			.getLogger(PphPenerimaanDaoImpl.class);

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public PphPenerimaanDaoImpl(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	private RowMapper<PphPenerimaan> PPH_PENERIMAAN_ROW_MAPPER = new RowMapper<PphPenerimaan>() {

		public PphPenerimaan mapRow(ResultSet resultSet, int rowNumber)
				throws SQLException {

			PphPenerimaan pphPenerimaan = new PphPenerimaan();
			pphPenerimaan.setId(resultSet.getString("id"));
			pphPenerimaan.setNamaProyek(resultSet.getString("nama_proyek"));
			pphPenerimaan.setPeriode(resultSet.getString("periode"));
			pphPenerimaan.setRkpAwal(resultSet.getInt("rkp_awal"));
			pphPenerimaan.setRencanaSampaiBulanIni(resultSet
					.getInt("rencana_sampai_bulan_ini"));
			pphPenerimaan.setRealisasiSampaiBulanLalu(resultSet
					.getInt("realisasi_sampai_bulan_lalu"));
			pphPenerimaan.setRealisasiBulanIni(resultSet
					.getInt("realisasi_bulan_ini"));
			pphPenerimaan.setRealisasiSampaiBulanIni(resultSet
					.getInt("realisasi_sampai_bulan_ini"));
			pphPenerimaan.setProyeksi(resultSet.getInt("proyeksi"));

			return pphPenerimaan;

		}
	};

	public void inserPphPenerimaan(PphPenerimaan pphPenerimaan) {

		String id = pphPenerimaan.getId();
		String namaProyek = pphPenerimaan.getNamaProyek();
		String periode = pphPenerimaan.getPeriode();
		Integer rkpAwal = pphPenerimaan.getRkpAwal();
		Integer rencanaSampaiBulanIni = pphPenerimaan
				.getRencanaSampaiBulanIni();
		Integer realisasiSampaiBulanLalu = pphPenerimaan
				.getRealisasiSampaiBulanLalu();
		Integer realisasiBulanIni = pphPenerimaan.getRealisasiBulanIni();
		Integer realisasiSampaiBulanIni = pphPenerimaan
				.getRealisasiSampaiBulanIni();
		Integer proyeksi = pphPenerimaan.getProyeksi();

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

		String sql = "INSERT INTO wg_informasi_manajemen_pph_penerimaan (id, nama_proyek, "
				+ "periode, nama_proyek, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi) VALUES (:id, :namaProyek, :periode, :rkpAwal, "
				+ ":rencanaSampaiBulanIni, :realisasiSampaiBulanLalu, :realisasiBulanIni, "
				+ ":realisasiSampaiBulanIni, :proyeksi)";

		try {
			namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
		} catch (DataAccessException e) {
			LOGGER.error("Error inserting data into database on inserPphPenerimaan : "
					+ e);
		}

	}

	public List<PphPenerimaan> getAllPphPenerimaan() {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_pph_penerimaan";

		List<PphPenerimaan> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PPH_PENERIMAAN_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getAllPphPenerimaan : "
					+ e);
		}

		return resultList;

	}

	public List<PphPenerimaan> getPphPenerimaanByNamaProyekAndPeriode(
			String namaProyek, String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_pph_penerimaan WHERE "
				+ "nama_proyek = :namaProyek AND periode = :periode";

		List<PphPenerimaan> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PPH_PENERIMAAN_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getPphPenerimaanByNamaProyekAndPeriode : "
					+ e);
		}

		return resultList;

	}

	public List<PphPenerimaan> getPphPenerimaanByPeriode(String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_pph_penerimaan WHERE periode = :periode";

		List<PphPenerimaan> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PPH_PENERIMAAN_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getPphPenerimaanByPeriode : "
					+ e);
		}

		return resultList;

	}

}
