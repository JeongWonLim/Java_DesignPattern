package chapter1;
import java.util.Vector;

public class Course {
	private Vector<Student> students;
	private String name;
	
	
	public Course(String name) {
		this.name = name;
		students = new Vector<Student>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(Student student) {
		if(students.contains(student))
			students.remove(student);
	}
	
	public 
}
