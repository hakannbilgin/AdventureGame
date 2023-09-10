package simpleadventuregame.locations.battlelocs.beginnerbattlelocs;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.battlelocs.BattleLoc;
import simpleadventuregame.monsters.beginnerlocmonsters.Skeleton;

public class Temple extends BattleLoc{

	public Temple(Player player) {
		super(5,player, "Abonden Temple", new Skeleton(),2);
		// TODO Auto-generated constructor stub
	}

}
