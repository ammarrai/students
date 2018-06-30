/**
 * On a very basic level, this is an abstract class because it has abstract methods.

 * From the design pattern perspective, this is essentially the "FACTORY OF FACTORIES"
 * This will get the factories for Shape objects.
 */

package designpatterns.creational.abstractfactory.abstract_factory;

import designpatterns.creational.abstractfactory.interfaces.Shape;


abstract public class AbstractFactory {

	// This method has a return type of Shape. It takes a shape as an argument which is of type String
	public abstract Shape getShape(String shape);

}
