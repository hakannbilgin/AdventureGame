package simpleadventuregame.items.Loot.craftingloot;

import simpleadventuregame.items.Loot.Award;

public class Emerald extends Award {

	public Emerald() {
		super(8, "Emerald");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isChange(int locationId) {
		if (locationId == 12) {
			this.setChance(40);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();
		} else {
			return false;
		}
	}

}
