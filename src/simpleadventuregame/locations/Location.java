package simpleadventuregame.locations;

import simpleadventuregame.game.Player;

public abstract class Location {

	private Player player;
	private String name;
	private int id;
	
	
	public Location(int id, Player player, String locationName) {
//		super();
		this.id = id;
		this.player = player;
		this.name = locationName;
	}

	
	
	public abstract boolean onLocation();

	public Player getPlayer() {
		return player;
	}


	public void setPlayer(Player player) {
		this.player = player;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
