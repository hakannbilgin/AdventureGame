package simpleadventuregame.locations.battlelocs.darkforests;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.battlelocs.BattleLoc;
import simpleadventuregame.monsters.bosses.ElfKing;

public class ElfKingPlace extends BattleLoc {

	public ElfKingPlace(Player player) {
		super(11, player, "Elf King Place", new ElfKing(), 1);
		
	}

	

}
