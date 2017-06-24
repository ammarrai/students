package designpatterns.creational.abstractfactory.factory_classes;

import designpatterns.creational.abstractfactory.abstract_factory.AbstractFactory;
import designpatterns.creational.abstractfactory.concrete_classes_shapes.Circle;
import designpatterns.creational.abstractfactory.concrete_classes_shapes.Rectangle;
import designpatterns.creational.abstractfactory.concrete_classes_shapes.Square;
import designpatterns.creational.abstractfactory.interfaces.Shape;

public class ShapeFactory extends AbstractFactory{

	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}

		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();

		}

		return null;

	}
}
