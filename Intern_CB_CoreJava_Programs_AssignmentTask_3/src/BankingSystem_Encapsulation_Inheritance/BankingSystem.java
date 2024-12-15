package BankingSystem_Encapsulation_Inheritance;

public class BankingSystem {
	public static void main(String[] args) {
		// Creating a SavingsAccount object
		SavingsAccount account = new SavingsAccount("12345", "John Doe", 1000.0, 2.0);

		// Display initial details
		System.out.println("Account Holder: " + account.getAccountHolderName());
		System.out.println("Initial Balance: " + account.getBalance());

		// Apply interest
		account.applyInterest();

		// Display updated balance
		System.out.println("Balance after interest: " + account.getBalance());
	}
}