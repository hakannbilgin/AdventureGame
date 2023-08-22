package simpleadventuregame.items.Loot;

import simpleadventuregame.monsters.Monster;

public class Iron extends Award{

	public Iron() {
		super(4, "Iron");
	
	}

	@Override
	public boolean isChange(Monster monster) {
		// TODO Auto-generated method stub
		return true;
	}

	

}
