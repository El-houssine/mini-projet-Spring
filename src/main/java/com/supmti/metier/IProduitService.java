package com.supmti.metier;

import java.util.List;

import com.supmti.model.Categorie;
import com.supmti.model.Produit;

public interface IProduitService {
 public List<Produit>listeProduits();
 public List<Produit>listeProduits(Categorie categorie);
 public int totaliteProduit();
}
