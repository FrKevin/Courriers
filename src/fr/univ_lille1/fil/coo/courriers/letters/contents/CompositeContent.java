package fr.univ_lille1.fil.coo.courriers.letters.contents;

import java.util.ArrayList;
import java.util.List;

public class CompositeContent extends Content{
	protected List<Content> contents = new ArrayList<>();
	
	public CompositeContent() {
		this(new ArrayList<>());
	}
	
	public CompositeContent(List<Content> contents){
		this.contents = contents;
	}
	
	@Override
	public String toString() {
		//http://kaioa.com/node/59 for performance of StringBuilder
		StringBuilder allToString = new StringBuilder();
		for(Content c : contents){
			allToString.append(c.toString());
		}
		return allToString.toString();
	}
}
