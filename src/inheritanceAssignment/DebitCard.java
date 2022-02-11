//DebitCard class declares an additional variable overdraftLimit -  allowing the user to perform a purchase within a limit even when the accounts runs negative balance.

package inheritanceAssignment;

public class DebitCard extends ATMCard {

	private int overdraftLimit;

	DebitCard(String name, String cardNumber, int pinNumber) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.pinNumber = pinNumber;
		this.overdraftLimit = 150;
		this.balance = 4293.84;
	}

	public int getOverdraftLimit() {
		return overdraftLimit;
	}

	public double purchase(double purAmount) { // purchase amount is passed as parameter

		balance -= purAmount; // first purchase amount is deducted from account balance, then each condition
								// is checked
		if (balance > 0) { // if balance after purchase is zero, the transaction will be completed
			System.out.println("Successfully completed the purchase");
		} else if (balance < 0 && balance > -overdraftLimit) {
			// if balance is negative but within the overdraft limit, purchase goes through
			// but gives a warning
			System.out.println("Running out of balance. An overdraft fee will be applied");
		} else {
			// if the balance becomes negative and less than overdraft limit, the purchase
			// will be declined
			System.out.println("Your purchase was declined! You've reached your overdraft limit");
			balance += purAmount;
		}
		System.out.println("Your current account balance is : " + balance);
		return balance;
	}

	public double depositMoney(double depAmount) {
		if (depAmount > 0) {
			balance += depAmount;
			System.out.println("Transaction is successfully completed");
			System.out.println("Your current balance : " + balance);
		} else {
			System.out.println("The deposit amount is not valid");
		}
		return balance;
	}

}
