package main;
public class BankAccount {

	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public double debit(double amount) {
		if (balance < amount) {
			amount = balance;
		}

		balance -= amount;
		return amount;
	}
	public double checkBalance() {
		
		return balance;
	}

}
