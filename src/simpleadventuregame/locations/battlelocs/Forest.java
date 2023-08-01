package simpleadventuregame.locations.battlelocs;

import simpleadventuregame.game.Player;
import simpleadventuregame.items.Loot.Wood;
import simpleadventuregame.monsters.Vampire;

public class Forest extends BattleLoc {

	public Forest(Player player) {
		super(player, "Forest", new Vampire(), new Wood(), 3);
		
	}

}
