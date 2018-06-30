package core.stringbuilder;

public class Example {

	// iv

	// c
	Example(int flightNumber) {
	}

	// mm
	public static void main(String[] args) {
		int flightNumber;
		String location = "Florida";

		StringBuilder sb = new StringBuilder(40);
		System.out.println(sb.capacity());

		Example myFlight = new Example(175);
		
		sb.append("I flew to ");
		sb.append(location);
		sb.append(" on ");
		sb.append(myFlight);
		
		int time = 9;
		int pos = sb.length() - " on ".length() - myFlight.toString().length();
		
		sb.insert(pos + 4, " at " + time);
		
		String message = sb.toString();
		
		System.out.println(sb);

		//how do we calculate what our insert point is, going backwards?
		
		
	}
}

// most common methods of stringbuilder append and insert.
