package fr.univ_lille1.fil.coo.courriers.factory.letters;

import fr.univ_lille1.fil.coo.courriers.letters.Letter;

public interface FactoryLetter {
	
	Letter<?> createLetter();
}
