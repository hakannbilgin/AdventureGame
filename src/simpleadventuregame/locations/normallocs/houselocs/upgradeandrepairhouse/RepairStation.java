package simpleadventuregame.locations.normallocs.houselocs.upgradeandrepairhouse;

import simpleadventuregame.game.gameitems.Inventory;
import simpleadventuregame.game.gameitems.Player;

public class RepairStation {

	Player player;

	public RepairStation(Player player) {
		super();
		this.player = player;
	}
	
	
	public void repairCurrentTool(){
		
		this.getInventory().getTool().repair();
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
