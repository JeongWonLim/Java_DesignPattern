package chapter1;

public class Transcript {
	private Student student;
	private Course course;
	private String date;
	private String grade;

	public Transcript(Student student, Course course) {
		this.student = student;
		student.addTranscript(this);
		this.course = course;
		course.addTranscript(this);
	}
	
	public Student getStudent() {
		return student;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return date;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String printAllGrade() {
		return "이름 " + student.getName() + " 성적 " + getGrade();
	}

}
