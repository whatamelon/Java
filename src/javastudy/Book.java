package javastudy;

public class Book {
	String name;
	String company;
	int price;
	String author;
	int size;
	
	public Book(String name, String company, int price, String author, int size) {
			this.name = name;
			this.company = company;
			this.price = price;
			this.author = author;
			this.size = size;
	}
	
	public void print() {
		System.out.println("������ : " + name);
		System.out.println("���ǻ� : " + company);
		System.out.println("���� : " + price);
		System.out.println("���� : " + author);
		System.out.println("������ : " + size);
		System.out.println("*******************");
	}
}