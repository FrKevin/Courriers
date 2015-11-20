package fr.univ_lille1.fil.coo.courriers.factory.contents.moneyContent;

import fr.univ_lille1.fil.coo.courriers.letters.contents.MoneyContent;

/**
 * Represent a factory to generate a specific {@link MoneyContent}
 * @author maxime
 *
 */
public interface FactoryMoneyContent {
	MoneyContent createMoneyContent();
}
