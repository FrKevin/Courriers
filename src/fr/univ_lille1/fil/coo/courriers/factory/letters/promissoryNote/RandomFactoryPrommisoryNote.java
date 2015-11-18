package fr.univ_lille1.fil.coo.courriers.factory.letters.promissoryNote;


import java.util.Random;

import fr.univ_lille1.fil.coo.courriers.letters.PromissoryNote;
import fr.univ_lille1.fil.coo.courriers.letters.contents.MoneyContent;


public class RandomFactoryPrommisoryNote implements FactoryPromissoryNote {

	private static final Random RAND = new Random();
	public static final int BOUND_MAX = 1000;
	public static final int BOUND_MIN = 1;

	@Override
	public PromissoryNote createPromissoryNote() {
		return new PromissoryNote(new MoneyContent(BOUND_MIN + (RAND.nextDouble()*BOUND_MAX - 1)));
	}
}
