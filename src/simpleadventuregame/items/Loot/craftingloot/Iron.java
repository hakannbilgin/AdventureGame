package simpleadventuregame.items.Loot.craftingloot;

import simpleadventuregame.items.Loot.Award;

public class Iron extends Award{

	public Iron() {
		super(4, "Iron");
	
	}

	@Override
	public boolean isChange(int locationId) {
		if (locationId == 5){
			this.setChance(100);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();	
		}else{
			return false;
		}
	}

	

}
