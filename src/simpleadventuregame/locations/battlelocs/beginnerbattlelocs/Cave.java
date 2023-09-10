package simpleadventuregame.locations.battlelocs.beginnerbattlelocs;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.battlelocs.BattleLoc;
import simpleadventuregame.monsters.beginnerlocmonsters.Zombie;

public class Cave extends BattleLoc{

	public Cave(Player player) {
		super(4,player, "Cave", new Zombie(),3);
		
	}

}
