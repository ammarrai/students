package core.fields.finalfields.enums;

public class CrewMember {

	// iv
	private FlightCrewJob job;

	// constructor
	public CrewMember(FlightCrewJob job) {
		this.job = job;
	}

	// g&s
	public void setJob(FlightCrewJob job) {
		this.job = job;
	}

	public FlightCrewJob getJob() {
		return job;
	}

}
