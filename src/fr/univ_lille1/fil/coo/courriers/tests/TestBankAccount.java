package fr.univ_lille1.fil.coo.courriers.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.univ_lille1.fil.coo.courriers.city.BankAccount;

public class TestBankAccount {
	
	protected BankAccount bankAccount;
	protected final double  AMOUNT = 50.5;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		bankAccount = new BankAccount();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		bankAccount = null;
	}
	
	@Test
	public void testBankAccount() {
		assertTrue(bankAccount.getAmount() == 0);
	}

	@Test
	public void testBankAccountDouble() {
		bankAccount = new BankAccount(AMOUNT);
		assertTrue(bankAccount.getAmount() == AMOUNT);
	}
	
	@Test
	public void testCredit() {
		bankAccount.credit( AMOUNT);
		assertTrue(bankAccount.getAmount() == AMOUNT);
	}
	
	@Test
	public void testHasDebit() {
		assertFalse(bankAccount.hasDebit(AMOUNT));
		bankAccount.credit( AMOUNT);
		assertTrue(bankAccount.hasDebit(AMOUNT));
	}

	@Test
	public void testDebit() {
		assertFalse(bankAccount.debit(AMOUNT));
		bankAccount.credit(AMOUNT);
		assertTrue(bankAccount.debit(AMOUNT));	
	}
}
