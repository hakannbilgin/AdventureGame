package simpleadventuregame.locations.battlelocs.darkforests;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.battlelocs.BattleLoc;
import simpleadventuregame.monsters.forestmonsters.DarkElf;

public class DarkForest extends BattleLoc {

	public DarkForest( Player player) {
		super(12, player, "Dark Forest", new DarkElf(), 2);
		// TODO Auto-generated constructor stub
	}

	
}
