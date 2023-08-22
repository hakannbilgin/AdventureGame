package simpleadventuregame.items.Loot;

import simpleadventuregame.monsters.Monster;

public class Wood extends Award {

	public Wood() {
		super(3,"Wood");
		
	}

	@Override
	public boolean isChange(Monster monster) {
		// TODO Auto-generated method stub
		return true;
	}

	

}
