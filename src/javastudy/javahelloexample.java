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
//콜 바이 레퍼런스 함수 안 수정 가능 , 콜 바이 벨류 함수 안 수정 불가