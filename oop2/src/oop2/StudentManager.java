package oop2;

public class StudentManager {
	
	public void add(Student student) {
		System.out.println("Added : " + student.getFirstName());
	}
	
	public void update(Student student) {
		System.out.println("Updated  : " + student.getFirstName());
	}
	
	public void delete(Student student) {
		System.out.println("Deleted: " + student.getFirstName());
	}
}
