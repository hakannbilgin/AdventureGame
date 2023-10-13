package simpleadventuregame.items.tools;

public class Hammer extends Tool {

	public Hammer() {
		super("Hammer", 1, 5);

	}

	@Override
	public void use() {
		if (this.getUseCount() != 0) {
			this.setUseCount(this.getUseCount() - 1);
			if (this.getUseCount() != 0) {
				System.out.println("You used " + this.getName() + " and " + this.getUseCount() + " use left.");

			} else {
				System.out.println("Your tool is broken. You can't use it anymore.  Craft new one");
				
			}
		}

	}

}
