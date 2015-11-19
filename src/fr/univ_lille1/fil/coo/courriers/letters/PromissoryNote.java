package fr.univ_lille1.fil.coo.courriers.letters;

import fr.univ_lille1.fil.coo.courriers.city.Inhabitant;
import fr.univ_lille1.fil.coo.courriers.letters.contents.MoneyContent;
import fr.univ_lille1.fil.coo.courriers.letters.decorators.Decorable;

/**
 * This class represent a promissory note
 * This kind of letter contains an amount to give to an inhabitant
 */
public class PromissoryNote extends Letter<MoneyContent> implements Decorable{
	
	private static final double FIX_COST = 1;
	private static final double COEFF_COST = 0.01;

	/**
	 * Create a {@link Letter} with a money content
	 * @param moneyContent The amount of money of the promissory note
	 */
	public PromissoryNote(MoneyContent moneyContent){
		this(null, null, moneyContent);
	}
	
	/**
	 * Create a {@link Letter} with a money content, a sender and a receiver
	 * @param sender The sender of the letter
	 * @param receiver The receiver of the letter
	 * @param moneyContent The money content of the letter
	 */
	public PromissoryNote(Inhabitant sender, Inhabitant receiver,MoneyContent moneyContent){
		super(42, sender, receiver, moneyContent);
		setCost(COEFF_COST * content.getMoney() +FIX_COST);
	}	
	
	@Override
	protected void action() {
		receiver.credit(this.content.getMoney());
	}

	@Override
	public String toString() {
		// TODO Stub de la méthode généré automatiquement
		return "a promissory letter letter whose content is " + content.toString();
	}

}
