package coffeeDrinks;

public class Americano extends Coffee {

	@Override
	protected void grindBeans() {
		System.out.println("Step 1 => Grinding coarse espresso beans");
	}

	@Override
	protected void addExtras() {
		System.out.println("Step 3 => Adding hot water");

	}

	@Override
	protected void addMilk() {
		System.out.println("Step 4 => Adding a splash of cold milk");

	}

	@Override
	protected void addTopping() {
		System.out.println("Step 6 => No topping");

	}

}
