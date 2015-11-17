package fr.univ_lille1.fil.coo.courriers.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.univ_lille1.fil.coo.courriers.city.City;
import fr.univ_lille1.fil.coo.courriers.city.Inhabitant;

public class TestCity {
	
	protected City city;
	protected static final int  NB_INHABITANTS = 50;
	
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
		assertTrue(city.getInhabitants().isEmpty());
	}


	@Test
	public void testAddInhabitants() {
		for(int i = 0; i < NB_INHABITANTS; i++){
			city.addInhabitants(new Inhabitant("H"+i, city));
		}
		assertTrue(city.getInhabitants().size() == NB_INHABITANTS);
		for(int i = 0; i < NB_INHABITANTS; i++){
			assertTrue(city.getInhabitants().get(i).getName().compareTo("H"+i) == 0);
		}
	}

	@Test
	public void testSendLetter() {
		fail("Not yet implemented");
	}

	@Test
	public void testDistributeLetters() {
		fail("Not yet implemented");
	}

}
