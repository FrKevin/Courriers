package fr.univ_lille1.fil.coo.courriers.letters;

import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;
import fr.univ_lille1.fil.coo.courriers.letters.decorators.RegisteredLetter;

public class ReceiptLetter extends SimpleLetter {

	
	protected static TextContent createTextContent(RegisteredLetter<?> registeredLetter) {
		return new TextContent("aknowledgment of receipt for a registered letter whose content is " + registeredLetter.getContent().toString());
	}
	
	public ReceiptLetter(RegisteredLetter<?> registeredLetter) {
		super(COST_SIMPLE_LETTER, registeredLetter.receiver, registeredLetter.sender, createTextContent(registeredLetter));
	}
}
