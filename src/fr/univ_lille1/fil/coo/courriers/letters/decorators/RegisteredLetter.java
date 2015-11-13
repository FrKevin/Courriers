package fr.univ_lille1.fil.coo.courriers.letters.decorators;

import fr.univ_lille1.fil.coo.courriers.letters.Letter;
import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.Content;
import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

public class RegisteredLetter extends DecoratorLetter {
	protected static final double EXTRA_COST = 15;
	
	public RegisteredLetter(Letter<?> letter) {
		super(letter.getCost()+EXTRA_COST, letter);
	}

	@Override
	protected void action() {
		SimpleLetter letter = new SimpleLetter(0,new TextContent(receiver.getName(), ""));
		letter.operation();
	}

}
