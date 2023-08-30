package simpleadventuregame.items.Loot.boxes;

import simpleadventuregame.items.Item;
import simpleadventuregame.items.Loot.Award;

public abstract class GiftBox extends Award{

	public GiftBox(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	
	
	public abstract Item openBox();
	
	public abstract void awardsInBox();
	
	
	
}
