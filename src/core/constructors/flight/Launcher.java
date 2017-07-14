package core.constructors.flight;

public final class Launcher {
	private Launcher() {                // prevents anyone from accidently creating a Main/launcher
	}

	public static void main(String[] args) {
		Flight flight = new Flight();
		flight.run(args);
	}
}