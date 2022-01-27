package oop2;

public class Main {
	
	public static void main(String[] args) {
		
		Instructor instructor = new Instructor(1, "instructor@gmail.com", "123", "Engin", "Demiroð", "image.jpg");
		
		Instructor instructor2 = new Instructor(2, "instructor2@gmail.com", "456", "Murat", "Yücedað", "image2.jpg");
		
		Student student = new Student(1, "student@gmail.com", "123456", "student", "studentLastName", "image3.jpg");
		
		String dizi[] = {instructor.getFirstName(),instructor2.getFirstName()};
		
		Course course = new Course(1, "image.jpg", "course", "taným", "image4.jpg",dizi ,0);
		
		CourseManager courseManager = new CourseManager();
		courseManager.registerCourse(course, student);;
		
	}

}
