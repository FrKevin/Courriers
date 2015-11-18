package fr.univ_lille1.fil.coo.courriers.factory.contents.compositeContent;

import java.util.ArrayList;
import java.util.List;

import fr.univ_lille1.fil.coo.courriers.factory.contents.moneyContent.DefaultFactoryMoneyContent;
import fr.univ_lille1.fil.coo.courriers.factory.contents.textContent.DefaultFactoryTextContent;
import fr.univ_lille1.fil.coo.courriers.letters.contents.CompositeContent;
import fr.univ_lille1.fil.coo.courriers.letters.contents.Content;

public class DefaultFactoryCompositeContent implements FactoryCompositeContent{

	@Override
	public CompositeContent createCompositeContent() {
		List<Content> contents = new ArrayList<>();
		contents.add(new DefaultFactoryTextContent().createTextContent());
		contents.add(new DefaultFactoryMoneyContent().createMoneyContent());
		return new CompositeContent(contents);
	}

}
