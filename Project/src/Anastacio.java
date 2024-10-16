
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Anastacio {

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

        String departureCountry = B_Validations.AIRPORT_COUNTRY_MAP.get(cdair);

        while(cdarr == null) {
            System.out.print("Enter departure arrival (e.g., BOS): ");
            cdarr = B_Validations.validateDepartureArrival(scan, departureCountry);
        }
        
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


class B_Validations {

	static int cfn = 0;
	static String cn = null;
	static String cnat = null;
	static String cooo = null;
	static LocalDate cdd = null;
	static String cdt = null;
	static String cdair = null;
	static String cdarr = null;

	private static final String[] ALL_NATIONALITIES = { "afghan", "albanian", "algerian", "american", "andorran",
			"angolan", "antiguans", "argentinean", "armenian", "australian", "austrian", "azerbaijani", "bahamian",
			"bahraini", "bangladeshi", "barbadian", "barbudans", "batswana", "belarusian", "belgian", "belizean",
			"beninese", "bhutanese", "bolivian", "bosnian", "brazilian", "british", "bruneian", "bulgarian",
			"burkinabe", "burmese", "burundian", "cambodian", "cameroonian", "canadian", "cape verdean",
			"central african", "chadian", "chilean", "chinese", "colombian", "comoran", "congolese", "costa rican",
			"croatian", "cuban", "cypriot", "czech", "danish", "djibouti", "dominican", "dutch", "east timorese",
			"ecuadorean", "egyptian", "emirian", "equatorial guinean", "eritrean", "estonian", "ethiopian", "fijian",
			"filipino", "finnish", "french", "gabonese", "gambian", "georgian", "german", "ghanaian", "greek",
			"grenadian", "guatemalan", "guinea-bissauan", "guinean", "guyanese", "haitian", "herzegovinian", "honduran",
			"hungarian", "i-kiribati", "icelander", "indian", "indonesian", "iranian", "iraqi", "irish", "israeli",
			"italian", "ivorian", "jamaican", "japanese", "jordanian", "kazakhstani", "kenyan", "kittian and nevisian",
			"kuwaiti", "kyrgyz", "lao", "latvian", "lebanese", "liberian", "libyan", "liechtensteiner", "lithuanian",
			"luxembourger", "macedonian", "malagasy", "malawian", "malaysian", "maldivan", "malian", "maltese",
			"marshallese", "mauritanian", "mauritian", "mexican", "micronesian", "moldovan", "monacan", "mongolian",
			"moroccan", "mosotho", "motswana", "mozambican", "namibian", "nauruan", "nepalese", "new zealander",
			"ni-vanuatu", "nicaraguan", "nigerien", "north korean", "northern irish", "norwegian", "omani", "pakistani",
			"palauan", "panamanian", "papua new guinean", "paraguayan", "peruvian", "polish", "portuguese", "qatari",
			"romanian", "russian", "rwandan", "saint lucian", "salvadoran", "samoan", "san marinese", "sao tomean",
			"saudi", "scottish", "senegalese", "serbian", "seychellois", "sierra leonean", "singaporean", "slovakian",
			"slovenian", "solomon islander", "somali", "south african", "south korean", "spanish", "sri lankan",
			"sudanese", "surinamer", "swazi", "swedish", "swiss", "syrian", "taiwanese", "tajik", "tanzanian", "thai",
			"togolese", "tongan", "trinidadian or tobagonian", "tunisian", "turkish", "tuvaluan", "ugandan",
			"ukrainian", "uruguayan", "uzbekistani", "venezuelan", "vietnamese", "welsh", "yemenite", "zambian",
			"zimbabwean" };

	private static final String[] ALL_COUNTRIES = { "afghanistan", "albania", "algeria", "andorra", "angola",
			"antigua and barbuda", "argentina", "armenia", "australia", "austria", "azerbaijan", "bahamas", "bahrain",
			"bangladesh", "barbados", "belarus", "belgium", "belize", "benin", "bhutan", "bolivia",
			"bosnia and herzegovina", "botswana", "brazil", "brunei", "bulgaria", "burkina faso", "burundi",
			"cabo verde", "cambodia", "cameroon", "canada", "central african republic", "chad", "chile", "china",
			"colombia", "comoros", "congo", "costa rica", "croatia", "cuba", "cyprus", "czech republic", "denmark",
			"djibouti", "dominica", "dominican republic", "east timor", "ecuador", "egypt", "el salvador",
			"equatorial guinea", "eritrea", "estonia", "ethiopia", "fiji", "finland", "france", "gabon", "gambia",
			"georgia", "germany", "ghana", "greece", "grenada", "guatemala", "guinea", "guinea-bissau", "guyana",
			"haiti", "honduras", "hungary", "iceland", "india", "indonesia", "iran", "iraq", "ireland", "israel",
			"italy", "ivory coast", "jamaica", "japan", "jordan", "kazakhstan", "kenya", "kiribati", "kosovo", "kuwait",
			"kyrgyzstan", "laos", "latvia", "lebanon", "lesotho", "liberia", "libya", "liechtenstein", "lithuania",
			"luxembourg", "macedonia", "madagascar", "malawi", "malaysia", "maldives", "mali", "malta",
			"marshall islands", "mauritania", "mauritius", "mexico", "micronesia", "moldova", "monaco", "mongolia",
			"montenegro", "morocco", "mozambique", "myanmar", "namibia", "nauru", "nepal", "netherlands", "new zealand",
			"nicaragua", "niger", "nigeria", "north korea", "norway", "oman", "pakistan", "palau", "panama",
			"papua new guinea", "paraguay", "peru", "philippines", "poland", "portugal", "qatar", "romania", "russia",
			"rwanda", "saint kitts and nevis", "saint lucia", "saint vincent and the grenadines", "samoa", "san marino",
			"sao tome and principe", "saudi arabia", "senegal", "serbia", "seychelles", "sierra leone", "singapore",
			"slovakia", "slovenia", "solomon islands", "somalia", "south africa", "south korea", "south sudan", "spain",
			"sri lanka", "sudan", "suriname", "swaziland", "sweden", "switzerland", "syria", "taiwan", "tajikistan",
			"tanzania", "thailand", "togo", "tonga", "trinidad and tobago", "tunisia", "turkey", "turkmenistan",
			"tuvalu", "uganda", "ukraine", "united arab emirates", "united kingdom", "united states of america",
			"america", "uruguay", "uzbekistan", "vanuatu", "vatican city", "venezuela", "vietnam", "yemen", "zambia",
			"zimbabwe" };

	public static final Map<String, String> AIRPORT_COUNTRY_MAP = new HashMap<>();

	static {
		AIRPORT_COUNTRY_MAP.put("KUL", "Malaysia");
		AIRPORT_COUNTRY_MAP.put("MNL", "Philippines");
		AIRPORT_COUNTRY_MAP.put("ATL", "United States");
		AIRPORT_COUNTRY_MAP.put("NGS", "Japan");
		AIRPORT_COUNTRY_MAP.put("BOS", "United States");
		AIRPORT_COUNTRY_MAP.put("ICN", "South Korea");
	}

	public static int validateFlightNumber(Scanner scan) {
		String input = scan.nextLine();
		if (input.matches("\\d{4}")) {
			return cfn = localToGlobal(input);
		} else {
			printLines();
			System.out.println("Invalid input. Please enter exactly 4 digits.");
			printLines();
			return 0;
		}
	}

	public static String validateCustomerName(Scanner scan) {
		String input = scan.nextLine();
		if (input.matches("\\S+\\s+\\S+.*")) {
			return cn = input;
		} else {
			printLines();
			System.out.println("Invalid input. Please enter at least two words separated by whitespace.");
			printLines();
			return null;
		}
	}

	public static String validateCustomerNationality(Scanner scan) {
		Set<String> nationalities = new HashSet<>(Arrays.asList(ALL_NATIONALITIES));
		String input = scan.nextLine().toLowerCase();
		if (input.matches("\\w+") && nationalities.contains(input)) {
			return cnat = input;
		} else {
			printLines();
			System.out.println("Invalid nationality. Please enter a proper recognized nationality.");
			printLines();
			return null;
		}
	}

	public static String validateCustomerOrigin(Scanner scan) {
		Set<String> countries = new HashSet<>(Arrays.asList(ALL_COUNTRIES));
		String input = scan.nextLine().toLowerCase();
		if (countries.contains(input)) {
			return cooo = input;
		} else {
			printLines();
			System.out.println("Invalid country. Please enter a recognized country in lowercase.");
			printLines();
			return null;
		}
	}

	public static LocalDate validateDepartureDate(Scanner scan) {
		String input = scan.nextLine();
		try {
			DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate date = LocalDate.parse(input, dateFormatter);
			if (date.isBefore(LocalDate.now())) {
				printLines();
				System.out.println("Error input. Date must be in the future.");
				printLines();
				return null;
			}
			return cdd = date;
		} catch (DateTimeParseException e) {
			printLines();
			System.out.println("Error input. Invalid date format.");
			printLines();
			return null;
		}
	}

	public static String validateDepartureTime(Scanner scan) {
		String input = scan.nextLine().trim();
		String regex = "^(0?[1-9]|1[0-2]):[0-5][0-9]\\s?(am|pm|AM|PM)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		if (matcher.matches()) {
			return cdt = input;
		} else {
			printLines();
			System.out.println("Invalid departure time. Please enter in the format ##:##(am or pm).");
			printLines();
			return null;
		}
	}

	public static String validateDepartureAirport(Scanner scan) {
		Set<String> validAirports = AIRPORT_COUNTRY_MAP.keySet();
		String input = scan.nextLine().trim().toUpperCase();
		if (validAirports.contains(input)) {
			return cdair = input;
		} else {
			printLines();
			System.out.println("Invalid departure airport. Please enter a valid airport code (e.g., MNL).");
			printLines();
			return null;
		}
	}

	public static String validateDepartureArrival(Scanner scan, String departureCountry) {
		Set<String> validArrivals = AIRPORT_COUNTRY_MAP.keySet();
		String input = scan.nextLine().trim().toUpperCase();
		if (validArrivals.contains(input) && !AIRPORT_COUNTRY_MAP.get(input).equals(departureCountry)) {
			return cdarr = input;
		} else {
			printLines();
			System.out
					.println("Invalid departure arrival. Please enter a valid airport code from a different country.");
			printLines();
			return null;
		}
	}

	public static void doubleCheck() {
		System.out.println("Flight number: DL" + cfn);
		System.out.println("Customer name: " + cn.toUpperCase());
		System.out.println("Customer nationality: " + cnat.toUpperCase());
		System.out.println("Customer country of origin: " + cooo.toUpperCase());
		System.out.println("Departure date: " + cdd);
		System.out.println("Departure time: " + cdt.toUpperCase());
		System.out.println("Departure airport: " + cdair.toUpperCase());
		System.out.println("Departure arrival: " + cdarr.toUpperCase());
	}

	public static void printBlank() {
		System.out.println();
	}

	public static int localToGlobal(String input) {
		return Integer.parseInt(input);
	}

	public static void printLines() {
		System.out.println("--------------------------------------------------------------------------------------");
	}

}

