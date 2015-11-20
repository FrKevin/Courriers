package fr.univ_lille1.fil.coo.courriers.factory.contents.abs;

import fr.univ_lille1.fil.coo.courriers.factory.contents.compositeContent.DefaultFactoryCompositeContent;
import fr.univ_lille1.fil.coo.courriers.factory.contents.compositeContent.FactoryCompositeContent;
import fr.univ_lille1.fil.coo.courriers.factory.contents.moneyContent.DefaultFactoryMoneyContent;
import fr.univ_lille1.fil.coo.courriers.factory.contents.moneyContent.FactoryMoneyContent;
import fr.univ_lille1.fil.coo.courriers.factory.contents.textContent.DefaultFactoryTextContent;
import fr.univ_lille1.fil.coo.courriers.factory.contents.textContent.FactoryTextContent;
import fr.univ_lille1.fil.coo.courriers.letters.contents.CompositeContent;
import fr.univ_lille1.fil.coo.courriers.letters.contents.MoneyContent;
import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

/**
 * This factory generate contents for letters
 */
public class DefaultAbstractFactoryContent implements AbstractFactoryContent{
	
	protected FactoryCompositeContent factoryCompositeContent;
	protected FactoryMoneyContent factoryMoneyContent;
	protected FactoryTextContent factoryTextContent;
	
	public DefaultAbstractFactoryContent(){
		this(new DefaultFactoryCompositeContent(), new DefaultFactoryMoneyContent(), new DefaultFactoryTextContent());
	}
	
	public DefaultAbstractFactoryContent(FactoryCompositeContent factoryCompositeContent, FactoryMoneyContent factoryMoneyContent, FactoryTextContent factoryTextContent) {
		this.factoryCompositeContent = factoryCompositeContent;
		this.factoryMoneyContent = factoryMoneyContent;
		this.factoryTextContent = factoryTextContent;
	}

	@Override
	public TextContent createTextContent() {
		return factoryTextContent.createTextContent();
	}

	@Override
	public MoneyContent createMoneyContent() {
		return factoryMoneyContent.createMoneyContent();
	}

	@Override
	public CompositeContent createCompositeContent() {
		return factoryCompositeContent.createCompositeContent();
	}

}