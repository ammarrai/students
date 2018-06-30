package core.generics;

public class Olive {

	// instance variables
	public String oliveName = "Kalamata";
	public long color = 0x000000;

	// constructors
	public Olive() {
	}

	public Olive(String oliveName) {
		this.oliveName = oliveName;
	}

	public Olive(String oliveName, long color) {
		this(oliveName);
		this.color = color;
	}

	// methods
	public String toString() {
		return "name: " + this.oliveName + ": " + "color: " + this.color;
	}

}
