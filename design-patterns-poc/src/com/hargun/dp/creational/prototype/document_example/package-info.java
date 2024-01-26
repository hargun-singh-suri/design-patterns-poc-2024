package com.hargun.dp.creational.prototype.document_example;

/**
 * Definition -
 * 
 * The Prototype Design Pattern is a creational pattern that allows the creation
 * of new objects by copying an existing object, known as the prototype.
 * 
 * Instead of creating objects through a constructor, the pattern involves
 * cloning an existing instance to create a new one.
 * 
 * It is useful when the cost of creating a new instance is more expensive or
 * complex than copying an existing one.
 * 
 * This pattern promotes object creation by duplicating existing instances,
 * providing a mechanism for creating new objects with minimal effort.
 * 
 * POC -
 * 
 * Develop a document editing application where users can create various types
 * of documents, such as reports and presentations. Each document type has
 * specific content sections (for reports) or slides (for presentations) that
 * need to be efficiently cloned and customized. The challenge is to design a
 * system that allows users to easily duplicate existing documents, including
 * their internal content, and make modifications without affecting the original
 * documents. Propose a solution using the Prototype Design Pattern to address
 * this problem and enhance the application's capability in handling document
 * creation and customization.
 * 
 * Implementation Approach -
 * 
 * Identify Abstract Prototype:
 * 
 * Define an abstract prototype interface (e.g., DocumentPrototype) with methods
 * for cloning the document and accessing/modifying internal content.
 * 
 * Implement Concrete Prototypes:
 * 
 * Create concrete prototype classes for different document types (e.g.,
 * ReportDocument, PresentationDocument) that implement the abstract prototype
 * interface. Ensure that the concrete prototypes perform deep copy for internal
 * content (e.g., content sections or slides).
 * 
 * Client Code:
 * 
 * In the client code (e.g., the document editing application), create instances
 * of concrete prototypes and clone them to generate new documents. Customize
 * the cloned documents as needed by accessing and modifying their internal
 * content. Verify that modifications to the internal content of cloned
 * documents do not affect the original documents.
 * 
 * 
 * Associated Concept -
 * 
 * Shallow Copy:
 * 
 * Shallow copy creates a new object but does not duplicate the internal objects
 * within the original object. It copies references to the existing objects.
 * Changes made to the internal objects in the copy will be reflected in the
 * original, and vice versa.
 * 
 * Deep Copy:
 * 
 * Deep copy creates a completely independent copy of the original object, along
 * with copies of all the internal objects within it. Changes made to the
 * internal objects in the copy will not affect the original, and vice versa.
 * 
 * Summary -
 * 
 * A shallow copy creates a new object and then copies the non-static fields
 * from the original object to the new object. If there is a value type field in
 * the original object, a bit-by-bit copy is performed. But if the field is a
 * reference type, this method will copy the reference, not the actual object.
 * 
 * But for a deep copy, a new object will be created, and will have a reference
 * to the new object that is a copy.
 * 
 * Copy constructor -
 * 
 * A copy constructor is a special constructor that creates a new object by
 * copying the attributes of an existing object of the same type. It is used to
 * initialize an object with values from another object, providing a convenient
 * way to create a copy of an object. The copy constructor typically takes an
 * object of the same class as a parameter and initializes the new object with
 * the values of the passed object.
 * 
 * --------
 */