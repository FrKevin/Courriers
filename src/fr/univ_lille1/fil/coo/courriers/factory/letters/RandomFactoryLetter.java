package fr.univ_lille1.fil.coo.courriers.factory.letters;

import fr.univ_lille1.fil.coo.courriers.factory.letters.abs.AbstractFactoryLetter;
import fr.univ_lille1.fil.coo.courriers.factory.letters.abs.DefaultAbstractFactoryLetter;
import fr.univ_lille1.fil.coo.courriers.letters.Letter;

import fr.univ_lille1.fil.coo.courriers.utils.UtilsCourriers;

/**
 * Represent a factory to generate specified {@link Letter}
 */
public class RandomFactoryLetter implements FactoryLetter {
	
	public static final int RATIO_PROMISSORY_NOTE = 2;
	public static final int RATIO_SIMPLE_LETTER = 10;
	public static final int RATIO_GLOBAL = 10;


	private AbstractFactoryLetter abstractFactoryLetter;
	
	/**
	 * Create a factory with a specified {@link AbstractFactoryLetter}
	 * @param abstractFactoryLetter The {@link AbstractFactoryLetter} used to generate {@link Letter}
	 */
	public RandomFactoryLetter(AbstractFactoryLetter abstractFactoryLetter) {
		this.abstractFactoryLetter = abstractFactoryLetter;
	}
	
	/**
	 * Create a factory with the default {@link AbstractFactoryLetter}
	 */
	
	public RandomFactoryLetter() {
		this(new DefaultAbstractFactoryLetter());
	}

	@Override
	public Letter<?> createLetter() {
		return (UtilsCourriers.RAND.nextInt(RATIO_GLOBAL) <= RATIO_PROMISSORY_NOTE) ? abstractFactoryLetter.createPromissoryNote() : abstractFactoryLetter.createSimpleLetter();
	}



}
