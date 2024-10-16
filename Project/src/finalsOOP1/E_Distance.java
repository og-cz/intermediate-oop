package finalsOOP1;

import java.time.LocalDate;

public class E_Distance extends D_FlightDetails {

	String depCode = depAirport + depArrival;
	int depKm = 0;

	
	int calculateDistance() {
		switch(depCode) {
		    case "KULMNL": depKm = 2488; break;
		    case "KULATL": depKm = 15926; break;
		    case "KULNGS": depKm = 4450; break;
		    case "KULBOS": depKm = 14955; break;
		    case "KULICN": depKm = 4600; break;
		    
		    case "MNLKUL": depKm = 2488; break;
		    case "MNLBOS": depKm = 13590; break;
		    case "MNLNGS": depKm = 2229; break;
		    case "MNLICN": depKm = 2599; break;
		    case "MNLATL": depKm = 8722; break;
		    
		    case "ATLKUL": depKm = 15926; break;
		    case "ATLMNL": depKm = 8722; break;
		    case "ATLNGS": depKm = 11812; break;
		    case "ATLBOS": depKm = 1523; break;
		    case "ATLICN": depKm = 15926; break;
		    
		    case "NGSKUL": depKm = 4450; break;
		    case "NGSMNL": depKm = 2229; break;
		    case "NGSBOS": depKm = 11400; break;
		    case "NGSICN": depKm = 595; break;
		    case "NGSATL": depKm = 11812; break;
		    
		    case "BOSKUL": depKm = 14955; break;
		    case "BOSMNL": depKm = 13590; break;
		    case "BOSICN": depKm = 10990; break;
		    case "BOSNGS": depKm = 11400; break;
		    case "BOSATL": depKm = 1523; break;
		    
		    case "ICNKUL": depKm = 4600; break;
		    case "ICNMNL": depKm = 2599; break;
		    case "ICNATL": depKm = 15926; break;
		    case "ICNNGS": depKm = 595; break;
		    case "ICNBOS": depKm = 10990; break;
		    
		    default: distance = -1; break; 
			}
		return depKm;
        }
	
		@Override
		String calculateArrivalTime() {
			return null;
		}
		
		@Override
		LocalDate calculateArrivalDate() {
			return null;
		}
		
		@Override
		public String calculateFlightDuration() {
			return null;
		}
		
}