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
		System.out.println("��ǰ�� : " + name);
		System.out.println("������ : " + company);
		System.out.println("���� : " + price);
		printDetail();
	}
	
	protected abstract void printDetail();
}
// class ���信�� ����̶� ������ �ִ�. ���� ����̶�� ������ �ٸ� ���� �� ����.
// ������ �ְ� ���� �ִ� �޼ҵ带 �߻� �޼ҵ��� �θ�.