package fr.univ_lille1.fil.coo.courriers.factory.contents.textContent;

import java.util.Random;

import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

public class RandomFactoryTextContent implements FactoryTextContent{
private static final Random RAND = new Random();
	
	private static final char[] ALPHABET = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 
											 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ', '\n'};
	
	public static final int DEFAULT_NB_CHARACTER = 10;
	protected int nbCharacter;
	

	public RandomFactoryTextContent() {
		this(DEFAULT_NB_CHARACTER);
	}
	
	public RandomFactoryTextContent(int nbCharacter) {
		this.nbCharacter = nbCharacter;
	}
	
	@Override
	public TextContent createTextContent() {
		StringBuilder result = new StringBuilder();
		for(int i=0; i < nbCharacter; ++i) {
			result.append(ALPHABET[RAND.nextInt(ALPHABET.length)]);
		}
		return new TextContent(result.toString());
	}
	
}
