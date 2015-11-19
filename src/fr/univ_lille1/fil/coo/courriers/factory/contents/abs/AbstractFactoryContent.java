package fr.univ_lille1.fil.coo.courriers.factory.contents.abs;

import fr.univ_lille1.fil.coo.courriers.letters.contents.CompositeContent;
import fr.univ_lille1.fil.coo.courriers.letters.contents.MoneyContent;
import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

public interface AbstractFactoryContent {
	
	public TextContent createTextContent();
	
	public MoneyContent createMoneyContent();
	
	public CompositeContent createCompositeContent();
	
}
