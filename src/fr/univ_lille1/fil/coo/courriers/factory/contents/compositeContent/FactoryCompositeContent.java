package fr.univ_lille1.fil.coo.courriers.factory.contents.compositeContent;

import fr.univ_lille1.fil.coo.courriers.letters.contents.CompositeContent;

/**
 * Represent a factory to generate a specific case of {@link CompositeContent}
 */
public interface FactoryCompositeContent {
	/**
	 * Create a composite content
	 * @return A list of content as composite
	 */
	CompositeContent createCompositeContent();
}
