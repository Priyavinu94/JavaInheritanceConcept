package accessModifiers;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		SavingsAccount customer = new SavingsAccount("Priya", 10.0);
		System.out.println("Enter the credentials to login");
		System.out.print("Emaid id : ");
		customer.emailId = sc.next();	//default variable can be directly accessed
		System.out.print("Login Password : ");
		customer.setLogin(sc.next());
		if (customer.getloginID().equals(null)) {	//loginID is private, can't access directly
			System.out.println("Invalid login");
		} else {
			System.out.println("Welcome "+ customer.accountName);//accountName is public variable
			
			System.out.println("Do you want to add Phone number");
			if (sc.next().equals("yes")) {
				System.out.println("Enter phone number: ");
				customer.setPhoneNo(sc.nextLong());
				System.out.println("Phone No : " + customer.phoneNo); //phoneNo is default variable
			} else {
				System.out.println("You opted not to add phone no");
			}
			
			System.out.println("Yout account balance is : " + customer.balance); //protected variable accessed
			
		}
		

	}

}
