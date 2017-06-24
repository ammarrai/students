package designpatterns.creational.factorymethod.factory;
import designpatterns.creational.factorymethod.abstract_superclass.Plan;
import designpatterns.creational.factorymethod.concrete_classes.CommercialPlan;
import designpatterns.creational.factorymethod.concrete_classes.DomesticPlan;
import designpatterns.creational.factorymethod.concrete_classes.NonProfitPlan;

public class GetPlanFactory {
	 
	      
		   //use getPlan method to get object of type Plan   
		       public Plan getPlan(String planType){  
		            if(planType == null){  
		             return null;  
		            }  
		          if(planType.equalsIgnoreCase("DOMESTIC")) {  
		                 return new DomesticPlan();  
		               }   
		           else if(planType.equalsIgnoreCase("COMMERCIAL")){  
		                return new CommercialPlan();  
		            }   
		          else if(planType.equalsIgnoreCase("NONPROFIT")) {  
		                return new NonProfitPlan();  
		          }  
		      return null;  
		   }  
	}

