package fr.univ_lille1.fil.coo.courriers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fr.univ_lille1.fil.coo.courriers.city.City;
import fr.univ_lille1.fil.coo.courriers.city.Inhabitant;
import fr.univ_lille1.fil.coo.courriers.factory.FactoryCity;

public class Simulate {

	protected int currentDay = 1;
	protected int nbDay;
	protected int nbRandomInhabitant; 
	
	private static final Random RAND = new Random();
	
	public static final int DEFAULT_NB_RANDOM_INHABITANT = 5;
	public static final int DEFAULT_NB_DAY = 6;

	protected City city;
	
	public Simulate(FactoryCity factoryCity) {
		this(DEFAULT_NB_DAY, DEFAULT_NB_RANDOM_INHABITANT, factoryCity);
	}
	
	public Simulate(int nbDay, int nbRandomInhabitant, FactoryCity factoryCity) {
		this.nbDay = nbDay;
		this.nbRandomInhabitant = nbRandomInhabitant; 
		this.city = factoryCity.createCity();
	}
		
	public void run() {
		boolean isFirstDay = true;
		List<Inhabitant> randomInhabitants;
		while (currentDay < nbDay) {
			messageForNDay();
			randomInhabitants = getRandomInhabitants(nbRandomInhabitant);
			
		}
	}
	
	protected String messageForNDay() {
		return "**********************************************\nDay" + currentDay;
	}
	
	protected List<Inhabitant> getRandomInhabitants(int nbInhabitants) {
		if (nbInhabitants > city.getInhabitants().size()) {
			return new ArrayList<>(city.getInhabitants());
		}
		List<Inhabitant> randomInhabitant = new ArrayList<>();
		int i = 0;
		int idRandomInhabitants;
		while (i  < nbInhabitants) {
			idRandomInhabitants = RAND.nextInt(nbInhabitants);
			if (!randomInhabitant.contains(city.getInhabitants().get(idRandomInhabitants))) {
				randomInhabitant.add(city.getInhabitants().get(idRandomInhabitants));
				++i;
			}
		}
		return randomInhabitant;
	}
		
	
	public int getNbDay() {
		return nbDay;
	}

	public int getCurrentDay() {
		return currentDay;
	}

}
