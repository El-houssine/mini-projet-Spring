package com.supmti.model;

import org.springframework.stereotype.Component;


public class Produit {
    private int id;
	private String libelleProduit;
	private Double Prix;
	private Categorie categorie;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public String getLibelleProduit() {
		return libelleProduit;
	}

	public void setLibelleProduit(String libelleProduit) {
		this.libelleProduit = libelleProduit;
	}

	public Double getPrix() {
		return Prix;
	}

	public void setPrix(Double prix) {
		Prix = prix;
	}

}
