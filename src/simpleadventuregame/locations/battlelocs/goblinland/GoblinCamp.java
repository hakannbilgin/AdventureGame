package simpleadventuregame.locations.battlelocs.goblinland;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.battlelocs.BattleLoc;
import simpleadventuregame.monsters.Monster;
import simpleadventuregame.monsters.goblinlandmonsters.LittleGoblin;

public class GoblinCamp extends BattleLoc {

	public GoblinCamp(Player player) {
		super(16, player, "Goblin Camp", new LittleGoblin(), 5);
		
	}

}
