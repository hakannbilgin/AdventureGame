package simpleadventuregame.monsters.forestmonsters;

import simpleadventuregame.items.Loot.craftingloot.DarkStone;
import simpleadventuregame.items.Loot.craftingloot.Water;
import simpleadventuregame.monsters.Monster;

public class Elf extends Monster{

	public Elf() {
		super(5, "Elf", new DarkStone(), new Water(), 11, 17, 15,4,5);
		
	}

}
