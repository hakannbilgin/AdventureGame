package simpleadventuregame.locations.battlelocs;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.monsters.Zombie;

public class Cave extends BattleLoc{

	public Cave(Player player) {
		super(4,player, "Cave", new Zombie(),3);
		
	}

}
