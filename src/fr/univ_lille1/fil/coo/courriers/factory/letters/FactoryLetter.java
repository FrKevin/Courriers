package fr.univ_lille1.fil.coo.courriers.factory.letters;

import fr.univ_lille1.fil.coo.courriers.letters.Letter;

/**
 * Represent a factory to generate a specified case of a {@link Letter}
 */
public interface FactoryLetter {

	Letter<?> createLetter();
}
