package oop2;

public class CourseManager {
	
	public void registerCourse(Course course, Student student) {
		System.out.println( student.getFirstName() + " isimli öğrenci " + course.getCourseName() +
				" adlı kursa kayıt oldu.");
	}
	
	public void getAll(Course[] courses) {
		
		if(courses.length == 0) {
			System.out.println("Kurs bulunamadı..");
		}else {
			System.out.println("Kurslar listeleniyor..");
			for(Course course : courses) {
				System.out.println(course.getCourseName());
			}
		}
		
	}

}
