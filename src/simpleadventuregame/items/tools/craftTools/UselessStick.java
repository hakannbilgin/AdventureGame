package simpleadventuregame.items.tools.craftTools;

import simpleadventuregame.items.tools.Tool;

public class UselessStick extends Tool {

	public UselessStick() {

		super("Useless Stick", -2 , 999,999, false,false);

	}

	@Override
	public boolean use() {
		return true;

	}

//	@Override
//	public void repair() {
//		// TODO Auto-generated method stub
//		
//	}

}
