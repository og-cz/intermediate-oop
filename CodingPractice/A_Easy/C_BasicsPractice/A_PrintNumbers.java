package C_BasicsPractice;

import java.util.Scanner;

public class A_PrintNumbers {

	public static void main(String[] args) {
		
		// 1. Print Numbers
		// Task: Write a program to print numbers from 1 to 20.
		// Hint: Use a for loop.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number to start adding 20: ");
		int inp = scan.nextInt();
		
		int x = 1;
		System.out.println("For Looped/Number Count");
		
		System.out.println("Nested");
		for(int i = inp; i <= inp + 20 ; i++) {
			System.out.println(i + " : " + (x++));
		}
		
		System.out.println();
		System.out.println("Nested");
        for(int i = 0; i <= 20; i++) {
        	for(int j = inp; j <= inp;) {
        		System.out.println(j + i + " : " + (i + 1));
        		break;
        	}
        }
		
		
		
		scan.close();
	}

}
