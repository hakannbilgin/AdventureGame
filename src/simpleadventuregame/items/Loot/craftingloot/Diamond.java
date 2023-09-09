package simpleadventuregame.items.Loot.craftingloot;

import simpleadventuregame.items.Loot.Award;

public class Diamond extends Award {

	public Diamond() {
		super(6, "Diomand");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isChange(int locationId) {

		if (locationId == 9) {
			this.setChance(60);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();
		} else if (locationId == 11) {
			this.setChance(40);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();
		}

		else {
			return false;
		}
	}

}
