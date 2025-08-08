package My_Encapsulation;

public class Bank_Account {
	String acc_holder_name;
	String acc_number;
	double balance;
	String branch;
	
	//constructor
	
	Bank_Account(String name, String number, double balance, String branch) {
		this.acc_holder_name = name;
		this.acc_number = number;
		this.balance = balance;
		this.branch = branch;
		
	}
	void deposit(double amount){
		balance = balance+amount;
		System.out.println("Current balance : "+balance);
		System.out.println("deposit amount : "+amount);
		
	}
	void withdraw(double amount){
		balance = balance+amount;
		System.out.println("Current balance : "+balance);
		System.out.println("withdraw amount : "+amount);
		
	}
	void display() {
		System.out.println("");
		System.out.println("");
			
		}

	}

}
