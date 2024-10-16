package finalsOOP;

import java.util.HashSet;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AnastacioCarl_Project {

	// name of airline
	public static String airlinesName = "Delta Airlines";

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// input (optional: String to int)
		String input;
		// Declare and initialize the variable here
		int number = 0;
		// control flag/leverage
		boolean validInput = false;
		// Date Var
		LocalDate date = null;
		// Time
		String time = null;

		// storage
		int fn = 0;
		String cn = null;
		String cnat = null;
		String cooo = null;
		LocalDate cdd = null;
		String cdt = null;
		int dd, dt, dair, darr = 0;

		// all nationalities
		Set<String> nationalities = new HashSet<>();
		String[] allNationalities = { "afghan", "albanian", "algerian", "american", "andorran", "angolan", "antiguans",
				"argentinean", "armenian", "australian", "austrian", "azerbaijani", "bahamian", "bahraini",
				"bangladeshi", "barbadian", "barbudans", "batswana", "belarusian", "belgian", "belizean", "beninese",
				"bhutanese", "bolivian", "bosnian", "brazilian", "british", "bruneian", "bulgarian", "burkinabe",
				"burmese", "burundian", "cambodian", "cameroonian", "canadian", "cape verdean", "central african",
				"chadian", "chilean", "chinese", "colombian", "comoran", "congolese", "costa rican", "croatian",
				"cuban", "cypriot", "czech", "danish", "djibouti", "dominican", "dutch", "east timorese", "ecuadorean",
				"egyptian", "emirian", "equatorial guinean", "eritrean", "estonian", "ethiopian", "fijian", "filipino",
				"finnish", "french", "gabonese", "gambian", "georgian", "german", "ghanaian", "greek", "grenadian",
				"guatemalan", "guinea-bissauan", "guinean", "guyanese", "haitian", "herzegovinian", "honduran",
				"hungarian", "i-kiribati", "icelander", "indian", "indonesian", "iranian", "iraqi", "irish", "israeli",
				"italian", "ivorian", "jamaican", "japanese", "jordanian", "kazakhstani", "kenyan",
				"kittian and nevisian", "kuwaiti", "kyrgyz", "lao", "latvian", "lebanese", "liberian", "libyan",
				"liechtensteiner", "lithuanian", "luxembourger", "macedonian", "malagasy", "malawian", "malaysian",
				"maldivan", "malian", "maltese", "marshallese", "mauritanian", "mauritian", "mexican", "micronesian",
				"moldovan", "monacan", "mongolian", "moroccan", "mosotho", "motswana", "mozambican", "namibian",
				"nauruan", "nepalese", "new zealander", "ni-vanuatu", "nicaraguan", "nigerien", "north korean",
				"northern irish", "norwegian", "omani", "pakistani", "palauan", "panamanian", "papua new guinean",
				"paraguayan", "peruvian", "polish", "portuguese", "qatari", "romanian", "russian", "rwandan",
				"saint lucian", "salvadoran", "samoan", "san marinese", "sao tomean", "saudi", "scottish", "senegalese",
				"serbian", "seychellois", "sierra leonean", "singaporean", "slovakian", "slovenian", "solomon islander",
				"somali", "south african", "south korean", "spanish", "sri lankan", "sudanese", "surinamer", "swazi",
				"swedish", "swiss", "syrian", "taiwanese", "tajik", "tanzanian", "thai", "togolese", "tongan",
				"trinidadian or tobagonian", "tunisian", "turkish", "tuvaluan", "ugandan", "ukrainian", "uruguayan",
				"uzbekistani", "venezuelan", "vietnamese", "welsh", "yemenite", "zambian", "zimbabwean" };

		// Adding country names to the set
		Set<String> countries = new HashSet<>();
		String[] allCountries = { "afghanistan", "albania", "algeria", "andorra", "angola", "antigua and barbuda",
				"argentina", "armenia", "australia", "austria", "azerbaijan", "bahamas", "bahrain", "bangladesh",
				"barbados", "belarus", "belgium", "belize", "benin", "bhutan", "bolivia", "bosnia and herzegovina",
				"botswana", "brazil", "brunei", "bulgaria", "burkina faso", "burundi", "cabo verde", "cambodia",
				"cameroon", "canada", "central african republic", "chad", "chile", "china", "colombia", "comoros",
				"congo", "costa rica", "croatia", "cuba", "cyprus", "czech republic", "denmark", "djibouti", "dominica",
				"dominican republic", "east timor", "ecuador", "egypt", "el salvador", "equatorial guinea", "eritrea",
				"estonia", "ethiopia", "fiji", "finland", "france", "gabon", "gambia", "georgia", "germany", "ghana",
				"greece", "grenada", "guatemala", "guinea", "guinea-bissau", "guyana", "haiti", "honduras", "hungary",
				"iceland", "india", "indonesia", "iran", "iraq", "ireland", "israel", "italy", "ivory coast", "jamaica",
				"japan", "jordan", "kazakhstan", "kenya", "kiribati", "kosovo", "kuwait", "kyrgyzstan", "laos",
				"latvia", "lebanon", "lesotho", "liberia", "libya", "liechtenstein", "lithuania", "luxembourg",
				"macedonia", "madagascar", "malawi", "malaysia", "maldives", "mali", "malta", "marshall islands",
				"mauritania", "mauritius", "mexico", "micronesia", "moldova", "monaco", "mongolia", "montenegro",
				"morocco", "mozambique", "myanmar", "namibia", "nauru", "nepal", "netherlands", "new zealand",
				"nicaragua", "niger", "nigeria", "north korea", "norway", "oman", "pakistan", "palau", "panama",
				"papua new guinea", "paraguay", "peru", "philippines", "poland", "portugal", "qatar", "romania",
				"russia", "rwanda", "saint kitts and nevis", "saint lucia", "saint vincent and the grenadines", "samoa",
				"san marino", "sao tome and principe", "saudi arabia", "senegal", "serbia", "seychelles",
				"sierra leone", "singapore", "slovakia", "slovenia", "solomon islands", "somalia", "south africa",
				"south korea", "south sudan", "spain", "sri lanka", "sudan", "suriname", "swaziland", "sweden",
				"switzerland", "syria", "taiwan", "tajikistan", "tanzania", "thailand", "togo", "tonga",
				"trinidad and tobago", "tunisia", "turkey", "turkmenistan", "tuvalu", "uganda", "ukraine",
				"united arab emirates", "united kingdom", "united states of america", "america", "uruguay",
				"uzbekistan", "vanuatu", "vatican city", "venezuela", "vietnam", "yemen", "zambia", "zimbabwe" };

		printLines();
		System.out.println("		  " + airlinesName);
		printLines();

		print("\"DEPATURE CODE\"\n" + "KUL: Malaysia\n" + "MNL: Philippines\n" + "ATL: United States\n" + "NGS: Japan\n"
				+ "BOS: United States\n" + "ICN: South Korea\n");

		printLines();

		print("Enter flight number (e.g., : DL####): DL");
        input = scan.nextLine();
        if (input.matches("\\d{4}")) {
            number = localToGlobal(input);
            fn = number;
        } else {
            printBlank();
            System.out.println("Invalid input. Please enter exactly 4 digits.");
            System.exit(0);
        }

        print("Enter customer name: ");
        input = scan.nextLine();
        if (input.matches("\\S+\\s+\\S+.*")) {
            cn = input;
        } else {
            printBlank();
            System.out.println("Invalid input. Please enter at least two words separated by whitespace.");
            System.exit(0);
        }

        print("Enter customer nationality: ");
        input = scan.nextLine().toLowerCase();
        for (String nationality : allNationalities) {
            nationalities.add(nationality);
        }

        if (input.matches("\\w+")) {
            if (nationalities.contains(input)) {
                validInput = true;
                cnat = input;
            } else {
                printBlank();
                System.out.println("Invalid nationality. Please enter a proper recognized nationality.");
                System.exit(0);
            }
        } else {
            printBlank();
            System.out.println("Invalid input. Please enter exactly your Nationality without spaces.");
            System.exit(0);
        }

        print("Enter customer country of origin: ");
        input = scan.nextLine().toLowerCase();
        for (String country : allCountries) {
            countries.add(country);
        }
        if (countries.contains(input)) {
            cooo = input;
        } else {
            printBlank();
            System.out.println("Invalid country. Please enter a recognized country in lowercase.");
            System.exit(0);
        }

        print("Enter departure date(dd/MM/yyyy): ");
        input = scan.nextLine();
        try {
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            date = LocalDate.parse(input, dateFormatter);
            cdd = date;
            if (date.isBefore(LocalDate.now())) {
                printBlank();
                System.out.println("Error input. Date must be in the future.");
                System.exit(0);
            }
            System.out.println("You entered a valid date: " + date);
        } catch (DateTimeParseException e) {
            printBlank();
            System.out.println("Error input. Invalid date format.");
            System.exit(0);
        }

        print("Enter departure time (e.g., ##:##(am or pm)): ");
        input = scan.nextLine().trim();
        if (isValidTime(input)) {
            System.out.println("Valid departure time: " + input);
            input = cdt;
        } else {
            System.out.println("Invalid departure time. Please enter in the format ##:##(am or pm).");
            System.exit(0);
        }

        print("Enter departure airport (e.g., MNL): ");
        input = scan.nextLine();

        print("Enter departure arrival (e.g., BOS): ");
        input = scan.nextLine();

        printLines();
        print("Double check information. Press enter to Continue!\n");
        printLines();
        input = scan.nextLine();
        if (input.equals("")) {
        }

        EncapVar ev = new EncapVar(fn, cn, cnat, cooo, cdd);

		fn = ev.getFlightNumber();
		cn = ev.getCustomerName();
		cnat = ev.getCustomerNationality();
		cooo = ev.getCustomerOrigin();
		cdd = ev.getCustomerDate();

		System.out.println(fn + cn + cnat + cooo + cdd);
		
		
        scan.close();
        
	}

	// print any blank space
	public static void printBlank() {
		System.out.println();
	}

	public static void printLines() {
		System.out.println("--------------------------------------------------");
	}

	// Print any String
	public static void print(String word) {
		System.out.print(word);
	}

	public static int localToGlobal(String input) {
		int number = Integer.parseInt(input);
		return number;
	}

	// Helper method to validate the date without exceptions
	public static boolean isValidDate(String dateStr) {
		// Check if the date string matches the pattern dd/MM/yyyy
		if (dateStr.matches("\\d{2}/\\d{2}/\\d{4}")) {
			String[] parts = dateStr.split("/");
			int day = Integer.parseInt(parts[0]);
			int month = Integer.parseInt(parts[1]);
			int year = Integer.parseInt(parts[2]);

			// Basic range checks
			if (month < 1 || month > 12) {
				return false;
			}
			if (day < 1 || day > 31) {
				return false;
			}

			// Check days per month
			YearMonth yearMonth = YearMonth.of(year, month);
			return day <= yearMonth.lengthOfMonth();
		}
		return false;
	}

	public static boolean isValidTime(String time) {
		String regex = "^(0?[1-9]|1[0-2]):[0-5][0-9]\\s?(am|pm|AM|PM)$";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(time);

        // Check if the input matches the pattern
        return matcher.matches();
    }
	
}
