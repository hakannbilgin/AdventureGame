package simpleadventuregame.monsters.bosses;

import simpleadventuregame.items.Loot.Award;
import simpleadventuregame.items.Loot.boxes.GoblinKingBox;
import simpleadventuregame.items.Loot.craftingloot.Steel;
import simpleadventuregame.monsters.Monster;

public class GoblinKing extends Monster{

	public GoblinKing() {
		super(13, "Goblin King", new GoblinKingBox(), new Steel(), 26, 26, 35, 7, 3);
		// TODO Auto-generated constructor stub
	}

}
