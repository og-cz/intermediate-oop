package finalsOOP1;

import java.time.LocalDate;

public class D_FlightDetails {
    
	String depAirport = C_EncapDatabase.getCustomerAirport();
	String depArrival = C_EncapDatabase.getCustomerArrival();
	LocalDate depDate = C_EncapDatabase.getCustomerDate();
	String depTime = C_EncapDatabase.getCustomerTime();
	
	int arrivalTime;
	protected static final int SPEED = 800;
	int distance;
	public String depCode;
	
	int calculateDistance() {
		return 0;
	}
	
	String calculateArrivalTime() {
		return null;
	}
	
	LocalDate calculateArrivalDate() {
		return null;
	}

	public String calculateFlightDuration() {
		return null;
	}

}
