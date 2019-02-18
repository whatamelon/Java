package javastudy;

public class Javastudy13 {
	public static void main(String[] args) {
		Person1 kim = new Person1("±Ë∞≥∂À",20);
		Person1 lee = new Person1("¿Ã∞≥∂À",30);
		
		kim.setAge(100);
		lee.setAge(10000);
		
		System.out.println(kim.getName());
		System.out.println(kim.getAge());
		System.out.println(lee.getName());
		System.out.println(lee.getAge());
	}
}