
public class AirlineFlights implements DataFlightInterface{
	
	@Override
	public void flightData() {
		
			
			System.out.println("    \"Flight Schedule in Days\"");
	        System.out.println("Monday Flights: " + schedMon);
	        System.out.println("Tuesday Flights: " + schedTue);
	        System.out.println("Wednesday Flights: " + schedWed);
	        System.out.println("Thursday Flights: " + schedThurs);
	        System.out.println("Friday Flights: " + schedFri);
	        System.out.println("Saturday Flights: " + schedSat);
	        System.out.println("Sunday Flights: " + schedSun);
	        System.out.println("---------------------------------");	        
	        System.out.println("  \"Flight Schedule in Weeks\"");
	        System.out.println("1st Week Flight: " + schedWeek1);
	        System.out.println("2nd Week Flight: " + schedWeek2);
	        System.out.println("3rd Week Flight: " + schedWeek3);
	        System.out.println("4th Week Flight: " + schedWeek4);
	        System.out.println("---------------------------------");
	        System.out.println("      \"Flight Destinations\"");
			System.out.println("Local Flights: " + lfNum);
			System.out.println("International Flights: " + ifNum);
	        System.out.println("---------------------------------");
	        System.out.println("	\"Total Flights\"");
	        System.out.println("Total Flight in a Weeks : " + totalweekFlight);
	        System.out.println("Total Flight in a Month : " + totalmonthFlight);
	        System.out.println("--------------------------------");	        
	        
	        
	}
}
