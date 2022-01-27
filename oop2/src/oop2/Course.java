package oop2;

public class Course {
	
	private int courseId;
	private String image;
	private String courseName;
	private String description;
	private String instructorPicture;
	private String []instructorNames;
	private double amount;
	
	private Category courseCategory;
	private Instructor[] courseInstructors;
	private Student[] students;
	
	public Course() {
		super();
	}

	public Course(int courseId, String image, String courseName, String description, String instructorPicture,
			String[] instructorNames, double amount) {
		super();
		this.courseId = courseId;
		this.image = image;
		this.courseName = courseName;
		this.description = description;
		this.instructorPicture = instructorPicture;
		this.instructorNames = instructorNames;
		this.amount = amount;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInstructorPicture() {
		return instructorPicture;
	}

	public void setInstructorPicture(String instructorPicture) {
		this.instructorPicture = instructorPicture;
	}

	public String[] getInstructorNames() {
		return instructorNames;
	}

	public void setInstructorNames(String[] instructorNames) {
		this.instructorNames = instructorNames;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getIsFree() {
		if(this.amount == 0) {
			return "Free";
		}
		return String.valueOf(this.amount);
	}

}
