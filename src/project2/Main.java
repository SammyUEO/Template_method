package project2;

import coffeeDrinks.Americano;
import coffeeDrinks.Cappuccino;
import coffeeDrinks.Coffee;
import coffeeDrinks.Espresso;
import coffeeDrinks.Latte;

public class Main {

	public static void main(String[] args) {

		System.out.println("Making espresso");
		Coffee espresso = new Espresso();
		espresso.prepareCoffee();

		System.out.println("\nMaking cappuccino");
		Coffee cappuccino = new Cappuccino();
		cappuccino.prepareCoffee();

		System.out.println("\nMaking latte");
		Coffee latte = new Latte();
		latte.prepareCoffee();

		System.out.println("\nMaking americano");
		Coffee americano = new Americano();
		americano.prepareCoffee();
	}

}
