package fr.univ_lille1.fil.coo.courriers.factory.letters.abs;

import fr.univ_lille1.fil.coo.courriers.factory.letters.complexLetter.DefaultFactoryComplexLetter;
import fr.univ_lille1.fil.coo.courriers.factory.letters.complexLetter.FactoryComplexLetter;
import fr.univ_lille1.fil.coo.courriers.factory.letters.promissoryNote.DefaultFactoryPrommisoryNote;
import fr.univ_lille1.fil.coo.courriers.factory.letters.promissoryNote.FactoryPromissoryNote;
import fr.univ_lille1.fil.coo.courriers.factory.letters.registeredLetter.FactoryRegisterLetter;
import fr.univ_lille1.fil.coo.courriers.factory.letters.registeredLetter.RandomDecorateFactoryRegisteredLetter;
import fr.univ_lille1.fil.coo.courriers.factory.letters.simpleLetter.DefaultFactorySimpleLetter;
import fr.univ_lille1.fil.coo.courriers.factory.letters.simpleLetter.FactorySimpleLetter;
import fr.univ_lille1.fil.coo.courriers.factory.letters.urgentLetter.FactoryUrgentLetter;
import fr.univ_lille1.fil.coo.courriers.factory.letters.urgentLetter.RandomDecorateFactoryUrgentLetter;
import fr.univ_lille1.fil.coo.courriers.letters.ComplexLetter;
import fr.univ_lille1.fil.coo.courriers.letters.Letter;
import fr.univ_lille1.fil.coo.courriers.letters.PromissoryNote;
import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;
import fr.univ_lille1.fil.coo.courriers.letters.decorators.RegisteredLetter;
import fr.univ_lille1.fil.coo.courriers.letters.decorators.UrgentLetter;

/**
 * Represent a factory to generate basic {@link Letter}
 */
public class DefaultAbstractFactoryLetter implements AbstractFactoryLetter{

	protected FactorySimpleLetter factorySimpleLetter;
	protected FactoryPromissoryNote factoryPromissoryNote;
	protected FactoryComplexLetter factoryComplexLetter;
	protected FactoryRegisterLetter factoryRegisterLetter;
	protected FactoryUrgentLetter factoryUrgentLetter;
	
	public DefaultAbstractFactoryLetter() {
		this(new DefaultFactorySimpleLetter(), new DefaultFactoryPrommisoryNote(), new DefaultFactoryComplexLetter(), 
			 new RandomDecorateFactoryRegisteredLetter(), new RandomDecorateFactoryUrgentLetter());
	}
	
	public DefaultAbstractFactoryLetter(FactorySimpleLetter factorySimpleLetter, FactoryPromissoryNote factoryPromissoryNote, FactoryComplexLetter factoryComplexLetter,
										FactoryRegisterLetter factoryRegisterLetter, FactoryUrgentLetter factoryUrgentLetter) {
		this.factorySimpleLetter = factorySimpleLetter;
		this.factoryPromissoryNote = factoryPromissoryNote;
		this.factoryComplexLetter = factoryComplexLetter;
		this.factoryRegisterLetter = factoryRegisterLetter;
		this.factoryUrgentLetter = factoryUrgentLetter;
	}
	
	@Override
	public PromissoryNote createPromissoryNote() {
		return factoryPromissoryNote.createPromissoryNote();
	}

	@Override
	public SimpleLetter createSimpleLetter() {
		return factorySimpleLetter.createSimpleLetter();
	}

	@Override
	public ComplexLetter createComplexLetter() {
		return factoryComplexLetter.createComplexLetter();
	}

	@Override
	public RegisteredLetter<?> createRegisteredLetter() {
		return factoryRegisterLetter.createRegisteredLetter();
	}

	@Override
	public UrgentLetter<?> createUrgentLetter() {
		return factoryUrgentLetter.createUrgentLetter();
	}
}