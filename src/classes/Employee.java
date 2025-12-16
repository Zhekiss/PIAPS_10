package classes;

public abstract class Employee {

	private int ssNo;
	private String name;
	private String email;
	private static int counter;

	public Employee(String name, String email, int ssNo) {
		this.name = name;
		this.email = email;
		this.ssNo = ssNo;
		increaseCounter();
	}

	public int getSsNo() {
		return this.ssNo;
	}

	public void setSsNo(int ssNo) {
		this.ssNo = ssNo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		Employee.counter = counter;
	}

	public void increaseCounter() {
		counter++;
	}
}