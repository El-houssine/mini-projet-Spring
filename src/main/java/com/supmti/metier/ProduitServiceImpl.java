package com.supmti.metier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.supmti.dao.IProduitDao;
import com.supmti.model.Categorie;
import com.supmti.model.Produit;
@Component
public class ProduitServiceImpl implements IProduitService {
	@Autowired
    private IProduitDao produitDao;
	
    List<Produit>produits=new ArrayList<Produit>();
	
	
	public int totaliteProduit() {
		
		return this.produitDao.getTotaliteProduit();
	}
	
	public List<Produit> listeProduits(Categorie categorie) {
		
		return (List<Produit>) this.produitDao.getListProduits(categorie);
	}

	public List<Produit> listeProduits() {
		
		return (List<Produit>) this.produitDao.getListProduits();
	}
 
}
