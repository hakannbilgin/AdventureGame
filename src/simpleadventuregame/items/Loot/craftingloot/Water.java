package simpleadventuregame.items.Loot.craftingloot;

import simpleadventuregame.items.Loot.Award;

public class Water extends Award {

	public Water() {
		super(2, "Water");

	}

	@Override
	public boolean isChange(int locationId) {
		if (locationId == 7) {
			this.setChance(100);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();
		} else if (locationId == 8) {
			this.setChance(70);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();
		} else if (locationId == 16) {
			this.setChance(70);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();
		}else if (locationId == 18) {
			this.setChance(70);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();
		} else {
			return false;
		}
	}

}
