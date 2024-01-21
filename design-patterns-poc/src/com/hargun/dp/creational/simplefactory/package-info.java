package com.hargun.dp.creational.simplefactory;

/**
 * Definition :
 * 
 * The Simple Factory Pattern is a design pattern in programming that helps
 * create objects without specifying their exact class. Instead of directly
 * using a constructor, we have a separate 'factory' class responsible for
 * creating objects based on certain conditions or input. This makes it easier
 * to manage object creation, especially when there are multiple classes or
 * variations to choose from. In simple terms, it's like ordering a pizza from a
 * menu without needing to know how the pizza is made or what ingredients are
 * used; you just ask the 'factory' (in this case, the pizza place) to give you
 * the pizza you want.
 * 
 * -- It helps you abstract the process of object creation from the consumers of
 * the application.
 * 
 * -------------------------------------------------
 * 
 * POC :
 * 
 * A coffee shop wants to enhance its ordering system by introducing a variety
 * of coffee drinks. The coffee shop offers different types of coffee, such as
 * Espresso and Latte, each with its unique preparation process. The goal is to
 * design a flexible system that allows the addition of new coffee types in the
 * future without modifying the existing code.
 * 
 * -------------------------------------------------
 * 
 * Solution :
 * 
 * Create a Coffee interface with a prepare() method for each coffee type,
 * concrete classes like Espresso and Latte implementing this interface, and a
 * CoffeeFactory responsible for creating instances of different coffee drinks
 * based on user input. The client code, represented by the CoffeeShop class,
 * utilizes the factory to obtain and prepare various coffee drinks
 * without being concerned with the specifics of their creation. This design
 * ensures extensibility, enabling the coffee shop to easily introduce new types
 * of coffee drinks in the future.
 * 
 */
