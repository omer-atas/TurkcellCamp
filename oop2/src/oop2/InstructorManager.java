package oop2;

public class InstructorManager {
	
	public void register(Instructor instructor) {
		System.out.println("Added : " + instructor.getFirstName());
	}

	public void update(Instructor instructor) {
		System.out.println("Updated : " + instructor.getFirstName());
	}
	
	public void delete(Instructor instructor) {
		System.out.println("Deleted : " + instructor.getFirstName());
	}
}
