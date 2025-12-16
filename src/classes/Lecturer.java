package classes;

import java.util.ArrayList;
import java.util.List;

public class Lecturer extends ResearchAssociate {

	public Lecturer(String name, String email, int ssNo, String fieldOfStudy) {
		super(name, email, ssNo, fieldOfStudy);
		this.taughtCourses = new ArrayList<>();
	}

	private List<Course> taughtCourses;

	public List<Course> getTaughtCourses() {
		return this.taughtCourses;
	}

	public void setTaughtCourses(List<Course> taughtCourses) {
		this.taughtCourses = taughtCourses;
	}

	public void teachCourse() {
		System.out.println("ru_vsu_cs_kodintsev_a_v.Lecturer " + getName() + " is teaching courses");
	}

	public void addCourse(Course course) {
		if (this.taughtCourses != null) {
			this.taughtCourses.add(course);
		}
	}

}