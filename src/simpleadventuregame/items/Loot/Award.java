package simpleadventuregame.items.Loot;

import simpleadventuregame.items.Item;

/*
 * 
 * TODO : need to use this class for extra awards
 * 
 */
public abstract class Award extends Item{

//	private int id;
	private String name;
	private int chance;

	public String getName() {
		return name;
	}

	public Award(int id, String name) {

		this.setId(id);
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public int getChance() {
		return chance;
	}

	public void setChance(int chance) {
		this.chance = chance;
	}
	
	

	public abstract boolean isChange(int locationId);
	
}
