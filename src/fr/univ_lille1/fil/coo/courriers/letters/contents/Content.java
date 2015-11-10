package fr.univ_lille1.fil.coo.courriers.letters.contents;

public abstract class Content {
	protected String receiver;
	
	public Content(String receiver) {
		this.receiver = receiver;
	}

	@Override
	public abstract String toString();
}
