package javastudy;

public class javahelloexample {

	public static void main(String[] args) {
		MethodExample example = new MethodExample();

		Person hong = new Person();

		example.changeA(hong);

		System.out.println(hong.name);
		System.out.println(hong.age);
		System.out.println("*****************");

		example.changeB(hong);

		System.out.println(hong.name);
		System.out.println(hong.age);
		System.out.println("*****************");
	}
}
//�� ���� ���۷��� �Լ� �� ���� ���� , �� ���� ���� �Լ� �� ���� �Ұ