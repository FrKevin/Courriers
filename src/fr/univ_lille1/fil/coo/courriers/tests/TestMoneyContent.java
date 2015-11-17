package fr.univ_lille1.fil.coo.courriers.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.univ_lille1.fil.coo.courriers.letters.contents.MoneyContent;

public class TestMoneyContent {
	
	protected MoneyContent moneyContent;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		moneyContent = new MoneyContent(10);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		moneyContent = null;
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void MoneyContentWidthIllegalArgumentException(){
		/* Supprime l'avertissement pour le compilateur  */
		@SuppressWarnings("unused")
		MoneyContent err = new MoneyContent(-1);
	}
	
	@Test
	public void testMoneyContent() {
		assertTrue(moneyContent.getMoney() == 10);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetMoney() {
		moneyContent.setMoney(-10);
	}
}
