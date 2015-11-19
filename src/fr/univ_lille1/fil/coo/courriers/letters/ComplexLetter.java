package fr.univ_lille1.fil.coo.courriers.letters;

import fr.univ_lille1.fil.coo.courriers.letters.contents.CompositeContent;

public class ComplexLetter extends Letter<CompositeContent>{
	private static final int  COST_COMPLEX_LETTER = 10;
	
	public ComplexLetter(CompositeContent compositeContent) {
		this(COST_COMPLEX_LETTER, compositeContent);
	}
	
	public ComplexLetter(double cost, CompositeContent compositeContent){
		super(cost, compositeContent);
	}

	@Override
	protected void action() {
		//TODO Not yet implemented
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
