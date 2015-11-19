package fr.univ_lille1.fil.coo.courriers.factory.inhabitant;

import fr.univ_lille1.fil.coo.courriers.city.City;
import fr.univ_lille1.fil.coo.courriers.city.Inhabitant;

/**
 * Represent a factory to generate a specified case of an {@link Inhabitant}
 */
public interface FactoryInhabitant {

	Inhabitant createInhabitant();
	void setCity(City city);
	City getCity();
}
