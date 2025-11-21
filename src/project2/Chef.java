package project2;

//Factory method example
public abstract class Chef {
	
	public abstract Dish prepareDish();
	
	public void serveDish() {
		Dish dish = prepareDish();
		dish.serve();
	}

}
