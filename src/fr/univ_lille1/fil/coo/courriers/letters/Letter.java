package fr.univ_lille1.fil.coo.courriers.letters;

import fr.univ_lille1.fil.coo.courriers.city.Inhabitant;
import fr.univ_lille1.fil.coo.courriers.letters.contents.Content;

public abstract class Letter<T extends Content> {
	
	private double cost;
	
	protected Inhabitant sender;
	protected Inhabitant receiver;
	
	protected T content;
	
	public Letter(double cost){
		this(cost, null);
	}
	
	public Letter(double cost, T content){
		this(cost, null, null, content);
	}
	
	public Letter(double cost, Inhabitant sender, Inhabitant receiver, T content){
		setCost(cost);
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}
	
	public void operation(){
		if(sender == null || receiver == null )
			throw new NullPointerException("The sender or receiver is null.");
		if(content == null)
			throw new NullPointerException("The content is null.");
		action();
	}
	
	protected abstract void action();
	
	public Inhabitant getSender() {
		return sender;
	}

	public void setSender(Inhabitant sender) {
		this.sender = sender;
	}

	public Inhabitant getReceiver() {
		return receiver;
	}

	public void setReceiver(Inhabitant receiver) {
		this.receiver = receiver;
	}
	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		if( cost < 0)
			throw new IllegalArgumentException("The cost is negatif.");
		this.cost = cost;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
}
