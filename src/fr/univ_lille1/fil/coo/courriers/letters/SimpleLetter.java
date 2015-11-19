package fr.univ_lille1.fil.coo.courriers.letters;

import fr.univ_lille1.fil.coo.courriers.city.Inhabitant;
import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;
import fr.univ_lille1.fil.coo.courriers.letters.decorators.Decorable;

public class SimpleLetter extends Letter<TextContent> implements Decorable {
	public static final int  COST_SIMPLE_LETTER = 1;
	
	public SimpleLetter(TextContent textContent){
		this(COST_SIMPLE_LETTER, textContent);
	}
	
	public SimpleLetter(double cost, TextContent textContent) {
		super(cost, textContent);
	}
	
	public SimpleLetter(double cost, Inhabitant sender, Inhabitant receiver, TextContent textContent){
		super(cost, sender, receiver, textContent);
	}
	
	@Override
	protected void action() {
		
	}

	@Override
	public String toString() {
		return "a simple letter whose a content is" + content.toString();
	}

}