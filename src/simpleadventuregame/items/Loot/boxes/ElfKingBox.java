package simpleadventuregame.items.Loot.boxes;

import java.util.ArrayList;
import simpleadventuregame.items.Item;
import simpleadventuregame.items.Loot.craftingloot.DarkStone;
import simpleadventuregame.items.Loot.craftingloot.Diamond;
import simpleadventuregame.items.Loot.craftingloot.Food;
import simpleadventuregame.items.Loot.craftingloot.Iron;
import simpleadventuregame.items.Loot.craftingloot.Water;
import simpleadventuregame.items.Loot.craftingloot.Wood;
import simpleadventuregame.items.armors.BossArmors.TrollArmor;

public class ElfKingBox extends GiftBox {

//	private String elfKingAwardsFormat = " Item :  [%-11s] [Id :%d] \n";
//	private ArrayList<Item> trollBoxAward = new ArrayList<Item>();
	

	public ElfKingBox() {
		super(10, "Troll Box",false);

	}

	@Override
	public boolean isChange(int locationId) {

		if (locationId == 19) {
			this.setChance(60);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();
		} else {
			return false;
		}
	}

	@Override
	public Item openBox() {

		this.awardsInBox();
		System.out.println("-----THE BOX IS OPENING-----");
		
		int boxAwardChance = (int) (Math.random() * 100);

		if (boxAwardChance >= 0 && boxAwardChance <= 20) {

			return getTrollBoxAward().get(0);

		} else if (boxAwardChance > 20 && boxAwardChance <= 40) {

			return getTrollBoxAward().get(1);

		} else if (boxAwardChance > 40 && boxAwardChance <= 60) {

			return getTrollBoxAward().get(2);

		} else if (boxAwardChance > 60 && boxAwardChance <= 80) {

			return getTrollBoxAward().get(3);

		} else if (boxAwardChance > 80 && boxAwardChance <= 90) {

			return getTrollBoxAward().get(4);

		} else if (boxAwardChance > 90 && boxAwardChance <= 95) {

			return getTrollBoxAward().get(5);

		} else if (boxAwardChance > 95 && boxAwardChance <= 100) {

			return getTrollBoxAward().get(6);
		}
		return null;

	}

	@Override
	public void awardsInBox() {
		getBoxAward().add(0, new Water());
		getBoxAward().add(1, new Food());
		getBoxAward().add(2, new Wood());
		getBoxAward().add(3, new Iron());
		getBoxAward().add(4, new DarkStone());
		getBoxAward().add(5, new Diamond());
		getBoxAward().add(6, new TrollArmor());
		
		for (Item item : getBoxAward()) {
			System.out.printf(getAwardsFormat(), item.getName(), item.getId());;
		}

	}

	public ArrayList<Item> getTrollBoxAward() {
		return this.getBoxAward();
	}

//	public void setTrollBoxAward(ArrayList<Item> trollBoxAward) {
//		this.trollBoxAward = trollBoxAward;
//	}

}
