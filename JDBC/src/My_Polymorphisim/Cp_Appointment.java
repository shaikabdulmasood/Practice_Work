package My_Polymorphisim;

public class Cp_Appointment {

	void book(String doctorName) {
        System.out.println("Appointment booked with Dr. " + doctorName);
    }

    void book(String doctorName, String department) {
        System.out.println("Appointment booked with Dr. " + doctorName + " from " + department + " department.");
    }

    void book(String doctorName, String department, String time) {
        System.out.println("Appointment booked with Dr. " + doctorName + " (" + department + ") at " + time);
    }
}

