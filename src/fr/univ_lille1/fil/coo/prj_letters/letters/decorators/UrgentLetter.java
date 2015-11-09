package fr.univ_lille1.fil.coo.prj_letters.letters.decorators;

import fr.univ_lille1.fil.coo.prj_letters.letters.Letter;
import fr.univ_lille1.fil.coo.prj_letters.letters.contents.Content;

public class UrgentLetter<T extends Content> extends DecoratorLetter<T> {
	
	public UrgentLetter(Letter<T> letter) {
		super(letter);
		// TODO Stub du constructeur généré automatiquement
	}

	@Override
	public void toDo() {
		// TODO Stub de la méthode généré automatiquement
		
	}
	
}
