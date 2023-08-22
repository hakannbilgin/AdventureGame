package simpleadventuregame.locations.battlelocs;

import simpleadventuregame.game.Player;
import simpleadventuregame.items.Loot.Wood;
import simpleadventuregame.monsters.Vampire;

public class NormalForest extends BattleLoc {

	public NormalForest(Player player) {
		super(player, "Normal Forest", new Vampire(), new Wood(), 3);
		
	}

}
