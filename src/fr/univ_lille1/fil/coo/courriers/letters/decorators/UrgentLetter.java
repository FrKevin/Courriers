package fr.univ_lille1.fil.coo.courriers.letters.decorators;

import fr.univ_lille1.fil.coo.courriers.letters.Letter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.Content;

public class UrgentLetter<T extends Content> extends DecoratorLetter<T> {
	
	public UrgentLetter(double cost, Letter<T> letter) {
		super(cost, letter);
	}

	@Override
	protected void action() {
		// TODO Auto-generated method stub
		
	}
}
