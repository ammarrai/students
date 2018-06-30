package core.fields;

public class Birds {

private String type = "soaring"; // instance variable - not inside a method / should be private
private int size;               // 

	public static void main(String[] arg) {

		float pricePerPound = 5.75F;    // local variable - it's scope is the method 
		                                 // all local vars live on the stack!

	}

}




// note: when a method is called, it lands on top of a call-stack in the form of a
// "stack frame"  which holds the state of the method.
// e.g. if method foo() calls method bar(), then bar() is stacked on top of foo()



// all objects live on the heap.
