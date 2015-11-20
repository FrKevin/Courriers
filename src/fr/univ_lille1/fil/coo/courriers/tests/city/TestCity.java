package fr.univ_lille1.fil.coo.courriers.tests.city;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.univ_lille1.fil.coo.courriers.city.City;
import fr.univ_lille1.fil.coo.courriers.city.Inhabitant;
import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

public class TestCity {
	
	protected City city;
	protected static final int NB_INHABITANTS = 5;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		city = new City("C1");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		city = null;
	}
	
	@Test
	public void testCityString() {
		assertTrue(city.getName().compareTo("C1") == 0);
		assertEquals("C1", city.getName());
		assertTrue(city.getInhabitants().isEmpty());
		assertTrue(city.getPostbox().isEmpty());
	}


	@Test
	public void testAddInhabitants() {
		city.addInhabitants(new Inhabitant("H", city));

		assertEquals(1, city.getInhabitants().size());
		assertTrue(city.getInhabitants().get(0).getName().compareTo("H") == 0);
		
		city.addInhabitants(new Inhabitant("H2", city));
		
		assertEquals(2, city.getInhabitants().size());
		assertTrue(city.getInhabitants().get(0).getName().compareTo("H") == 0);
		assertTrue(city.getInhabitants().get(1).getName().compareTo("H2") == 0);
	}

	@Test
	public void testSendLetter() {
		city.sendLetter(new SimpleLetter(new TextContent("content")));
		
		assertEquals(1, city.getPostbox().getLetters().size());
		assertEquals("content", ((TextContent)(city.getPostbox().getLetters().peek().getContent())).getContentLetter());
		
		
	}

	@Test
	public void testDistributeLetters() {
		fail("Not yet implemented");
	}

}
