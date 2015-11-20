package fr.univ_lille1.fil.coo.courriers.factory.contents.moneyContent;

import fr.univ_lille1.fil.coo.courriers.letters.contents.MoneyContent;
import fr.univ_lille1.fil.coo.courriers.utils.UtilsCourriers;

/**
 * Represent a factory to generate a random {@link MoneyContent}
 */
public class DefaultFactoryMoneyContent implements FactoryMoneyContent{
	
	public static final int BOUND_MAX = 1000;
	public static final int BOUND_MIN = 1;
	
	@Override
	public MoneyContent createMoneyContent() {	
		return new MoneyContent(UtilsCourriers.randDouble(BOUND_MIN, BOUND_MAX));
	}

}
