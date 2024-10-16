// Main.java
public class Main {
 
	public static void main(String[] args) {
		
		// Create a new bank account
		
		BankAccount account = new
		BankAccount("123456789", 1000.0);
		
		account.deposit(500.0); // Deposit funds
		account.withdraw(200.0); // Withdraw funds
		
		
		System.out.println("Current balance: " + account.getBalance());
		
		CustomerDetails cd = new CustomerDetails ();
		cd.setName("Tyler");
		cd.setYear(2005);
		cd.setSex('M');
		cd.setNationality("Filipino");
		cd.setCivilstatus("Single");
		cd.setCountry("Philippines");
		
		System.out.println("--------------------------");
		System.out.println("CUSTOMER INFORMATION");
		System.out.print("Name: ");
		System.out.println(cd.getName());
		System.out.print("Year of Birth: ");
		System.out.println(cd.getYear());
		System.out.print("Sex: ");
		System.out.println(cd.geSex());
		System.out.print("Nationality: ");
		System.out.println(cd.getNationality());
		System.out.print("Civil Status: ");
		System.out.println(cd.getCivilstatus());
		System.out.print("Country: ");
		System.out.println(cd.getCountry());
 
	}
 
}