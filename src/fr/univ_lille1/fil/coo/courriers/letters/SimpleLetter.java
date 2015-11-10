package fr.univ_lille1.fil.coo.courriers.letters;

import fr.univ_lille1.fil.coo.courriers.city.Inhabitant;
import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

public class SimpleLetter extends Letter<TextContent> {
	private static final int  COST_SIMPLE_LETTER = 1;
	
	public SimpleLetter(TextContent textContent){
		this(COST_SIMPLE_LETTER, textContent);
	}
	
	public SimpleLetter(double cost, TextContent  textContent) {
		super(cost, textContent);
	}
	
	public SimpleLetter(double cost, Inhabitant sender, Inhabitant receiver, TextContent textContent){
		super(cost, sender, receiver, textContent);
	}
	
	@Override
	protected void action() {
		
	}

}