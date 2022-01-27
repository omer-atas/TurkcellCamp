package kodlamaio;

public class Instructor {

	private int instructorId;
	private String instructorName;
	private String instructorImage;
	
	private Course[] instructorCourses;
	
	public Instructor() {}

	public Instructor(int instructorId, String instructorName, String instructorImage) {
		this.instructorId = instructorId;
		this.instructorName = instructorName;
		this.instructorImage = instructorImage;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getInstructorImage() {
		return instructorImage;
	}

	public void setInstructorImage(String instructorImage) {
		this.instructorImage = instructorImage;
	}

	public Course[] getInstructorCourses() {
		return instructorCourses;
	}

	public void setInstructorCourses(Course[] instructorCourses) {
		this.instructorCourses = instructorCourses;
	}
	
}
