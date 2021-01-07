package com.supmti.spring.presentation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.supmti.metier.IFacturationService;
import com.supmti.metier.IProduitService;
import com.supmti.model.Produit;

public class Projet_Tva_3_Application {

	public static void main(String[] args) {

		

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		IFacturationService myBean = ctx.getBean(IFacturationService.class);
		IProduitService myProd = ctx.getBean(IProduitService.class);
		//System.out.println(myBean.calculMantantFacture(produits));
		for (Produit prd : myProd.listeProduits()) {
			System.out.println(prd.getLibelleProduit());
		}

		// System.out.println(((FacturationService)myBean).getTva().getClass().getName());
	}

}
