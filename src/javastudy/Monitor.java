package javastudy;

public class Monitor extends Product{
	String size;
	
	public Monitor(String name, String company, int price, String size) {
		super (name,company,price);
		this.size = size;
	}
	
	public void printDetail() {
		super.print();
		System.out.println("Å©±â : " + size);
		System.out.println("*******************");
	}
}