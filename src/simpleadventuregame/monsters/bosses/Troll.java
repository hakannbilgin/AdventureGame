package simpleadventuregame.monsters.bosses;

import simpleadventuregame.items.Loot.boxes.ElfKingBox;
import simpleadventuregame.items.Loot.craftingloot.Diamond;
import simpleadventuregame.monsters.Monster;

public class Troll extends Monster {

	public Troll() {
		super(7, "Troll", new ElfKingBox(), new Diamond(), 20, 20, 20);
		
	}

}
