package com.supmti.dao;



public class TvaMaroc implements ITva {

	private static Double taux = 20d;

	private static final int CENT = 100;

	public Double calculeMantantTva(Double mantantHT) {

		return mantantHT * taux / CENT;
	}
}
