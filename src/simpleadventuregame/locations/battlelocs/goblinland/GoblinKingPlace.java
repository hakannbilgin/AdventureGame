package simpleadventuregame.locations.battlelocs.goblinland;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.battlelocs.BattleLoc;
import simpleadventuregame.monsters.Monster;
import simpleadventuregame.monsters.bosses.GoblinKing;

public class GoblinKingPlace extends BattleLoc {

	public GoblinKingPlace(Player player) {
		super(19, player, "Goblin King's Place", new GoblinKing(), 1);
		// TODO Auto-generated constructor stub
	}

}
