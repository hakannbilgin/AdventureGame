package simpleadventuregame.items.Loot.boxes;

import java.util.ArrayList;

import simpleadventuregame.items.Item;
import simpleadventuregame.items.Loot.craftingloot.DarkStone;
import simpleadventuregame.items.Loot.craftingloot.Diamond;
import simpleadventuregame.items.Loot.craftingloot.ElfStone;
import simpleadventuregame.items.Loot.craftingloot.Emerald;
import simpleadventuregame.items.Loot.craftingloot.Food;
import simpleadventuregame.items.Loot.craftingloot.GoblinKeyParts;
import simpleadventuregame.items.Loot.craftingloot.Iron;
import simpleadventuregame.items.Loot.craftingloot.Steel;
import simpleadventuregame.items.Loot.craftingloot.Water;
import simpleadventuregame.items.Loot.craftingloot.Wood;
import simpleadventuregame.items.armors.BossArmors.TrollArmor;
import simpleadventuregame.items.weapons.bossweapons.GoblinSword;

public class GoblinKingBox extends GiftBox{

	public GoblinKingBox() {
		super(16, "GoblinKing Box");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isChange(int locationId) {
		if (locationId == 11) {
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

			return getGoblinBoxAward().get(0);

		} else if (boxAwardChance > 20 && boxAwardChance <= 40) {

			return getGoblinBoxAward().get(1);

		} else if (boxAwardChance > 40 && boxAwardChance <= 60) {

			return getGoblinBoxAward().get(2);

		} else if (boxAwardChance > 60 && boxAwardChance <= 80) {

			return getGoblinBoxAward().get(3);

		} else if (boxAwardChance > 80 && boxAwardChance <= 90) {

			return getGoblinBoxAward().get(4);

		} else if (boxAwardChance > 90 && boxAwardChance <= 95) {

			return getGoblinBoxAward().get(5);

		} else if (boxAwardChance > 95 && boxAwardChance <= 100) {

			return getGoblinBoxAward().get(6);
		}
		return null;

	}

	@Override
	public void awardsInBox() {
		getBoxAward().add(0, new Water());
		getBoxAward().add(1, new Diamond());
		getBoxAward().add(2, new ElfStone());
		getBoxAward().add(3, new GoblinKeyParts());
		getBoxAward().add(4, new Emerald());
		getBoxAward().add(5, new Steel());
		getBoxAward().add(6, new GoblinSword());
		
		for (Item item : getBoxAward()) {
			System.out.printf(getAwardsFormat(), item.getName(), item.getId());;
		}
		
	}
	
	public ArrayList<Item> getGoblinBoxAward() {
		return this.getBoxAward();
	}
	

}
