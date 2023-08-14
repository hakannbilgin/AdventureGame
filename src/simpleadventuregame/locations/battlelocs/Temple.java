package simpleadventuregame.locations.battlelocs;

import simpleadventuregame.game.Player;
import simpleadventuregame.items.Loot.Iron;
import simpleadventuregame.monsters.Skeleton;

public class Temple extends BattleLoc{

	public Temple(Player player) {
		super(player, "Abonden Temple", new Skeleton(), new Iron(), 2);
		// TODO Auto-generated constructor stub
	}

}
