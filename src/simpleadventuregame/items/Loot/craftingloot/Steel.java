package simpleadventuregame.items.Loot.craftingloot;

import simpleadventuregame.items.Loot.Award;

public class Steel extends Award{

	public Steel() {
		super(14, "Steel");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isChange(int locationId) {
		if (locationId == 17){
			this.setChance(80);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();	
		}else if (locationId == 19) {
			this.setChance(70);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();
		} else{
			return false;
		}
	}

}
