package simpleadventuregame.locations.battlelocs.darkforests;

import simpleadventuregame.game.Player;
import simpleadventuregame.items.Loot.DarkStone;
import simpleadventuregame.locations.battlelocs.BattleLoc;
import simpleadventuregame.monsters.Elf;

public class EnchantedForest extends BattleLoc {

	public EnchantedForest(Player player) {
		super(player, "Enchanted Forest", new Elf() , new DarkStone(), 3);
		
	}

}
