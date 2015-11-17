package fr.univ_lille1.fil.coo.courriers.factory;

import java.util.ArrayList;
import java.util.List;

import fr.univ_lille1.fil.coo.courriers.city.City;
import fr.univ_lille1.fil.coo.courriers.city.Inhabitant;

public class FactoryInHabitant {
	protected List<Inhabitant> inHabitants = new ArrayList<>();
	protected int nbInHabitants;
	protected City city;
	
	public FactoryInHabitant(City city){
		this(100, city);
	}
	
	public FactoryInHabitant(int nbInHabitants, City city){
		this.nbInHabitants = nbInHabitants;
		this.city = city;
		init();
	}
	
	private void init(){
		System.out.println("Creating "+ nbInHabitants + " inHabitants");
		for(int i = 0; i< nbInHabitants; i++){
			inHabitants.add(new Inhabitant("InHabitant-"+i, city));
		}
	}

	public List<Inhabitant> getInHabitants() {
		return inHabitants;
	}
}
