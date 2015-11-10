package fr.univ_lille1.fil.coo.courriers;

import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;
import fr.univ_lille1.fil.coo.courriers.letters.decorators.DecoratorLetter;
import fr.univ_lille1.fil.coo.courriers.letters.decorators.RegisteredLetter;

public class Main {
	public static void main(String[] args) {
		DecoratorLetter<TextContent> decoLetter = new RegisteredLetter<>(10, new RegisteredLetter<>(10, new SimpleLetter(10, new TextContent("", "DDD"))));
		System.out.println(decoLetter.getContent());
		System.out.println(decoLetter.getCost());
	}
}
