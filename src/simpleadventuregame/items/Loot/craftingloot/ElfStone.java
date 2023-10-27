package simpleadventuregame.items.Loot.craftingloot;

import simpleadventuregame.items.Loot.Award;

public class ElfStone extends Award {

	public ElfStone() {
		super(7, "Elf Stone",false);
		
	}

	@Override
	public boolean isChange(int locationId) {
		if (locationId == 12) {
			this.setChance(60);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();
		} else {
			return false;
		}
	}

}
