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

import id.co.wikagedung.system.projectDashboard.dao.ProsentaseTerhadapProduksiDao;
import id.co.wikagedung.system.projectDashboard.model.ProsentaseTerhadapProduksi;

public class ProsentaseTerhadapProduksiDaoImpl implements
		ProsentaseTerhadapProduksiDao {

	private static final Logger LOGGER = Logger
			.getLogger(ProsentaseTerhadapProduksiDaoImpl.class);

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public ProsentaseTerhadapProduksiDaoImpl(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	private RowMapper<ProsentaseTerhadapProduksi> PROSENTASE_TERHADAP_PRODUKSI_ROW_MAPPER = new RowMapper<ProsentaseTerhadapProduksi>() {

		public ProsentaseTerhadapProduksi mapRow(ResultSet resultSet,
				int rowNumber) throws SQLException {

			ProsentaseTerhadapProduksi prosentaseTerhadapProduksi = new ProsentaseTerhadapProduksi();
			prosentaseTerhadapProduksi.setId(resultSet.getString("id"));
			prosentaseTerhadapProduksi.setNamaProyek(resultSet
					.getString("nama_proyek"));
			prosentaseTerhadapProduksi.setPeriode(resultSet
					.getString("periode"));
			prosentaseTerhadapProduksi.setRkpAwal(resultSet
					.getDouble("rkp_awal"));
			prosentaseTerhadapProduksi.setRencanaSampaiBulanIni(resultSet
					.getDouble("rencana_sampai_bulan_ini"));
			prosentaseTerhadapProduksi.setRealisasiSampaiBulanLalu(resultSet
					.getDouble("realisasi_sampai_bulan_lalu"));
			prosentaseTerhadapProduksi.setRealisasiBulanIni(resultSet
					.getDouble("realisasi_bulan_ini"));
			prosentaseTerhadapProduksi.setRealisasiSampaiBulanIni(resultSet
					.getDouble("realisasi_sampai_bulan_ini"));
			prosentaseTerhadapProduksi.setProyeksi(resultSet
					.getDouble("proyeksi"));

			return prosentaseTerhadapProduksi;

		}
	};

	public void insertProsentaseTerhadapProduksi(
			ProsentaseTerhadapProduksi prosentaseTerhadapProduksi) {

		String id = prosentaseTerhadapProduksi.getId();
		String namaProyek = prosentaseTerhadapProduksi.getNamaProyek();
		String periode = prosentaseTerhadapProduksi.getPeriode();
		Double rkpAwal = prosentaseTerhadapProduksi.getRkpAwal();
		Double rencanaSampaiBulanIni = prosentaseTerhadapProduksi
				.getRencanaSampaiBulanIni();
		Double realisasiSampaiBulanLalu = prosentaseTerhadapProduksi
				.getRealisasiSampaiBulanLalu();
		Double realisasiBulanIni = prosentaseTerhadapProduksi
				.getRealisasiBulanIni();
		Double realisasiSampaiBulanIni = prosentaseTerhadapProduksi
				.getRealisasiSampaiBulanIni();
		Double proyeksi = prosentaseTerhadapProduksi.getProyeksi();

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

		String sql = "INSERT INTO wg_informasi_manajemen_prosentase_terhadap_produksi (id, nama_proyek, "
				+ "periode, nama_proyek, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi) VALUES (:id, :namaProyek, :periode, :rkpAwal, "
				+ ":rencanaSampaiBulanIni, :realisasiSampaiBulanLalu, :realisasiBulanIni, "
				+ ":realisasiSampaiBulanIni, :proyeksi)";

		try {
			namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
		} catch (DataAccessException e) {
			LOGGER.error("Error inserting data into database on insertProsentaseTerhadapProduksi : "
					+ e);
		}

	}

	public List<ProsentaseTerhadapProduksi> getAllProsentaseTerhadapProduksi() {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_prosentase_terhadap_produksi";

		List<ProsentaseTerhadapProduksi> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource,
					PROSENTASE_TERHADAP_PRODUKSI_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getAllProsentaseTerhadapProduksi : "
					+ e);
		}

		return resultList;

	}

	public List<ProsentaseTerhadapProduksi> getProsentaseTerhadapProduksiByNamaProyekAndPeriode(
			String namaProyek, String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_prosentase_terhadap_produksi WHERE "
				+ "nama_proyek = :namaProyek AND periode = :periode";

		List<ProsentaseTerhadapProduksi> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource,
					PROSENTASE_TERHADAP_PRODUKSI_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getProsentaseTerhadapProduksiByNamaProyekAndPeriode : "
					+ e);
		}

		return resultList;

	}

	public List<ProsentaseTerhadapProduksi> getProsentaseTerhadapProduksiByPeriode(
			String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_prosentase_terhadap_produksi WHERE periode = :periode";

		List<ProsentaseTerhadapProduksi> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource,
					PROSENTASE_TERHADAP_PRODUKSI_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getProsentaseTerhadapProduksiByPeriode : "
					+ e);
		}

		return resultList;

	}

}
