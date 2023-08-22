package simpleadventuregame.items.Loot;

import simpleadventuregame.monsters.Monster;

public class Food extends Award{

	public Food() {
		super(1,"Food");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isChange(Monster monster) {
		if (monster.getId() == 6){
			
		}
		return true;
	}

}
