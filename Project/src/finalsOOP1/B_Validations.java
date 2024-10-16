package finalsOOP1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class B_Validations {

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

	public static String validateDepartureArrival(Scanner scan, String departureAirport) {
        Set<String> validArrivals = AIRPORT_COUNTRY_MAP.keySet();
        String input = scan.nextLine().trim().toUpperCase();
        if (validArrivals.contains(input) && !input.equals(departureAirport)) {
            return cdarr = input;
        } else {
            printLines();
            System.out.println("Invalid departure arrival. Please enter a valid airport code different from the departure airport.");
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