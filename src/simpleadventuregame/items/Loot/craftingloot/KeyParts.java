package simpleadventuregame.items.Loot.craftingloot;

import simpleadventuregame.items.Loot.Award;

public class KeyParts extends Award {

	public KeyParts() {
		super(9, "Key Parts",false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isChange(int locationId) {
		if (locationId == 14) {
			this.setChance(60);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();
		} else {
			return false;
		}
	}

}
