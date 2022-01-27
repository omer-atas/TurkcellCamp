package kodlamaio;


public class Main {
	
	public static void main(String[] args) {		
		
		Category category = new Category(1,"Yazýlým");
		Category category2 = new Category(2,"Tasarým");
		Category category3 = new Category(3,"Pazarlama");
		
		Category[] categories = new Category[] {category,category2,category3};
		
		
		Instructor instructor = new Instructor(1,"Engin Demiroð","image.jpg");
		Instructor instructor2 = new Instructor(1,"Murat Yücedað","image2.jpg");
		Instructor instructor3 = new Instructor(1,"Ömer Çolakoðlu","image3.jpg");
		
		Instructor[] instructors = new Instructor[] {instructor,instructor2,instructor3};
		
		
		Course course = new Course(1,"Java","image.jpg","Java Eðitimi",0);
		Course course2 = new Course(1,"C#","image2.jpg","C# Eðitimi",10);
		Course course3 = new Course(1,"Python","image3.jpg","Python Eðitimi",20);
		
		Course[] courses = new Course[] {course,course2,course3};
		for(Course c:courses) {
			System.out.println(c.getCourseName());
			System.out.println(c.getDescription());
			System.out.println(c.getPrice());
			System.out.println("*************************************************");
		}
		
	}
		
}
