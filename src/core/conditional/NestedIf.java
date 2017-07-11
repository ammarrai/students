package core.conditional;

// a nested if similar to using an && operator.. except we can string more than 2 conditions

// Remember: the else matches up with the most recent if statement

public class NestedIf {

	public static void main(String[] args) {

		String feet = "big"; // outer if statement
		String shoes = "big"; // inner if statement
		String event = "big"; // inner-inner if statement

		if (feet == "big") {
			if (shoes == "big") {
				if (event == "big") {
					System.out.println("It's a fit!");
				} else {                                     // These else dependent on if closest to it.
					System.out.println("We have a feet/shoes mistmach :(");
				}
			}
		}

		System.out.println("We have exited the loop.");

	}
}
