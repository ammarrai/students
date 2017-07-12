package core.constructors;
public class DefaultConstructor {

	DefaultConstructor() { // This is a default constructor. It "steps in" before a new object is instantiated
		System.out.println("** default constructor business prior to object instantiation ***");
	}

	public static void main(String[] args) {
		DefaultConstructor objectReference = new DefaultConstructor();   // Before this obj is created, the default constructor will be executed!
System.out.println("object created!");
	}
}


/*
  Uses for a default constructor:
 
1. Increment a counter to track how many objects of this class type have been made.

2. Assign runtime-specific state (data about what’s happening NOW).

3. Assign values to the object’s important instance variables.

4. Get and save a reference to the object that’s creating the new object.

5. Add the object to an ArrayList.

6. Create HAS-A objects.

*/
