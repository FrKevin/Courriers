package fr.univ_lille1.fil.coo.courriers;

import fr.univ_lille1.fil.coo.courriers.factory.city.DefaultFactoryCity;

public class Main {
	public static void main(String[] args) {
		new Simulate(new DefaultFactoryCity("Lille")).run();
	
	}
}
