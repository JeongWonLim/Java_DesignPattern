package chapter1;

public class Person1 {
	private Phone[] Phones;
	
	public Person1() {
		Phones = new Phone[2];
	}

	public Phone getPhones(int i) {
		if(i == 0 || i == 1 )
			return Phones[i]; //0�̸� ����ȭ, 1�̸� �繫�� ��ȭ
		return null;
	}
	
	
}
