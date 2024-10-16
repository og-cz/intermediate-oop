package B_MarketSoftware;

import java.util.Scanner;

public class A_Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		EncapDatabase enter = new EncapDatabase();
		
		print("\"BUYER DETAILS \"\n");
		print("Enter Buyer Name: ");
		enter.setBuyerName(scan.nextLine());
		
		print("Enter product Code: ");
		enter.setProductCode(scan.nextLine().toUpperCase());
	
		Product product = new Product();
		
		System.out.println(product.price());
		System.out.println(product.name());

		scan.close();
	}
	
	static void print(String word) {
		System.out.print(word);
	}

}
