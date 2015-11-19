package fr.univ_lille1.fil.coo.courriers.letters;

import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

public class ThanksLetter extends SimpleLetter {

	public ThanksLetter(PromissoryNote promissoryNote) {
		super(COST_SIMPLE_LETTER, promissoryNote.receiver, promissoryNote.sender, new TextContent("thanks for " + promissoryNote.toString()));
	}
	
	@Override
	public String toString() {
		return "a thanks letter which is " + super.toString();
	}
}

