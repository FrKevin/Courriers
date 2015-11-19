package fr.univ_lille1.fil.coo.courriers.letters.decorators;

import fr.univ_lille1.fil.coo.courriers.letters.Letter;

public class UrgentLetter<L extends Letter<?> & Decorable> extends DecoratorLetter<L> {
	
	protected static final double EXTRA_COST = 2;
	
	public UrgentLetter(L letter) {
		super(letter.getCost()*EXTRA_COST, letter);

	}

	@Override
	protected void action() {
		letter.operation();
	}
	
	@Override
	public String toString() {
		return "an urgent letter whose content is " + letter.getContent().toString();
	}
}
