package RandomStuff;

import java.util.Scanner;

public class RS1_CalculatorWithMethods {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		println("Choose operator if ( + , - , / , * )");
		String operator = scan.nextLine().toLowerCase();
		
		
		if(operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*")) {
				
				double numint1; double numint2;
			
			
				print("Value 1 :	");
				numint1 = scan.nextDouble();
			
				print("value 2 :	");
				numint2 = scan.nextDouble();
				
		
				println(numint1 + " " + operator + " " + numint2 );
		
			print("Output :	");
				String c = operator;
					switch (c) {
					case "+":
						double result = add(numint1,numint2);
						System.out.print(result);
						break;
					case "-":
						double result2 = subtract(numint1,numint2);
						System.out.print(result2);
						break;
					case "/":
						double result3 = divide(numint1,numint2);
						System.out.print(result3);
						break;
					case "*":
						double result4 = multiply(numint1,numint2);
						System.out.print(result4);
						break;
					}
			
			
		} else {
			println("Wrong input!");
			System.exit(0);
		}
		
		scan.close();
	}
		
		static void print(String word) {
			System.out.print(word);
		}
		
		static void println(String word) {
			System.out.println(word);
		}
	
		static double add(double numint1, double numint2) {
			double myAdd = numint1 + numint2;
			return Math.round(myAdd * 100.0) / 100.0;
		}
		
		static double subtract(double numint1, double numint2) {
			double myMin =  numint1 - numint2;
			return Math.round(myMin * 100.0) / 100.0;
			}
		
		static double multiply(double numint1, double numint2) {
			double myMulti = numint1 * numint2;
			return Math.round(myMulti * 100.0) / 100.0;
			}
		
		static double divide(double numint1, double numint2) {
			 double myDiv = numint1 / numint2;
			 return Math.round(myDiv * 100.0) / 100.0;
			 }

}
