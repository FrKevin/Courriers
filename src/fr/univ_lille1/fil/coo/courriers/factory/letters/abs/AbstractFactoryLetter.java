package fr.univ_lille1.fil.coo.courriers.factory.letters.abs;

import fr.univ_lille1.fil.coo.courriers.letters.ComplexLetter;
import fr.univ_lille1.fil.coo.courriers.letters.Letter;
import fr.univ_lille1.fil.coo.courriers.letters.PromissoryNote;
import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;

/**
 * Represent a factory to generate specific {@link Letter}
 */
public interface AbstractFactoryLetter {
	
	/**
	 * Generate a {@link PromissoryNote}
	 * @return a {@link PromissoryNote}
	 */
	public PromissoryNote createPromissoryNote();

	/**
	 * Generate a {@link SimpleLetter}
	 * @return a {@link SimpleLetter}
	 */
	public SimpleLetter createSimpleLetter();
	
	/**
	 * Generate a {@link ComplexLetter}
	 * @return a {@link ComplexLetter}
	 */
	public ComplexLetter createComplexLetter();
}
