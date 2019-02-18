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
			System.out.println("정상적인 나이 설정을 부탁드립니다.");
			return;
		}
		this.age = age;
	}
}
//관례적으로 상수를 대문자로 표현함.
//클래스는 상속class, 인터페이스는 구현implements