package My_Polymorphisim;

public class Rp_Hospital_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rp_Staff staff1 = new Doctor();
		Rp_Staff staff2 = new Nurse();
		Rp_Staff staff3 = new Attender();
		
		staff1.duties();
		staff2.duties();
		staff3.duties();
	}

}
