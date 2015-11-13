package fr.univ_lille1.fil.coo.courriers.letters.decorators;

import fr.univ_lille1.fil.coo.courriers.letters.Letter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.Content;

public class UrgentLetter extends DecoratorLetter {
	
	protected static final double EXTRA_COST = 15;
	
	public UrgentLetter(Letter<?> letter) {
		super(letter.getCost()*2, letter);
	}

	@Override
	protected void action() {
		letter.operation();
	}
}
