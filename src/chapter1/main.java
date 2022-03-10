package chapter1;

public class main {

	public static void main(String[] args) {
		Professor hongGilDong = new Professor();
		Student manSup = new Student();
		hongGilDong.setStudent(manSup);
		hongGilDong.advise("졸라리 상담해라");
		

	}

}
