package com.supmti.metier;

import java.util.List;

import com.supmti.dao.ITva;
import com.supmti.model.Produit;

public class FacturationService implements IFacturationService {

	private ITva tva;

	public FacturationService(ITva tva) {
		super();
		this.tva = tva;
	}

	public Double calculMantantFacture(List<Produit> produits) {
		Double mantantHT = 0d;
		for (Produit produit : produits) {
			mantantHT += produit.getPrix();
		}

		return mantantHT += tva.calculeMantantTva(mantantHT);
	}

	public ITva getTva() {
		return tva;
	}

	public void setTva(ITva tva) {
		this.tva = tva;
	}

}
