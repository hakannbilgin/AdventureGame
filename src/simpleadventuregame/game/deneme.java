package simpleadventuregame.game;



import java.util.ArrayList;
import java.util.Arrays;

import simpleadventuregame.game.gameitems.Inventory;
import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.items.Item;
import simpleadventuregame.items.Loot.Award;
import simpleadventuregame.items.Loot.boxes.ElfKingBox;
import simpleadventuregame.items.Loot.craftingloot.Diamond;
import simpleadventuregame.items.Loot.craftingloot.Food;
import simpleadventuregame.items.Loot.craftingloot.Iron;
import simpleadventuregame.items.Loot.craftingloot.Water;
import simpleadventuregame.items.armors.BossArmors.TrollArmor;
import simpleadventuregame.items.elixir.HealthElixir;
import simpleadventuregame.items.generalitems.keys.GoblinKey;
import simpleadventuregame.items.weapons.toolstoreweapons.LongSword;
import simpleadventuregame.locations.Location;
import simpleadventuregame.locations.normallocs.houselocs.SafeHouse;
import simpleadventuregame.locations.normallocs.storelocs.ToolStore;
import simpleadventuregame.utils.PlayerScanner;

public class deneme {
	
	static ArrayList<GoblinKey> goblinKeys = new ArrayList<GoblinKey>();
	
	public static void main(String[] args) {
		
		GoblinKey goblinKey = new GoblinKey();
	
//		ArrayList<GoblinKey> goblinKeys = new ArrayList<GoblinKey>();
		goblinKeys.add(new GoblinKey());
		
//		System.out.println(goblinKeys.contains(new GoblinKey().getId()));
		getawardItemsInInventoryById(1);
		System.out.println("Burada 2");

		System.out.println(goblinKeys.isEmpty());
		
		
		

		
}
	
	public static boolean getawardItemsInInventoryById(int id) {
		

		for (Item item : goblinKeys) {

			if (item.getId() == id) {
				goblinKeys.remove(item);
				System.out.println("Object removed");
				return true;
				
			}
		}
		System.out.println("Burada");
		return false;
	}
}
