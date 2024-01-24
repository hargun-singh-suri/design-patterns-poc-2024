package com.hargun.dp.creational.factory.abstractfactory;

/**
 * Abstract Factory Pattern is a creational design pattern that provides an
 * interface for creating families of related or dependent objects without
 * specifying their concrete classes. In simpler terms, it's like having
 * multiple factory methods, each responsible for creating a set of related
 * products.
 * 
 * -------------------------------------------------
 * 
 * POC :
 * 
 * Imagine a coffee shop that serves different coffee drinks like Espresso and
 * Latte. Customers can also choose add-ons, such as various milk foams or
 * flavored syrups. The task is to create a system where customers can easily
 * order their preferred coffee type along with their chosen add-ons. The coffee
 * shop might introduce new combinations of drinks and add-ons later on. The
 * challenge is to design a flexible solution that allows for the creation of
 * these coffee-drink-and-add-on combinations without having to change the
 * existing code.
 * 
 * -------------------------------------------------
 * 
 * Solution :
 * 
 * To address the coffee shop's requirement of offering various combinations of
 * coffee drinks and add-ons, Implementing the Abstract Factory
 * Pattern. Define abstract product interfaces (Coffee and CoffeeAddOn) and
 * corresponding concrete product classes (Espresso, Latte, MilkFoam,
 * FlavoredSyrup). Two abstract factories (CoffeeFactory and AddOnFactory)
 * declare methods for creating families of related products. Concrete factories
 * (EspressoFactory, LatteFactory, MilkFoamFactory, FlavoredSyrupFactory)
 * implement these interfaces, creating specific combinations of coffee drinks
 * and add-ons. The client code can then use a specific factory to create a set
 * of products that work together harmoniously.
 * 
 * 
 * 
 * Difference :
 * 
 * Simple Factory Pattern: The Simple Factory Pattern involves a single factory
 * class responsible for creating objects based on input parameters. This
 * straightforward approach encapsulates the object creation logic, shielding
 * clients from knowing the specific details of instantiation. However, it lacks
 * the flexibility to create families of related objects, and adding new
 * products may require modifying the factory class directly.
 * 
 * Factory Method Pattern: In the Factory Method Pattern, subclasses take on the
 * responsibility of creating objects through their own factory methods. This
 * pattern offers greater flexibility, allowing the creation of families of
 * related or dependent objects. Clients interact with an interface or abstract
 * class, utilizing the factory method to instantiate objects. The extension
 * involves adding new products by introducing new subclasses without modifying
 * existing code.
 *
 * Abstract Factory Pattern: The Abstract Factory Pattern introduces abstract
 * factories that declare methods for creating families of related or dependent
 * objects. This highly flexible pattern supports the creation of families of
 * products through multiple concrete factories. Clients interact with abstract
 * factories and product interfaces or abstract classes. Extending the system
 * involves adding new products by creating new concrete factories and
 * corresponding products without modifying existing code.
 * 
 */