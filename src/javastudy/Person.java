package javastudy;

public class Person {
	String name;
	String address;
	int age;
	int height;
	int weight;

	public Person() {
		System.out.println("생성자 호출");
		name = "김 OO";
		address = "서울";
		age = 20;
		height = 170;
		weight = 70;
	}
}
	// 변수 선언은  public class 와 void 사이에 하기.
	// 가비지 = 포인팅을 잘못해서 쓸 수 없게 됨.