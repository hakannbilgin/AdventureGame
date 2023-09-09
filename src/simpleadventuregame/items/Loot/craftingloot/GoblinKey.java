package simpleadventuregame.items.Loot.craftingloot;

import simpleadventuregame.items.Loot.Award;

public class GoblinKey extends Award {

	public GoblinKey() {
		super(9, "Goblin Key");
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
