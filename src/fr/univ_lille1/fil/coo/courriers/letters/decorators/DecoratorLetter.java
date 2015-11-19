package fr.univ_lille1.fil.coo.courriers.letters.decorators;

import fr.univ_lille1.fil.coo.courriers.letters.Letter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.Content;

public abstract class DecoratorLetter<L extends Letter<?> & Decorable> extends Letter<Content> {

	protected Letter<?> letter;

	public DecoratorLetter(double cost, L letter) {
		super(cost);
		this.letter = letter;
		this.content = letter.getContent();
	}
	
	@Override
	public String toString() {
		// TODO Stub de la méthode généré automatiquement
		return null;
	}
	
}
