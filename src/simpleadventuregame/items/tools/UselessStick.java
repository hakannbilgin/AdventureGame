package simpleadventuregame.items.tools;

public class UselessStick extends Tool {

	public UselessStick() {

		super("Useless Stick", -2 , 999,999, false);

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
