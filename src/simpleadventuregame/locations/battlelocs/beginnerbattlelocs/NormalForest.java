package simpleadventuregame.locations.battlelocs.beginnerbattlelocs;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.battlelocs.BattleLoc;
import simpleadventuregame.monsters.beginnerlocmonsters.Vampire;

public class NormalForest extends BattleLoc {

	public NormalForest(Player player) {
		super(6,player, "Normal Forest", new Vampire(),3);
		
	}

}
