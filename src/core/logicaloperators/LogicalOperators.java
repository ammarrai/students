package core.logicaloperators;

public class LogicalOperators {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
	    boolean f = false;

		// 9.  != not equals
		// 10. & and - returns true if both operands return true.
		// 11. ^ xor - returns true if only ONE of the operands evaluates to true.
		// 12. | or - returns true if at least one of the operands evaluates to true.
		// 13. && conditional And - If left expression is false, the right expression is never checked.
		// 14. || conditional Or - If left expression is true, true is returned without evaluation of right side.

		if (a == 1 & b == 2) {
			System.out.println("The & (and) operator found BOTH conditions to be true!");
		}

		if (a == 1 ^ b == 0) {
			System.out.println("The ^ (xor) operator found ONLY ONE of the conditions to be true!");
		}

		if (a == 9999 | b == 2) {
			System.out.println("The | (or) operator found at least one of the conditions to be true!");
		}

		if (a == 1 && b == 2) {
			System.out.println(
					"The && (conditional and) operator found the left condition to be true so it never checked the right operand");
		}
		if (a == 1 || b == 9999) {
			System.out.println(
					"The || (conditional or) operator checks to see if the left operand is true. If so, the right side is never evaluated.");
		}
		if (f != true) {
			System.out.println(
					"The != (not equals) operator is self explanatory.");
		
		}
		
	}

}
