package accessModifiers;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		SavingsAccount customer = new SavingsAccount("Priya", 10.0);
		System.out.println("Enter the credentials to login");
		System.out.print("Emaid id : ");
		customer.emailId = sc.next();	//protected variable can be directly accessed
		System.out.print("Login Password : ");
		customer.setLogin(sc.next());
		if (customer.getloginID().equals(null)) {	//loginID is private, can't access directly
			System.out.println("Invalid login");
		} else {
			System.out.println("Welcome "+ customer.accountName);//accountName is public variable
			
			System.out.println("Do you want to update Phone number");
			if (sc.next().equals("yes")) {
				customer.setPhoneNo(sc.nextLong());
				System.out.println("Phone No : " + customer.phoneNo); //phoneNo is default variable
			} else {
				System.out.println("You opted not to update");
			}
			
		}
		

	}

}
