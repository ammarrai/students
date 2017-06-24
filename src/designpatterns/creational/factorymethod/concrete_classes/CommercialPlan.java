package designpatterns.creational.factorymethod.concrete_classes;

import designpatterns.creational.factorymethod.abstract_superclass.Plan;

public class CommercialPlan extends Plan {

	public void getRate() {
		rate = 7.50;
	}

}