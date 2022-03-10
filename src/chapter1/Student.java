package chapter1;
import java.util.Vector;

public class Student {
	private String name;
	private Professor advisor;
	private Vector<Course> courses;

	public Student(String name) {
		this.name = name;
		courses = new Vector<Course>();
	}
	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}
	
	public void advise(String msg) {
		System.out.println(msg);
	}
	
	public void registerCourse(Course course) {
		courses.add(course);
	}
	
	public void dropCourse(Course course) {
		if(courses.contains(course))
			courses.remove(course);
	}
	
	public Vector<Course> getCourses(){
		return courses;
	}
	
	public class Course{
		private String name;
		
		public Course(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
	}
}
