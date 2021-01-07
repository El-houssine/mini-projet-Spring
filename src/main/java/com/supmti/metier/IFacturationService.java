package com.supmti.metier;

import java.util.List;

import com.supmti.model.Produit;

public interface IFacturationService {
	public Double calculMantantFacture(List<Produit> produits);
	

	// public List<Produit> Afficher();
}
