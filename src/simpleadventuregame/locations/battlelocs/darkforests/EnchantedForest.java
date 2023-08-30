package simpleadventuregame.locations.battlelocs.darkforests;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.battlelocs.BattleLoc;
import simpleadventuregame.monsters.forestmonsters.Elf;

public class EnchantedForest extends BattleLoc {

	public EnchantedForest(Player player) {
		super(8,player, "Enchanted Forest", new Elf() ,3);
		
	}

}
