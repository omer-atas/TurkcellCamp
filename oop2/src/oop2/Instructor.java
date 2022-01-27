package oop2;

public class Instructor extends User{
	
	private Course[] instructorCourses;

	public Instructor() {
		super();
	}

	public Instructor(int id, String email, String password, String firstName, String lastName, String image) {
		super(id,email,password,firstName,lastName,image);
	}

	public Course[] getInstructorCourses() {
		return instructorCourses;
	}

	public void setInstructorCourses(Course[] instructorCourses) {
		this.instructorCourses = instructorCourses;
	}

}
