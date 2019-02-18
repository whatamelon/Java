package javastudy;

class A {
	public A() {
		System.out.println("생성자 A 호출");
	}
	
	public A(int x) {
		System.out.println("생성자 A 호출(x)");
	}
}

class B extends A {
	public B() {
		System.out.println("생성자 B 호출");
	}
	
	public B(int x) {
		super(x); // super는 한 단계 위에 있는 부모 클래스만 참조할 수 있음.
		System.out.println("생성자 B 호출(x)");
	}
}

class C extends B {
	public C() {
		System.out.println("생성자 C 호출");
	}
	
	public C(int x) {
		super(x);
		System.out.println("생성자 C 호출(x)");
	}
}

public class CallTest {
	public static void main(String[] args) {
		C c = new C(1);
	}
}