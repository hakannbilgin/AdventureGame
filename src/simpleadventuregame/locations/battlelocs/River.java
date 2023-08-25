package simpleadventuregame.locations.battlelocs;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.monsters.Bear;

public class River extends BattleLoc{

	public River(Player player) {
		super(7,player, "River", new Bear(),2);
		
	}

}
