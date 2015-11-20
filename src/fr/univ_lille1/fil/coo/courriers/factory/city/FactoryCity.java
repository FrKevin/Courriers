package fr.univ_lille1.fil.coo.courriers.factory.city;

import fr.univ_lille1.fil.coo.courriers.city.City;

/**
 * Represent a factory to generate a specific case of a {@link City}
 */
public interface FactoryCity {
	City createCity();
}
