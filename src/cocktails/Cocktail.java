package cocktails;

public abstract class Cocktail {

	public final void prepareCocktail() {
		prepareGlass();
		addIce();
		addBaseSpirit();
		addMixers();
		shake();
		addGarnish();
	}

	protected abstract void prepareGlass();

	private void addIce() {
		System.out.println("Step 2 => Adding ice cubes");
	}

	protected abstract void addBaseSpirit();

	protected abstract void addMixers();

	private void shake() {
		System.out.println("Step 5 => Shaking the cocktail");
	}

	protected abstract void addGarnish();

}
