package fr.univ_lille1.fil.coo.courriers.city;

/**
 * This class Represent a bank account of an {@link Inhabitant}
 *
 */
public class BankAccount {

	private double amount;
	
	/**
	 * Initialize an account with 0€
	 */
	public BankAccount(){
		this(0);
	}
	
	/**
	 * Initialize an account with an amount defined
	 * @param amount The amout of money of the account
	 */
	public BankAccount(double amount) {
		this.amount = amount;
	}
	
	/**
	 * Verify that the account can do a debit
	 * @param amount the amount wanted to be debited
	 * @return True if the account has enough money, false if it hasn't
	 */
	public boolean hasDebit(double amount){
		return this.amount - amount >= 0;
	}
	
	/**
	 * Debit an amount of the account
	 * @param amount amount wanted to be debited
	 * @return true if it's done, false if not done
	 */
	public boolean debit(double amount){
		if(hasDebit(amount)){
			this.amount -= amount;
			return true;
		}
		return false;
	}
	
	/**
	 * Credit an amount on the account
	 * @param amount amount wanted to be credited
	 */
	public void credit(double amount){
		this.amount += amount;
	}
	
	/*
	 * A voir hasDebit(BankAccount bankAccount) debit(BankAccount bankAccount) credit(BankAccount bankAccount)
	 */
	/**
	 * Return the amount available on the account
	 * @return The amount avalable in the bank account
	 */
	public double getAmount() {
		return amount;
	}
}
