package fr.univ_lille1.fil.coo.courriers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import fr.univ_lille1.fil.coo.courriers.city.City;
import fr.univ_lille1.fil.coo.courriers.factory.city.FactoryCity;

public class Simulate {

	private int nbDay;
	private int currentDay = 0;
	
	private City city;
	
	public Simulate(int nbDay, FactoryCity factoryCity) {
		this.nbDay = nbDay;
		this.city = factoryCity.createCity();
	}
	
	public void run() {
		// TODO Implemenation
		while(true) {
			
		}
	}
	
	public int getNbDay() {
		return nbDay;
	}

	public int getCurrentDay() {
		return currentDay;
	}

}
