package fr.univ_lille1.fil.coo.courriers.factory;

import fr.univ_lille1.fil.coo.courriers.city.City;

public class FactoryCity {
	public static City createCity(String nameCity){
		System.out.println("Creating "+ nameCity + " city.");
		return new City(nameCity);
	}
}
