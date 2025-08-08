package My_Obeject_Class;

import java.util.Scanner;

public class Bank_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the account holder name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Account number :");
		int accnum = sc.nextInt();
		
		System.out.println("Enter the balacne : ");
		double bala = sc.nextDouble();
		
		Bank_Account bk = new Bank_Account(name, accnum, bala);
		
		bk.display();
		bk.withdraw(500);
		bk.deposit(100);
		
	}

}
class Bank_Account {
	
	String account_holder_name;
	int account_number;
	double balance;
	//Constructor
	Bank_Account(String name, int accnum, double bala){
		this.account_holder_name  = name;
		this.account_number = accnum;
		this.balance = bala;
		
		}
	//Deposit amount
	void deposit(double amount) {
		balance = balance+amount;
		System.out.println(amount+" rupees depositedd Sucsessfully\n");
		System.out.println("current balance : "+balance+" rupees\n");
	}
	void withdraw(double amount) {
		if(balance > 0 ) {
			balance = balance-amount;
			System.out.println(amount+" rupees withdraw successfully\n");
			System.out.println("current balance : "+balance+" rupees\n");
		}else {
			System.out.println("Insuficiant Balance!\n");
		}
		
	}
	void display() {
		System.out.println("               Acount Details               ");
		System.out.println("--------------------------------------------");
		System.out.println("1. Account Holder Name : "+account_holder_name);
		System.out.println("2. Account Number      : "+account_number);
		System.out.println("3. Bank Balance	       : "+balance+" rupees");	
		
		
	}


}

