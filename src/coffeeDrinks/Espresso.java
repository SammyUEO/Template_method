package coffeeDrinks;

public class Espresso extends Coffee {

	@Override
	protected void grindBeans() {
		System.out.println("Step 1 => Grinding fine espresso beans");

	}

	@Override
	protected void addExtras() {
		System.out.println("Step 3 => Adding sugar");

	}

	@Override
	protected void addMilk() {
		System.out.println("Step 4 => No milk added");

	}

	@Override
	protected void addTopping() {
		System.out.println("Step 6 => No topping");

	}

}
