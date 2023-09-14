package simpleadventuregame.items.Loot.craftingloot;

import simpleadventuregame.items.Loot.Award;

public class Wood extends Award {

	private int woodChange;

	public Wood() {
		super(3, "Wood");

	}

	@Override
	public boolean isChange(int locationId) {
		if (locationId == 6) {
			this.setChance(100);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();
		} else if (locationId == 12) {
			this.setChance(70);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();
		} else {
			return false;
		}
	}

	public int getWoodChange() {
		return woodChange;
	}

	public void setWoodChange(int woodChange) {
		this.woodChange = woodChange;
	}

}
