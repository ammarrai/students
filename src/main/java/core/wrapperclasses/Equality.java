package core.wrapperclasses;

public class Equality {

	public static void main(String[] args) {

		Integer i1 = 10 * 10 * 10;
		Integer i2 = 100 * 10;

		/*
		 * == is used to compare primitive types and returns true if both
		 * references point to the same object. In the case below, i1 and i2 
		 * don't point to the same object.
		 */

		if (i1 == i2) {
			System.out.println("i1 == i2 is true.");
		} else {
			System.out.println("i1 == i2 is false");
		}

		/*
		 * .equals is used to compare strings In this case, we are dealing with
		 * objects
		 */

		if (i1.equals(i2)) {
			System.out.println("i1 'equals' i2");
		} else {
			System.out.println("i1 does not 'equals' i2");
		}
		

	}

}


/* The reason that the expression on line 19 evaluated to a true is because when
 * we are boxing an int, short,byte [-128 to 127], char, boolean [All of its
 * values] into a wrapper class, we will always get a reference to the same
 * exact object. In other words, a 5 wrapped into an Integer and another 5
 * wrapped into an Integer is the same object.
 */
