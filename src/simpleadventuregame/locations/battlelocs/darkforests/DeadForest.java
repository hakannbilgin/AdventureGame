package simpleadventuregame.locations.battlelocs.darkforests;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.battlelocs.BattleLoc;
import simpleadventuregame.monsters.forestmonsters.Spirit;

public class DeadForest extends BattleLoc{

	public DeadForest(Player player) {
		super(9,player, "Dead Forest", new Spirit(),2);
		
	}

}
