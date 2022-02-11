// Assuming ATMCard does the functions : Checking account balance and withdraw amount only
// assume - no user fees

package inheritanceAssignment;

public class ATMCard {

	String name;
	String cardNumber;
	int pinNumber;
	double balance;

	private String inputCardNum;
	private int inputPinNum;

	public ATMCard() {
		// no-arg constructor
	}

	public String getInputCardNum() {
		return inputCardNum;
	}

	public void setInputCardNum(String inputCardNum) {
		if (inputCardNum.length() == 16) {
			this.inputCardNum = inputCardNum;
		}
	}

	public int getInputPinNum() {
		return inputPinNum;
	}

	public void setInputPinNum(int inputPinNum) {
		if (inputPinNum > 0 || inputPinNum < 9999) {
			this.inputPinNum = inputPinNum;
		}
	}

	public double getBalance() {
		return balance;
	}

	public boolean isCardValid(String cardNumber, int pinNumber) {
		if (cardNumber.equals(this.cardNumber) && pinNumber == this.pinNumber) {
			return true;
		}
		return false;
	}

	public void showBalance(String cardNumber, int pinNumber) {
		System.out.println("Your account balance is  " + balance);
	}

	public double withdraw(double withdrawAmount) {
		if (balance > withdrawAmount) {
			balance -= withdrawAmount;
			System.out.println("Please collect the money");
		} else {
			System.out.println("Account does not hold enough funds to withdraw");
		}
		return balance;
	}
}
