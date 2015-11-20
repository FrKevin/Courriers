package fr.univ_lille1.fil.coo.courriers.factory.contents.textContent;

import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

/**
 * Represent a factory to generate a specific {@link TextContent}
 */
public interface FactoryTextContent {
	TextContent createTextContent();
}
