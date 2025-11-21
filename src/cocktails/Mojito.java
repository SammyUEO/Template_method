package cocktails;

public class Mojito extends Cocktail {

	@Override
	protected void prepareGlass() {
		System.out.println("Step 1 => Preparing highball glass");

	}

	@Override
	protected void addBaseSpirit() {
		System.out.println("Step 3 => Adding white rum");

	}

	@Override
	protected void addMixers() {
		System.out.println("Step 4 => Adding lime juice, sugar, mint leaves and soda water");

	}

	@Override
	protected void addGarnish() {
		System.out.println("Step 6 => Adding mint sprig and lime wedge");

	}

}
