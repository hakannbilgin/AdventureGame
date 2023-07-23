package simpleadventuregame.locations.battlelocs;

import simpleadventuregame.game.Player;
import simpleadventuregame.monsters.Vampire;

public class Forest extends BattleLoc {

	public Forest(Player player) {
		super(player, "Forest", new Vampire(), "Firewood", 3);
		
	}

}
