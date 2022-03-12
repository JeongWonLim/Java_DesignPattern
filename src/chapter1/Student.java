package chapter1;
import java.util.Vector;
import java.util.Iterator;
public class Student {
	private String name;
	private Professor advisor;
	private Vector<Transcript> transcripts;

	public Student(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}
	
	//면담
	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}
	
	public void advise(String msg) {
		System.out.println(msg);
	}

	//성적
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	
	public String getName() {
		return name;
	}
	
	//현 학생이 듣는 전체 과목
	public Vector<Course> getCourses(){
		Vector<Course> courses = new Vector<Course>();
		Iterator<Transcript> iter = transcripts.iterator();
		
		while(iter.hasNext()) {
			Transcript tr = iter.next();
			courses.add(tr.getCourse());
		}
		
		return courses;
	}
}
