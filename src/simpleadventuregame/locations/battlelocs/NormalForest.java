package simpleadventuregame.locations.battlelocs;

import simpleadventuregame.game.Player;
import simpleadventuregame.monsters.Vampire;

public class NormalForest extends BattleLoc {

	public NormalForest(Player player) {
		super(6,player, "Normal Forest", new Vampire(),3);
		
	}

}
