package finalsOOP1;

import java.time.LocalDate;

public class H_FlightHours extends G_ArrivalDate {

	@Override
	public int calculateDistance() {
		return super.calculateDistance();
	}

	@Override
	public LocalDate calculateArrivalDate() {
		return super.calculateArrivalDate();
	}

	@Override
	public String calculateArrivalTime() {
		return super.calculateArrivalTime();
	}

	@Override
    public String calculateFlightDuration() {
		
		String flightDuration;
		switch(depCode) {
		case "KULMNL": flightDuration = "3 hours and 7 minutes"; break;
	    case "KULATL": flightDuration = "19 hours and 54 minutes"; break;
	    case "KULNGS": flightDuration = "5 hours and 33 minutes"; break;
	    case "KULBOS": flightDuration = "18 hours and 41 minutes"; break;
	    case "KULICN": flightDuration = "5 hours and 45 minutes"; break;
	    
	    case "MNLKUL": flightDuration = "3 hours and 7 minutes"; break;
	    case "MNLBOS": flightDuration = "16 hours and 59 minutes"; break;
	    case "MNLNGS": flightDuration = "2 hours and 47 minutes"; break;
	    case "MNLICN": flightDuration = "3 hours and 15 minutes"; break;
	    case "MNLATL": flightDuration = "10 hours and 54 minutes"; break;
	    
	    case "ATLKUL": flightDuration = "19 hours and 54 minutes"; break;
	    case "ATLMNL": flightDuration = "10 hours and 54 minutes"; break;
	    case "ATLNGS": flightDuration = "14 hours and 46 minutes"; break;
	    case "ATLBOS": flightDuration = "1 hour and 54 minutes"; break;
	    case "ATLICN": flightDuration = "19 hours and 54 minutes"; break;
	    
	    case "NGSKUL": flightDuration = "5 hours and 33 minutes"; break;
	    case "NGSMNL": flightDuration = "2 hours and 47 minutes"; break;
	    case "NGSBOS": flightDuration = "14 hours and 15 minutes"; break;
	    case "NGSICN": flightDuration = "44 minutes"; break;
	    case "NGSATL": flightDuration = "14 hours and 46 minutes"; break;
	    
	    case "BOSKUL": flightDuration = "16 hours and 57 minutes"; break;
	    case "BOSMNL": flightDuration = "16 hours and 59 minutes"; break;
	    case "BOSICN": flightDuration = "13 hours and 44 minutes"; break;
	    case "BOSNGS": flightDuration = "14 hours and 15 minutes"; break;
	    case "BOSATL": flightDuration = "1 hour and 54 minutes"; break;
	    
	    default: flightDuration = "Unknown"; break;
		}
		System.out.println(flightDuration);
		return flightDuration;
    }

}