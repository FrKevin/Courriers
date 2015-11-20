package fr.univ_lille1.fil.coo.courriers.tests.letters;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.univ_lille1.fil.coo.courriers.letters.Letter;

public abstract class LetterTest {
	protected Letter<?> letter;
	public final static double COST_LETTER = 10;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		letter = createLetterWidthContentAndCost();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		letter = null;
	}
	
	@Test(expected = NullPointerException.class)
	public void testIsNullForContentWidthNullPointerException() {
		createLetterWidthCost().isNullForContent();
	}
	
	@Test
	public void testIsNullForContent() {
		createLetterWidthContentAndCost().isNullForContent();
	}
	
	@Test(expected = NullPointerException.class)
	public void testIsNullForReceiverWidthNullPointerException() {
		createLetterWidthCost().isNullForReceiver();
	}
	
	@Test
	public void testIsNullForReceiver() {
		createLetterWidthCostSenderReceiverContent().isNullForReceiver();
	}
	
	@Test(expected = NullPointerException.class)
	public void testIsNullForSenderWidthNullPointerException() {
		createLetterWidthCost().isNullForSender();
	}

	@Test
	public void testIsNullForSender() {
		createLetterWidthCostSenderReceiverContent().isNullForSender();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetCostWidthIllegalArgumentException() {
		letter.setCost(-COST_LETTER);
	}
	
	@Test
	public void testSetCost() {
		letter.setCost(COST_LETTER);
		assertEquals(COST_LETTER, letter.getCost(), 0.001);
	}
	
	protected abstract Letter<?> createLetterWidthCost();
	
	protected abstract Letter<?> createLetterWidthContentAndCost();
	
	protected abstract Letter<?> createLetterWidthCostSenderReceiverContent();
}
