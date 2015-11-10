package fr.univ_lille1.fil.coo.courriers.city;

public class BankAccount {

	private double amount;
	
	
	public BankAccount(){
		this(0);
	}
	
	public BankAccount(double amount) {
		this.amount = amount;
	}
	
	public boolean hasDebit(double amount){
		return this.amount - amount >= 0;
	}
	
	public boolean debit(double amount){
		if(hasDebit(amount)){
			this.amount -= amount;
			return true;
		}
		return false;
	}
	
	public void credit(double amount){
		this.amount += amount;
	}
	
	/*
	 * A voir hasDebit(BankAccount bankAccount) debit(BankAccount bankAccount) credit(BankAccount bankAccount)
	 */

	public double getAmount() {
		return amount;
	}
}
