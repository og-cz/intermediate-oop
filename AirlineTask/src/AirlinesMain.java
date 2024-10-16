import java.util.Scanner;

public class AirlinesMain {

    public static void main(String[] args) {
    	
    	Scanner x = new Scanner(System.in);
    	
    	// Flight Name Information
    	System.out.println("Name: Carl Zeus B. Anastacio");
        System.out.println("Section: COM232");
        System.out.println("Date: Apr 26, 2024");
        System.out.println("Time: 9:00 am");
        System.out.println("---------------------------------");
        System.out.println("Country: Philippines");
        System.out.println("Airlines: Philippine Airlines");
        System.out.println("---------------------------------");
        
        // Input to see Day Flights
		System.out.println("	\"Flight Schedule\"");
        System.out.print("Input any Day to View Flight: ");
        String inpDayF = x.nextLine();
        
        AirlineFlights myObj = new AirlineFlights();
        
        switch (inpDayF.toLowerCase()) { 
        	case "monday", "mon":
        			System.out.println("Schedule Flight for Monday: " + myObj.schedMon);
        		break;
        	case "tuesday", "tue":
        		System.out.println("Schedule Flight for Tuesday: " + myObj.schedTue);
        		break;
        	default:
                System.out.println("---------------------------------");
        		System.out.println("Invalid Input. Input a Day only!");
                System.out.println("---------------------------------");
        	return;
        }
        
        System.out.println("---------------------------------");

        // Output Local and Inter. Data
        AirlineFlights dfObj = new AirlineFlights();
        dfObj.flightData();
        

    }
}
