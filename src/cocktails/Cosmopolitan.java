package cocktails;

public class Cosmopolitan extends Cocktail {

	@Override
	protected void prepareGlass() {
		System.out.println("Step 1 => Preparing chilled martini glass");

	}

	@Override
	protected void addBaseSpirit() {
		System.out.println("Step 3 => Adding vodka and triple sec");

	}

	@Override
	protected void addMixers() {
		System.out.println("Step 4 => Adding cranberry juice and lime juice");
	}

	@Override
	protected void addGarnish() {
		System.out.println("Step 6 => Adding orange peel twist");

	}

}
