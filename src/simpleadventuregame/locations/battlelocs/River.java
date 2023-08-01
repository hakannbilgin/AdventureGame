package simpleadventuregame.locations.battlelocs;

import simpleadventuregame.game.Player;
import simpleadventuregame.items.Loot.Water;
import simpleadventuregame.monsters.Bear;

public class River extends BattleLoc{

	public River(Player player) {
		super(player, "River", new Bear(), new Water(), 2);
		
	}

}
