package fr.univ_lille1.fil.coo.courriers.factory.letters.urgentLetter;

import fr.univ_lille1.fil.coo.courriers.letters.decorators.UrgentLetter;

public interface FactoryUrgentLetter {
	
	UrgentLetter<?> createUrgentLetter();
	
}
