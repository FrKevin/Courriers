package fr.univ_lille1.fil.coo.courriers.city;

import java.util.LinkedList;
import java.util.Queue;

import fr.univ_lille1.fil.coo.courriers.letters.Letter;

public class Postbox {

	protected Queue<Letter<?>> letters = new LinkedList<>();
	
	public void addLetter(Letter<?> letter){
		letters.add(letter);
	}
	
	public boolean isEmpty(){
		return letters.isEmpty();
	}
	
	public Queue<Letter<?>> getLetters() {
		return letters;
	}

	public Letter<?> takeFirstLetter() {
		return letters.poll();
	}
	
}
