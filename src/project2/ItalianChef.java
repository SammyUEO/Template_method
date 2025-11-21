package project2;

public class ItalianChef extends Chef {

	@Override
	public Dish prepareDish() {
		return new ItalianDish();
	}

}
