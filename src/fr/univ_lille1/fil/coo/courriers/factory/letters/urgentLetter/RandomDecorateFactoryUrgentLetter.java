package fr.univ_lille1.fil.coo.courriers.factory.letters.urgentLetter;

import fr.univ_lille1.fil.coo.courriers.factory.letters.promissoryNote.DefaultFactoryPrommisoryNote;
import fr.univ_lille1.fil.coo.courriers.factory.letters.promissoryNote.FactoryPromissoryNote;
import fr.univ_lille1.fil.coo.courriers.factory.letters.simpleLetter.DefaultFactorySimpleLetter;
import fr.univ_lille1.fil.coo.courriers.factory.letters.simpleLetter.FactorySimpleLetter;
import fr.univ_lille1.fil.coo.courriers.letters.decorators.UrgentLetter;
import fr.univ_lille1.fil.coo.courriers.utils.UtilsCourriers;

public class RandomDecorateFactoryUrgentLetter implements FactoryUrgentLetter {

	FactorySimpleLetter factorySimpleLetter;
	FactoryPromissoryNote factoryPromissoryNote;
	
	public RandomDecorateFactoryUrgentLetter() {
		this(new DefaultFactorySimpleLetter(), new DefaultFactoryPrommisoryNote());
	}
	

	public RandomDecorateFactoryUrgentLetter(FactorySimpleLetter factorySimpleLetter, FactoryPromissoryNote factoryPromissoryNote) {
		this.factorySimpleLetter = factorySimpleLetter;
		this.factoryPromissoryNote = factoryPromissoryNote;
	}


	@Override
	public UrgentLetter<?> createUrgentLetter() {
		return UtilsCourriers.randInt(0, 2) == 1 ? new UrgentLetter<>(factorySimpleLetter.createSimpleLetter())
				 : new UrgentLetter<>(factoryPromissoryNote.createPromissoryNote());
	}

}
