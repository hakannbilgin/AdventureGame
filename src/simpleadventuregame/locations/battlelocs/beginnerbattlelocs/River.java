package simpleadventuregame.locations.battlelocs.beginnerbattlelocs;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.battlelocs.BattleLoc;
import simpleadventuregame.monsters.beginnerlocmonsters.Bear;

public class River extends BattleLoc{

	public River(Player player) {
		super(7,player, "River", new Bear(),2);
		
	}

}
