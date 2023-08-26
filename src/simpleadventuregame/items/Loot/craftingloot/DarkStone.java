package simpleadventuregame.items.Loot.craftingloot;

import simpleadventuregame.items.Loot.Award;

public class DarkStone extends Award {

	
	
	public DarkStone() {
		super(5, "DarkStone");
		
	}


	@Override
	public boolean isChange(int locationId) {
		if (locationId== 8) {
			setChance(40);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();	
		}
		return false;
	}

	
}
