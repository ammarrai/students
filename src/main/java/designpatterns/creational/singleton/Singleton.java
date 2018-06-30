package designpatterns.creational.singleton;

/**
 * Ensure that only one instance of a class is created.
 * Provide a global point of access to the object
 * Allow multiple instances in the future without affecting a singleton class's clients
 */


public class Singleton {
	private static Singleton instance = null;           // static instance ; belongs only to the class

	protected Singleton() {                             // Exists only to defeat instantiation outside of package
                                                         // Constructor is sometimes private...
	}

	public static Singleton getInstance() {            // Lazy initialization
		if (instance == null) {                        // Only initializes if instance == null.
			instance = new Singleton();
		}
		return instance;                                
	}
}