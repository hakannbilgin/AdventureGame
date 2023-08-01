package simpleadventuregame.locations.battlelocs;

import simpleadventuregame.game.Player;
import simpleadventuregame.items.Loot.Food;
import simpleadventuregame.monsters.Zombie;

public class Cave extends BattleLoc{

	public Cave(Player player) {
		super(player, "Mağara", new Zombie(), new Food(), 3);
		// TODO Auto-generated constructor stub
	}

}
