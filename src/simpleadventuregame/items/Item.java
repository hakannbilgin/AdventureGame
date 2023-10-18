package simpleadventuregame.items;

import simpleadventuregame.game.AbstractEntity;

public abstract class Item extends AbstractEntity<Integer> {

	private String name;

	public Item(String name, int id) {
		
		this.name = name;
		this.setId(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
