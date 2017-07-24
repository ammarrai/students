package core.interfaces.inheritingmultipleinterfaces;

public class Launcher {
	public static void main(String[] args) {
		
		Flight lax045= new Flight(45);
		//Add crew members
		//Pilot Patty, CoPilot Karl, Marshal Mary
		//Add Passengers
		// Bob, Jane, Steve, Lisa
		for(Person p:lax045);
		System.out.println(p.getName());

	}
}
