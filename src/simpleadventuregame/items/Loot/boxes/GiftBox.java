package simpleadventuregame.items.Loot.boxes;

import java.util.ArrayList;

import simpleadventuregame.items.Item;
import simpleadventuregame.items.Loot.Award;

public abstract class GiftBox extends Award{
	private String AwardsFormat = " Item :  [%-11s] [Id :%d] \n";
	private ArrayList<Item> boxAward = new ArrayList<Item>();
	

	public GiftBox(int id, String name,boolean upgradeable) {
		super(id, name,upgradeable);
		
	}

	
	
	public abstract Item openBox();
	
	public abstract void awardsInBox();



	public String getAwardsFormat() {
		return AwardsFormat;
	}



	public void setAwardsFormat(String awardsFormat) {
		AwardsFormat = awardsFormat;
	}



	public ArrayList<Item> getBoxAward() {
		return boxAward;
	}



	public void setBoxAward(ArrayList<Item> boxAward) {
		this.boxAward = boxAward;
	}
	
	
	
}
