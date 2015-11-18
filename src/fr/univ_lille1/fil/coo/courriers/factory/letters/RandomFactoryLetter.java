package fr.univ_lille1.fil.coo.courriers.factory.letters;

import java.util.Random;

import fr.univ_lille1.fil.coo.courriers.factory.letters.abs.AbstractFactoryLetter;
import fr.univ_lille1.fil.coo.courriers.factory.letters.abs.DefaultAbstractFactoryLetter;
import fr.univ_lille1.fil.coo.courriers.letters.Letter;

public class RandomFactoryLetter implements FactoryLetter {

	private static final Random RAND = new Random();
	
	public static final int RATIO_PROMISSORY_NOTE = 2;
	public static final int RATIO_SIMPLE_LETTER = 10;
	public static final int RATIO_GLOBAL = 10;


	private AbstractFactoryLetter abstractFactoryLetter;

	public RandomFactoryLetter(AbstractFactoryLetter abstractFactoryLetter) {
		this.abstractFactoryLetter = abstractFactoryLetter;
	}
	
	public RandomFactoryLetter() {
		this(new DefaultAbstractFactoryLetter());
	}

	@Override
	public Letter<?> createLetter() {
		return (RAND.nextInt(RATIO_GLOBAL) <= RATIO_PROMISSORY_NOTE) ? abstractFactoryLetter.createPromissoryNote() : abstractFactoryLetter.createSimpleLetter();
	}

	
}
