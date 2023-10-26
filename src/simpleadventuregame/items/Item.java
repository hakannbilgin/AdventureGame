package simpleadventuregame.items;

import simpleadventuregame.game.AbstractEntity;

public abstract class Item extends AbstractEntity<Integer> {

	private String name;
	private boolean upgradeable;

	public Item(String name, int id, boolean upgradeable) {
		
		this.name = name;
		this.setId(id);
		this.upgradeable= upgradeable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isUpgradeable() {
		return upgradeable;
	}

	public void setUpgradeable(boolean upgradeable) {
		this.upgradeable = upgradeable;
	}
	

}
