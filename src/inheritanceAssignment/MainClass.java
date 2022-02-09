/* Program for the application dealing with Cards.
 * Assuming ATMCard as parent class. Both CreditCard & DebitCard class extends ATMCard class
 * Assuming all 3 cards of a person are linked with the same Bank/financial service provider.
 */

package inheritanceAssignment;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CreditCard credit = new CreditCard("Priya", "4506987965469052", 4123, 3000, 20);
		DebitCard debit = new DebitCard("Priya", "4500398080923256", 4156, 150);
		ATMCard atm = new ATMCard("Priya", "3224390493242342", 4569);

		do {
			System.out.println("Welcome!!! Please select the card service.");
			System.out.println("Enter the number corresponding to each option to make selection");
			System.out.println(" 1.Credit\n 2.Debit\n 3.ATM \n 4.Exit");

			String selection = sc.next();

			switch (selection) {

			case "1": // credit card functions:

				System.out.println("Please enter your card No & 4 digit PIN. OR  Insert your card");
				credit.setInputCardNum(sc.next());
				credit.setInputPinNum(sc.nextInt());
				if (credit.isCardValid(credit.getInputCardNum(), credit.getInputPinNum())) {
					System.out.println("Hi " + credit.name);
					System.out.println("Please make a selection : \n 1. View card information");
					System.out.println(" 2. Make a purchase\n 3. Make bill payment\n 4. Main Menu");
					int option = sc.nextInt();
					switch (option) {
					case 1:
						credit.viewInfo();
						break;
					case 2:
						System.out.println("Enter the purchase amount");
						double purchaseFor = sc.nextDouble();
						credit.purchase(purchaseFor);
						break;
					case 3:
						System.out.println("Enter the amount you wish to pay");
						double payToCard = sc.nextDouble();
						credit.makeBillpayment(payToCard);
						break;
					case 4:
						break;
					default:
						System.out.println("Invalid selection.");
					}
				} else {
					System.out.println("Invalid Card or Pin No.");
				}
				break;

			case "2": // debit card functions

				System.out.println("Please enter your card No & 4 digit PIN. OR  Insert your card");
				debit.setInputCardNum(sc.next());
				debit.setInputPinNum(sc.nextInt());
				if (debit.isCardValid(debit.getInputCardNum(), debit.getInputPinNum())) {
					System.out.println("Hi " + debit.name);
					System.out.println("Please make a selection : \n 1. View card Information");
					System.out.println(" 2. Withdraw money\n 3. Make a deposit\n 4. Make a purchase\n 5. Main Menu");
					int option = sc.nextInt();
					switch (option) {
					case 1:
						debit.showBalance(debit.getInputCardNum(), debit.getInputPinNum());
						System.out.println("Overdraft Limit is : " + debit.getOverdraftLimit());
						break;
					case 2:
						System.out.println("Enter the amount to be withdrawn");
						double amountToWithdraw = sc.nextDouble();
						debit.withdraw(amountToWithdraw);
						break;
					case 3:
						System.out.println("Enter the amount to be deposited");
						double amountToDeposit = sc.nextDouble();
						debit.depositMoney(amountToDeposit);
						break;
					case 4:
						System.out.println("Enter the purchase amount");
						double purchaseFor = sc.nextDouble();
						debit.purchase(purchaseFor);
						break;
					case 5:
						break;
					default:
						System.out.println("Invalid selection.");
					}
				} else {
					System.out.println("Invalid Card or Pin No.");
				}
				break;

			case "3": // atm card functions:

				System.out.println("Please enter your card No & 4 digit PIN. OR  Insert your card");
				atm.setInputCardNum(sc.next());
				atm.setInputPinNum(sc.nextInt());
				if (atm.isCardValid(atm.getInputCardNum(), atm.getInputPinNum())) {
					System.out.println("Hi " + credit.name);
					System.out.println(
							"Please make a selection : \n 1. Check Balance\n 2. Withdraw money\n 3. Main Menu");
					int option = sc.nextInt();
					switch (option) {
					case 1:
						atm.showBalance(atm.getInputCardNum(), atm.getInputPinNum());
						break;
					case 2:
						System.out.println("Enter the amount to be withdrawn");
						double amountToWithdraw = sc.nextDouble();
						atm.withdraw(amountToWithdraw);
						break;
					case 3:
						break;
					default:
						System.out.println("Invalid selection.");
					}
				} else {
					System.out.println("Invalid Card or Pin No.");
				}
				break;

			case "4": // exit option

				System.out.println("You've opted to exit");
				break;

			default:

				System.out.println("Invalid Entry. Please make a valid selection.");
			}
			// after each case scenario completed, asks for exit or continue.
			System.out.println("Press 'Y' to go back to Main Menu.\nPress 'N' to confirm Exit");

		} while (sc.next().equals("Y"));	// process repeats or stops as per user input
	}
}