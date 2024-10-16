package C_BasicsPractice;

import java.util.Scanner;

public class D_FactorialCalculation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number for its factorial : ");
		int number = scan.nextInt();
		
        int factorial = 1;
        int i = 1;

        while (i <= number) {
            factorial *= i; 
            i++;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
		
		scan.close();
	}

}
