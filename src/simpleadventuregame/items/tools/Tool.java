package simpleadventuregame.items.tools;

import simpleadventuregame.items.Item;

public abstract class Tool extends Item {

	private int useCount = 0;
	//TODO:ADD TOOL LEVEL

	public Tool(String name, int id, int useCount) {
		super();
		this.setName(name);
		this.setId(id);
		this.useCount = useCount;
	}

//	TODO: ADD MORE MOTHOD TO USE TOOLS	
	public abstract void use();
	

	public int getUseCount() {
		return useCount;
	}

	public void setUseCount(int useCount) {
		this.useCount = useCount;
	}

}
