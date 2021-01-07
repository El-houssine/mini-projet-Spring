package com.supmti.dao;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.supmti.model.Categorie;
import com.supmti.model.Produit;

@Component
public class ProduitDaoImpl implements IProduitDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public ProduitDaoImpl(DataSource dataSource) {

		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Map getListProduits() {

		String sql = "SELECT * FROM PRODUIT";
		return this.jdbcTemplate.queryForMap(sql);

	}

	public Map getListProduits(Categorie categorie) {
		String sql = "SELECT * FROM PRODUIT WHERE LNAME = ?";
		return this.jdbcTemplate.queryForMap(sql, categorie);

	}

	public int getTotaliteProduit() {
		String sql = "SELECT COUNT(*) FROM PRODUIT";
		return this.jdbcTemplate.queryForInt(sql);

	}

	public Map listProduits(String categorie) {
		// TODO Auto-generated method stub
		return null;
	}

}
