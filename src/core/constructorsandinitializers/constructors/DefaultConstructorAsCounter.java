package core.constructorsandinitializers.constructors;

public class DefaultConstructorAsCounter 
 {

	static int instanceCounter = 0;       // static or class variable

	DefaultConstructorAsCounter() {
		instanceCounter++;                 // This will increment each time an object is created :)
	}

	public static void main(String[] args) {

		DefaultConstructorAsCounter objectreference1 = new DefaultConstructorAsCounter();
		DefaultConstructorAsCounter objectreference2 = new DefaultConstructorAsCounter();
		DefaultConstructorAsCounter objectreference3 = new DefaultConstructorAsCounter();
		DefaultConstructorAsCounter objectreference4 = new DefaultConstructorAsCounter();
		DefaultConstructorAsCounter objectreference5 = new DefaultConstructorAsCounter();

		System.out.println(instanceCounter);  // We get: 5

	}

}
