package finalsOOP1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.*;

public class A_AnastacioCarl_Project {

	public static String airlinesName = "Delta Airlines";

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cfn = 0;
        String cn = null;
        String cnat = null;
        String cooo = null;
        LocalDate cdd = null;
        String cdt = null;
        String cdair = null;
        String cdarr = null;

        printLines();
        System.out.println("		    " + airlinesName);
        printLines();

        print("\"DEPARTURE CODE\"\n" +
              "KUL: Malaysia\n" +
              "MNL: Philippines\n" +
              "ATL: United States\n" +
              "NGS: Japan\n" +
              "BOS: United States\n" +
              "ICN: South Korea\n");

        printLines();

        // Input for flight number
        do {
            System.out.print("Enter flight number (e.g., DL####): DL");
            cfn = B_Validations.validateFlightNumber(scan);
        } while (B_Validations.cfn == 0);

        // Input for customer name
        do {
            System.out.print("Enter customer name: ");
            cn = B_Validations.validateCustomerName(scan);
        } while (B_Validations.cn == null);

        // Input for customer nationality
        do {
            System.out.print("Enter customer nationality: ");
            cnat = B_Validations.validateCustomerNationality(scan);
        } while (B_Validations.cnat == null);

        // Input for customer country of origin
        do {
            System.out.print("Enter customer country of origin: ");
            cooo = B_Validations.validateCustomerOrigin(scan);
        } while (B_Validations.cooo == null);

        // Input for departure date
        do {
            System.out.print("Enter departure date (dd/MM/yyyy): ");
            cdd = B_Validations.validateDepartureDate(scan);
        } while (B_Validations.cdd == null);

        // Input for departure time
        do {
            System.out.print("Enter departure time (e.g., ##:##(am or pm)): ");
            cdt = B_Validations.validateDepartureTime(scan);
        } while (B_Validations.cdt == null);

        // Input for departure airport
        do {
            System.out.print("Enter departure airport (e.g., MNL): ");
            cdair = B_Validations.validateDepartureAirport(scan);
        } while (B_Validations.cdair == null);

        // Input for departure arrival
        do {
            System.out.print("Enter departure arrival (e.g., BOS): ");
            cdarr = B_Validations.validateDepartureArrival(scan, B_Validations.cdair);
        } while (B_Validations.cdarr == null);
        
        printLines();
        print("\"YOU'RE INFORMATIONS\"\n");
        B_Validations.doubleCheck();
        printLines();
        print("Double check information. Press enter to Continue!\n");
        printLines();

        if(scan.nextLine().toLowerCase().equals("")) { 
        	printLines();
        } else {
        	printLines();
        	print("Try again.");
        	printLines();
        	System.exit(0);
        }
    
        C_EncapDatabase eed = new C_EncapDatabase(cfn, cn, cnat, cooo, cdd, cdt, cdair, cdarr);
      
        D_FlightDetails ed = new E_Distance();
        D_FlightDetails fat = new F_ArrivalTime();
        D_FlightDetails gad = new G_ArrivalDate();
        D_FlightDetails fh = new H_FlightHours();
        

        System.out.println("Distance from " + cdair + " to " + cdarr + ": " + ed.calculateDistance() + "km");
        System.out.println("Arrival time: " + fat.calculateArrivalTime());
        System.out.println("Arrival date: " + gad.calculateArrivalDate());
        System.out.println("Arrival hours: " + fh.calculateFlightDuration());
        printLines();
        
        scan.close();
    }

	public static void printBlank() {
		System.out.println();
	}

	public static void printLines() {
		System.out.println("-----------------------------------------------------");
	}

	public static void print(String word) {
		System.out.print(word);
	}
}
