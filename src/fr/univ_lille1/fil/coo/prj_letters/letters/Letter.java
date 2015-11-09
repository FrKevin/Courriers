package fr.univ_lille1.fil.coo.prj_letters.letters;

import fr.univ_lille1.fil.coo.prj_letters.city.Inhabitant;
import fr.univ_lille1.fil.coo.prj_letters.letters.contents.Content;

public abstract class Letter<T extends Content> {
	
	protected double cost;
	
	protected Inhabitant sender;
	protected Inhabitant receiver;
	
	protected T content;

	
	public abstract void toDo();
}
