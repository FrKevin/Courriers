package fr.univ_lille1.fil.coo.courriers.factory.letters;

import java.util.Random;

import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

public class RandomFactorySimpleLetter implements FactorySimpleLetter {

	private static final Random RAND = new Random();
	
	private static final char[] ALPHABET = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 
											 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ', '\n'};
	
	public static final int DEFAULT_NB_CHARACTER = 10;
	protected int nbCharacter;
	
	public RandomFactorySimpleLetter() {
		this(DEFAULT_NB_CHARACTER);
	}
	
	public RandomFactorySimpleLetter(int nbCharacter) {
		this.nbCharacter = nbCharacter;
	}

	@Override
	public SimpleLetter createSimpleLetter() {
		StringBuilder result = new StringBuilder();
		for(int i=0; i < nbCharacter; ++i) {
			result.append(ALPHABET[RAND.nextInt(ALPHABET.length)]);
		}
		return new SimpleLetter(new TextContent(result.toString()));
	}

}
