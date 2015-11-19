package fr.univ_lille1.fil.coo.courriers;

import fr.univ_lille1.fil.coo.courriers.letters.PromissoryNote;
import fr.univ_lille1.fil.coo.courriers.letters.contents.MoneyContent;
import fr.univ_lille1.fil.coo.courriers.letters.decorators.RegisteredLetter;

public class Main {
	public static void main(String[] args) {
		RegisteredLetter<PromissoryNote> rl = new RegisteredLetter<>(new PromissoryNote(new MoneyContent(10)));
		System.out.println(rl.getCost());
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
