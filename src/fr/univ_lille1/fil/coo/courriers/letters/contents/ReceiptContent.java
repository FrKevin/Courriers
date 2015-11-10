package fr.univ_lille1.fil.coo.courriers.letters.contents;

public class ReceiptContent extends TextContent{

	public ReceiptContent(String receiver, String contentLetter) {
		super(receiver, contentLetter);
	}

	@Override
	public String toString(){
		return "an aknowledgment of receipt which is a simple letter whose content is a text content (aknowledgment of receipt for a registered letter whose" + super.toString();
	}
}