class C_EncapDatabase {

    private int cfn;
    private String cn;
    private String cnat;
    private String cooo;
    private static LocalDate cdd;
    private static String cdt;
    private static String cdair;
    private static String cdarr;

    C_EncapDatabase(int cfn, String cn, String cnat, String cooo, LocalDate cdd, String cdt, String cdair, String cdarr) {
        this.cfn = cfn;
        this.cn = cn;
        this.cnat = cnat;
        this.cooo = cooo;
        C_EncapDatabase.cdd = cdd;
        C_EncapDatabase.cdt = cdt;
        C_EncapDatabase.cdair = cdair;
        C_EncapDatabase.cdarr = cdarr;
    }

    int getFlightNumber() {
        return cfn;
    }

    String getCustomerName() {
        return cn;
    }

    String getCustomerNationality() {
        return cnat;
    }

    String getCustomerOrigin() {
        return cooo;
    }

    public static LocalDate getCustomerDate() {
        return cdd;
    }

    static String getCustomerTime() {
        return cdt;
    }

    static String getCustomerAirport() {
        return cdair;
    }

    static String getCustomerArrival() {
        return cdarr;
    }
 
}

class D_FlightDetails {
    
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

class E_Distance extends D_FlightDetails {

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

class F_ArrivalTime extends E_Distance {

	@Override
    public String calculateArrivalTime() {
        String[] timeParts = depTime.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1].substring(0, 2));
        boolean isPM = depTime.toUpperCase().endsWith("PM");

        if (isPM && hour != 12) {
            hour += 12;
        } else if (!isPM && hour == 12) {
            hour = 0;
        }

        int distance = calculateDistance();
        int kmPerHour = 800;
        int flightHours = distance / kmPerHour;
        int remainingKm = distance % kmPerHour;

        LocalTime parsedTime = LocalTime.of(hour, minute);
        LocalTime arrivalTime = parsedTime.plusHours(flightHours).plusMinutes(remainingKm * 60 / kmPerHour);

        // Adjusting the arrival hour for AM or PM
        int arrivalHour = arrivalTime.getHour();
        String amOrPm = "AM";
        if (arrivalHour >= 12) {
            amOrPm = "PM";
            if (arrivalHour > 12) {
                arrivalHour -= 12;
            }
        }

        // Formatting the arrival time with AM or PM
        String formattedArrivalTime = String.format("%d:%02d %s", arrivalHour, arrivalTime.getMinute(), amOrPm);

        return formattedArrivalTime;
    }

	@Override
	public int calculateDistance() {
		return super.calculateDistance();
	}

	@Override
	LocalDate calculateArrivalDate() {
		return null;
	}

}


class G_ArrivalDate extends F_ArrivalTime {

	@Override
	public int calculateDistance() {
		return super.calculateDistance();
	}

	@Override
	public String calculateArrivalTime() {
		return super.calculateArrivalTime();
	}

	public LocalDate calculateArrivalDate() {
		String[] timeParts = depTime.split(":");
		int hour = Integer.parseInt(timeParts[0]);
		int minute = Integer.parseInt(timeParts[1].substring(0, 2));
		boolean isPM = depTime.toUpperCase().endsWith("PM");

		if (isPM && hour != 12) {
			hour += 12;
		} else if (!isPM && hour == 12) {
			hour = 0;
		}

		LocalTime parsedTime = LocalTime.of(hour, minute);
		LocalDateTime departureDateTime = LocalDateTime.of(depDate, parsedTime);

		int distance = calculateDistance();
		int kmPerHour = 800;
		double flightHoursDecimal = (double) distance / kmPerHour;

		// Calculate flight hours and remaining minutes
		int flightHours = (int) flightHoursDecimal;
		int remainingMinutes = (int) ((flightHoursDecimal - flightHours) * 60);

		LocalDateTime arrivalDateTime = departureDateTime.plusHours(flightHours).plusMinutes(remainingMinutes);

		return arrivalDateTime.toLocalDate();
	}

}

class H_FlightHours extends G_ArrivalDate {

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
	    
	    case "ICNKUL": flightDuration = "5 hours and 45 minutes"; break;
	    case "ICNMNL": flightDuration = "3 hours and 15 minutes"; break;
	    case "ICNATL": flightDuration = "19 hours and 54 minutes"; break;
	    case "ICNNGS": flightDuration = "44 minutes"; break;
	    case "ICNBOS": flightDuration = "13 hours and 44 minutes"; break;
	    
	    default: flightDuration = "Unknown"; break;
	    
		}
		System.out.println(flightDuration);
		return flightDuration;
    }

}