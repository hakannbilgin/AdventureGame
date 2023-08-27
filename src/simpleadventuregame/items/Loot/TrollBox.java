package simpleadventuregame.items.Loot;

import java.util.ArrayList;

import simpleadventuregame.items.Loot.craftingloot.Diamond;
import simpleadventuregame.items.Loot.craftingloot.Food;
import simpleadventuregame.items.Loot.craftingloot.Iron;
import simpleadventuregame.items.Loot.craftingloot.Water;
import simpleadventuregame.items.Loot.craftingloot.Wood;

public class TrollBox extends GiftBox{

	private String trollBoxAwardsFormat = " TrollBox : [TrollArmor: % %-1d] [Money: %2d] \n";
	
	public TrollBox() {
		super(7, "Gift Box");
		
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
	public Award openBox() {
		
		int boxAwardChance = (int) (Math.random() * 100);
		
		
		
		return null;
	}

	@Override
	public void awardsInBox() {
		
		ArrayList<Award> trollBoxAward = new ArrayList<>();
		trollBoxAward.add(0, new Water());
		trollBoxAward.add(1, new Food());
		trollBoxAward.add(2, new Wood());
		trollBoxAward.add(3, new Iron()); 
		trollBoxAward.add(4, new Diamond());
		trollBoxAward.add(5, new TrollBox());
	}

	
}
