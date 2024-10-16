package D_OOPCargoVessel;

import java.util.Scanner;

public class A_Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = null;
	
		System.out.print("Origin of shipment: ");
		input = B_Inputs.inputOrigin(scan);
		
		System.out.print("Port of destination and disembarkation of Container: ");
		input = B_Inputs.inputDestination(scan);
		 
		System.out.print("No. of pieces of containers for 40-foot containers: ");
		input = B_Inputs.input40Container(scan);
		
		System.out.print("Weight per containers (kg): ");
		input = B_Inputs.inputContainerWeight(scan);
		
		// Total weight of all containers: (o)
		
		System.out.print("Price per containers: ");
		input = B_Inputs.inputPricePerCon(scan);
		
		System.out.print("Tax per container: ");
		input = B_Inputs.inputTaxContainer(scan);
		
		// Total price of the containers including tax: (o)
		
		
		int container40 = Integer.parseInt(B_Inputs.max40Container);

		System.out.println(container40);
	
		
		
		scan.close();
	}

}
