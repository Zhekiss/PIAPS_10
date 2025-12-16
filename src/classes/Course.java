package classes;

public class Course {

	private String name;
	private int id;
	private float hours;

	public Course(int id, String name, float hours) {
		this.id = id;
		this.name = name;
		this.hours = hours;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public float getHours() {
		return this.hours;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}

}