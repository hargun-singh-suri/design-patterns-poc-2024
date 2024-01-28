package com.hargun.dp.creational.builder;

/**
 * 
 * ------------------------------------ 
 * 
 * Builder Pattern
 * 
 * The Builder Pattern is a design approach that helps construct complex objects
 * step by step. It's like using a customizable recipe to build objects with
 * various configurations. This pattern is useful when creating objects with
 * multiple options, providing a clear and organized way to assemble them. It's
 * comparable to choosing toppings for a pizza, allowing you to build unique
 * objects by specifying features at each stage of construction.
 * 
 * 
 * ------------------------------------
 * 
 * 
 * POC:
 * 
 * Implement a manufacturing system for vehicles using the Builder design
 * pattern. The system should allow the creation of cars and motorcycles with
 * customizable features. The vehicles should be constructed using a
 * step-by-step process, including adding the brand name, building the body, and
 * inserting wheels. The goal is to use method chaining to provide a interface
 * for constructing vehicles.
 * 
 * ------------------------------------
 * 
 *
 * Approach:
 * 
 * 1. Define the common `Builder` interface with methods for adding the brand
 * name, building the body, and inserting wheels.
 * 
 * 2. Create concrete builder classes, `CarBuilder` and `MotorCycleBuilder`,
 * implementing the `Builder` interface. Each builder class should initialize
 * the corresponding type of vehicle and provide methods for each construction
 * step.
 * 
 * 3. Implement the abstract `Vehicle` class with a linked list to store
 * construction sequences. Add methods to add parts and display the constructed
 * product.
 * 
 * 4. Create concrete vehicle classes, `Car` and `MotorCycle`, extending the
 * `Vehicle` class. Initialize these classes with a brand name and display a
 * construction message.
 * 
 * 5. Develop a `Client` class to demonstrate the builder pattern. Instantiate
 * builder objects, build vehicles using method chaining, and display the
 * constructed products.
 ** 
 * Implementation Strategy:
 * 
 * 1. Begin by defining the `Builder` interface and the concrete builder classes
 * (`CarBuilder` and `MotorCycleBuilder`).
 * 
 * 2. Implement the abstract `Vehicle` class with a linked list to store
 * construction sequences.
 * 
 * 3. Create concrete vehicle classes (`Car` and `MotorCycle`) by extending the
 * `Vehicle` class.
 * 
 * 4. Develop the `Client` class to demonstrate the builder pattern. Instantiate
 * builder objects, build vehicles using method chaining, and display the
 * constructed products.
 * 
 * 5. Execute the `Client` class to observe the creation of cars and motorcycles
 * using the builder pattern and method chaining. Verify that the construction
 * sequences are displayed correctly for each vehicle.
 * 
 * ------------------------------------
 * 
 * Additional Info -
 * 
 * Passing too many arguments in a method or constructor is not a recommended
 * practice in general.
 * 
 * In the Builder Pattern:
 * 
 * Director: Guides the construction process, instruct how the product is built
 * by directing the builder.
 * 
 * Builder: Defines the step-by-step construction process for the product,
 * providing methods to build each part.
 * 
 * Product: Represents the complex object being constructed, created through the
 * steps defined by the builder.
 * 
 * If you need to make a complex object that involves various steps of the
 * construction process and at the same time the products need to be immutable,
 * the Builder pattern is a good choice
 * 
 * Method Chaining -
 * 
 * Method chaining is a programming technique where multiple methods are invoked
 * on an object in a single line of code. Each method call returns the object
 * itself, allowing subsequent methods to be called on the same object. This
 * creates a fluent and concise syntax, making the code more readable and
 * expressive. Method chaining is commonly used to perform a series of
 * operations or modifications on an object in a single, continuous line.
 * 
 * 
 * ------------------------------------ POC For practice
 * 
 * Implement a system for constructing customized computer configurations based
 * on user preferences. A computer configuration involves selecting components
 * such as the processor, RAM, storage, and graphics card. The challenge is to
 * design a flexible solution using the Builder Pattern that allows users to
 * easily customize and build their computers step by step. The system should
 * support various types of computers, each with different configurations, and
 * ensure a clear and user-friendly process for specifying component choices.
 * 
 * Requirements:
 * 
 * Define a product class representing a computer with attributes like
 * processor, RAM, storage, and graphics card.
 * 
 * Implement a builder interface with methods for building each component of the
 * computer.
 * 
 * Create concrete builder classes (e.g., GamingComputerBuilder,
 * WorkComputerBuilder) that implement the builder interface and specialize in
 * constructing specific types of computers.
 * 
 * In the client code, demonstrate how users can customize and build different
 * types of computers using the Builder Pattern & method chaining, selecting
 * components based on their preferences.
 */