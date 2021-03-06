package fr.univ_lille1.fil.coo.courriers.factory.letters;

import fr.univ_lille1.fil.coo.courriers.letters.Letter;

/**
 * Represent a factory to generate a specific case of a {@link Letter}
 */
public interface FactoryLetter {

	/**
	 * Create a letter with a kind of content
	 * @return the letter created
	 */
	Letter<?> createLetter();
}
