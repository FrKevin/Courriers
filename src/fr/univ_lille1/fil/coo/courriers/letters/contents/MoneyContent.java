package fr.univ_lille1.fil.coo.courriers.letters.contents;

public class MoneyContent extends Content {
	protected double money;
	
	public MoneyContent(double money){
		setMoney(money);
	}
	
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		if( money < 0)
			throw new IllegalArgumentException("The money is negatif.");
		this.money = money;
	}

	@Override
	public String toString() {
		return "content is a money content ("+money+"€)";
	}
	
	
}
