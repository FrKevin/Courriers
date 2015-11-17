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
		this.name = name;
		this.inhabitants = new ArrayList<>();
		this.postbox = new Postbox();
	}

	public void addInhabitants(Inhabitant inHabitant){
		inhabitants.add(inHabitant);
	}
	
	public void sendLetter(Letter<?> letter){
		postbox.addLetter(letter);
	}
	
	public void distributeLetters(){
		int index = -1;
		Letter<?> l;
		while(postbox.isEmpty()){
			l = postbox.firstLetter();
			index = inhabitants.indexOf(l.getReceiver());
			if(index > -1){
				inhabitants.get(index).getPostbox().addLetter(l);
			}
		}
	}

	public String getName() {
		return name;
	}

	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}

	public Postbox getPostbox() {
		return postbox;
	}
}