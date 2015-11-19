package fr.univ_lille1.fil.coo.courriers.letters.decorators;

import fr.univ_lille1.fil.coo.courriers.letters.Letter;
import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

public class RegisteredLetter<L extends Letter<?> & Decorable> extends DecoratorLetter<L> {
	protected static final double EXTRA_COST = 15;
	
	public RegisteredLetter(L letter) {
		super(letter.getCost()+EXTRA_COST, letter);
	}

	@Override
	protected void action() {
		SimpleLetter receipt = new SimpleLetter(new TextContent(letter.getContent().toString()));
		receiver.getCity().sendLetter(receipt);
		letter.operation();
	}

}
