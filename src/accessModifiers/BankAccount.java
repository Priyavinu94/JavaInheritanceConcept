package accessModifiers;

public class BankAccount {

	public String accountName; // public variable
	private String loginID; // private variable
	protected double balance; // protected variable
	String emailId; // default variable
	long phoneNo; // default variable

	public BankAccount() {
		// No argument constructor
	}

	public BankAccount(String accountName, String emailId) {
		this.accountName = accountName;
		this.emailId = emailId;
		this.balance = 4635.51;
	}

	public String getloginID() {
		return loginID;
	}

	public void setLogin(String loginID) {
		if (loginID.length() < 8) {
			this.loginID = loginID;
		}
	}
	
	public void setPhoneNo(long phoneNo) {
		if (phoneNo != 0) {
			this.phoneNo = phoneNo;
		} else {
			System.out.println("Enter valid phone no.");
		}
	}
	public double getBalance() {
		return balance;
	}

	
}
