package fr.univ_lille1.fil.coo.courriers;

import fr.univ_lille1.fil.coo.courriers.factory.city.DefaultFactoryCity;

public class Main {
	public static void main(String[] args) {
		double t = 15.3554544545454;
		String xd = "bbhfhvfh" + String.format("%.2f" , t);
		System.out.println(xd);
		new Simulate(new DefaultFactoryCity("Lille")).run();
	}
}
