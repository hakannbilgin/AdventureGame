package simpleadventuregame.locations.normallocs;

import simpleadventuregame.game.Player;

public class SafeHouse extends NormalLoc {

	public SafeHouse(Player player) {
		super(player, "Safe House");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onLocation() {
		System.out.println(" Now you are in the safe house \n Your have been healed, your health is full");
		this.getPlayer().setHealth(this.getPlayer().getDefaultHealth());
		return true;
	}

	
	
}
