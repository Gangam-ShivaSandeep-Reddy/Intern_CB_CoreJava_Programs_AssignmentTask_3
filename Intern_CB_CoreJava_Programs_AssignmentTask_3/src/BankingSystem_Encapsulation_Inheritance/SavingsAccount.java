package BankingSystem_Encapsulation_Inheritance;

public class SavingsAccount extends Account {
	private double interestRate;

	// Constructor
	public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
		super(accountNumber, accountHolderName, balance);
		this.interestRate = interestRate;
	}

	// Getter and Setter for interestRate
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	// Method to calculate and update balance after applying interest
	public void applyInterest() {
		double interest = getBalance() * (interestRate / 100);
		setBalance(getBalance() + interest);
	}
}

