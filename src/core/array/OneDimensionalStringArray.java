package core.array;


// Arrays are objects which can be of primitive data types of reference types.

public class OneDimensionalStringArray {

	public static void main(String[] args) {

		String[] pets;       // This does not create an array. This simply declares a reference. 
		
		pets = new String[10];  // This creates an array objects and assigns it to the reference.
		
				
		pets[0] = "cat";    // setting value of index 0
		pets[1] = "dog";
		pets[2] = "frog";
		pets[3] = "mouse";
		pets[4] = "lion";
		
		System.out.println(pets[0]);
		System.out.println(pets[1]);
		System.out.println(pets[2]);
		System.out.println(pets[3]);
		System.out.println(pets[4]);
		System.out.println(pets.length);
		
		for (String a : pets){
			System.out.println(a);
		}
		
		
		
		
		
		
	}

}
