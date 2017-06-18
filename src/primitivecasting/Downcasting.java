package primitivecasting;

import xyz.TypeTester;

/**
Casting primitives is required any time you are going from a larger numerical data
type to a smaller numerical data type, or converting from a floating-point to an
integral value.
*/

public class Downcasting {

	static TypeTester tester = new TypeTester();

	public static void main(String[] args) {

		long x = 2;
		long y = 5;
		int z = 0;

		System.out.print("The value of x is " + x + " and its datatype is ");
		tester.printType(x);
		System.out.println();
		System.out.print("The value of y is " + y + " and its datatype is ");
		tester.printType(y);
		System.out.println();
		System.out.print("The value of z is " + z + " and its datatype is ");
		tester.printType(z);
		System.out.println();
		System.out.println();
		System.out.println("Let's do a simple addition operation: x + y");
		System.out.println();
		System.out.println(x + " plus " + y + " equals " + x + y + " <---whoops! String concatenation at play here! :)");
		System.out.println();
		
		// downcasting does not happen automatically...
	    // z=x+y;
		System.out.println("Now let's try adding x + y and storing the result in z...");
		System.out.println("z=(int)(x+y);");
		// downcasting must be explicit; 
		// The desired downcast must be enclosed in parenthesis on the right side.
		// The operation must also be enclosed in parenthesis, also on the right side.
		z=(int)(x+y);
		System.out.print("The value of z is "+z+" the datatype of which is ");
		tester.printType(z);
	}

}
