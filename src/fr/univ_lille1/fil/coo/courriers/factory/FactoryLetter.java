package fr.univ_lille1.fil.coo.courriers.factory;

import fr.univ_lille1.fil.coo.courriers.letters.Letter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.MoneyContent;
import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

public interface FactoryLetter {
	public Letter<MoneyContent> createPromissoryNote();

	public Letter<TextContent> createSimpleLetter();
}
