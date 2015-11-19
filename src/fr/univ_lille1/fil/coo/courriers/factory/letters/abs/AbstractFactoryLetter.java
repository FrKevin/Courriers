package fr.univ_lille1.fil.coo.courriers.factory.letters.abs;

import fr.univ_lille1.fil.coo.courriers.letters.ComplexLetter;
import fr.univ_lille1.fil.coo.courriers.letters.PromissoryNote;
import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;

public interface AbstractFactoryLetter {
	
	public PromissoryNote createPromissoryNote();

	public SimpleLetter createSimpleLetter();
	
	public ComplexLetter createComplexLetter();
}
