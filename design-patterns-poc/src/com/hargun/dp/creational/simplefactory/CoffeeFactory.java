package com.hargun.dp.creational.simplefactory;

public class CoffeeFactory {
	public static Coffee createCoffee(CoffeeType type) {
		return switch (type) {
		case ESPRESSO -> new Espresso();
		case LATTE -> new Latte();
		default -> null;
		};
	}
}
