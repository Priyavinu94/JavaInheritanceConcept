//CreditCard class variables : creditLimit, minimum due, and credit card balance.

package inheritanceAssignment;

public class CreditCard extends ATMCard {

	private int creditLimit;
	private int minimumDue;
	private int creditCardBalance;

	public CreditCard(String name, String cardNumber, int pinNumber, int creditLimit, int minimumDue) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.pinNumber = pinNumber;
		this.creditLimit = creditLimit;
		this.minimumDue = minimumDue;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	// in purchase method, purchase amount is passed as parameter.
	public double purchase(double purAmount) {
		creditCardBalance += purAmount; // In credit cards, after spending the money, the amount gets added to the
		// balance.
		if (creditCardBalance > creditLimit) { // checks if the balance after the purchase exceeds credit limit
			System.out.println("Transcation is declined. Credit limit is exceeded.");
			creditCardBalance -= purAmount; // if exceeds, the transaction is declined, balance is set back to the same
			// before purchase
		} else {
			System.out.println("Successfully completed the transaction");
			// if credit limit does not exceed, it goes through
		}
		return creditCardBalance;
	}

	// makeBillPayment method: the payment amount is passed as parameter
	public double makeBillpayment(double paymentAmount) {
		if (paymentAmount >= minimumDue) {
			creditCardBalance -= paymentAmount; // when a payment is done to credit card, the balance decreases.
			System.out.println("Amount paid");
		} else {
			System.out.println("Make a payment greater than minimum due amount to avoid interest");
		}
		return creditCardBalance;
	}

	public void viewInfo() {
		System.out.println("Hi " + name + "\nYour Credit card balance is : " + creditCardBalance);
		System.out.println("Available credit is : " + (creditLimit - creditCardBalance));
	}

}
