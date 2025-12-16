package classes;

public class AdministrativeEmployee extends Employee {


	public AdministrativeEmployee(String name, String email, int ssNo) {
		super(name, email, ssNo);
		setName(name);
		setEmail(email);
		setSsNo(ssNo);
	}

	public void manageWork() {
		System.out.println("Administrative employee " + getName() + " is managing work tasks");
	}

}