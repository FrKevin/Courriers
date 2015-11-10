package fr.univ_lille1.fil.coo.courriers.letters;

import fr.univ_lille1.fil.coo.courriers.city.Inhabitant;
import fr.univ_lille1.fil.coo.courriers.letters.contents.MoneyContent;

public class PromissoryNote extends Letter<MoneyContent> {
	
	private static final double FIX_COST = 1;
	private static final double COEFF_COST = 0.01;

	public PromissoryNote(MoneyContent moneyContent){
		this(null, null, moneyContent);
	}
	
	public PromissoryNote(Inhabitant sender, Inhabitant receiver,MoneyContent moneyContent){
		super(42, sender, receiver, moneyContent);
		setCost(COEFF_COST * content.getMoney() +FIX_COST);
		isPossible();
	}
	
	protected void isPossible(){
		if(!sender.debit(this.getCost())){
			throw new IllegalArgumentException("The sender have negative solde account.");
		}
	}
	
	@Override
	protected void action() {
		receiver.credit(this.content.getMoney());
	}

}
