package fr.univ_lille1.fil.coo.courriers.city;

import java.util.ArrayList;
import java.util.List;

import fr.univ_lille1.fil.coo.courriers.letters.Letter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.Content;

public class Postbox {

	protected List<Letter<Content>> letters = new ArrayList<>();
	
	public void addLetter(Letter<Content> letter){
		letters.add(letter);
	}
}
