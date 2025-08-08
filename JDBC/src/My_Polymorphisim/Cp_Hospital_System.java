package My_Polymorphisim;
import java.util.Scanner;

public class Cp_Hospital_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
        Cp_Appointment appt = new Cp_Appointment();
		 
        System.out.println("Choose booking option:");
        System.out.println("1. Book with Doctor Name");
        System.out.println("2. Book with Doctor Name and Department");
        System.out.println("3. Book with Doctor Name, Department, and Time");
        System.out.print("Enter your choice (1 or 2 or 3): ");
		
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        switch (choice) {
        case 1:
            System.out.print("Enter Doctor Name: ");
            String name1 = scanner.nextLine();
            appt.book(name1);
            break;

        case 2:
            System.out.print("Enter Doctor Name: ");
            String name2 = scanner.nextLine();
            System.out.print("Enter Department: ");
            String dept2 = scanner.nextLine();
            appt.book(name2, dept2);
            break;

        case 3:
            System.out.print("Enter Doctor Name: ");
            String name3 = scanner.nextLine();
            System.out.print("Enter Department: ");
            String dept3 = scanner.nextLine();
            System.out.print("Enter Preferred Time: ");
            String time3 = scanner.nextLine();
            appt.book(name3, dept3, time3);
            break;
        default:
            System.out.println("Invalid choice.");
    }
	}

}
