package coffeeDrinks;

public class Cappuccino extends Coffee {

	@Override
	protected void grindBeans() {
		System.out.println("Step 1 => Grinding medium espresso beans");

	}

	@Override
	protected void addExtras() {
		System.out.println("Step 3 => Adding vanilla extract");

	}

	@Override
	protected void addMilk() {
		System.out.println("Step 4 => Adding steamed milk and foam");

	}

	@Override
	protected void addTopping() {
		System.out.println("Step 6 => Adding cocoa powder");

	}

}
