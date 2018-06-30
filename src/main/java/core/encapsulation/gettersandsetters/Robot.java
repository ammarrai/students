package core.encapsulation.gettersandsetters;

public class Robot {

	// instance variables
	private int height;
	private int weight;
	private byte intelligence;
	private int speed;

	//constructors
	Robot() {
		
	}
	
	Robot(int height, int weight, byte intelligence, int speed) {
		
	}
	
	
	// methods
	void fight() {

	}

	void defend() {

	}

	
	//getters & setters
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public byte getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(byte intelligence) {
		this.intelligence = intelligence;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
}
