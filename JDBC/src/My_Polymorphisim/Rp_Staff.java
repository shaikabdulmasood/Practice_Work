package My_Polymorphisim;

public class Rp_Staff {
	void duties(){
		System.out.println("Performing general hospital duties");
	}

}
class Doctor extends Rp_Staff{
	void duties() {
		System.out.println("Doctor: Diagnosing and treating patients.");
	}
}

class Nurse extends Rp_Staff{
	void duties() {
		 System.out.println("Nurse: Monitoring patients and assisting doctors.");
	}
}

class Attender extends Rp_Staff {
	void duites() {
		 System.out.println("Attender: Enter patients details.");
	}
}


