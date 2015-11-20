package fr.univ_lille1.fil.coo.courriers;

import fr.univ_lille1.fil.coo.courriers.factory.city.DefaultFactoryCity;

public class Main {
	public static void main(String[] args) {
		double t = 15.3554544545454;
		String xd = "bbhfhvfh" + String.format("%.2f" , t);
		System.out.println(xd);
		new Simulate(new DefaultFactoryCity("Lille")).run();
		
		
		//new Simulate(6, new DefaultFactoryCity("Lille")).run();  
		
		/* // Petit Test ------------------
		Postbox p = new Postbox();
		p.addLetter(new SimpleLetter(new TextContent("dddd")));
		System.out.println(p);
		
		UrgentLetter u = new UrgentLetter(new SimpleLetter(new TextContent("dddd")));
		System.out.println(u.getCost());
		System.out.println(u.getContent());
		*/
	}
}
