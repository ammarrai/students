package core.constructors.overloadedconstructors;

public class OverloadedConstructor {

	int speed = 0;
	int weight = 0;

	// constructors
	OverloadedConstructor() {                        // default constructor.
		speed = 100;
		weight = 100;
	}
	OverloadedConstructor(int speed) {              // takes only one arg.
		this.speed = speed;             // makes method parameter "speed" equal the instance variable "speed"
		
	}
	OverloadedConstructor(int weight, int speed) {  // takes two args.
		this.weight = weight;
		this.speed = speed;
	}
		
	void run(String[] args) {
		
		OverloadedConstructor obj0 = new OverloadedConstructor();
		OverloadedConstructor obj1 = new OverloadedConstructor(5, 6);
		OverloadedConstructor obj2 = new OverloadedConstructor(10);

		System.out.println("This is output from the default constructor");
		System.out.println(obj0.weight);
		System.out.println(obj0.speed);
		
		System.out.println();
		
		System.out.println("This is output from the obj1 constructor");
		System.out.println(obj1.weight);
		System.out.println(obj1.speed);
		
		System.out.println();
		
		System.out.println("This is output from the obj2 constructor");
		System.out.println(obj2.speed);
		System.out.println(obj2.weight);

	}

}
