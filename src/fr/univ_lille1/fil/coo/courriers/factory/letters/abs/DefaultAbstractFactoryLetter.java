package fr.univ_lille1.fil.coo.courriers.factory.letters.abs;

import fr.univ_lille1.fil.coo.courriers.letters.PromissoryNote;
import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.MoneyContent;
import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

public class DefaultAbstractFactoryLetter implements AbstractFactoryLetter{

	
	@Override
	public PromissoryNote createPromissoryNote() {
		return new PromissoryNote(new MoneyContent(10));
	}

	@Override
	public SimpleLetter createSimpleLetter() {
		return new SimpleLetter(new TextContent("Blabla"));
	}

}
