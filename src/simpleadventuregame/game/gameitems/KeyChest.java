package simpleadventuregame.game.gameitems;

public class KeyChest {

	private int totalKeyCount = 0;
	private int goblinKeyCount = 0;
	
	
	public int getTotalKeyCount() {
		totalKeyCount = getGoblinKeyCount();
		return totalKeyCount;
	}
//	public void setTotalKeyCount(int totalKeyCount) {
//		this.totalKeyCount = totalKeyCount;
//	}
	public int getGoblinKeyCount() {
		
		return goblinKeyCount;
	}
	public void setGoblinKeyCount(int goblinKeyCount) {	
		this.goblinKeyCount = goblinKeyCount;
	}
	
	
	
}
