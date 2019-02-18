package javastudy;

public class Notebook extends Product {
	String os;
	int ssd;
	
	public Notebook(String name, String company, int price, String os, int ssd) {
		super (name,company,price);
		this.os = os;
		this.ssd = ssd;
	}
	
	public void printDetail() {
		super.print();
		System.out.println("�ü�� : " + os);
		System.out.println("�ϵ�뷮 : " + ssd);
		System.out.println("*******************");
	}
}