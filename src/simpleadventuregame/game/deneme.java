package simpleadventuregame.game;



import java.util.ArrayList;
import simpleadventuregame.items.Item;
import simpleadventuregame.items.generalitems.keys.GoblinKey;

public class deneme {
	
	static ArrayList<GoblinKey> goblinKeys = new ArrayList<GoblinKey>();
	
	public static void main(String[] args) {
		
		GoblinKey goblinKey = new GoblinKey();
	
//		ArrayList<GoblinKey> goblinKeys = new ArrayList<GoblinKey>();
		goblinKeys.add(new GoblinKey());
		
//		System.out.println(goblinKeys.contains(new GoblinKey().getId()));
		removeObjectfromInventory(1);
		System.out.println("Burada 2");

		System.out.println(goblinKeys.isEmpty());
		
}
	
	public static boolean removeObjectfromInventory(int id) {
		

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
