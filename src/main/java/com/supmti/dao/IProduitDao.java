package com.supmti.dao;


import java.util.Map;

import com.supmti.model.Categorie;



public interface IProduitDao {
 public Map getListProduits();
 public Map getListProduits(Categorie categorie);
 public int getTotaliteProduit();
}
