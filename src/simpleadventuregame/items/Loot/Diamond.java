package simpleadventuregame.items.Loot;

import simpleadventuregame.monsters.Monster;

public class Diamond extends Award{

	public Diamond() {
		super(6, "Diomand");
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean isChange(Monster monster) {
		
		return true;
	}

}
