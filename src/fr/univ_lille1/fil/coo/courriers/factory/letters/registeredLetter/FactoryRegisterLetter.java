package fr.univ_lille1.fil.coo.courriers.factory.letters.registeredLetter;

import fr.univ_lille1.fil.coo.courriers.letters.decorators.RegisteredLetter;

public interface FactoryRegisterLetter {
	
	RegisteredLetter<?> createRegisteredLetter();
}
