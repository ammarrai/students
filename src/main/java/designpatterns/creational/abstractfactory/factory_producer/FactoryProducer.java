package designpatterns.creational.abstractfactory.factory_producer; 

import designpatterns.creational.abstractfactory.factory_classes.ShapeFactory;

// This class invokes the appropriate factory class. e.g. ShapeFactory, ColorFactory, etc. 

public class FactoryProducer {
   public static ShapeFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();
      }
      return null;
   }
}