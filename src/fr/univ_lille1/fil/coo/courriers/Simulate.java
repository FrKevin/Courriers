package fr.univ_lille1.fil.coo.courriers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fr.univ_lille1.fil.coo.courriers.city.City;
import fr.univ_lille1.fil.coo.courriers.city.Inhabitant;
import fr.univ_lille1.fil.coo.courriers.factory.city.FactoryCity;
import fr.univ_lille1.fil.coo.courriers.factory.letters.FactoryLetter;
import fr.univ_lille1.fil.coo.courriers.factory.letters.RandomFactoryLetter;
import fr.univ_lille1.fil.coo.courriers.letters.Letter;

public class Simulate {

	protected int currentDay = 1;
	protected int nbDay;
	protected int maxNbRandomInhabitant; 
	
	private static final Random RAND = new Random();
	
	public static final int DEFAULT_MAX_NB_RANDOM_INHABITANT = 5;
	public static final int DEFAULT_NB_DAY = 6;
	
	protected int nbRandomInhabitants;
	protected List<Inhabitant> randomReceiverInhabitants;
	protected List<Inhabitant> randomSenderInhabitants;
 
	protected City city;
	
	private boolean isFirstDay;
	
	public Simulate(FactoryCity factoryCity) {
		this(DEFAULT_NB_DAY, DEFAULT_MAX_NB_RANDOM_INHABITANT, factoryCity);
	}
	
	public Simulate(int nbDay, int nbRandomInhabitant, FactoryCity factoryCity) {
		this.nbDay = nbDay;
		this.maxNbRandomInhabitant = nbRandomInhabitant; 
		this.city = factoryCity.createCity();
	}
		
	public void run() {
		isFirstDay = true;
		while (currentDay < nbDay || city.hasMailToDistribute()) {
			messageForNDay();
			initRandomInhabitants();
			sendInhabitants();
			receiveInhabitants();
			nextDay();
		}
	}
	
	protected void initRandomInhabitants() {
		nbRandomInhabitants = RAND.nextInt(maxNbRandomInhabitant);
		randomSenderInhabitants = new ArrayList<>();
		randomReceiverInhabitants = new ArrayList<>();
		for (int i = 0; i < nbRandomInhabitants; i++) {
			randomSenderInhabitants.add(getRandomSenderInhabitant());
			randomReceiverInhabitants.add(getRandomReceiverInhabitant(randomSenderInhabitants.get(i)));
		}
	}
	
	protected void sendInhabitants() {
		FactoryLetter factoryLetter = new RandomFactoryLetter();
		for (int i = 0; i < nbRandomInhabitants; i++) {
			try {
				Letter<?> letter = factoryLetter.createLetter();
				letter.setSender(randomSenderInhabitants.get(i));
				letter.setReceiver(randomReceiverInhabitants.get(i));
				city.sendLetter(letter);
			} catch (IllegalArgumentException e) { }
		}
		
	}
	
	protected void receiveInhabitants() {
		if(isFirstDay) {
			return;
		}
		for(Inhabitant inhabitant : city.getInhabitants()) {
			inhabitant.showLetters();
		}
	}
	
	protected String messageForNDay() {
		return "**********************************************\nDay" + currentDay;
	}

	protected Inhabitant getRandomReceiverInhabitant(Inhabitant sender) {
		Inhabitant receiver = null;
		do {
			receiver = city.getInhabitants().get(RAND.nextInt(city.getInhabitants().size()));
		} while (receiver.equals(sender));
		return receiver;
	}
	
	protected Inhabitant getRandomSenderInhabitant() {
		return city.getInhabitants().get(RAND.nextInt(city.getInhabitants().size()));
	}
	
	protected void nextDay() {
		++currentDay;
	}
				
	public int getNbDay() {
		return nbDay;
	}

	public int getCurrentDay() {
		return currentDay;
	}
}
