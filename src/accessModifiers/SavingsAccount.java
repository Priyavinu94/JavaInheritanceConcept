package accessModifiers;

public class SavingsAccount extends BankAccount {

	public double interestRate;

	public SavingsAccount(String accountName, double interestRate) {
		this.accountName = accountName;
		this.interestRate = interestRate;
		this.balance = 686.89;
	}

	public double addInterest(double interestRate) {
		return balance * interestRate / 100;
	}
}
