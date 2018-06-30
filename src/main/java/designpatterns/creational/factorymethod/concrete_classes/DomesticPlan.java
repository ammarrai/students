package designpatterns.creational.factorymethod.concrete_classes;

import designpatterns.creational.factorymethod.abstract_superclass.Plan;

public class DomesticPlan extends Plan {

	public void getRate() {
		rate = 3.50;
	}
}
