package oop2;

public class CourseManager {
	
	public void registerCourse(Course course, Student student) {
		System.out.println( student.getFirstName() + " isimli ��renci " + course.getCourseName() +
				" adl� kursa kay�t oldu.");
	}
	
	public void getAll(Course[] courses) {
		
		if(courses.length == 0) {
			System.out.println("Kurs bulunamad�..");
		}else {
			System.out.println("Kurslar listeleniyor..");
			for(Course course : courses) {
				System.out.println(course.getCourseName());
			}
		}
		
	}

}
