package simpleadventuregame.locations.normallocs.houselocs.blacksmith.normalBlackSmith;

import simpleadventuregame.game.gameitems.Inventory;
import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.items.tools.IronHammer;
import simpleadventuregame.items.tools.SteelHammer;
import simpleadventuregame.items.tools.WoodHammer;

public class ToolCraftingTable {
	Player player;

	public ToolCraftingTable(Player player) {
//		super();
		this.player = player;
	}

	public void craftWoodHammer() {

		if (getInventory().getWoodCount() >= 3 && getInventory().getWaterCount() >= 1) {
			getInventory().setTool(new WoodHammer());
			getInventory().setWoodCount(getInventory().getWoodCount() - 3);
			getInventory().setWaterCount(getInventory().getWaterCount() - 1);
			System.out.println("-------------------------- \n Wood Hammer Crafted \n --------------------------");

		} else {
			System.out.println("You don't have enough item");
		}

	}

	public void craftIronHammer() {

		if (getInventory().getIronCount() >= 2 && getInventory().getWoodCount() >= 2
				&& getInventory().getWaterCount() >= 1) {
			getInventory().setTool(new IronHammer());
			getInventory().setIronCount(getInventory().getIronCount() - 2);
			getInventory().setWoodCount(getInventory().getWoodCount() - 2);
			getInventory().setWaterCount(getInventory().getWaterCount() - 1);
			System.out.println("-------------------------- \n Iron Hammer Crafted \n --------------------------");

		} else {
			System.out.println("You don't have enough item");
		}

	}

	public void craftSteelHammer() {

		if (getInventory().getToolPartsCount() >= 3 && getInventory().getIronCount() >= 1
				&& getInventory().getSteelCount() >= 1) {
			getInventory().setTool(new SteelHammer());
			getInventory().setWoodCount(getInventory().getWoodCount() - 3);
			getInventory().setWaterCount(getInventory().getWaterCount() - 1);
			System.out.println("-------------------------- \n Steel Hammer Crafted \n --------------------------");

		} else {
			System.out.println("You don't have enough item");
		}

	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Inventory getInventory() {

		return this.getPlayer().getInventory();
	}

}
