package simpleadventuregame.monsters.bosses;

import simpleadventuregame.items.Loot.boxes.ElfKingBox;
import simpleadventuregame.items.Loot.craftingloot.Diamond;
import simpleadventuregame.monsters.Monster;

public class ElfKing extends Monster {

	public ElfKing() {
		super(7, "Elf King", new ElfKingBox(), new Diamond(), 20, 20, 20);
		
	}

}
