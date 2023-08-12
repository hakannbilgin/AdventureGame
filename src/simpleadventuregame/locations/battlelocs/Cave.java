package simpleadventuregame.locations.battlelocs;

import simpleadventuregame.game.Player;
import simpleadventuregame.items.Loot.Food;
import simpleadventuregame.items.Loot.Iron;
import simpleadventuregame.monsters.Zombie;

public class Cave extends BattleLoc{

	public Cave(Player player) {
		super(player, "Cave", new Zombie(), new Food(), 3);
		
	}

}
