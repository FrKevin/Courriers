package fr.univ_lille1.fil.coo.courriers.tests.city;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.univ_lille1.fil.coo.courriers.city.Postbox;
import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

public class TestPostbox {
	
	protected static final int  NB_LETTERS = 50;
	
	@Test
	public void testAddLetter() {
		Postbox box = new Postbox();
		assertTrue(box.getLetters().size() == 0);
		for(int i = 0; i < NB_LETTERS; i++){
			box.addLetter(new SimpleLetter(new TextContent("")));
		}
		assertTrue(box.getLetters().size() == NB_LETTERS);
	}
}
