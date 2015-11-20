package fr.univ_lille1.fil.coo.courriers.factory.letters.simpleLetter;

import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;

/**
 * Represent a factory to generate specific {@link SimpleLetter}
 */
public interface FactorySimpleLetter {
	/**
	 * Generate a {@link SimpleLetter}
	 * @return The {@link SimpleLetter} generated
	 */
	SimpleLetter createSimpleLetter();
}
