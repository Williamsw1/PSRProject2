package encapsulation;

class BankDetails 
{

	String accountNumber;
	int balance;
	String accountHolder;
	String email;
	String phoneNumber;

	public BankDetails(String accountNumber, int balance, String accountHolder, String email, String phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolder = accountHolder;
		//this.email = email;
		this.email=email;
		this.phoneNumber = phoneNumber;

	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public int getBalance()
	{
		return balance;
	}
	public String getAccountHolderName()
	{
		return accountHolder;
	}
	public String getEmailId()
	{
		return email;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	void employee()
	{
		System.out.println("Phone: "+phoneNumber);
	}

	public void deposit(int amount) 
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("balance amount: "+balance);
		}
		else
		{
			System.out.println("Invalid amount for deposit");
		}
		
		
	}

	public void withdraw(double amount) {
		if(amount>0 && amount<=balance)
		{
			balance-=amount;
			System.out.println("Withdrawn: "+amount);
			System.out.println("New balance: "+balance);
			
		}
		else
		{
			System.out.println("You are trying to widthraw the amount which not available");
		}
		
	}

}

class BankAccount 
{

	public static void main(String[] args)

	{
		BankDetails obj1 = new BankDetails("1234", 1000, "XXX", "abc@gmail.com", "1234567891");
		BankDetails obj2 = new BankDetails("4567", 2000, "YYY", "def@gmail.com", "1234567892");
		
		System.out.println("Acc Name: "+obj1.getAccountHolderName());
		
		obj1.employee();
		System.out.println("balance: "+obj1.balance);
		obj1.deposit(1000);
		obj1.withdraw(500);
		
	
	}
}
