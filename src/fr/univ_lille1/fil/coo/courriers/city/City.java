package fr.univ_lille1.fil.coo.courriers.city;

import java.util.ArrayList;
import java.util.List;

import fr.univ_lille1.fil.coo.courriers.letters.Letter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.Content;

public class City {
	
	protected String name;
	protected List<Inhabitant> inhabitants;
	protected Postbox postbox; 
	
	public City(String name){
		this(name, new ArrayList<>());
	}

	public City(String name, List<Inhabitant> inhabitants) {
		this.name = name;
		this.inhabitants = inhabitants;
		this.postbox = new Postbox();
	}
	
	public void addInhabitants(Inhabitant inHabitant){
		inhabitants.add(inHabitant);
	}
	
	public void sendLetter(Letter<Content> letter){
		postbox.addLetter(letter);
	}
	
	public void distributeLetters(){}	
}