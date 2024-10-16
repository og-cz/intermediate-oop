// BankAccount class encapsulating account information and operations
class BankAccount {
	private String accountNumber;
	private double balance;
	
	// Constructor to initialize account number and balance
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	
	// Method to deposit funds into the account
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println(amount + " deposited successfully.");
		} else {
			System.out.println("Invalid amount. Deposit failed.");
		}
	}
	
	// Method to withdraw funds from the account
	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println(amount + " withdrawn successfully.");
		} else {
			System.out.println("Insufficient balance or invalid amount. Withdrawal failed.");
		}
	}
	
	// Method to get the current balance of the account
	public double getBalance() { return balance; }
		
	// Method to get the account number
	public String getAccountNumber() { return accountNumber; }
	
	}