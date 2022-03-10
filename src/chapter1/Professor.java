package chapter1;

public class Professor {
	private Student student;

	public void setStudent(Student student) {
		this.student = student;
		student.setAdvisor(this);
	}
	
	public void advise(String msg) {
		student.advise(msg);
	}

}
