package com.supmti.dao;

public class TvaFrance implements ITva {

	private static Double taux = 19d;

	private static final int CENT = 100;

	public Double calculeMantantTva(Double mantantHT) {

		return mantantHT * taux / CENT;
	}

}
