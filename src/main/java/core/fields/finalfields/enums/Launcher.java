package core.fields.finalfields.enums;

public class Launcher {
	
	String value;
	
	// methods
		@Override
		public String toString() {
			return value;
			
		}
	
	public static void main(String[] args) {
		CrewMember imran = new CrewMember(FlightCrewJob.CoPilot); //created as CoPilot
		
		imran.setJob(FlightCrewJob.Pilot);  //now a Pilot
		
		System.out.println(imran.getJob()); //show current job
	}
}
