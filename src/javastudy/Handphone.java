package javastudy;

public class Handphone extends Product {
	String color;
	int memory;
	
	public Handphone(String name, String company, int price, String color, int memory) {
		super (name,company,price);
		this.color = color;
		this.memory = memory;
	}
	
	public void printDetail() {
		super.print();
		System.out.println("컬러 : " + color);
		System.out.println("메모리 : " + memory);
		System.out.println("*******************");
	}
}