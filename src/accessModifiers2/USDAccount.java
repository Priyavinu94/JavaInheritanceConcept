package accessModifiers2;

import accessModifiers.BankAccount;

public class USDAccount extends BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount customer = new BankAccount("Priya", "sree@gmail.com");
		
		System.out.print("Account holder name : " +customer.accountName);	//public variable from another package
		System.out.println("Main account balance : " + customer.getBalance());

	}

}
