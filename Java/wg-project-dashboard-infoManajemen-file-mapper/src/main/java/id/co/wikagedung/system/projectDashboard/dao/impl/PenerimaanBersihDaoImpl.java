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

import id.co.wikagedung.system.projectDashboard.dao.PenerimaanBersihDao;
import id.co.wikagedung.system.projectDashboard.model.PenerimaanBersih;

public class PenerimaanBersihDaoImpl implements PenerimaanBersihDao {

	private static final Logger LOGGER = Logger
			.getLogger(PenerimaanBersihDaoImpl.class);

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public PenerimaanBersihDaoImpl(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	private RowMapper<PenerimaanBersih> PENERIMAAN_BERSIH_ROW_MAPPER = new RowMapper<PenerimaanBersih>() {

		public PenerimaanBersih mapRow(ResultSet resultSet, int rowNumber)
				throws SQLException {

			PenerimaanBersih penerimaanBersih = new PenerimaanBersih();
			penerimaanBersih.setId(resultSet.getString("id"));
			penerimaanBersih.setNamaProyek(resultSet.getString("nama_proyek"));
			penerimaanBersih.setPeriode(resultSet.getString("periode"));
			penerimaanBersih.setRkpAwal(resultSet.getDouble("rkp_awal"));
			penerimaanBersih.setRencanaSampaiBulanIni(resultSet
					.getDouble("rencana_sampai_bulan_ini"));
			penerimaanBersih.setRealisasiSampaiBulanLalu(resultSet
					.getDouble("realisasi_sampai_bulan_lalu"));
			penerimaanBersih.setRealisasiBulanIni(resultSet
					.getDouble("realisasi_bulan_ini"));
			penerimaanBersih.setRealisasiSampaiBulanIni(resultSet
					.getDouble("realisasi_sampai_bulan_ini"));
			penerimaanBersih.setProyeksi(resultSet.getDouble("proyeksi"));

			return penerimaanBersih;

		}
	};

	public void insertPenerimaanBersih(PenerimaanBersih penerimaanBersih) {

		String id = penerimaanBersih.getId();
		String namaProyek = penerimaanBersih.getNamaProyek();
		String periode = penerimaanBersih.getPeriode();
		Double rkpAwal = penerimaanBersih.getRkpAwal();
		Double rencanaSampaiBulanIni = penerimaanBersih
				.getRencanaSampaiBulanIni();
		Double realisasiSampaiBulanLalu = penerimaanBersih
				.getRealisasiSampaiBulanLalu();
		Double realisasiBulanIni = penerimaanBersih.getRealisasiBulanIni();
		Double realisasiSampaiBulanIni = penerimaanBersih
				.getRealisasiSampaiBulanIni();
		Double proyeksi = penerimaanBersih.getProyeksi();

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

		String sql = "INSERT INTO wg_informasi_manajemen_penerimaan_bersih (id, nama_proyek, "
				+ "periode, nama_proyek, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi) VALUES (:id, :namaProyek, :periode, :rkpAwal, "
				+ ":rencanaSampaiBulanIni, :realisasiSampaiBulanLalu, :realisasiBulanIni, "
				+ ":realisasiSampaiBulanIni, :proyeksi)";

		try {
			namedParameterJdbcTemplate.update(sql, mapSqlParameterSource);
		} catch (DataAccessException e) {
			LOGGER.error("Error inserting data into database on insertPenerimaanBersih : "
					+ e);
		}

	}

	public List<PenerimaanBersih> getAllPenerimaanBersih() {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_penerimaan_bersih";

		List<PenerimaanBersih> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PENERIMAAN_BERSIH_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getAllPenerimaanBersih : "
					+ e);
		}

		return resultList;

	}

	public List<PenerimaanBersih> getPenerimaanBersihByNamaProyekAndPeriode(
			String namaProyek, String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("namaProyek", namaProyek, Types.VARCHAR);
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_penerimaan_bersih WHERE "
				+ "nama_proyek = :namaProyek AND periode = :periode";

		List<PenerimaanBersih> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PENERIMAAN_BERSIH_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getPenerimaanBersihByNamaProyekAndPeriode : "
					+ e);
		}

		return resultList;

	}

	public List<PenerimaanBersih> getPenerimaanBersihByPeriode(String periode) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("periode", periode, Types.VARCHAR);

		String sql = "SELECT id, nama_proyek, periode, rkp_awal, rencana_sampai_bulan_ini, "
				+ "realisasi_sampai_bulan_lalu, realisasi_bulan_ini, realisasi_sampai_bulan_ini, "
				+ "proyeksi  FROM wg_informasi_manajemen_penerimaan_bersih WHERE periode = :periode";

		List<PenerimaanBersih> resultList = null;

		try {
			resultList = namedParameterJdbcTemplate.query(sql,
					mapSqlParameterSource, PENERIMAAN_BERSIH_ROW_MAPPER);
		} catch (DataAccessException e) {
			LOGGER.error("Error getting data from database on getPenerimaanBersihByPeriode : "
					+ e);
		}

		return resultList;

	}

}
