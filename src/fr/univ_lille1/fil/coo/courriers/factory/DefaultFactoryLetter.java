package fr.univ_lille1.fil.coo.courriers.factory;

import fr.univ_lille1.fil.coo.courriers.city.City;
import fr.univ_lille1.fil.coo.courriers.city.Inhabitant;
import fr.univ_lille1.fil.coo.courriers.letters.Letter;
import fr.univ_lille1.fil.coo.courriers.letters.PromissoryNote;
import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.MoneyContent;
import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

public class DefaultFactoryLetter implements FactoryLetter{

	@Override
	public Letter<MoneyContent> createPromissoryNote() {
		City city = new City("ville");
		Inhabitant sender = new Inhabitant("toto", city, 100);
		Inhabitant receiver = new Inhabitant("tata", city);
		return new PromissoryNote(sender, receiver, new MoneyContent(10));
	}

	@Override
	public Letter<TextContent> createSimpleLetter() {
		return new SimpleLetter(new TextContent("Letter"));
	}

}
