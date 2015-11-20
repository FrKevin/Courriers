package fr.univ_lille1.fil.coo.courriers.factory.inhabitant;

import fr.univ_lille1.fil.coo.courriers.city.City;
import fr.univ_lille1.fil.coo.courriers.city.Inhabitant;

/**
 * Represent a factory to generate a basis inhabitant
 */
public class DefaultFactoryInhabitant implements FactoryInhabitant {
	
	protected City city;
	private int idInhabitant = 0;
	
	
	public DefaultFactoryInhabitant(City city){
		setCity(city);
	}
	
	public DefaultFactoryInhabitant() {
		this(null);
	}
	
	public void resetId() {
		idInhabitant = 0;
	}
	
	public void setCity(City city) {
		this.city = city;
	}
	
	public City getCity() {
		return city;
	}
		
	@Override
	public Inhabitant createInhabitant() {
		return new Inhabitant("Inhabitant-" + idInhabitant, city);
	
	}
}
