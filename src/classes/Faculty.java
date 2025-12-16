package classes;

public class Faculty {

	private Employee dean;
	private String name;

	public Faculty(String name, Employee dean) {
		this.name = name;
		this.dean = dean;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 *
	 * @param dean
	 */
	public void setDean(Employee dean) {
		this.dean = dean;
	}

	public Employee getDean() {
		return this.dean;
	}

}