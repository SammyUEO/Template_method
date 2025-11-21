package coffeeDrinks;

public abstract class Coffee {

	public final void prepareCoffee() {
		grindBeans();
		brewCoffee();
		addExtras();
		addMilk();
		addFinalTouch();
		addTopping();
	}

	protected abstract void grindBeans();

	private void brewCoffee() {
		System.out.println("Step 2 => Brewing coffee");
	}

	protected abstract void addExtras();

	protected abstract void addMilk();

	private void addFinalTouch() {
		System.out.println("Step 5 => Adding final touch");
	}

	protected abstract void addTopping();

}
