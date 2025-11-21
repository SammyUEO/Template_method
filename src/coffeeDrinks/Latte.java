package coffeeDrinks;

public class Latte extends Coffee {

	@Override
	protected void grindBeans() {
		System.out.println("Step 1 => Grinding espresso beans");

	}

	@Override
	protected void addExtras() {
		System.out.println("Step 3 => Adding caramel syrup");

	}

	@Override
	protected void addMilk() {
		System.out.println("Step 4 => Adding steamed milk");

	}

	@Override
	protected void addTopping() {
		System.out.println("Step 6 => Adding whipped cream");

	}

}
