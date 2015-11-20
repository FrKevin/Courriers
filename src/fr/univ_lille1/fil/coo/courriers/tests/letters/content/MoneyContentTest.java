package fr.univ_lille1.fil.coo.courriers.tests.letters.content;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.univ_lille1.fil.coo.courriers.letters.contents.MoneyContent;

public class MoneyContentTest {
	
	protected MoneyContent moneyContent;
	public final static int GAINS = 10;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		moneyContent = new MoneyContent(GAINS);
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
		assertTrue(moneyContent.getMoney() == GAINS);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetMoneyWidthIllegalArgumentException() {
		moneyContent.setMoney(-10);
	}
	
	public void testSetMoney() {
		moneyContent.setMoney(GAINS + GAINS);
		assertTrue(moneyContent.getMoney() == (GAINS+GAINS) );
	}
}
