package simpleadventuregame.locations.normallocs.houselocs.blacksmith;

import simpleadventuregame.game.gameitems.Inventory;
import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.items.tools.Hammer;

public class ToolCraftingTable {
	Player player;

	
	public ToolCraftingTable(Player player) {
//		super();
		this.player = player;
	}
	
	public void craftHammer() {
		
		if (getInventory().getToolPartsCount() >= 3 && getInventory().getIronCount() >= 1 && getInventory().getSteelCount() >= 1) {
			getInventory().setTool(new Hammer());
			getInventory().setWoodCount(getInventory().getWoodCount() - 3);
			getInventory().setWaterCount(getInventory().getWaterCount() - 1);
			System.out.println("-------------------------- \n Hammer Crafted \n --------------------------");
			
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
