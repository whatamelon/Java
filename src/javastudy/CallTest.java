package javastudy;

class A {
	public A() {
		System.out.println("������ A ȣ��");
	}
	
	public A(int x) {
		System.out.println("������ A ȣ��(x)");
	}
}

class B extends A {
	public B() {
		System.out.println("������ B ȣ��");
	}
	
	public B(int x) {
		super(x); // super�� �� �ܰ� ���� �ִ� �θ� Ŭ������ ������ �� ����.
		System.out.println("������ B ȣ��(x)");
	}
}

class C extends B {
	public C() {
		System.out.println("������ C ȣ��");
	}
	
	public C(int x) {
		super(x);
		System.out.println("������ C ȣ��(x)");
	}
}

public class CallTest {
	public static void main(String[] args) {
		C c = new C(1);
	}
}