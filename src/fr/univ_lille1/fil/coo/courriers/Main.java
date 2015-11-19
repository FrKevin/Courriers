package fr.univ_lille1.fil.coo.courriers;

import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;
import fr.univ_lille1.fil.coo.courriers.letters.decorators.UrgentLetter;

public class Main {
	public static void main(String[] args) {
		UrgentLetter u = new UrgentLetter(new SimpleLetter(new TextContent("bla bla")));
		System.out.println(u.toString());
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
