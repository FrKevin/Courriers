package fr.univ_lille1.fil.coo.courriers.letters.decorators;

import fr.univ_lille1.fil.coo.courriers.letters.Letter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.Content;

public abstract class DecoratorLetter<T extends Content> extends Letter<T> {

	protected Letter<T> letter;

	public DecoratorLetter(double cost, Letter<T> letter) {
		super(cost+letter.getCost());
		this.letter = letter;
		this.content = letter.getContent();
	}
}
