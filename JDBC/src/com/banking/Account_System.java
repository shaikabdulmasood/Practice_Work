package com.banking;

public class Account_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account_Service_Imp service = new Account_Service_Imp();
        // Register accounts
		
		Account acc1 = new Saving_Account("Abdul Masood",20000212,20000.00,"Kurnool","12/02/2002");
		Account acc2 = new Current_Account("Abdul Masood",20000212,20000.00,"Kurnool","12/02/2002");
		

        service.registerAccount(acc1);
        service.registerAccount(acc2);

        service.showAllAccounts();

        // Show account type (Polymorphism)
        System.out.println("\nAccount Types:");
        for (int i = 0; i < service.getAccountCount(); i++) {
            Account acc = service.getAccounts()[i];
            acc.accountType();  // Runtime Polymorphism
        }
	}

}
