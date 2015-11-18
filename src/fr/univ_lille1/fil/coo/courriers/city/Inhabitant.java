package fr.univ_lille1.fil.coo.courriers.city;

public class Inhabitant {

	protected String name;
	protected City city;
	protected BankAccount bankAccount;
	protected Postbox postbox;
	
	
	public Inhabitant(String name, City city) {
		this(name, city, 0);
	}


	public Inhabitant(String name, City city, double amount) {
		super();
		this.name = name;
		this.city = city;
		this.bankAccount = new BankAccount(amount);
		this.postbox = new Postbox();
	}
	
	public void credit(double amount){
		bankAccount.credit(amount);
	}
	
	public boolean debit(double amount){
		return bankAccount.debit(amount);
	}

	public String getName() {
		return name;
	}

	public City getCity() {
		return city;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public Postbox getPostbox() {
		return postbox;
	}
	
	public void showLetters() {
		// TODO 
	}
	
}
