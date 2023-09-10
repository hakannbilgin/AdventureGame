package simpleadventuregame.game.gameitems;

import java.util.ArrayList;
import java.util.List;

import simpleadventuregame.items.Loot.Award;
import simpleadventuregame.items.armors.Armor;
import simpleadventuregame.items.armors.OldClothes;
import simpleadventuregame.items.weapons.Fist;
import simpleadventuregame.items.weapons.Weapon;

public class Inventory {
	
	private List<Award> awardsInInventory;
	
	private ElixirChest elixirChest;
	private BoxChest boxChest;
	private Weapon weapon;
	private Armor armor;
	private int waterCount = 0;
	private int foodCount = 0;
	private int woodCount = 0;
	private int ironCount = 0;
	private int darkStone = 0;
	private int diamondCount= 0;
	private int emeraldCount =0;
	private int elfStoneCount = 0;
	private int goblinKeyCount = 0;

	public Inventory() {
		this.weapon = new Fist();
		this.armor = new OldClothes();
		this.elixirChest= new ElixirChest();
		this.boxChest = new BoxChest();
		this.awardsInInventory = new ArrayList<>();
	}


	
	public void addAward(Award award) {
        // Envantore öğe eklemek için bu metodu kullanabiliriz.
		awardsInInventory.add(award);
    }

    public void removeAward(Award award) {
        // Envantordan öğe çıkarmak için bu metodu kullanabiliriz.
    	awardsInInventory.remove(award);
    }

    public List<Award> getItems() {
        // Envantordaki tüm öğeleri almak için bu metodu kullanabiliriz.
        return awardsInInventory;
    }
	
	
	
	
	public List<Award> getAwardsInInventory() {
		return awardsInInventory;
	}



//	public void setAwardsInInventory(List<Award> awardsInInventory) {
//		this.awardsInInventory = awardsInInventory;
//	}



	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public int getWaterCount() {
		return waterCount;
	}

	public void setWaterCount(int waterCount) {
		this.waterCount = waterCount;
	}

	public int getFoodCount() {
		return foodCount;
	}

	public void setFoodCount(int foodCount) {
		this.foodCount = foodCount;
	}

	public int getWoodCount() {
		return woodCount;
	}

	public void setWoodCount(int woodCount) {
		this.woodCount = woodCount;
	}

	public int getIronCount() {
		return ironCount;
	}

	public void setIronCount(int ironCount) {
		this.ironCount = ironCount;

	}

	public int getDarkStone() {
		return darkStone;
	}

	public void setDarkStone(int darkStone) {
		this.darkStone = darkStone;
	}

	public int getDiamondCount() {
		return diamondCount;
	}

	public void setDiamondCount(int diamondCount) {
		this.diamondCount = diamondCount;
	}


	public BoxChest getBoxChest() {
		return boxChest;
	}


	public int getEmeraldCount() {
		return emeraldCount;
	}


	public void setEmeraldCount(int emeraldCount) {
		this.emeraldCount = emeraldCount;
	}


	public ElixirChest getElixirChest() {
		return elixirChest;
	}


	public int getElfStoneCount() {
		return elfStoneCount;
	}


	public void setElfStoneCount(int elfStoneCount) {
		this.elfStoneCount = elfStoneCount;
	}


	public int getGoblinKeyCount() {
		return goblinKeyCount;
	}


	public void setGoblinKeyCount(int goblinKeyCount) {
		this.goblinKeyCount = goblinKeyCount;
	}



//	public void setElixirChest(ElixirChest elixirChest) {
//		this.elixirChest = elixirChest;
//	}


//	public void setBoxChest(BoxChest boxChest) {
//		this.boxChest = boxChest;
//	}

	
	
}
