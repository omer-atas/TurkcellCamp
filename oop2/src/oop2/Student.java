package oop2;

public class Student extends User{
	
	private Course[] studentCourses;

	public Student() {
		super();
	}

	public Student(int id, String email, String password, String firstName, String lastName, String image) {
		super(id,email,password,firstName,lastName,image);
	}

	public Course[] getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(Course[] studentCourses) {
		this.studentCourses = studentCourses;
	}
	
}
