package fr.univ_lille1.fil.coo.courriers.factory;

import fr.univ_lille1.fil.coo.courriers.city.City;

public class DefaultFactoryCity implements FactoryCity {
	
	protected String nameCity;
	protected FactoryInhabitant factoryInhabitant;
	protected int nbHabitant;
	protected City city;
	
	public final static int DEFAULT_NB_INHABITANT = 100;

	
	public DefaultFactoryCity(String nameCity) {
		this(nameCity, DEFAULT_NB_INHABITANT);
	}
	
	public DefaultFactoryCity(String nameCity, int nbHabitant) {
		this(nameCity, new DefaultFactoryInhabitant(), nbHabitant);
	}
	
	public DefaultFactoryCity(String nameCity, FactoryInhabitant factoryInhabitant, int nbHabitant) {
		this.nameCity = nameCity;
		this.nbHabitant = nbHabitant;
		setFactoryInhabitant(factoryInhabitant);
	}
	
	public void setFactoryInhabitant(FactoryInhabitant factoryInhabitant) {
		this.factoryInhabitant = factoryInhabitant;
		linkedCity();
	}
	
	protected void linkedCity() {
		factoryInhabitant.setCity(city);
	}
	
	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}
	

	protected String messageCreateCity() {
		return "Creating "+ nameCity + " city.";
	}
	
	protected String messageCreateNInhabitant() {
		return "Creating "+ nbHabitant + " inhabitant.";
	}

	@Override
	public City createCity() {
		city = new City(nameCity);
		System.out.println(messageCreateCity());
		for(int i=0; i < nbHabitant; ++i) {
			city.addInhabitants(factoryInhabitant.createInhabitant());
		}
		System.out.println(messageCreateNInhabitant());
		return city;
	}
}
