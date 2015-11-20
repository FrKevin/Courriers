package fr.univ_lille1.fil.coo.courriers.tests.city;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.univ_lille1.fil.coo.courriers.city.City;
import fr.univ_lille1.fil.coo.courriers.city.Inhabitant;
import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

public class InhabitantTest {
	
	Inhabitant h;
	City c = new City("Lille");

	@Before
	public void setUp() throws Exception {
		h = new Inhabitant("toto", c);
	}

	@After
	public void tearDown() throws Exception {
		h = null;
	}

	@Test
	public void testInhabitantStringCity() {
		assertEquals("toto", h.getName());
		assertEquals(c.getName(), h.getCity().getName());
		assertEquals(0, h.getBankAccount().getAmount(), 0.001);
		assertTrue(h.getPostbox().isEmpty());
	}

	@Test
	public void testInhabitantStringCityDouble() {
		h = new Inhabitant("toto", c, 123.45);
		assertEquals("toto", h.getName());
		assertEquals(c, h.getCity());
		assertEquals(123.45, h.getBankAccount().getAmount(), 0.001);
	}

	@Test
	public void testGetName() {
		assertEquals("toto", h.getName());
	}

	@Test
	public void testGetCity() {
		assertEquals(c.getName(), h.getCity().getName());
	}

	@Test
	public void testGetBankAccount() {
		assertEquals(0, h.getBankAccount().getAmount(), 0.001);
		h = new Inhabitant("toto", c, 123.45);
		assertEquals(123.45, h.getBankAccount().getAmount(), 0.001);
	}

	@Test
	public void testGetPostbox() {
		assertTrue(h.getPostbox().isEmpty());
		h.getPostbox().addLetter(new SimpleLetter(new TextContent("t")));
		assertFalse(h.getPostbox().isEmpty());
		
	}

	@Test
	public void testShowLetters() {
		h.getPostbox().addLetter(new SimpleLetter(new TextContent("t")));
		h.showLetters();
		assertTrue(h.getPostbox().isEmpty());
	}

}
