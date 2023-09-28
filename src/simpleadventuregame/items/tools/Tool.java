package simpleadventuregame.items.tools;

import simpleadventuregame.items.Item;

public abstract class Tool extends Item {

	public int useCount;
	//TODO:ADD TOOL LEVEL

	public Tool(String name, int id) {
		super();
		this.setName(name);
		this.setId(id);
	}

//	TODO: ADD MORE MOTHOD TO USE TOOLS	
	public  void use() {
		//TODO:how to use
	}
	

	public int getUseCount() {
		return useCount;
	}

	public void setUseCount(int useCount) {
		this.useCount = useCount;
	}

}
