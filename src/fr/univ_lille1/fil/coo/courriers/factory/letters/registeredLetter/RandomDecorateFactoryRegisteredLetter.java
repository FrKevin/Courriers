package fr.univ_lille1.fil.coo.courriers.factory.letters.registeredLetter;

import fr.univ_lille1.fil.coo.courriers.factory.letters.promissoryNote.DefaultFactoryPrommisoryNote;
import fr.univ_lille1.fil.coo.courriers.factory.letters.promissoryNote.FactoryPromissoryNote;
import fr.univ_lille1.fil.coo.courriers.factory.letters.simpleLetter.DefaultFactorySimpleLetter;
import fr.univ_lille1.fil.coo.courriers.factory.letters.simpleLetter.FactorySimpleLetter;
import fr.univ_lille1.fil.coo.courriers.letters.decorators.RegisteredLetter;
import fr.univ_lille1.fil.coo.courriers.utils.UtilsCourriers;

public class RandomDecorateFactoryRegisteredLetter implements FactoryRegisterLetter {

	protected FactorySimpleLetter factorySimpleLetter;
	protected FactoryPromissoryNote factoryPromissoryNote;
	
	public RandomDecorateFactoryRegisteredLetter() {
		this(new DefaultFactorySimpleLetter(), new DefaultFactoryPrommisoryNote());
	}

	public RandomDecorateFactoryRegisteredLetter(FactorySimpleLetter factorySimpleLetter, FactoryPromissoryNote factoryPromissoryNote) {
		this.factorySimpleLetter = factorySimpleLetter;
		this.factoryPromissoryNote = factoryPromissoryNote;
	}

	@Override
	public RegisteredLetter<?> createRegisteredLetter() {
		return UtilsCourriers.randInt(0, 2) == 1 ? new RegisteredLetter<>(factorySimpleLetter.createSimpleLetter())
												 : new RegisteredLetter<>(factoryPromissoryNote.createPromissoryNote());
	}
	
	

}
