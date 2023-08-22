package simpleadventuregame.items.Loot;

import simpleadventuregame.monsters.Monster;

public class DarkStone extends Award {

	private int change = 40;
	
	public DarkStone() {
		super(5, "DarkStone");
		
	}


	@Override
	public boolean isChange(Monster monster) {
		
		int lootChange = (int) (Math.random() * 100);

		return lootChange <= this.change;
		
	}

}
