package cocktails;

public class PinaColada extends Cocktail {

	@Override
	protected void prepareGlass() {
		System.out.println("Step 1 => Preparing hurricane glass");
	}

	@Override
	protected void addBaseSpirit() {
		System.out.println("Step 3 => Adding white rum and coconut rum");

	}

	@Override
	protected void addMixers() {
		System.out.println("Step 4 => Adding pineapple juice and coconut cream");

	}

	@Override
	protected void addGarnish() {
		System.out.println("Step 6 => Adding pineapple wedge and cherry");

	}

}
