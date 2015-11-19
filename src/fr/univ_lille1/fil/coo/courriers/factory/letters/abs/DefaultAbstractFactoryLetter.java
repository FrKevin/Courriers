package fr.univ_lille1.fil.coo.courriers.factory.letters.abs;


import fr.univ_lille1.fil.coo.courriers.factory.letters.promissoryNote.DefaultFactoryPrommisoryNote;
import fr.univ_lille1.fil.coo.courriers.factory.letters.promissoryNote.FactoryPromissoryNote;
import fr.univ_lille1.fil.coo.courriers.factory.letters.simpleLetter.DefaultFactorySimpleLetter;
import fr.univ_lille1.fil.coo.courriers.factory.letters.simpleLetter.FactorySimpleLetter;
import fr.univ_lille1.fil.coo.courriers.letters.PromissoryNote;
import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;

public class DefaultAbstractFactoryLetter implements AbstractFactoryLetter{

	protected FactorySimpleLetter factorySimpleLetter;
	protected FactoryPromissoryNote factoryPromissoryNote;

	public DefaultAbstractFactoryLetter() {
		this(new DefaultFactorySimpleLetter(), new DefaultFactoryPrommisoryNote());
	}
	
	public DefaultAbstractFactoryLetter(FactorySimpleLetter factorySimpleLetter, FactoryPromissoryNote factoryPromissoryNote) {
		this.factorySimpleLetter = factorySimpleLetter;
		this.factoryPromissoryNote = factoryPromissoryNote;
	}
	
	@Override
	public PromissoryNote createPromissoryNote() {
		return factoryPromissoryNote.createPromissoryNote();
	}

	@Override
	public SimpleLetter createSimpleLetter() {
		return factorySimpleLetter.createSimpleLetter();
	}

}
