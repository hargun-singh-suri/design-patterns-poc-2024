package com.hargun.dp.creational.factory;

/**
 * The Factory Method Pattern is a design pattern that defines an interface for
 * creating an object but lets subclasses alter the type of objects that will be
 * created. In simpler terms, it's like having a method in a class that acts as
 * a factory, allowing subclasses to decide which specific type of object to
 * create. This promotes flexibility in object creation and customization based
 * on different scenarios.
 * 
 * -------------------------------------------------
 * 
 * POC :
 * 
 * Design a simple coffee ordering system that accommodates different types of
 * coffee drinks. The system should utilize the Factory Method Pattern to allow
 * the addition of new coffee types in the future without modifying existing
 * code.
 * 
 * -------------------------------------------------
 * 
 * Solution :
 * 
 * In our coffee ordering system, we've created a `Coffee` interface with a
 * `prepare()` method for different coffee types like `Espresso` and `Latte`. To
 * enable the addition of new coffee types without changing the existing code,
 * we introduced a `CoffeeFactory` interface with a factory method,
 * `createCoffee()`. Concrete creators like `EspressoCreator` and `LatteCreator`
 * implement this interface, acting as factories that create specific coffee
 * instances.
 * 
 * In our client code (`CoffeeShop`), we instantiate these concrete creators and
 * use their factory methods to create instances of different coffee drinks. By
 * calling the `prepare` method on each coffee object, we trigger the specific
 * preparation steps for the chosen coffee type. This design follows the Factory
 * Method Pattern, providing flexibility for future expansions while keeping the
 * code simple and maintainable.
 * 
 * 
 * Difference :
 * 
 * Simple Factory Pattern: 
 * 
 * Responsibility: A single factory class creates objects based on input parameters. 
 * 
 * Flexibility: Limited flexibility; doesn't support creating families of related objects. 
 * 
 * Client Interaction: Clients directly interact with the factory class. 
 * 
 * Extension: Adding new products may require modifying the factory class. 
 * 
 * Factory Method Pattern: 
 * 
 * Responsibility: Subclasses have their own factory methods to create objects. 
 * 
 * Flexibility: More flexible; supports creating families of related or dependent objects.
 * 
 * Client Interaction: Clients interact with an interface or abstract class, using the factory method. 
 * 
 * Extension: Adding new products involves creating new subclasses without modifying existing code.
 */