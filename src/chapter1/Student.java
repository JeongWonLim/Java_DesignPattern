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
	
	//���
	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}
	
	public void advise(String msg) {
		System.out.println(msg);
	}

	//����
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	
	public String getName() {
		return name;
	}
	
	//�� �л��� ��� ��ü ����
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
