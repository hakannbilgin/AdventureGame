package simpleadventuregame.items.Loot.craftingloot;

import simpleadventuregame.items.Loot.Award;

public class ToolParts extends Award{

	public ToolParts() {
		super(15, "Tool Parts",false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isChange(int locationId) {
		if (locationId == 18){
			this.setChance(80);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();	
		}else{
			return false;
		}
	}

}
