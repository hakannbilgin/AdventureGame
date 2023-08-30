package simpleadventuregame.monsters.forestmonsters;

import simpleadventuregame.items.Loot.craftingloot.ElfStone;
import simpleadventuregame.items.Loot.craftingloot.Wood;
import simpleadventuregame.monsters.Monster;

public class DarkElf extends Monster{

	public DarkElf() {
		super(7, "Dark Elf", new ElfStone() , new Wood(), 15, 16, 17);
		// TODO Auto-generated constructor stub
	}

}
