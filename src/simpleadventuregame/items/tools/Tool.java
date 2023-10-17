package simpleadventuregame.items.tools;

import simpleadventuregame.items.Item;

public abstract class Tool extends Item {

	private int useCount = 0;
	private boolean repairable;
	//TODO:ADD TOOL LEVEL

	public Tool(String name, int id, int useCount , boolean repairable) {
		super();
		this.setName(name);
		this.setId(id);
		this.useCount = useCount;
		this.repairable = repairable;
	}

//	TODO: ADD MORE MOTHOD TO USE TOOLS	
	public abstract void use();
	
	public abstract void repair();
	

	public int getUseCount() {
		return useCount;
	}

	public void setUseCount(int useCount) {
		this.useCount = useCount;
	}

	public boolean isRepairable() {
		return repairable;
	}

	public void setRepairable(boolean repairable) {
		this.repairable = repairable;
	}
	
}
