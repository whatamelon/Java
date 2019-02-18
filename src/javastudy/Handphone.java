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
		System.out.println("�÷� : " + color);
		System.out.println("�޸� : " + memory);
		System.out.println("*******************");
	}
}