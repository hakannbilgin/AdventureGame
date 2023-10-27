package simpleadventuregame.items.Loot.craftingloot;

import simpleadventuregame.items.Loot.Award;

public class Food extends Award{

	public Food() {
		super(1,"Food",false);
		
	}

	@Override
	public boolean isChange(int locationId) {
		if (locationId == 4){
			this.setChance(100);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();	
		}else if (locationId == 9) {
			this.setChance(70);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();	
		}else if (locationId == 17) {
			this.setChance(70);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();
		}
		else{
			return false;
		}
		
	}

}
