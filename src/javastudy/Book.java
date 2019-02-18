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
		System.out.println("도서명 : " + name);
		System.out.println("출판사 : " + company);
		System.out.println("가격 : " + price);
		System.out.println("저자 : " + author);
		System.out.println("페이지 : " + size);
		System.out.println("*******************");
	}
}