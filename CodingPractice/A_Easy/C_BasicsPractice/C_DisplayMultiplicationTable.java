package C_BasicsPractice;

import java.util.Scanner;

public class C_DisplayMultiplicationTable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number to Show it Multiplication Table : ");
		int inp = scan.nextInt();
		
		System.out.println("Nested For Loop");

		for(int i = 1; i <= inp;) {
			for(int j = 1; j <= inp; j++) {
				System.out.println(inp + " * " + j + " = " + (inp * j));
			}
			break;
		}
		System.out.println();
		System.out.println("For Loop");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(inp + " * " + i + " = " + (inp * i));
		}
		
		scan.close();
	}

}
