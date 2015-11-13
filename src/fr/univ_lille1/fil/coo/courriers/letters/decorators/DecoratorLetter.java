package fr.univ_lille1.fil.coo.courriers.letters.decorators;

import fr.univ_lille1.fil.coo.courriers.letters.Letter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.Content;

@SuppressWarnings("rawtypes")
public abstract class DecoratorLetter extends Letter {

	protected Letter<?> letter;

	public DecoratorLetter(double cost, Letter<?> letter) {
		super(cost);
		this.letter = letter;
		this.content = letter.getContent();
	}
}
