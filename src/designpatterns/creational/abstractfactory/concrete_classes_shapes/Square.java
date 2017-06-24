package designpatterns.creational.abstractfactory.concrete_classes_shapes;
import designpatterns.creational.abstractfactory.interfaces.Shape;

public class Square implements Shape {
	
	@Override
	
	public void draw() { // This method was declared in the Shape interface and is being implemeneted here
		
		System.out.println("We are now inside the Square draw() method");
	}
}

