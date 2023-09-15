package simpleadventuregame.monsters.forestmonsters;

import simpleadventuregame.items.Loot.craftingloot.GoblinKey;
import simpleadventuregame.items.elixir.BlockElixir;
import simpleadventuregame.monsters.Monster;

public class DarkSpirit extends Monster{

	public DarkSpirit() {
		super(8, "Dark Spirit", new GoblinKey(), new BlockElixir(), 16, 18, 18, 4,4);
		// TODO Auto-generated constructor stub
	}

}
