package simpleadventuregame.locations.normallocs;

import simpleadventuregame.game.Player;
import simpleadventuregame.locations.Location;

public abstract class NormalLoc extends Location{

	public NormalLoc(Player player, String locationName) {
		super(player, locationName);
		
	}

	@Override
	public boolean onLocation() {
		
		return true;
	}

}
