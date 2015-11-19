package fr.univ_lille1.fil.coo.courriers.city;

import java.util.ArrayList;
import java.util.List;

import fr.univ_lille1.fil.coo.courriers.letters.Letter;

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
		if(!letter.getSender().debit(letter.getCost())){
			throw new IllegalArgumentException("The sender have negative solde account.");
		}
		postbox.addLetter(letter);
		System.out.println(messageSender(letter));
	}
	
	public void distributeLetters(){
		int index = -1;
		Letter<?> l;
		while(postbox.isEmpty()){
			l = postbox.takeFirstLetter();
			index = inhabitants.indexOf(l.getReceiver());
			if(index > -1){
				inhabitants.get(index).getPostbox().addLetter(l);
			}
		}
	}
	
	public boolean hasMailToDistribute() {
		return !postbox.isEmpty();
	}
	
	protected String messageSender(Letter<?> letter) {
		return "-> " + letter.getSender().getName() + "mails " + letter.toString() + " to" + letter.getReceiver().getName() + 
						" for a cost of " + letter.getCost() + " euros";
	}

	@Override
	public String toString() {
		return getName();
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