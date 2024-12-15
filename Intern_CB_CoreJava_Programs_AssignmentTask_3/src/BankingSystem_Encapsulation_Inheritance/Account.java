package BankingSystem_Encapsulation_Inheritance;

public class Account {

	private long accountNumber;
	private  String accountHolderName;
	private double balance;
	public Account(String accountNumber2, String accountHolderName2, double balance2) {
		// TODO Auto-generated constructor stub
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}



}
