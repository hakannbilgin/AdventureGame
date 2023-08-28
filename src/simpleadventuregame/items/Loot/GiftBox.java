package simpleadventuregame.items.Loot;

import simpleadventuregame.items.Item;

public abstract class GiftBox extends Award{

	public GiftBox(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	
	
	public abstract Item openBox();
	
	public abstract void awardsInBox();
	
	
	
}
