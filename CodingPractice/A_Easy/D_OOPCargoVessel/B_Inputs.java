package D_OOPCargoVessel;

import java.util.Scanner;

public class B_Inputs {

	static String origin;
	static String destination;
	static String max40Container;
	static String containerWeight;
	static String totalWeight;
	static String priceContainer;
	static String taxContainer;
	static String overallTotal;

	static String inputOrigin(Scanner scan) {
		String input = scan.nextLine().toUpperCase();
		return origin = input;
	}

	static String inputDestination(Scanner scan) {
		String input = scan.nextLine().toUpperCase();
		return destination = input;
	}

	static String input40Container(Scanner scan) {
		String input = scan.nextLine();
		return max40Container = input;
	}

	static String inputContainerWeight(Scanner scan) {
		String input = scan.nextLine();
		return containerWeight = input;
	}

	// Total weight of all containers: (o)

	static String inputPricePerCon(Scanner scan) {
		String input = scan.nextLine();
		return priceContainer = input;
	}

	static String inputTaxContainer(Scanner scan) {
		String input = scan.nextLine();
		return taxContainer = input;
	}

	// Total price of the containers including tax: (o)
	
	void display() {
	}
}
