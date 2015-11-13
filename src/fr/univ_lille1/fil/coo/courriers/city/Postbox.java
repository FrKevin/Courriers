package fr.univ_lille1.fil.coo.courriers.city;

import java.util.ArrayList;
import java.util.List;

import fr.univ_lille1.fil.coo.courriers.letters.Letter;

public class Postbox {

	protected List<Letter<?>> letters = new ArrayList<>();
	
	public void addLetter(Letter<?> letter){
		letters.add(letter);
	}
}
