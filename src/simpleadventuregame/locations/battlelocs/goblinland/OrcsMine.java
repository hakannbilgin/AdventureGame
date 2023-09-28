package simpleadventuregame.locations.battlelocs.goblinland;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.battlelocs.BattleLoc;
import simpleadventuregame.monsters.goblinlandmonsters.Orc;

public class OrcsMine extends BattleLoc {

	public OrcsMine (Player player) {
		super(18, player, "Orc's Mine", new Orc(), 3);
		
	}

}
