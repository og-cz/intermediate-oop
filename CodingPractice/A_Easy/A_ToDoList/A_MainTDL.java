package A_ToDoList;

import java.util.Scanner;

public class A_MainTDL {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean isChecked = true;
		String input = null;

		print("To do list");
		print("Done|Date|Activities|");
		
		System.out.print("Done : ");
		input = C_Database.setList1(scan);
		
		printLines();
		
	}

	public static void print(String word) {
		System.out.println(word);
	}
	
	public static void printLines() {
		System.out.println("------------------------------------");
	}
}
