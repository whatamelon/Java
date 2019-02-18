package javastudy;

public class Person1 {
	public final static int MIN_AGE = 0;
	public final static int MAX_AGE = 0;
	private String name;
	private int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;

	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age < MIN_AGE || age > MAX_AGE) {
			System.out.println("�������� ���� ������ ��Ź�帳�ϴ�.");
			return;
		}
		this.age = age;
	}
}
//���������� ����� �빮�ڷ� ǥ����.
//Ŭ������ ���class, �������̽��� ����implements