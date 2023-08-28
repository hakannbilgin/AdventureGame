package simpleadventuregame.items;

import simpleadventuregame.game.AbstractEntity;

public abstract class Item extends AbstractEntity<Integer> {

	
	
	private String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
