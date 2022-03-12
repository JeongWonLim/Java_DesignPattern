package chapter1;
import java.util.Vector;

public class main {

	public static void main(String[] args) {
		Student s1 = new Student("manSup");
		Student s2 = new Student("gilDong");
		Course se = new Course("Software Engineering");
		Course designPattern = new Course("Design Pattern");
		
		Transcript t1 = new Transcript(s1, se);
		Transcript t2 = new Transcript(s1, designPattern);
		Transcript t3 = new Transcript(s2, designPattern);
		
		t1.setDate("2012");
		t1.setGrade("B0");
		t2.setDate("2012");
		t2.setGrade("D+");
		
		t3.setDate("2013");
		t3.setGrade("C+");
		
		Vector<Course> courses;
		courses = s1.getCourses();
		Vector<Transcript> trans = designPattern.getTranscripts();
		for(int i = 0; i < trans.size(); i++) {
			System.out.println(trans.get(i).printAllGrade());
		}
		
		System.out.println(t1.getStudent().getName());
		
		
	}

}
