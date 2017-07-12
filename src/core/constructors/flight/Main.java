package core.constructors.flight;

public final class Main {
	private Main() {                // prevents anyone from accidently creating a Main/launcher
	}

	public static void main(String[] args) {
		Flight flight = new Flight();
		flight.run(args);
	}
}