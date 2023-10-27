package simpleadventuregame.items.Loot.craftingloot;

import simpleadventuregame.items.Loot.Award;

public class Iron extends Award{

	public Iron() {
		super(4, "Iron",false);
	
	}

	@Override
	public boolean isChange(int locationId) {
		if (locationId == 5){
			this.setChance(100);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();	
		}else if (locationId == 16) {
			this.setChance(80);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();
		}else{
			return false;
		}
	}

	

}
