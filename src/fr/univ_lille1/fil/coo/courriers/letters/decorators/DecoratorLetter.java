package fr.univ_lille1.fil.coo.courriers.letters.decorators;

import fr.univ_lille1.fil.coo.courriers.city.Inhabitant;
import fr.univ_lille1.fil.coo.courriers.letters.Letter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.Content;

public abstract class DecoratorLetter<L extends Letter<?> & Decorable> extends Letter<Content> {

	protected L letter;

	public DecoratorLetter(double cost, L letter) {
		super(cost);
		this.letter = letter;
	}
	
	@Override
	public Inhabitant getReceiver() {
		return letter.getReceiver();
	}

	@Override
	public Inhabitant getSender() {
		return letter.getSender();
	}
	
	@Override
	public Content getContent() {
		return letter.getContent();
	}
}
