package project2;

public class FrenchChef extends Chef {

	@Override
	public Dish prepareDish() {
		return new FrenchDish();
	}

}
