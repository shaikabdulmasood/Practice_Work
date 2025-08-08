package ex;

public class bank_account 
{

	String accountholder;
	Double Balance;
	
	bank_account(String name, Double InitialBalance)
	{	
		accountholder = name;
		Balance = InitialBalance;
	}
	
	void deposite(int amount)
	{
		Balance = Balance + amount;
		System.out.println(amount+ " rupess deopsited.\nCurrent Balance is : "+ Balance);
		
	}
	void withdraw(int amount) 
	{
		if(amount <= Balance)
		{
			Balance = Balance - amount;
			System.out.println(amount+" rupees withdraw.\nCurrent Balance is :"+ Balance);
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	 void display() {
	        System.out.println("Account Holder: " + accountholder);
	        System.out.println("Balance: " + Balance);
	 }
	 void displaybalance() {
		 System.out.println("balance : "+Balance);
	 }

	public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
			bank_account bk = new bank_account("Masood", 1000.00);
			bk.display();
			bk.withdraw(400);
			bk.displaybalance();
			bk.deposite(300);
			bk.displaybalance();
		}
}