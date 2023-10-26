package simpleadventuregame.items.tools.craftTools;

import simpleadventuregame.items.tools.Tool;

public class IronHammer extends Tool{

	public IronHammer( ) {
		super("Iron Hammer", 2, 5,5, false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean use() {
		if (this.getUseCount() != 0) {
			this.setUseCount(this.getUseCount() - 1);
			if (this.getUseCount() != 0) {
				System.out.println("You used " + this.getName() + " and " + this.getUseCount() + " use left.");
				return true;
			} else {
				System.out.println("Your tool is broken. You can't use it anymore.  Craft new one");
				return true;
				
			}
		}
		return false;
		
	}

//	@Override
//	public void repair() {
//		// TODO Auto-generated method stub
//		
//	}

}
