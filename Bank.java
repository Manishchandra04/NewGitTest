class Account
{
	int account_no;
	String name;
	float amount;
	
	//Method to initialize object 
	void insert(int a, String n, float amt)
	{
		account_no=a;
		name = n;
		amount = amt;
	}
	
	//deposit method 
	void deposit(float amt)
	{
		amount=amount+amt;
		System.out.println(amt+" deposited");
	}
	
	//withdraw method 
	
	void withdraw(float amt)
	{
		if(amount < amt)
			System.out.print("Insufficient balance");
		else
		amount= amount-amt;
		System.out.println(amt+" withdrawn");
	}
	
	//method to check the balance of the account
	void checkBalance(){System.out.println("Balance is: "+amount);} 
	
	// Display balance 
	void display(){System.out.println(account_no+" "+ name + " "+ amount);}
	
}
	
	//Creating a test class to deposit and withdraw amount

public class Bank {

	public static void main(String[] args) {
	Account ac1= new Account();
	ac1.insert(01001233, "Manish Chandra", 20000);
	ac1.display();
	ac1.checkBalance();
	
	ac1.deposit(2000);
	ac1.checkBalance();
	
	ac1.withdraw(1000);
	ac1.checkBalance();

	}

}