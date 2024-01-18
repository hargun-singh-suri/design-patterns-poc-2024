package com.hargun.dp.behavioral.observer;

/**
 * Definition :
 * 
 * The Observer Pattern is a behavioral design pattern where an object, known as
 * the subject, maintains a list of its dependents, called observers, that need
 * to be notified of any state changes. Instead of the subject directly calling
 * methods on the observers, it provides a mechanism for the observers to
 * register interest and receive updates automatically when the subject's state
 * changes. This promotes a loosely coupled relationship between the subject and
 * observers, allowing for a more flexible and maintainable system design.
 * 
 * -------------------------------------------------
 * 
 * POC :
 * 
 * Creating a simple news system where a news agency needs to inform multiple
 * subscribers about the latest news.
 * 
 * -------------------------------------------------
 * 
 * Solution :
 * 
 * Initiate the implementation by establishing three fundamental components: an
 * Observer interface, a NewsAgency class serving as the subject, and a
 * NewsSubscriber class acting as the concrete observer. The Observer interface
 * will outline a method responsible for updating subscribers with news. Within
 * the NewsAgency class, manage a list of subscribers and execute notifications
 * to them whenever there's a new announcement. The NewsSubscriber class will be
 * designed to implement the update method, ensuring it processes and prints the
 * received news.Showcase the addition of subscribers to the news agency and how
 * updating the news seamlessly triggers automatic notifications to all
 * subscribers.
 */