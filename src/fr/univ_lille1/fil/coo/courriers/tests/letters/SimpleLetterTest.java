package fr.univ_lille1.fil.coo.courriers.tests.letters;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.univ_lille1.fil.coo.courriers.city.City;
import fr.univ_lille1.fil.coo.courriers.city.Inhabitant;
import fr.univ_lille1.fil.coo.courriers.letters.Letter;
import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

public class SimpleLetterTest extends LetterTest{
	public final static double COST_LETTER = 10;
	public final static String  CONTENT_LETTER = "bla bla";
	public final static String CITY_NAME = "Lille";
	
	@Test
	public void testAction() {
		fail("Not yet implemented");
	}

	@Override
	protected Letter<?> createLetterWidthCost() {
		SimpleLetter simpleLetter = new SimpleLetter(null);
		return simpleLetter;
	}

	@Override
	protected Letter<?> createLetterWidthContentAndCost() {
		return new SimpleLetter(COST_LETTER, new TextContent(CONTENT_LETTER));
	}

	@Override
	protected Letter<?> createLetterWidthCostSenderReceiverContent() {
		City city = new City(CITY_NAME);
		return new SimpleLetter(COST_LETTER, new Inhabitant("", city), new Inhabitant("", city), new TextContent(CONTENT_LETTER));
	}

}
