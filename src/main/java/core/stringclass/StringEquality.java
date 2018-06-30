/* For quick comparisons of Strings the equals() method is fine..
 * but if you are doing lots comparisons in a given set of string values
 * that's where the intern method comes in.
 */

package core.stringclass;

public class StringEquality {

	public static void main(String[] args) {

		String s1 = "I Love";
		s1 += " Java";

		// s1 = s1 + java

		String s2 = "I";
		s2 += " Love Java";

		// s2 = s2 + "Love Java"

		System.out.println(s1);
		System.out.println(s2);

		if (s1 == s2)
			System.out.println("True.");
		else {
			System.out.println("Nope. s1 == s2 is not true.");

			/*
			 * Why does this happen? Because the == operator compares values if
			 * they both point to the exact same object instance! Here s1 and s2
			 * point to two different instances.
			 */

			if (s1.equals(s2)) {
				System.out.println("Though expensive, The equals method's The character by character comparison matches!"); 
			} else {
				System.out.println("nope!");
			}

			String s3 = s1.intern();
			String s4 = s2.intern();

			// intern will make sure that two strings with the exact same value
			// will reference the exact same object
			if (s3 == s4) {
				System.out.println("Using inexpensive == operator and s3 matches s4!");
			}

		}
	}

}
