package kodlamaio;

public class Course {
	
	private int courseId;
	private String courseName;
	private String courseImage;
	private String description;
	private double price;
	
	private Instructor[] courseInstructors;
	private Category category;
	
	public Course() {}
	
	// Kurucu metot içerisine parametre olarak iliþkilere tabi olan attribüteler dahil edilmez..
	public Course(int courseId, String courseName, String courseImage, String description, double price) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseImage = courseImage;
		this.description = description;
		this.price = price;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseImage() {
		return courseImage;
	}

	public void setCourseImage(String courseImage) {
		this.courseImage = courseImage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Instructor[] getCourseInstructors() {
		return courseInstructors;
	}

	public void setCourseInstructors(Instructor[] courseInstructors) {
		this.courseInstructors = courseInstructors;
	}

	public String getPrice() {
		if(this.price == 0) {
			return "Free";
		}else {
			return String.valueOf(this.price);
		}
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	

}
