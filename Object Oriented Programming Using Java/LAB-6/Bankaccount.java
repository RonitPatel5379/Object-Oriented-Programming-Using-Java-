class Bank_Account {
	int accountNo;
	String userName;
	String email;
	String accountType;
	int accountBalance;

	public void displayAccountDetails() {
		System.out.println("Account Number: " + accountNo);
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
	}

	public void getAccountDetails(int accountNo,String userName,String email,String accountType,int accountBalance) {
		this.accountNo = accountNo;
		this.userName = userName;
		this.email = email;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
}

public class Bankaccount {
	public static void main(String[] args) {
	    Bank_Account ba1 = new Bank_Account();

	    ba1.getAccountDetails(101,"Ronit","ronitbhadania","saving",130);
		ba1.displayAccountDetails();
	}
}