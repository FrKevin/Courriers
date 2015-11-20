package fr.univ_lille1.fil.coo.courriers.factory.contents.abs;

import fr.univ_lille1.fil.coo.courriers.letters.contents.CompositeContent;
import fr.univ_lille1.fil.coo.courriers.letters.contents.Content;
import fr.univ_lille1.fil.coo.courriers.letters.contents.MoneyContent;
import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

/**
 * Represent a factory to generate a specific case of {@link Content}
 */
public interface AbstractFactoryContent {
	
	/**
	 * Generate a text content
	 * @return A text content for a letter
	 */
	public TextContent createTextContent();
	
	/**
	 * Generate a money content
	 * @return A money content for a letter
	 */
	public MoneyContent createMoneyContent();
	
	/**
	 * Generate a composite content
	 * @return A composite content for a letter
	 */
	public CompositeContent createCompositeContent();
	
}
