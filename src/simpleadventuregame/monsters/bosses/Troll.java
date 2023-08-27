package simpleadventuregame.monsters.bosses;

import simpleadventuregame.items.Loot.TrollBox;
import simpleadventuregame.items.Loot.craftingloot.Diamond;
import simpleadventuregame.monsters.Monster;

public class Troll extends Monster {

	public Troll() {
		super(7, "Troll", new TrollBox(), new Diamond(), 20, 20, 20);
		
	}

}
