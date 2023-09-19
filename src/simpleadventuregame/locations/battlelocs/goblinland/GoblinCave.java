package simpleadventuregame.locations.battlelocs.goblinland;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.battlelocs.BattleLoc;
import simpleadventuregame.monsters.goblinlandmonsters.MountainGoblin;

public class GoblinCave extends BattleLoc {

	public GoblinCave(Player player) {
		super(17, player, "Goblin Cave", new MountainGoblin(), 3);
		
	}

}
