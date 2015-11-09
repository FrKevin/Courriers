package fr.univ_lille1.fil.coo.prj_letters.letters.decorators;

import fr.univ_lille1.fil.coo.prj_letters.letters.Letter;
import fr.univ_lille1.fil.coo.prj_letters.letters.contents.Content;

public abstract class DecoratorLetter<T extends Content> extends Letter<T> {

	protected Letter<T> letter;
	
	
	public DecoratorLetter(Letter<T> letter) {
		this.letter = letter;
	}
}
