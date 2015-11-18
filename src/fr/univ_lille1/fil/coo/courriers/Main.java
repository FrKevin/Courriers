package fr.univ_lille1.fil.coo.courriers;

import fr.univ_lille1.fil.coo.courriers.factory.letters.RandomFactorySimpleLetter;
import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;

public class Main {
	public static void main(String[] args) {
		
		SimpleLetter letter = new RandomFactorySimpleLetter().createSimpleLetter();
		System.out.println(letter.getContent());
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
