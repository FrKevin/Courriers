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
	
	protected boolean isNullForContent(){
		if(content == null){
			throw new NullPointerException("The content is null.");
		}
		return false;
	}
	
	protected boolean isNullForReceiver(){
		if(receiver == null){
			throw new NullPointerException("The receiver is null.");
		}
		return false;
	}
	
	protected boolean isNullForSender(){
		if(sender == null){
			throw new NullPointerException("The sender is null.");
		}
		return false;
	}
	

	public void operation(){
		if(isNullForContent() && isNullForReceiver() && isNullForSender() == false){
			action();
		}
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
