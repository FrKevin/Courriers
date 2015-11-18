package fr.univ_lille1.fil.coo.courriers.factory.letters;

import fr.univ_lille1.fil.coo.courriers.letters.SimpleLetter;
import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

public class DefaultFactorySimpleLetter implements FactorySimpleLetter {
	
	public static final String DEFAULT_TEXT = "Bla Bla";
	protected String text;
	
	public DefaultFactorySimpleLetter() {
		this(DEFAULT_TEXT);
	}
	
	public DefaultFactorySimpleLetter(String text) {
		this.text = text;
	}

	@Override
	public SimpleLetter createSimpleLetter() {
		return new SimpleLetter(new TextContent(text));
	}

}
