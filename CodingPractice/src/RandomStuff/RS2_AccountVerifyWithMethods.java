package RandomStuff;
import java.util.Scanner;

public class RS2_AccountVerifyWithMethods {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	
	println("Input age");
		int age = scan.nextInt();
		scan.nextLine();
		
		
			if(age >= 18) {
				
				println("Cancel or Continue Registration");
				String acctProcess = scan.nextLine().toLowerCase();
				
				if(acctProcess.equalsIgnoreCase("continue")) {
					println("Good");
				} else if (acctProcess.equalsIgnoreCase("cancel")){
					println("Cancelled");
				} else {
					println("Wrong Input");
				}
					
				
			} else {
				System.out.println("Invalid Info");
				System.exit(0);
			}
		scan.close();
	}
	
		static void println(String word) {
			System.out.println(word);
		}

}
