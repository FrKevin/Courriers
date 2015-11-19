package fr.univ_lille1.fil.coo.courriers.factory.contents.textContent;

import fr.univ_lille1.fil.coo.courriers.letters.contents.TextContent;

public class DefaultFactoryTextContent implements FactoryTextContent{
	public static final String DEFAULT_TEXT = "Bla Bla";
	protected String text;
	
	public DefaultFactoryTextContent() {
		this(DEFAULT_TEXT);
	}
	
	public DefaultFactoryTextContent(String text) {
		this.text = text;
	}
	
	@Override
	public TextContent createTextContent() {
		return new TextContent(text);
	}

}
