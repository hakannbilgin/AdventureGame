package simpleadventuregame.locations.battlelocs.darkforests;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.battlelocs.BattleLoc;
import simpleadventuregame.monsters.forestmonsters.DarkSpirit;

public class AbandonedForest  extends BattleLoc{

	public AbandonedForest(Player player) {
		super(14, player, "Abondoned Forest", new DarkSpirit(), 2);
		
	}

}
