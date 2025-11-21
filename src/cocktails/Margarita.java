package cocktails;

public class Margarita extends Cocktail {

	@Override
	protected void prepareGlass() {
		System.out.println("Step 1 => Preparing margarita glass with salt rim");

	}

	@Override
	protected void addBaseSpirit() {
		System.out.println("Step 3 => Adding tequila");

	}

	@Override
	protected void addMixers() {
		System.out.println("Step 4 => Adding triple sec and lime juice");

	}

	@Override
	protected void addGarnish() {
		System.out.println("Step 6 => Adding lime wheel");

	}

}
