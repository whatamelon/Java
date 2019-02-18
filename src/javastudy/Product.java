package javastudy;

public abstract class Product {
	String name;
	String company;
	int price;

	public Product(String name, String company, int price) {
		this.name = name;
		this.company = company;
		this.price = price;
	}
	
	public void print() {
		System.out.println("제품명 : " + name);
		System.out.println("제조사 : " + company);
		System.out.println("가격 : " + price);
		printDetail();
	}
	
	protected abstract void printDetail();
}
// class 개념에는 상속이란 개념이 있다. 물론 상속이라는 개념은 다른 언어에도 다 있음.
// 구현만 있고 선언만 있는 메소드를 추상 메소드라고 부름.