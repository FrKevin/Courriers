package fr.univ_lille1.fil.coo.courriers.factory.letters.simpleLetter;

import fr.univ_lille1.fil.coo.courriers.factory.contents.textContent.DefaultFactoryTextContent;
import fr.univ_lille1.fil.coo.courriers.factory.contents.textContent.FactoryTextContent;
import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;

public class DefaultFactorySimpleLetter implements FactorySimpleLetter {
	protected FactoryTextContent factoryTextContent;
	
	public DefaultFactorySimpleLetter() {
		this(new DefaultFactoryTextContent());
	}
	
	public DefaultFactorySimpleLetter(FactoryTextContent factoryTextContent) {
		this.factoryTextContent = factoryTextContent;
	}

	@Override
	public SimpleLetter createSimpleLetter() {
		return new SimpleLetter(factoryTextContent.createTextContent());
	}

}
