package fr.univ_lille1.fil.coo.courriers.letters.contents;

public class TextContent extends Content {
	protected String contentLetter;
	
	public TextContent(String receiver, String contentLetter){
		super(receiver);
		this.contentLetter = contentLetter;
	}
	
	@Override
	public String toString(){
		return "content is a text content ("+ contentLetter +") to "+ receiver;
	}
}
