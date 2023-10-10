package simpleadventuregame.locations.normallocs.storelocs;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.normallocs.NormalLoc;

public class UglyGoblinsStore extends NormalLoc{
	private String equipmentWeaponFormat = " Equipment :  [%-7s] [%d] [Damage:  %-1d] [Money: %2d] \n";
	private String equipmentArmorFormat = " Equipment :  [%-7s] [%d] [DamageDodge:  %-1d] [Money: %2d] \n";

	public UglyGoblinsStore(Player player) {
		super(20, player, "Ugly Goblin Store");
		// TODO Auto-generated constructor stub
	}

}
