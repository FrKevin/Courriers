package fr.univ_lille1.fil.coo.courriers.factory.inhabitant;

import fr.univ_lille1.fil.coo.courriers.city.City;
import fr.univ_lille1.fil.coo.courriers.city.Inhabitant;

public interface FactoryInhabitant {

	Inhabitant createInhabitant();
	void setCity(City city);
	City getCity();
}
