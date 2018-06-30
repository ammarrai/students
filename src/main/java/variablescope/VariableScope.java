package variablescope;

public class VariableScope {

	static String x = "test"; // This is in-scope

	public static void main(String[] args) {
		int rooms = 5;
		int people = 10;
		int z = 72;

		if (rooms > 0) {
			System.out.println("we have enough rooms.");
			System.out.println(x);
		}

	}

	// x would be out of scope outside the main method.
	
	
}
