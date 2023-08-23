package simpleadventuregame.monsters;

import simpleadventuregame.items.Loot.Diamond;
import simpleadventuregame.items.Loot.Food;

public class Spirit extends Monster {

	
	
	public Spirit() {
		super(6, "Spirit", new Diamond(),new Food(), 5, 5, 16);
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public Award extraAwardWihtLocation(int locationId) {
//
//		if (this.getExtraAward().isChange(locationId)) {
//			return getExtraAward();
//		}
//		return null;
//
//	}

}
