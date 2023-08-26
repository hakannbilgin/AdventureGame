package simpleadventuregame.monsters;

import simpleadventuregame.items.Loot.craftingloot.DarkStone;
import simpleadventuregame.items.Loot.craftingloot.Water;

public class Elf extends Monster{

	public Elf() {
		super(5, "Elf", new DarkStone(), new Water(), 11, 17, 15);
		
	}

}
